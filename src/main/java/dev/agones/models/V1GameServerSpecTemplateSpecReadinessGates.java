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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1GameServerSpecTemplateSpecReadinessGates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecReadinessGates {
  public static final String SERIALIZED_NAME_CONDITION_TYPE = "conditionType";
  @SerializedName(SERIALIZED_NAME_CONDITION_TYPE)
  private String conditionType;


  public V1GameServerSpecTemplateSpecReadinessGates conditionType(String conditionType) {
    
    this.conditionType = conditionType;
    return this;
  }

   /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * @return conditionType
  **/
  @ApiModelProperty(required = true, value = "ConditionType refers to a condition in the pod's condition list with matching type.")

  public String getConditionType() {
    return conditionType;
  }


  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecReadinessGates v1GameServerSpecTemplateSpecReadinessGates = (V1GameServerSpecTemplateSpecReadinessGates) o;
    return Objects.equals(this.conditionType, v1GameServerSpecTemplateSpecReadinessGates.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecReadinessGates {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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

