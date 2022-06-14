/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.model;

/**
 * Resource locks prevent certain APIs from being called for the resource.
 * A full lock prevents both updating and deleting the resource. A lock delete
 * prevents deleting the resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceLock.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceLock {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "relatedResourceId", "message", "timeCreated"})
    public ResourceLock(
            Type type, String relatedResourceId, String message, java.util.Date timeCreated) {
        super();
        this.type = type;
        this.relatedResourceId = relatedResourceId;
        this.message = message;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Lock type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Lock type.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The resource ID that is locking this resource. Indicates that deleting this resource removes the lock.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
        private String relatedResourceId;

        /**
         * The resource ID that is locking this resource. Indicates that deleting this resource removes the lock.
         *
         * @param relatedResourceId the value to set
         * @return this builder
         **/
        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            this.__explicitlySet__.add("relatedResourceId");
            return this;
        }
        /**
         * A message added by the lock creator. The message typically gives an
         * indication of why the resource is locked.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A message added by the lock creator. The message typically gives an
         * indication of why the resource is locked.
         *
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Indicates when the lock was created, in the format defined by RFC 3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Indicates when the lock was created, in the format defined by RFC 3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceLock build() {
            ResourceLock __instance__ =
                    new ResourceLock(type, relatedResourceId, message, timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceLock o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .relatedResourceId(o.getRelatedResourceId())
                            .message(o.getMessage())
                            .timeCreated(o.getTimeCreated());

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
     * Lock type.
     **/
    public enum Type {
        Full("FULL"),
        Delete("DELETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Lock type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Lock type.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The resource ID that is locking this resource. Indicates that deleting this resource removes the lock.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
    private final String relatedResourceId;

    /**
     * The resource ID that is locking this resource. Indicates that deleting this resource removes the lock.
     *
     * @return the value
     **/
    public String getRelatedResourceId() {
        return relatedResourceId;
    }

    /**
     * A message added by the lock creator. The message typically gives an
     * indication of why the resource is locked.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A message added by the lock creator. The message typically gives an
     * indication of why the resource is locked.
     *
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Indicates when the lock was created, in the format defined by RFC 3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Indicates when the lock was created, in the format defined by RFC 3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceLock(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", relatedResourceId=").append(String.valueOf(this.relatedResourceId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceLock)) {
            return false;
        }

        ResourceLock other = (ResourceLock) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.relatedResourceId, other.relatedResourceId)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResourceId == null ? 43 : this.relatedResourceId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
