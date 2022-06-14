/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a database insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmManagedExternalDatabaseInsightSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmManagedExternalDatabaseInsightSummary extends DatabaseInsightSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseHostNames")
        private java.util.List<String> databaseHostNames;

        public Builder databaseHostNames(java.util.List<String> databaseHostNames) {
            this.databaseHostNames = databaseHostNames;
            this.__explicitlySet__.add("databaseHostNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionStatusDetails")
        private String databaseConnectionStatusDetails;

        public Builder databaseConnectionStatusDetails(String databaseConnectionStatusDetails) {
            this.databaseConnectionStatusDetails = databaseConnectionStatusDetails;
            this.__explicitlySet__.add("databaseConnectionStatusDetails");
            return this;
        }
        /**
         * Enterprise Manager Unique Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        /**
         * Enterprise Manager Unique Identifier
         * @param enterpriseManagerIdentifier the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }
        /**
         * Enterprise Manager Entity Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        /**
         * Enterprise Manager Entity Name
         * @param enterpriseManagerEntityName the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
            return this;
        }
        /**
         * Enterprise Manager Entity Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        /**
         * Enterprise Manager Entity Type
         * @param enterpriseManagerEntityType the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }
        /**
         * Enterprise Manager Entity Unique Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        /**
         * Enterprise Manager Entity Unique Identifier
         * @param enterpriseManagerEntityIdentifier the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }
        /**
         * Enterprise Manager Entity Display Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
        private String enterpriseManagerEntityDisplayName;

        /**
         * Enterprise Manager Entity Display Name
         * @param enterpriseManagerEntityDisplayName the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerEntityDisplayName(
                String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
            this.__explicitlySet__.add("enterpriseManagerEntityDisplayName");
            return this;
        }
        /**
         * OPSI Enterprise Manager Bridge OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        /**
         * OPSI Enterprise Manager Bridge OCID
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder
         **/
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * @param exadataInsightId the value to set
         * @return this builder
         **/
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalDatabaseInsightSummary build() {
            EmManagedExternalDatabaseInsightSummary __instance__ =
                    new EmManagedExternalDatabaseInsightSummary(
                            id,
                            databaseId,
                            compartmentId,
                            databaseName,
                            databaseDisplayName,
                            databaseType,
                            databaseVersion,
                            databaseHostNames,
                            freeformTags,
                            definedTags,
                            systemTags,
                            processorCount,
                            status,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            databaseConnectionStatusDetails,
                            enterpriseManagerIdentifier,
                            enterpriseManagerEntityName,
                            enterpriseManagerEntityType,
                            enterpriseManagerEntityIdentifier,
                            enterpriseManagerEntityDisplayName,
                            enterpriseManagerBridgeId,
                            exadataInsightId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalDatabaseInsightSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .databaseId(o.getDatabaseId())
                            .compartmentId(o.getCompartmentId())
                            .databaseName(o.getDatabaseName())
                            .databaseDisplayName(o.getDatabaseDisplayName())
                            .databaseType(o.getDatabaseType())
                            .databaseVersion(o.getDatabaseVersion())
                            .databaseHostNames(o.getDatabaseHostNames())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .processorCount(o.getProcessorCount())
                            .status(o.getStatus())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .databaseConnectionStatusDetails(o.getDatabaseConnectionStatusDetails())
                            .enterpriseManagerIdentifier(o.getEnterpriseManagerIdentifier())
                            .enterpriseManagerEntityName(o.getEnterpriseManagerEntityName())
                            .enterpriseManagerEntityType(o.getEnterpriseManagerEntityType())
                            .enterpriseManagerEntityIdentifier(
                                    o.getEnterpriseManagerEntityIdentifier())
                            .enterpriseManagerEntityDisplayName(
                                    o.getEnterpriseManagerEntityDisplayName())
                            .enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId())
                            .exadataInsightId(o.getExadataInsightId());

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
    public EmManagedExternalDatabaseInsightSummary(
            String id,
            String databaseId,
            String compartmentId,
            String databaseName,
            String databaseDisplayName,
            String databaseType,
            String databaseVersion,
            java.util.List<String> databaseHostNames,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Integer processorCount,
            ResourceStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String databaseConnectionStatusDetails,
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerEntityDisplayName,
            String enterpriseManagerBridgeId,
            String exadataInsightId) {
        super(
                id,
                databaseId,
                compartmentId,
                databaseName,
                databaseDisplayName,
                databaseType,
                databaseVersion,
                databaseHostNames,
                freeformTags,
                definedTags,
                systemTags,
                processorCount,
                status,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                databaseConnectionStatusDetails);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.exadataInsightId = exadataInsightId;
    }

    /**
     * Enterprise Manager Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Unique Identifier
     * @return the value
     **/
    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /**
     * Enterprise Manager Entity Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    private final String enterpriseManagerEntityName;

    /**
     * Enterprise Manager Entity Name
     * @return the value
     **/
    public String getEnterpriseManagerEntityName() {
        return enterpriseManagerEntityName;
    }

    /**
     * Enterprise Manager Entity Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    private final String enterpriseManagerEntityType;

    /**
     * Enterprise Manager Entity Type
     * @return the value
     **/
    public String getEnterpriseManagerEntityType() {
        return enterpriseManagerEntityType;
    }

    /**
     * Enterprise Manager Entity Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    private final String enterpriseManagerEntityIdentifier;

    /**
     * Enterprise Manager Entity Unique Identifier
     * @return the value
     **/
    public String getEnterpriseManagerEntityIdentifier() {
        return enterpriseManagerEntityIdentifier;
    }

    /**
     * Enterprise Manager Entity Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
    private final String enterpriseManagerEntityDisplayName;

    /**
     * Enterprise Manager Entity Display Name
     * @return the value
     **/
    public String getEnterpriseManagerEntityDisplayName() {
        return enterpriseManagerEntityDisplayName;
    }

    /**
     * OPSI Enterprise Manager Bridge OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    private final String enterpriseManagerBridgeId;

    /**
     * OPSI Enterprise Manager Bridge OCID
     * @return the value
     **/
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * @return the value
     **/
    public String getExadataInsightId() {
        return exadataInsightId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EmManagedExternalDatabaseInsightSummary(");
        sb.append("super=").append(super.toString());
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerEntityName=")
                .append(String.valueOf(this.enterpriseManagerEntityName));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", enterpriseManagerEntityDisplayName=")
                .append(String.valueOf(this.enterpriseManagerEntityDisplayName));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalDatabaseInsightSummary)) {
            return false;
        }

        EmManagedExternalDatabaseInsightSummary other = (EmManagedExternalDatabaseInsightSummary) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityName, other.enterpriseManagerEntityName)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityDisplayName,
                        other.enterpriseManagerEntityDisplayName)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityName == null
                                ? 43
                                : this.enterpriseManagerEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityDisplayName == null
                                ? 43
                                : this.enterpriseManagerEntityDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
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
