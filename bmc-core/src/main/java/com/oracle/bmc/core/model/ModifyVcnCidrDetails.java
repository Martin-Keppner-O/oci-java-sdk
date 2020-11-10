/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Contains the original CIDR that needs to be updated and the
 * new CIDR which will replace the original CIDR.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModifyVcnCidrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModifyVcnCidrDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("originalCidrBlock")
        private String originalCidrBlock;

        public Builder originalCidrBlock(String originalCidrBlock) {
            this.originalCidrBlock = originalCidrBlock;
            this.__explicitlySet__.add("originalCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newCidrBlock")
        private String newCidrBlock;

        public Builder newCidrBlock(String newCidrBlock) {
            this.newCidrBlock = newCidrBlock;
            this.__explicitlySet__.add("newCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyVcnCidrDetails build() {
            ModifyVcnCidrDetails __instance__ =
                    new ModifyVcnCidrDetails(originalCidrBlock, newCidrBlock);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyVcnCidrDetails o) {
            Builder copiedBuilder =
                    originalCidrBlock(o.getOriginalCidrBlock()).newCidrBlock(o.getNewCidrBlock());

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

    /**
     * The CIDR IP address that needs to be updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalCidrBlock")
    String originalCidrBlock;

    /**
     * The new CIDR IP address which will replace the orginal one.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newCidrBlock")
    String newCidrBlock;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
