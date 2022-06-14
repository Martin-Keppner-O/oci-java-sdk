/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * An entry for blocklist to describe blocked operation and reason.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BlocklistEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlocklistEntry {
    @Deprecated
    @java.beans.ConstructorProperties({"operation", "reason"})
    public BlocklistEntry(OperationType operation, String reason) {
        super();
        this.operation = operation;
        this.reason = reason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The operation type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private OperationType operation;

        /**
         * The operation type.
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(OperationType operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /**
         * The reason why the operation is blocklisted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * The reason why the operation is blocklisted.
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlocklistEntry build() {
            BlocklistEntry __instance__ = new BlocklistEntry(operation, reason);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlocklistEntry o) {
            Builder copiedBuilder = operation(o.getOperation()).reason(o.getReason());

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
     * The operation type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final OperationType operation;

    /**
     * The operation type.
     * @return the value
     **/
    public OperationType getOperation() {
        return operation;
    }

    /**
     * The reason why the operation is blocklisted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * The reason why the operation is blocklisted.
     * @return the value
     **/
    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BlocklistEntry(");
        sb.append("operation=").append(String.valueOf(this.operation));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlocklistEntry)) {
            return false;
        }

        BlocklistEntry other = (BlocklistEntry) o;
        return java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
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
