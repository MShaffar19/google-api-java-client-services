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
 * StartIPRotationRequest creates a new IP for the cluster and then performs a node upgrade on each
 * node pool to point to the new IP.
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
public final class StartIPRotationRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster. This field has been deprecated and replaced by the name
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The name (project, location, cluster id) of the cluster to start IP rotation. Specified in the
   * format 'projects/locations/clusters'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Whether to rotate credentials during IP rotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rotateCredentials;

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Deprecated. The name of the cluster. This field has been deprecated and replaced by the name
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster. This field has been deprecated and replaced by the name
   * field.
   * @param clusterId clusterId or {@code null} for none
   */
  public StartIPRotationRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The name (project, location, cluster id) of the cluster to start IP rotation. Specified in the
   * format 'projects/locations/clusters'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster id) of the cluster to start IP rotation. Specified in the
   * format 'projects/locations/clusters'.
   * @param name name or {@code null} for none
   */
  public StartIPRotationRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public StartIPRotationRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Whether to rotate credentials during IP rotation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRotateCredentials() {
    return rotateCredentials;
  }

  /**
   * Whether to rotate credentials during IP rotation.
   * @param rotateCredentials rotateCredentials or {@code null} for none
   */
  public StartIPRotationRequest setRotateCredentials(java.lang.Boolean rotateCredentials) {
    this.rotateCredentials = rotateCredentials;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public StartIPRotationRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public StartIPRotationRequest set(String fieldName, Object value) {
    return (StartIPRotationRequest) super.set(fieldName, value);
  }

  @Override
  public StartIPRotationRequest clone() {
    return (StartIPRotationRequest) super.clone();
  }

}
