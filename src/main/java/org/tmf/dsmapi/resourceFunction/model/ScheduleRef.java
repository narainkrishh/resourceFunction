/*
 * API Resource Function Provisioning and Lifecycle Management
 * API to provision,manage lifecyle of, configure and activate Resource Functions (Network Services in ETSI terminology that could be composed from physical or virtual network functions)
 *
 * OpenAPI spec version: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.tmf.dsmapi.resourceFunction.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ScheduleRef
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
@Entity
public class ScheduleRef   {
    
     @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("ResourceFunctionConfig")
  private ResourceFunction resourceFunctionConfig = null;

  public ScheduleRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleRef href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ScheduleRef resourceFunctionConfig(ResourceFunction resourceFunctionConfig) {
    this.resourceFunctionConfig = resourceFunctionConfig;
    return this;
  }

   /**
   * Get resourceFunctionConfig
   * @return resourceFunctionConfig
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceFunction getResourceFunctionConfig() {
    return resourceFunctionConfig;
  }

  public void setResourceFunctionConfig(ResourceFunction resourceFunctionConfig) {
    this.resourceFunctionConfig = resourceFunctionConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleRef scheduleRef = (ScheduleRef) o;
    return Objects.equals(this.id, scheduleRef.id) &&
        Objects.equals(this.href, scheduleRef.href) &&
        Objects.equals(this.resourceFunctionConfig, scheduleRef.resourceFunctionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, resourceFunctionConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    resourceFunctionConfig: ").append(toIndentedString(resourceFunctionConfig)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
