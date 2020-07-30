/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.gameservices.v1.model;

/**
 * A game server cluster resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GameServerCluster extends com.google.api.client.json.GenericJson {

  /**
   * The game server cluster connection information. This information is used to manage game server
   * clusters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GameServerClusterConnectionInfo connectionInfo;

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Human readable description of the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The labels associated with this game server cluster. Each label is a key-value pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The resource name of the game server cluster. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For
   * example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-
   * onprem-cluster`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The game server cluster connection information. This information is used to manage game server
   * clusters.
   * @return value or {@code null} for none
   */
  public GameServerClusterConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }

  /**
   * The game server cluster connection information. This information is used to manage game server
   * clusters.
   * @param connectionInfo connectionInfo or {@code null} for none
   */
  public GameServerCluster setConnectionInfo(GameServerClusterConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
    return this;
  }

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public GameServerCluster setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Human readable description of the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human readable description of the cluster.
   * @param description description or {@code null} for none
   */
  public GameServerCluster setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public GameServerCluster setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The labels associated with this game server cluster. Each label is a key-value pair.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this game server cluster. Each label is a key-value pair.
   * @param labels labels or {@code null} for none
   */
  public GameServerCluster setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The resource name of the game server cluster. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For
   * example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-
   * onprem-cluster`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource name of the game server cluster. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For
   * example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-
   * onprem-cluster`.
   * @param name name or {@code null} for none
   */
  public GameServerCluster setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GameServerCluster setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GameServerCluster set(String fieldName, Object value) {
    return (GameServerCluster) super.set(fieldName, value);
  }

  @Override
  public GameServerCluster clone() {
    return (GameServerCluster) super.clone();
  }

}
