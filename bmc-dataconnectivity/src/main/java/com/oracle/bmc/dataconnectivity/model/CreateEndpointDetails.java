/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The information about new Endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateEndpointDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcnId",
        "subnetId",
        "dnsZones",
        "freeformTags",
        "definedTags",
        "description",
        "displayName",
        "compartmentId",
        "endpointSize",
        "nsgIds"
    })
    public CreateEndpointDetails(
            String vcnId,
            String subnetId,
            java.util.List<String> dnsZones,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            String compartmentId,
            Integer endpointSize,
            java.util.List<String> nsgIds) {
        super();
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.dnsZones = dnsZones;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.endpointSize = endpointSize;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * VCN Identifier where the subnet resides.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * VCN Identifier where the subnet resides.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * Subnet Identifier for customer connected databases
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Subnet Identifier for customer connected databases
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * List of DNS zones to be used by the data assets to be harvested.
         * Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
        private java.util.List<String> dnsZones;

        /**
         * List of DNS zones to be used by the data assets to be harvested.
         * Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
         *
         * @param dnsZones the value to set
         * @return this builder
         **/
        public Builder dnsZones(java.util.List<String> dnsZones) {
            this.dnsZones = dnsZones;
            this.__explicitlySet__.add("dnsZones");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Data Connectivity Management Registry description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Data Connectivity Management Registry description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Data Connectivity Management Registry display name, registries can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Data Connectivity Management Registry display name, registries can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Endpoint size for reverse connection capacity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointSize")
        private Integer endpointSize;

        /**
         * Endpoint size for reverse connection capacity.
         * @param endpointSize the value to set
         * @return this builder
         **/
        public Builder endpointSize(Integer endpointSize) {
            this.endpointSize = endpointSize;
            this.__explicitlySet__.add("endpointSize");
            return this;
        }
        /**
         * List of NSGs to which the Private Endpoint VNIC must be added.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * List of NSGs to which the Private Endpoint VNIC must be added.
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEndpointDetails build() {
            CreateEndpointDetails __instance__ =
                    new CreateEndpointDetails(
                            vcnId,
                            subnetId,
                            dnsZones,
                            freeformTags,
                            definedTags,
                            description,
                            displayName,
                            compartmentId,
                            endpointSize,
                            nsgIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEndpointDetails o) {
            Builder copiedBuilder =
                    vcnId(o.getVcnId())
                            .subnetId(o.getSubnetId())
                            .dnsZones(o.getDnsZones())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .endpointSize(o.getEndpointSize())
                            .nsgIds(o.getNsgIds());

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
     * VCN Identifier where the subnet resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * VCN Identifier where the subnet resides.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * Subnet Identifier for customer connected databases
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Subnet Identifier for customer connected databases
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * List of DNS zones to be used by the data assets to be harvested.
     * Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
    private final java.util.List<String> dnsZones;

    /**
     * List of DNS zones to be used by the data assets to be harvested.
     * Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     *
     * @return the value
     **/
    public java.util.List<String> getDnsZones() {
        return dnsZones;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Data Connectivity Management Registry description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Data Connectivity Management Registry description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Data Connectivity Management Registry display name, registries can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Data Connectivity Management Registry display name, registries can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Endpoint size for reverse connection capacity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointSize")
    private final Integer endpointSize;

    /**
     * Endpoint size for reverse connection capacity.
     * @return the value
     **/
    public Integer getEndpointSize() {
        return endpointSize;
    }

    /**
     * List of NSGs to which the Private Endpoint VNIC must be added.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * List of NSGs to which the Private Endpoint VNIC must be added.
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateEndpointDetails(");
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", dnsZones=").append(String.valueOf(this.dnsZones));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", endpointSize=").append(String.valueOf(this.endpointSize));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEndpointDetails)) {
            return false;
        }

        CreateEndpointDetails other = (CreateEndpointDetails) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.dnsZones, other.dnsZones)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.endpointSize, other.endpointSize)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.dnsZones == null ? 43 : this.dnsZones.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.endpointSize == null ? 43 : this.endpointSize.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
