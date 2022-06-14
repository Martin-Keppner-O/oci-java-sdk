/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming Virtual Service traffic with HTTP protocol
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HttpVirtualServiceTrafficRouteRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HttpVirtualServiceTrafficRouteRule extends VirtualServiceTrafficRouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<VirtualDeploymentTrafficRuleTarget> destinations;

        public Builder destinations(
                java.util.List<VirtualDeploymentTrafficRuleTarget> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }
        /**
         * Route to match
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Route to match
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Match type for the route
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pathType")
        private PathType pathType;

        /**
         * Match type for the route
         * @param pathType the value to set
         * @return this builder
         **/
        public Builder pathType(PathType pathType) {
            this.pathType = pathType;
            this.__explicitlySet__.add("pathType");
            return this;
        }
        /**
         * If true, the rule will check that the content-type header has a application/grpc
         * or one of the various application/grpc+ values.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
        private Boolean isGrpc;

        /**
         * If true, the rule will check that the content-type header has a application/grpc
         * or one of the various application/grpc+ values.
         *
         * @param isGrpc the value to set
         * @return this builder
         **/
        public Builder isGrpc(Boolean isGrpc) {
            this.isGrpc = isGrpc;
            this.__explicitlySet__.add("isGrpc");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpVirtualServiceTrafficRouteRule build() {
            HttpVirtualServiceTrafficRouteRule __instance__ =
                    new HttpVirtualServiceTrafficRouteRule(destinations, path, pathType, isGrpc);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpVirtualServiceTrafficRouteRule o) {
            Builder copiedBuilder =
                    destinations(o.getDestinations())
                            .path(o.getPath())
                            .pathType(o.getPathType())
                            .isGrpc(o.getIsGrpc());

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
    public HttpVirtualServiceTrafficRouteRule(
            java.util.List<VirtualDeploymentTrafficRuleTarget> destinations,
            String path,
            PathType pathType,
            Boolean isGrpc) {
        super(destinations);
        this.path = path;
        this.pathType = pathType;
        this.isGrpc = isGrpc;
    }

    /**
     * Route to match
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Route to match
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * Match type for the route
     **/
    public enum PathType {
        Prefix("PREFIX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PathType.class);

        private final String value;
        private static java.util.Map<String, PathType> map;

        static {
            map = new java.util.HashMap<>();
            for (PathType v : PathType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PathType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PathType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PathType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Match type for the route
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathType")
    private final PathType pathType;

    /**
     * Match type for the route
     * @return the value
     **/
    public PathType getPathType() {
        return pathType;
    }

    /**
     * If true, the rule will check that the content-type header has a application/grpc
     * or one of the various application/grpc+ values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
    private final Boolean isGrpc;

    /**
     * If true, the rule will check that the content-type header has a application/grpc
     * or one of the various application/grpc+ values.
     *
     * @return the value
     **/
    public Boolean getIsGrpc() {
        return isGrpc;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HttpVirtualServiceTrafficRouteRule(");
        sb.append("super=").append(super.toString());
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", pathType=").append(String.valueOf(this.pathType));
        sb.append(", isGrpc=").append(String.valueOf(this.isGrpc));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpVirtualServiceTrafficRouteRule)) {
            return false;
        }

        HttpVirtualServiceTrafficRouteRule other = (HttpVirtualServiceTrafficRouteRule) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.pathType, other.pathType)
                && java.util.Objects.equals(this.isGrpc, other.isGrpc)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.pathType == null ? 43 : this.pathType.hashCode());
        result = (result * PRIME) + (this.isGrpc == null ? 43 : this.isGrpc.hashCode());
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
