/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.agones.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import dev.agones.models.V1GameServerAllocationPolicySpecConnectionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GameServerAllocationPolicySpec defines the desired state of GameServerAllocationPolicy. More info: https://agones.dev/site/docs/reference/agones_crd_api_reference/#multicluster.agones.dev/v1.GameServerAllocationPolicy
 */
@ApiModel(description = "GameServerAllocationPolicySpec defines the desired state of GameServerAllocationPolicy. More info: https://agones.dev/site/docs/reference/agones_crd_api_reference/#multicluster.agones.dev/v1.GameServerAllocationPolicy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerAllocationPolicySpec {
  public static final String SERIALIZED_NAME_CONNECTION_INFO = "connectionInfo";
  @SerializedName(SERIALIZED_NAME_CONNECTION_INFO)
  private V1GameServerAllocationPolicySpecConnectionInfo connectionInfo;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Long weight;


  public V1GameServerAllocationPolicySpec connectionInfo(V1GameServerAllocationPolicySpecConnectionInfo connectionInfo) {
    
    this.connectionInfo = connectionInfo;
    return this;
  }

   /**
   * Get connectionInfo
   * @return connectionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerAllocationPolicySpecConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }


  public void setConnectionInfo(V1GameServerAllocationPolicySpecConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
  }


  public V1GameServerAllocationPolicySpec priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * minimum: 0
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public V1GameServerAllocationPolicySpec weight(Long weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * minimum: 0
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getWeight() {
    return weight;
  }


  public void setWeight(Long weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerAllocationPolicySpec v1GameServerAllocationPolicySpec = (V1GameServerAllocationPolicySpec) o;
    return Objects.equals(this.connectionInfo, v1GameServerAllocationPolicySpec.connectionInfo) &&
        Objects.equals(this.priority, v1GameServerAllocationPolicySpec.priority) &&
        Objects.equals(this.weight, v1GameServerAllocationPolicySpec.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionInfo, priority, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerAllocationPolicySpec {\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

