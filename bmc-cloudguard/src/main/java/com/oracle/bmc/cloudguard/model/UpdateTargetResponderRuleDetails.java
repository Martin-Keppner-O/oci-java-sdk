/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of ResponderRule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTargetResponderRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTargetResponderRuleDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"condition", "configurations", "mode"})
    public UpdateTargetResponderRuleDetails(
            Condition condition,
            java.util.List<ResponderConfiguration> configurations,
            ResponderModeTypes mode) {
        super();
        this.condition = condition;
        this.configurations = configurations;
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * Configurations associated with the ResponderRule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<ResponderConfiguration> configurations;

        /**
         * Configurations associated with the ResponderRule
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(java.util.List<ResponderConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }
        /**
         * Execution Mode for ResponderRule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private ResponderModeTypes mode;

        /**
         * Execution Mode for ResponderRule
         * @param mode the value to set
         * @return this builder
         **/
        public Builder mode(ResponderModeTypes mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTargetResponderRuleDetails build() {
            UpdateTargetResponderRuleDetails __instance__ =
                    new UpdateTargetResponderRuleDetails(condition, configurations, mode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTargetResponderRuleDetails o) {
            Builder copiedBuilder =
                    condition(o.getCondition())
                            .configurations(o.getConfigurations())
                            .mode(o.getMode());

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

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    public Condition getCondition() {
        return condition;
    }

    /**
     * Configurations associated with the ResponderRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<ResponderConfiguration> configurations;

    /**
     * Configurations associated with the ResponderRule
     * @return the value
     **/
    public java.util.List<ResponderConfiguration> getConfigurations() {
        return configurations;
    }

    /**
     * Execution Mode for ResponderRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final ResponderModeTypes mode;

    /**
     * Execution Mode for ResponderRule
     * @return the value
     **/
    public ResponderModeTypes getMode() {
        return mode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateTargetResponderRuleDetails(");
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTargetResponderRuleDetails)) {
            return false;
        }

        UpdateTargetResponderRuleDetails other = (UpdateTargetResponderRuleDetails) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
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
