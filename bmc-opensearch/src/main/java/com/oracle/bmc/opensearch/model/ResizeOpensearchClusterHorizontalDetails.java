/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The node count configuration to update on an existing OpenSearch cluster for [horizontal
 * resizing](https://docs.cloud.oracle.com/iaas/Content/search-opensearch/Tasks/resizingacluster.htm#horizontalresize).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResizeOpensearchClusterHorizontalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResizeOpensearchClusterHorizontalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "masterNodeCount",
        "dataNodeCount",
        "opendashboardNodeCount",
        "freeformTags",
        "definedTags"
    })
    public ResizeOpensearchClusterHorizontalDetails(
            Integer masterNodeCount,
            Integer dataNodeCount,
            Integer opendashboardNodeCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.masterNodeCount = masterNodeCount;
        this.dataNodeCount = dataNodeCount;
        this.opendashboardNodeCount = opendashboardNodeCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of master nodes to configure for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeCount")
        private Integer masterNodeCount;

        /**
         * The number of master nodes to configure for the cluster.
         *
         * @param masterNodeCount the value to set
         * @return this builder
         */
        public Builder masterNodeCount(Integer masterNodeCount) {
            this.masterNodeCount = masterNodeCount;
            this.__explicitlySet__.add("masterNodeCount");
            return this;
        }
        /** The number of data nodes to configure for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeCount")
        private Integer dataNodeCount;

        /**
         * The number of data nodes to configure for the cluster.
         *
         * @param dataNodeCount the value to set
         * @return this builder
         */
        public Builder dataNodeCount(Integer dataNodeCount) {
            this.dataNodeCount = dataNodeCount;
            this.__explicitlySet__.add("dataNodeCount");
            return this;
        }
        /** The number of OpenSearch Dashboard nodes to configure for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeCount")
        private Integer opendashboardNodeCount;

        /**
         * The number of OpenSearch Dashboard nodes to configure for the cluster.
         *
         * @param opendashboardNodeCount the value to set
         * @return this builder
         */
        public Builder opendashboardNodeCount(Integer opendashboardNodeCount) {
            this.opendashboardNodeCount = opendashboardNodeCount;
            this.__explicitlySet__.add("opendashboardNodeCount");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResizeOpensearchClusterHorizontalDetails build() {
            ResizeOpensearchClusterHorizontalDetails model =
                    new ResizeOpensearchClusterHorizontalDetails(
                            this.masterNodeCount,
                            this.dataNodeCount,
                            this.opendashboardNodeCount,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResizeOpensearchClusterHorizontalDetails model) {
            if (model.wasPropertyExplicitlySet("masterNodeCount")) {
                this.masterNodeCount(model.getMasterNodeCount());
            }
            if (model.wasPropertyExplicitlySet("dataNodeCount")) {
                this.dataNodeCount(model.getDataNodeCount());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeCount")) {
                this.opendashboardNodeCount(model.getOpendashboardNodeCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The number of master nodes to configure for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeCount")
    private final Integer masterNodeCount;

    /**
     * The number of master nodes to configure for the cluster.
     *
     * @return the value
     */
    public Integer getMasterNodeCount() {
        return masterNodeCount;
    }

    /** The number of data nodes to configure for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeCount")
    private final Integer dataNodeCount;

    /**
     * The number of data nodes to configure for the cluster.
     *
     * @return the value
     */
    public Integer getDataNodeCount() {
        return dataNodeCount;
    }

    /** The number of OpenSearch Dashboard nodes to configure for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeCount")
    private final Integer opendashboardNodeCount;

    /**
     * The number of OpenSearch Dashboard nodes to configure for the cluster.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeCount() {
        return opendashboardNodeCount;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResizeOpensearchClusterHorizontalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("masterNodeCount=").append(String.valueOf(this.masterNodeCount));
        sb.append(", dataNodeCount=").append(String.valueOf(this.dataNodeCount));
        sb.append(", opendashboardNodeCount=").append(String.valueOf(this.opendashboardNodeCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResizeOpensearchClusterHorizontalDetails)) {
            return false;
        }

        ResizeOpensearchClusterHorizontalDetails other =
                (ResizeOpensearchClusterHorizontalDetails) o;
        return java.util.Objects.equals(this.masterNodeCount, other.masterNodeCount)
                && java.util.Objects.equals(this.dataNodeCount, other.dataNodeCount)
                && java.util.Objects.equals(
                        this.opendashboardNodeCount, other.opendashboardNodeCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.masterNodeCount == null ? 43 : this.masterNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeCount == null ? 43 : this.dataNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeCount == null
                                ? 43
                                : this.opendashboardNodeCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
