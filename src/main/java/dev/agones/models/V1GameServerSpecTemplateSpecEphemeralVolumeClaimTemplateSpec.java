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
import dev.agones.models.V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSource;
import dev.agones.models.V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSourceRef;
import dev.agones.models.V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecResources;
import dev.agones.models.V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
 */
@ApiModel(description = "The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSource dataSource;

  public static final String SERIALIZED_NAME_DATA_SOURCE_REF = "dataSourceRef";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_REF)
  private V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecResources resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec accessModes(List<String> accessModes) {
    
    this.accessModes = accessModes;
    return this;
  }

  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")

  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec dataSource(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
    return dataSource;
  }


  public void setDataSource(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
    this.dataSource = dataSource;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec dataSourceRef(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
    
    this.dataSourceRef = dataSourceRef;
    return this;
  }

   /**
   * Get dataSourceRef
   * @return dataSourceRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSourceRef getDataSourceRef() {
    return dataSourceRef;
  }


  public void setDataSourceRef(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec resources(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecResources getResources() {
    return resources;
  }


  public void setResources(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecResources resources) {
    this.resources = resources;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec selector(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecSelector getSelector() {
    return selector;
  }


  public void setSelector(V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpecSelector selector) {
    this.selector = selector;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec volumeMode(String volumeMode) {
    
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
   * @return volumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")

  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec = (V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec) o;
    return Objects.equals(this.accessModes, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.accessModes) &&
        Objects.equals(this.dataSource, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.dataSource) &&
        Objects.equals(this.dataSourceRef, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.dataSourceRef) &&
        Objects.equals(this.resources, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.resources) &&
        Objects.equals(this.selector, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.selector) &&
        Objects.equals(this.storageClassName, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.storageClassName) &&
        Objects.equals(this.volumeMode, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.volumeMode) &&
        Objects.equals(this.volumeName, v1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, dataSourceRef, resources, selector, storageClassName, volumeMode, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecEphemeralVolumeClaimTemplateSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    dataSourceRef: ").append(toIndentedString(dataSourceRef)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

