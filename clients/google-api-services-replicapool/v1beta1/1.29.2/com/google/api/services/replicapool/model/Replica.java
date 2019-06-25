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

package com.google.api.services.replicapool.model;

/**
 * An individual Replica within a Pool. Replicas are automatically created by the replica pool,
 * using the template provided by the user. You cannot directly create replicas.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Replica extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The name of the Replica object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] The self-link of the Replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Last known status of the Replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplicaStatus status;

  /**
   * [Output Only] The name of the Replica object.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] The name of the Replica object.
   * @param name name or {@code null} for none
   */
  public Replica setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] The self-link of the Replica.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The self-link of the Replica.
   * @param selfLink selfLink or {@code null} for none
   */
  public Replica setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Last known status of the Replica.
   * @return value or {@code null} for none
   */
  public ReplicaStatus getStatus() {
    return status;
  }

  /**
   * [Output Only] Last known status of the Replica.
   * @param status status or {@code null} for none
   */
  public Replica setStatus(ReplicaStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public Replica set(String fieldName, Object value) {
    return (Replica) super.set(fieldName, value);
  }

  @Override
  public Replica clone() {
    return (Replica) super.clone();
  }

}
