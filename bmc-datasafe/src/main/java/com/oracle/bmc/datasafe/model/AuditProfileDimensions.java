/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit profiles.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditProfileDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditProfileDimensions {
    @Deprecated
    @java.beans.ConstructorProperties({"isPaidUsageEnabled"})
    public AuditProfileDimensions(Boolean isPaidUsageEnabled) {
        super();
        this.isPaidUsageEnabled = isPaidUsageEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         **/
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditProfileDimensions build() {
            AuditProfileDimensions __instance__ = new AuditProfileDimensions(isPaidUsageEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditProfileDimensions o) {
            Builder copiedBuilder = isPaidUsageEnabled(o.getIsPaidUsageEnabled());

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
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     * @return the value
     **/
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuditProfileDimensions(");
        sb.append("isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditProfileDimensions)) {
            return false;
        }

        AuditProfileDimensions other = (AuditProfileDimensions) o;
        return java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPaidUsageEnabled == null
                                ? 43
                                : this.isPaidUsageEnabled.hashCode());
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
