package fi.metatavu.acgbridge.server.rest.model;

import fi.metatavu.acgbridge.server.rest.model.TransactionProperty;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * A single transaction
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "A single transaction")

public class Transaction   {
  
  private String id = null;
  private String machineId = null;
  private List<TransactionProperty> properties = new ArrayList<TransactionProperty>();

  /**
   * Unique identifier for the transaction
   **/
  public Transaction id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier for the transaction")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique identifier for a machine that initiated the transaction
   **/
  public Transaction machineId(String machineId) {
    this.machineId = machineId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier for a machine that initiated the transaction")
  public String getMachineId() {
    return machineId;
  }
  public void setMachineId(String machineId) {
    this.machineId = machineId;
  }

  /**
   **/
  public Transaction properties(List<TransactionProperty> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<TransactionProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<TransactionProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(id, transaction.id) &&
        Objects.equals(machineId, transaction.machineId) &&
        Objects.equals(properties, transaction.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, machineId, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machineId: ").append(toIndentedString(machineId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
