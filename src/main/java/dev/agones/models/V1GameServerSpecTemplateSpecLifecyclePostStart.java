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
import dev.agones.models.V1GameServerSpecTemplateSpecLifecyclePostStartExec;
import dev.agones.models.V1GameServerSpecTemplateSpecLifecyclePostStartHttpGet;
import dev.agones.models.V1GameServerSpecTemplateSpecLifecyclePostStartTcpSocket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 */
@ApiModel(description = "PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T08:25:17.075Z[Etc/UTC]")
public class V1GameServerSpecTemplateSpecLifecyclePostStart {
  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1GameServerSpecTemplateSpecLifecyclePostStartExec exec;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";
  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1GameServerSpecTemplateSpecLifecyclePostStartHttpGet httpGet;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";
  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1GameServerSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket;


  public V1GameServerSpecTemplateSpecLifecyclePostStart exec(V1GameServerSpecTemplateSpecLifecyclePostStartExec exec) {
    
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecLifecyclePostStartExec getExec() {
    return exec;
  }


  public void setExec(V1GameServerSpecTemplateSpecLifecyclePostStartExec exec) {
    this.exec = exec;
  }


  public V1GameServerSpecTemplateSpecLifecyclePostStart httpGet(V1GameServerSpecTemplateSpecLifecyclePostStartHttpGet httpGet) {
    
    this.httpGet = httpGet;
    return this;
  }

   /**
   * Get httpGet
   * @return httpGet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecLifecyclePostStartHttpGet getHttpGet() {
    return httpGet;
  }


  public void setHttpGet(V1GameServerSpecTemplateSpecLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
  }


  public V1GameServerSpecTemplateSpecLifecyclePostStart tcpSocket(V1GameServerSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket) {
    
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Get tcpSocket
   * @return tcpSocket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GameServerSpecTemplateSpecLifecyclePostStartTcpSocket getTcpSocket() {
    return tcpSocket;
  }


  public void setTcpSocket(V1GameServerSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GameServerSpecTemplateSpecLifecyclePostStart v1GameServerSpecTemplateSpecLifecyclePostStart = (V1GameServerSpecTemplateSpecLifecyclePostStart) o;
    return Objects.equals(this.exec, v1GameServerSpecTemplateSpecLifecyclePostStart.exec) &&
        Objects.equals(this.httpGet, v1GameServerSpecTemplateSpecLifecyclePostStart.httpGet) &&
        Objects.equals(this.tcpSocket, v1GameServerSpecTemplateSpecLifecyclePostStart.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GameServerSpecTemplateSpecLifecyclePostStart {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

