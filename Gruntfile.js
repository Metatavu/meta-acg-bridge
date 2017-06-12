/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'jaxrs-spec-cruft': [
        'jaxrs-spec-generated/src/main/java/fi/metatavu/acgbridge/server/RestApplication.java'
      ],
      'jaxrs-spec-sources': ['jaxrs-spec-generated/src']
    },
    'copy': {
      'jaxrs-spec-extras': {
        src: '**',
        dest: 'jaxrs-spec-generated',
        cwd: 'jaxrs-spec-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'jaxrs-spec-generate': {
        command : 'mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l jaxrs-spec ' +
          '--api-package fi.metatavu.acgbridge.server.rest ' +
          '--model-package fi.metatavu.acgbridge.server.rest.model ' +
          '--group-id fi.metatavu.acg-bridge ' +
          '--artifact-id meta-acg-bridge-spec ' +
          '--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir jaxrs-spec-templates ' +
          '--additional-properties dateLibrary=java8 ' +
          '-o jaxrs-spec-generated/'
      },
      'jaxrs-spec-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'jaxrs-spec-release': {
        command : 'git add src pom.xml swagger.json && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('jaxrs-spec', ['download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'copy:jaxrs-spec-extras', 'shell:jaxrs-spec-install', 'shell:jaxrs-spec-release' ]);

  grunt.registerTask('default', ['jaxrs-spec' ]);
  
};