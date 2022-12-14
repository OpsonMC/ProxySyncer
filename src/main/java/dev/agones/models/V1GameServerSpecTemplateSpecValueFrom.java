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
import dev.agones.models.V1GameServerSpecTemplateSpecValueFromConfigMapKeyRef;
import dev.agones.models.V1GameServerSpecTemplateSpecValueFromFieldRef;
import dev.agones.models.V1GameServerSpecTemplateSpecValueFromResourceFieldRef;
import dev.agones.models.V1GameServerSpecTemplateSpecValueFromSecretKeyRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
 */
@ApiModel(description = "Source for the environment variable's value. Cannot be used if value is not empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1GameServerSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1GameServerSpecTemplateSpecValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1GameServerSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1GameServerSpecTemplateSpecValueFromSecretKeyRef secretKeyRef;


  public V1GameServerSpecTemplateSpecValueFrom configMapKeyRef(V1GameServerSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef) {
    
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1GameServerSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1GameServerSpecTemplateSpecValueFrom fieldRef(V1GameServerSpecTemplateSpecValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1GameServerSpecTemplateSpecValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1GameServerSpecTemplateSpecValueFrom resourceFieldRef(V1GameServerSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1GameServerSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  public V1GameServerSpecTemplateSpecValueFrom secretKeyRef(V1GameServerSpecTemplateSpecValueFromSecretKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1GameServerSpecTemplateSpecValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecValueFrom v1GameServerSpecTemplateSpecValueFrom = (V1GameServerSpecTemplateSpecValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1GameServerSpecTemplateSpecValueFrom.configMapKeyRef) &&
        Objects.equals(this.fieldRef, v1GameServerSpecTemplateSpecValueFrom.fieldRef) &&
        Objects.equals(this.resourceFieldRef, v1GameServerSpecTemplateSpecValueFrom.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, v1GameServerSpecTemplateSpecValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

