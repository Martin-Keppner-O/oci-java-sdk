/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define options for supported add-ons.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddOnOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddOnOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"isKubernetesDashboardEnabled", "isTillerEnabled"})
    public AddOnOptions(Boolean isKubernetesDashboardEnabled, Boolean isTillerEnabled) {
        super();
        this.isKubernetesDashboardEnabled = isKubernetesDashboardEnabled;
        this.isTillerEnabled = isTillerEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether or not to enable the Kubernetes Dashboard add-on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isKubernetesDashboardEnabled")
        private Boolean isKubernetesDashboardEnabled;

        /**
         * Whether or not to enable the Kubernetes Dashboard add-on.
         * @param isKubernetesDashboardEnabled the value to set
         * @return this builder
         **/
        public Builder isKubernetesDashboardEnabled(Boolean isKubernetesDashboardEnabled) {
            this.isKubernetesDashboardEnabled = isKubernetesDashboardEnabled;
            this.__explicitlySet__.add("isKubernetesDashboardEnabled");
            return this;
        }
        /**
         * Whether or not to enable the Tiller add-on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTillerEnabled")
        private Boolean isTillerEnabled;

        /**
         * Whether or not to enable the Tiller add-on.
         * @param isTillerEnabled the value to set
         * @return this builder
         **/
        public Builder isTillerEnabled(Boolean isTillerEnabled) {
            this.isTillerEnabled = isTillerEnabled;
            this.__explicitlySet__.add("isTillerEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddOnOptions build() {
            AddOnOptions __instance__ =
                    new AddOnOptions(isKubernetesDashboardEnabled, isTillerEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddOnOptions o) {
            Builder copiedBuilder =
                    isKubernetesDashboardEnabled(o.getIsKubernetesDashboardEnabled())
                            .isTillerEnabled(o.getIsTillerEnabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Whether or not to enable the Kubernetes Dashboard add-on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isKubernetesDashboardEnabled")
    private final Boolean isKubernetesDashboardEnabled;

    /**
     * Whether or not to enable the Kubernetes Dashboard add-on.
     * @return the value
     **/
    public Boolean getIsKubernetesDashboardEnabled() {
        return isKubernetesDashboardEnabled;
    }

    /**
     * Whether or not to enable the Tiller add-on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTillerEnabled")
    private final Boolean isTillerEnabled;

    /**
     * Whether or not to enable the Tiller add-on.
     * @return the value
     **/
    public Boolean getIsTillerEnabled() {
        return isTillerEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddOnOptions(");
        sb.append("isKubernetesDashboardEnabled=")
                .append(String.valueOf(this.isKubernetesDashboardEnabled));
        sb.append(", isTillerEnabled=").append(String.valueOf(this.isTillerEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddOnOptions)) {
            return false;
        }

        AddOnOptions other = (AddOnOptions) o;
        return java.util.Objects.equals(
                        this.isKubernetesDashboardEnabled, other.isKubernetesDashboardEnabled)
                && java.util.Objects.equals(this.isTillerEnabled, other.isTillerEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isKubernetesDashboardEnabled == null
                                ? 43
                                : this.isKubernetesDashboardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTillerEnabled == null ? 43 : this.isTillerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
