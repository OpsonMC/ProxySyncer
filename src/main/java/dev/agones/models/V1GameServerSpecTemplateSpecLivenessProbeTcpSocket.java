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
 * TCPSocket specifies an action involving a TCP port.
 */
@ApiModel(description = "TCPSocket specifies an action involving a TCP port.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecLivenessProbeTcpSocket {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;


  public V1GameServerSpecTemplateSpecLivenessProbeTcpSocket host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Optional: Host name to connect to, defaults to the pod IP.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Host name to connect to, defaults to the pod IP.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public V1GameServerSpecTemplateSpecLivenessProbeTcpSocket port(Object port) {
    
    this.port = port;
    return this;
  }

   /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")

  public Object getPort() {
    return port;
  }


  public void setPort(Object port) {
    this.port = port;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecLivenessProbeTcpSocket v1GameServerSpecTemplateSpecLivenessProbeTcpSocket = (V1GameServerSpecTemplateSpecLivenessProbeTcpSocket) o;
    return Objects.equals(this.host, v1GameServerSpecTemplateSpecLivenessProbeTcpSocket.host) &&
        Objects.equals(this.port, v1GameServerSpecTemplateSpecLivenessProbeTcpSocket.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecLivenessProbeTcpSocket {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

