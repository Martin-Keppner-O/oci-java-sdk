/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Description of log analytics entity type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntityType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEntityType {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "internalName",
        "compartmentId",
        "category",
        "cloudType",
        "properties",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "managementAgentEligibilityStatus"
    })
    public LogAnalyticsEntityType(
            String name,
            String internalName,
            String compartmentId,
            String category,
            EntityCloudType cloudType,
            java.util.List<EntityTypeProperty> properties,
            EntityLifecycleStates lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ManagementAgentEligibilityStatus managementAgentEligibilityStatus) {
        super();
        this.name = name;
        this.internalName = internalName;
        this.compartmentId = compartmentId;
        this.category = category;
        this.cloudType = cloudType;
        this.properties = properties;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.managementAgentEligibilityStatus = managementAgentEligibilityStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Log analytics entity type name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Log analytics entity type name.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Internal name for the log analytics entity type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        /**
         * Internal name for the log analytics entity type.
         *
         * @param internalName the value to set
         * @return this builder
         **/
        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }
        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Log analytics entity type category. Category will be used for grouping and filtering.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Log analytics entity type category. Category will be used for grouping and filtering.
         *
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * Log analytics entity type group. That can be CLOUD (OCI) or NON_CLOUD otherwise.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
        private EntityCloudType cloudType;

        /**
         * Log analytics entity type group. That can be CLOUD (OCI) or NON_CLOUD otherwise.
         *
         * @param cloudType the value to set
         * @return this builder
         **/
        public Builder cloudType(EntityCloudType cloudType) {
            this.cloudType = cloudType;
            this.__explicitlySet__.add("cloudType");
            return this;
        }
        /**
         * The parameters used in file patterns specified in log sources for this log analytics entity type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<EntityTypeProperty> properties;

        /**
         * The parameters used in file patterns specified in log sources for this log analytics entity type.
         *
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<EntityTypeProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * The current lifecycle state of the log analytics entity.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EntityLifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the log analytics entity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Time the log analytics entity type was created. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the log analytics entity type was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time the log analytics entity type was updated. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time the log analytics entity type was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * This field indicates whether logs for entities of this type can be collected using a management agent.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentEligibilityStatus")
        private ManagementAgentEligibilityStatus managementAgentEligibilityStatus;

        /**
         * This field indicates whether logs for entities of this type can be collected using a management agent.
         *
         * @param managementAgentEligibilityStatus the value to set
         * @return this builder
         **/
        public Builder managementAgentEligibilityStatus(
                ManagementAgentEligibilityStatus managementAgentEligibilityStatus) {
            this.managementAgentEligibilityStatus = managementAgentEligibilityStatus;
            this.__explicitlySet__.add("managementAgentEligibilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntityType build() {
            LogAnalyticsEntityType __instance__ =
                    new LogAnalyticsEntityType(
                            name,
                            internalName,
                            compartmentId,
                            category,
                            cloudType,
                            properties,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            managementAgentEligibilityStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntityType o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .internalName(o.getInternalName())
                            .compartmentId(o.getCompartmentId())
                            .category(o.getCategory())
                            .cloudType(o.getCloudType())
                            .properties(o.getProperties())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .managementAgentEligibilityStatus(
                                    o.getManagementAgentEligibilityStatus());

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
     * Log analytics entity type name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Log analytics entity type name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Internal name for the log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    private final String internalName;

    /**
     * Internal name for the log analytics entity type.
     *
     * @return the value
     **/
    public String getInternalName() {
        return internalName;
    }

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Log analytics entity type category. Category will be used for grouping and filtering.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Log analytics entity type category. Category will be used for grouping and filtering.
     *
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * Log analytics entity type group. That can be CLOUD (OCI) or NON_CLOUD otherwise.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
    private final EntityCloudType cloudType;

    /**
     * Log analytics entity type group. That can be CLOUD (OCI) or NON_CLOUD otherwise.
     *
     * @return the value
     **/
    public EntityCloudType getCloudType() {
        return cloudType;
    }

    /**
     * The parameters used in file patterns specified in log sources for this log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<EntityTypeProperty> properties;

    /**
     * The parameters used in file patterns specified in log sources for this log analytics entity type.
     *
     * @return the value
     **/
    public java.util.List<EntityTypeProperty> getProperties() {
        return properties;
    }

    /**
     * The current lifecycle state of the log analytics entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final EntityLifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the log analytics entity.
     *
     * @return the value
     **/
    public EntityLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Time the log analytics entity type was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the log analytics entity type was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time the log analytics entity type was updated. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time the log analytics entity type was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * This field indicates whether logs for entities of this type can be collected using a management agent.
     *
     **/
    public enum ManagementAgentEligibilityStatus {
        Eligible("ELIGIBLE"),
        Ineligible("INELIGIBLE"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagementAgentEligibilityStatus.class);

        private final String value;
        private static java.util.Map<String, ManagementAgentEligibilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementAgentEligibilityStatus v : ManagementAgentEligibilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagementAgentEligibilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementAgentEligibilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagementAgentEligibilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This field indicates whether logs for entities of this type can be collected using a management agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentEligibilityStatus")
    private final ManagementAgentEligibilityStatus managementAgentEligibilityStatus;

    /**
     * This field indicates whether logs for entities of this type can be collected using a management agent.
     *
     * @return the value
     **/
    public ManagementAgentEligibilityStatus getManagementAgentEligibilityStatus() {
        return managementAgentEligibilityStatus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsEntityType(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", internalName=").append(String.valueOf(this.internalName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", cloudType=").append(String.valueOf(this.cloudType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", managementAgentEligibilityStatus=")
                .append(String.valueOf(this.managementAgentEligibilityStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEntityType)) {
            return false;
        }

        LogAnalyticsEntityType other = (LogAnalyticsEntityType) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.internalName, other.internalName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.cloudType, other.cloudType)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.managementAgentEligibilityStatus,
                        other.managementAgentEligibilityStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.internalName == null ? 43 : this.internalName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.cloudType == null ? 43 : this.cloudType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentEligibilityStatus == null
                                ? 43
                                : this.managementAgentEligibilityStatus.hashCode());
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
