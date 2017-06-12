package fi.metatavu.acgbridge.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * A key - value pair describing a transaction property
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A key - value pair describing a transaction property")

public class TransactionProperty   {
  
  private String key = null;
  private String value = null;

  /**
   * Key
   **/
  public TransactionProperty key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Value
   **/
  public TransactionProperty value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionProperty transactionProperty = (TransactionProperty) o;
    return Objects.equals(key, transactionProperty.key) &&
        Objects.equals(value, transactionProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionProperty {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
