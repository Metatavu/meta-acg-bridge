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
  private String orderId = null;
  private String machineId = null;
  private String serverId = null;
  private String successUrl = null;
  private String failureUrl = null;
  private String paymentStrategy = null;
  private Double amount = null;
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
   * Unique identifier for the orderId
   **/
  public Transaction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier for the orderId")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
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
   * Unique identifier for a server that initiated the transaction
   **/
  public Transaction serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier for a server that initiated the transaction")
  public String getServerId() {
    return serverId;
  }
  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  /**
   * URL address to callback when transaction is successful
   **/
  public Transaction successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "URL address to callback when transaction is successful")
  public String getSuccessUrl() {
    return successUrl;
  }
  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  /**
   * URL address to callback when transaction has failed.
   **/
  public Transaction failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "URL address to callback when transaction has failed.")
  public String getFailureUrl() {
    return failureUrl;
  }
  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }

  /**
   * Name of payment strategy used for transactions
   **/
  public Transaction paymentStrategy(String paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of payment strategy used for transactions")
  public String getPaymentStrategy() {
    return paymentStrategy;
  }
  public void setPaymentStrategy(String paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  /**
   * The amount for the payment.
   **/
  public Transaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "The amount for the payment.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
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
        Objects.equals(orderId, transaction.orderId) &&
        Objects.equals(machineId, transaction.machineId) &&
        Objects.equals(serverId, transaction.serverId) &&
        Objects.equals(successUrl, transaction.successUrl) &&
        Objects.equals(failureUrl, transaction.failureUrl) &&
        Objects.equals(paymentStrategy, transaction.paymentStrategy) &&
        Objects.equals(amount, transaction.amount) &&
        Objects.equals(properties, transaction.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, machineId, serverId, successUrl, failureUrl, paymentStrategy, amount, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    machineId: ").append(toIndentedString(machineId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
    sb.append("    paymentStrategy: ").append(toIndentedString(paymentStrategy)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
