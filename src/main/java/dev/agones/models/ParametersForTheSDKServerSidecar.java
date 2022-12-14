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
 * ParametersForTheSDKServerSidecar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class ParametersForTheSDKServerSidecar {
  public static final String SERIALIZED_NAME_GRPC_PORT = "grpcPort";
  @SerializedName(SERIALIZED_NAME_GRPC_PORT)
  private Integer grpcPort;

  public static final String SERIALIZED_NAME_HTTP_PORT = "httpPort";
  @SerializedName(SERIALIZED_NAME_HTTP_PORT)
  private Integer httpPort;

  /**
   * sdkServer log level parameter has three options: - \&quot;Info\&quot; (default) The SDK server will output all messages except for debug messages - \&quot;Debug\&quot; The SDK server will output all messages including debug messages - \&quot;Error\&quot; The SDK server will only output error messages 
   */
  @JsonAdapter(LogLevelEnum.Adapter.class)
  public enum LogLevelEnum {
    ERROR("Error"),
    
    INFO("Info"),
    
    DEBUG("Debug");

    private String value;

    LogLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogLevelEnum fromValue(String value) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LogLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOG_LEVEL = "logLevel";
  @SerializedName(SERIALIZED_NAME_LOG_LEVEL)
  private LogLevelEnum logLevel;


  public ParametersForTheSDKServerSidecar grpcPort(Integer grpcPort) {
    
    this.grpcPort = grpcPort;
    return this;
  }

   /**
   * Starting with Agones 1.2 the default gRPC port is 9357. In earlier releases, the default was 59357. 
   * minimum: 1
   * maximum: 65535
   * @return grpcPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting with Agones 1.2 the default gRPC port is 9357. In earlier releases, the default was 59357. ")

  public Integer getGrpcPort() {
    return grpcPort;
  }


  public void setGrpcPort(Integer grpcPort) {
    this.grpcPort = grpcPort;
  }


  public ParametersForTheSDKServerSidecar httpPort(Integer httpPort) {
    
    this.httpPort = httpPort;
    return this;
  }

   /**
   * Starting with Agones 1.2 the default HTTP port is 9358. In earlier releases, the default was 59358. 
   * minimum: 1
   * maximum: 65535
   * @return httpPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting with Agones 1.2 the default HTTP port is 9358. In earlier releases, the default was 59358. ")

  public Integer getHttpPort() {
    return httpPort;
  }


  public void setHttpPort(Integer httpPort) {
    this.httpPort = httpPort;
  }


  public ParametersForTheSDKServerSidecar logLevel(LogLevelEnum logLevel) {
    
    this.logLevel = logLevel;
    return this;
  }

   /**
   * sdkServer log level parameter has three options: - \&quot;Info\&quot; (default) The SDK server will output all messages except for debug messages - \&quot;Debug\&quot; The SDK server will output all messages including debug messages - \&quot;Error\&quot; The SDK server will only output error messages 
   * @return logLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sdkServer log level parameter has three options: - \"Info\" (default) The SDK server will output all messages except for debug messages - \"Debug\" The SDK server will output all messages including debug messages - \"Error\" The SDK server will only output error messages ")

  public LogLevelEnum getLogLevel() {
    return logLevel;
  }


  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametersForTheSDKServerSidecar parametersForTheSDKServerSidecar = (ParametersForTheSDKServerSidecar) o;
    return Objects.equals(this.grpcPort, parametersForTheSDKServerSidecar.grpcPort) &&
        Objects.equals(this.httpPort, parametersForTheSDKServerSidecar.httpPort) &&
        Objects.equals(this.logLevel, parametersForTheSDKServerSidecar.logLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grpcPort, httpPort, logLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametersForTheSDKServerSidecar {\n");
    sb.append("    grpcPort: ").append(toIndentedString(grpcPort)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
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

