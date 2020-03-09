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

package com.google.api.services.container.model;

/**
 * CreateClusterRequest creates a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateClusterRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A [cluster resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Cluster cluster;

  /**
   * The parent (project and location) where the cluster will be created. Specified in the format
   * 'projects/locations'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the parent field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the parent field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. A [cluster resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * @return value or {@code null} for none
   */
  public Cluster getCluster() {
    return cluster;
  }

  /**
   * Required. A [cluster resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * @param cluster cluster or {@code null} for none
   */
  public CreateClusterRequest setCluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * The parent (project and location) where the cluster will be created. Specified in the format
   * 'projects/locations'.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The parent (project and location) where the cluster will be created. Specified in the format
   * 'projects/locations'.
   * @param parent parent or {@code null} for none
   */
  public CreateClusterRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the parent field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the parent field.
   * @param projectId projectId or {@code null} for none
   */
  public CreateClusterRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the parent field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the parent field.
   * @param zone zone or {@code null} for none
   */
  public CreateClusterRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public CreateClusterRequest set(String fieldName, Object value) {
    return (CreateClusterRequest) super.set(fieldName, value);
  }

  @Override
  public CreateClusterRequest clone() {
    return (CreateClusterRequest) super.clone();
  }

}
