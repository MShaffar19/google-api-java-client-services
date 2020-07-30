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
 * Details about the Agones resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetDetails extends com.google.api.client.json.GenericJson {

  /**
   * Agones fleet details for game server clusters and game server deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TargetFleetDetails> fleetDetails;

  /**
   * The game server cluster name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gameServerClusterName;

  /**
   * The game server deployment name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gameServerDeploymentName;

  /**
   * Agones fleet details for game server clusters and game server deployments.
   * @return value or {@code null} for none
   */
  public java.util.List<TargetFleetDetails> getFleetDetails() {
    return fleetDetails;
  }

  /**
   * Agones fleet details for game server clusters and game server deployments.
   * @param fleetDetails fleetDetails or {@code null} for none
   */
  public TargetDetails setFleetDetails(java.util.List<TargetFleetDetails> fleetDetails) {
    this.fleetDetails = fleetDetails;
    return this;
  }

  /**
   * The game server cluster name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGameServerClusterName() {
    return gameServerClusterName;
  }

  /**
   * The game server cluster name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * @param gameServerClusterName gameServerClusterName or {@code null} for none
   */
  public TargetDetails setGameServerClusterName(java.lang.String gameServerClusterName) {
    this.gameServerClusterName = gameServerClusterName;
    return this;
  }

  /**
   * The game server deployment name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGameServerDeploymentName() {
    return gameServerDeploymentName;
  }

  /**
   * The game server deployment name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`.
   * @param gameServerDeploymentName gameServerDeploymentName or {@code null} for none
   */
  public TargetDetails setGameServerDeploymentName(java.lang.String gameServerDeploymentName) {
    this.gameServerDeploymentName = gameServerDeploymentName;
    return this;
  }

  @Override
  public TargetDetails set(String fieldName, Object value) {
    return (TargetDetails) super.set(fieldName, value);
  }

  @Override
  public TargetDetails clone() {
    return (TargetDetails) super.clone();
  }

}
