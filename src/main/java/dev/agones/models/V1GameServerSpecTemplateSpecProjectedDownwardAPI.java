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
import dev.agones.models.V1GameServerSpecTemplateSpecDownwardAPIItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * information about the downwardAPI data to project
 */
@ApiModel(description = "information about the downwardAPI data to project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecProjectedDownwardAPI {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1GameServerSpecTemplateSpecDownwardAPIItems> items = null;


  public V1GameServerSpecTemplateSpecProjectedDownwardAPI items(List<V1GameServerSpecTemplateSpecDownwardAPIItems> items) {
    
    this.items = items;
    return this;
  }

  public V1GameServerSpecTemplateSpecProjectedDownwardAPI addItemsItem(V1GameServerSpecTemplateSpecDownwardAPIItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is a list of DownwardAPIVolume file
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")

  public List<V1GameServerSpecTemplateSpecDownwardAPIItems> getItems() {
    return items;
  }


  public void setItems(List<V1GameServerSpecTemplateSpecDownwardAPIItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecProjectedDownwardAPI v1GameServerSpecTemplateSpecProjectedDownwardAPI = (V1GameServerSpecTemplateSpecProjectedDownwardAPI) o;
    return Objects.equals(this.items, v1GameServerSpecTemplateSpecProjectedDownwardAPI.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecProjectedDownwardAPI {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
