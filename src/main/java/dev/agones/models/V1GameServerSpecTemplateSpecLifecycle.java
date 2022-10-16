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
import dev.agones.models.V1GameServerSpecTemplateSpecLifecyclePostStart;
import dev.agones.models.V1GameServerSpecTemplateSpecLifecyclePreStop;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
 */
@ApiModel(description = "Actions that the management system should take in response to container lifecycle events. Cannot be updated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecLifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";
  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1GameServerSpecTemplateSpecLifecyclePostStart postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1GameServerSpecTemplateSpecLifecyclePreStop preStop;


  public V1GameServerSpecTemplateSpecLifecycle postStart(V1GameServerSpecTemplateSpecLifecyclePostStart postStart) {
    
    this.postStart = postStart;
    return this;
  }

   /**
   * Get postStart
   * @return postStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecLifecyclePostStart getPostStart() {
    return postStart;
  }


  public void setPostStart(V1GameServerSpecTemplateSpecLifecyclePostStart postStart) {
    this.postStart = postStart;
  }


  public V1GameServerSpecTemplateSpecLifecycle preStop(V1GameServerSpecTemplateSpecLifecyclePreStop preStop) {
    
    this.preStop = preStop;
    return this;
  }

   /**
   * Get preStop
   * @return preStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecLifecyclePreStop getPreStop() {
    return preStop;
  }


  public void setPreStop(V1GameServerSpecTemplateSpecLifecyclePreStop preStop) {
    this.preStop = preStop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecLifecycle v1GameServerSpecTemplateSpecLifecycle = (V1GameServerSpecTemplateSpecLifecycle) o;
    return Objects.equals(this.postStart, v1GameServerSpecTemplateSpecLifecycle.postStart) &&
        Objects.equals(this.preStop, v1GameServerSpecTemplateSpecLifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecLifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
