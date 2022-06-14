/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachVnicDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachVnicDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createVnicDetails",
        "displayName",
        "instanceId",
        "nicIndex"
    })
    public AttachVnicDetails(
            CreateVnicDetails createVnicDetails,
            String displayName,
            String instanceId,
            Integer nicIndex) {
        super();
        this.createVnicDetails = createVnicDetails;
        this.displayName = displayName;
        this.instanceId = instanceId;
        this.nicIndex = nicIndex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private CreateVnicDetails createVnicDetails;

        public Builder createVnicDetails(CreateVnicDetails createVnicDetails) {
            this.createVnicDetails = createVnicDetails;
            this.__explicitlySet__.add("createVnicDetails");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Which physical network interface card (NIC) the VNIC will use. Defaults to 0.
         * Certain bare metal instance shapes have two active physical NICs (0 and 1). If
         * you add a secondary VNIC to one of these instances, you can specify which NIC
         * the VNIC will use. For more information, see
         * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
        private Integer nicIndex;

        /**
         * Which physical network interface card (NIC) the VNIC will use. Defaults to 0.
         * Certain bare metal instance shapes have two active physical NICs (0 and 1). If
         * you add a secondary VNIC to one of these instances, you can specify which NIC
         * the VNIC will use. For more information, see
         * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         *
         * @param nicIndex the value to set
         * @return this builder
         **/
        public Builder nicIndex(Integer nicIndex) {
            this.nicIndex = nicIndex;
            this.__explicitlySet__.add("nicIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachVnicDetails build() {
            AttachVnicDetails __instance__ =
                    new AttachVnicDetails(createVnicDetails, displayName, instanceId, nicIndex);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachVnicDetails o) {
            Builder copiedBuilder =
                    createVnicDetails(o.getCreateVnicDetails())
                            .displayName(o.getDisplayName())
                            .instanceId(o.getInstanceId())
                            .nicIndex(o.getNicIndex());

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

    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    private final CreateVnicDetails createVnicDetails;

    public CreateVnicDetails getCreateVnicDetails() {
        return createVnicDetails;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Which physical network interface card (NIC) the VNIC will use. Defaults to 0.
     * Certain bare metal instance shapes have two active physical NICs (0 and 1). If
     * you add a secondary VNIC to one of these instances, you can specify which NIC
     * the VNIC will use. For more information, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
    private final Integer nicIndex;

    /**
     * Which physical network interface card (NIC) the VNIC will use. Defaults to 0.
     * Certain bare metal instance shapes have two active physical NICs (0 and 1). If
     * you add a secondary VNIC to one of these instances, you can specify which NIC
     * the VNIC will use. For more information, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     * @return the value
     **/
    public Integer getNicIndex() {
        return nicIndex;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AttachVnicDetails(");
        sb.append("createVnicDetails=").append(String.valueOf(this.createVnicDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", nicIndex=").append(String.valueOf(this.nicIndex));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachVnicDetails)) {
            return false;
        }

        AttachVnicDetails other = (AttachVnicDetails) o;
        return java.util.Objects.equals(this.createVnicDetails, other.createVnicDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.nicIndex, other.nicIndex)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.createVnicDetails == null ? 43 : this.createVnicDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.nicIndex == null ? 43 : this.nicIndex.hashCode());
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
