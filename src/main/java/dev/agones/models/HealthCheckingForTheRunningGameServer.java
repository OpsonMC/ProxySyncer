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
 * HealthCheckingForTheRunningGameServer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class HealthCheckingForTheRunningGameServer {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";
  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;


  public HealthCheckingForTheRunningGameServer disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public HealthCheckingForTheRunningGameServer failureThreshold(Integer failureThreshold) {
    
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Get failureThreshold
   * minimum: 1
   * maximum: 2147483648
   * @return failureThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailureThreshold() {
    return failureThreshold;
  }


  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }


  public HealthCheckingForTheRunningGameServer initialDelaySeconds(Integer initialDelaySeconds) {
    
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Get initialDelaySeconds
   * minimum: 0
   * maximum: 2147483648
   * @return initialDelaySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }


  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public HealthCheckingForTheRunningGameServer periodSeconds(Integer periodSeconds) {
    
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * Get periodSeconds
   * minimum: 0
   * maximum: 2147483648
   * @return periodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPeriodSeconds() {
    return periodSeconds;
  }


  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckingForTheRunningGameServer healthCheckingForTheRunningGameServer = (HealthCheckingForTheRunningGameServer) o;
    return Objects.equals(this.disabled, healthCheckingForTheRunningGameServer.disabled) &&
        Objects.equals(this.failureThreshold, healthCheckingForTheRunningGameServer.failureThreshold) &&
        Objects.equals(this.initialDelaySeconds, healthCheckingForTheRunningGameServer.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, healthCheckingForTheRunningGameServer.periodSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, failureThreshold, initialDelaySeconds, periodSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckingForTheRunningGameServer {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
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
