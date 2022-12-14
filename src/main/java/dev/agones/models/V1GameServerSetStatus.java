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
 * GameServerSetStatus is the status of a GameServerSet. More info: https://agones.dev/site/docs/reference/agones_crd_api_reference/#agones.dev/v1.GameServerSet
 */
@ApiModel(description = "GameServerSetStatus is the status of a GameServerSet. More info: https://agones.dev/site/docs/reference/agones_crd_api_reference/#agones.dev/v1.GameServerSet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSetStatus {
  public static final String SERIALIZED_NAME_ALLOCATED_REPLICAS = "allocatedReplicas";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_REPLICAS)
  private Integer allocatedReplicas;

  public static final String SERIALIZED_NAME_PLAYERS = "players";
  @SerializedName(SERIALIZED_NAME_PLAYERS)
  private Object players;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESERVED_REPLICAS = "reservedReplicas";
  @SerializedName(SERIALIZED_NAME_RESERVED_REPLICAS)
  private Integer reservedReplicas;

  public static final String SERIALIZED_NAME_SHUTDOWN_REPLICAS = "shutdownReplicas";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_REPLICAS)
  private Integer shutdownReplicas;


  public V1GameServerSetStatus allocatedReplicas(Integer allocatedReplicas) {
    
    this.allocatedReplicas = allocatedReplicas;
    return this;
  }

   /**
   * Get allocatedReplicas
   * minimum: 0
   * @return allocatedReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocatedReplicas() {
    return allocatedReplicas;
  }


  public void setAllocatedReplicas(Integer allocatedReplicas) {
    this.allocatedReplicas = allocatedReplicas;
  }


  public V1GameServerSetStatus players(Object players) {
    
    this.players = players;
    return this;
  }

   /**
   * Get players
   * @return players
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPlayers() {
    return players;
  }


  public void setPlayers(Object players) {
    this.players = players;
  }


  public V1GameServerSetStatus readyReplicas(Integer readyReplicas) {
    
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * Get readyReplicas
   * minimum: 0
   * @return readyReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1GameServerSetStatus replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * minimum: 0
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1GameServerSetStatus reservedReplicas(Integer reservedReplicas) {
    
    this.reservedReplicas = reservedReplicas;
    return this;
  }

   /**
   * Get reservedReplicas
   * minimum: 0
   * @return reservedReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReservedReplicas() {
    return reservedReplicas;
  }


  public void setReservedReplicas(Integer reservedReplicas) {
    this.reservedReplicas = reservedReplicas;
  }


  public V1GameServerSetStatus shutdownReplicas(Integer shutdownReplicas) {
    
    this.shutdownReplicas = shutdownReplicas;
    return this;
  }

   /**
   * Get shutdownReplicas
   * minimum: 0
   * @return shutdownReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShutdownReplicas() {
    return shutdownReplicas;
  }


  public void setShutdownReplicas(Integer shutdownReplicas) {
    this.shutdownReplicas = shutdownReplicas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSetStatus v1GameServerSetStatus = (V1GameServerSetStatus) o;
    return Objects.equals(this.allocatedReplicas, v1GameServerSetStatus.allocatedReplicas) &&
        Objects.equals(this.players, v1GameServerSetStatus.players) &&
        Objects.equals(this.readyReplicas, v1GameServerSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1GameServerSetStatus.replicas) &&
        Objects.equals(this.reservedReplicas, v1GameServerSetStatus.reservedReplicas) &&
        Objects.equals(this.shutdownReplicas, v1GameServerSetStatus.shutdownReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedReplicas, players, readyReplicas, replicas, reservedReplicas, shutdownReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSetStatus {\n");
    sb.append("    allocatedReplicas: ").append(toIndentedString(allocatedReplicas)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    reservedReplicas: ").append(toIndentedString(reservedReplicas)).append("\n");
    sb.append("    shutdownReplicas: ").append(toIndentedString(shutdownReplicas)).append("\n");
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

