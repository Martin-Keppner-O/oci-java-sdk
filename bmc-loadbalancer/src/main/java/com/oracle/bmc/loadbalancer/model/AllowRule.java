/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of configuring an access control rule. Access control rules permit access
 * to application resources based on user-specified match conditions. This rule applies only to HTTP listeners.
 * <p>
 **NOTES:**
 * *  If you do not specify any access control rules, the default rule is to allow all traffic.
 * *  If you add access control rules, the load balancer denies any traffic that does not match the rules.
 * *  Maximum of two match conditions can be specified in a rule.
 * *  You can specify this rule only with the following {@code RuleCondition} combinations:
 *     *  {@code SOURCE_IP_ADDRESS}
 *     *  {@code SOURCE_VCN_ID}
 *     *  {@code SOURCE_VCN_ID", "SOURCE_VCN_IP_ADDRESS}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AllowRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AllowRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<RuleCondition> conditions;

        public Builder conditions(java.util.List<RuleCondition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }
        /**
         * A brief description of the access control rule. Avoid entering confidential information.
         * <p>
         * example: {@code 192.168.0.0/16 and 2001:db8::/32 are trusted clients. Whitelist them.}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the access control rule. Avoid entering confidential information.
         * <p>
         * example: {@code 192.168.0.0/16 and 2001:db8::/32 are trusted clients. Whitelist them.}
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowRule build() {
            AllowRule __instance__ = new AllowRule(conditions, description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowRule o) {
            Builder copiedBuilder = conditions(o.getConditions()).description(o.getDescription());

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

    @Deprecated
    public AllowRule(java.util.List<RuleCondition> conditions, String description) {
        super();
        this.conditions = conditions;
        this.description = description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private final java.util.List<RuleCondition> conditions;

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * A brief description of the access control rule. Avoid entering confidential information.
     * <p>
     * example: {@code 192.168.0.0/16 and 2001:db8::/32 are trusted clients. Whitelist them.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the access control rule. Avoid entering confidential information.
     * <p>
     * example: {@code 192.168.0.0/16 and 2001:db8::/32 are trusted clients. Whitelist them.}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AllowRule(");
        sb.append("super=").append(super.toString());
        sb.append(", conditions=").append(String.valueOf(this.conditions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowRule)) {
            return false;
        }

        AllowRule other = (AllowRule) o;
        return java.util.Objects.equals(this.conditions, other.conditions)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.conditions == null ? 43 : this.conditions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
