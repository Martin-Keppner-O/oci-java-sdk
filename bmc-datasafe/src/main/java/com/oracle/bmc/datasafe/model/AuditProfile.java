/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents audit profile settings and audit configurations for the database target,
 * and helps evaluate the initial audit data volume for configuring collection in Data Safe. The
 * resource is also responsible for auto-discovery of audit trails in the database target during
 * target's registration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditProfile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "targetId",
        "description",
        "auditTrails",
        "isPaidUsageEnabled",
        "onlineMonths",
        "offlineMonths",
        "auditCollectedVolume",
        "isOverrideGlobalRetentionSetting",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AuditProfile(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AuditProfileLifecycleState lifecycleState,
            String lifecycleDetails,
            String targetId,
            String description,
            java.util.List<AuditTrail> auditTrails,
            Boolean isPaidUsageEnabled,
            Integer onlineMonths,
            Integer offlineMonths,
            Long auditCollectedVolume,
            Boolean isOverrideGlobalRetentionSetting,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.targetId = targetId;
        this.description = description;
        this.auditTrails = auditTrails;
        this.isPaidUsageEnabled = isPaidUsageEnabled;
        this.onlineMonths = onlineMonths;
        this.offlineMonths = offlineMonths;
        this.auditCollectedVolume = auditCollectedVolume;
        this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the audit profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the audit profile.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the audit. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the audit.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the audit profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the audit profile.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The date and time the audit profile was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the audit profile was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the audit profile was updated, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the audit profile was updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the audit profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditProfileLifecycleState lifecycleState;

        /**
         * The current state of the audit profile.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AuditProfileLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the audit profile in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the audit profile in Data Safe.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The OCID of the Data Safe target for which the audit profile is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the Data Safe target for which the audit profile is created.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The description of the audit profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the audit profile.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Indicates the list of available audit trails on the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditTrails")
        private java.util.List<AuditTrail> auditTrails;

        /**
         * Indicates the list of available audit trails on the target.
         *
         * @param auditTrails the value to set
         * @return this builder
         */
        public Builder auditTrails(java.util.List<AuditTrail> auditTrails) {
            this.auditTrails = auditTrails;
            this.__explicitlySet__.add("auditTrails");
            return this;
        }
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         */
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }
        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data
         * Safe audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data
         * Safe audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
         *
         * @param onlineMonths the value to set
         * @return this builder
         */
        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }
        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe
         * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the
         * audit data even longer in archive, please contact the Oracle Support.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe
         * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the
         * audit data even longer in archive, please contact the Oracle Support.
         *
         * @param offlineMonths the value to set
         * @return this builder
         */
        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }
        /**
         * Indicates number of audit records collected by Data Safe in the current calendar month.
         * Audit records for the Data Safe service account are excluded and are not counted towards
         * your monthly free limit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
        private Long auditCollectedVolume;

        /**
         * Indicates number of audit records collected by Data Safe in the current calendar month.
         * Audit records for the Data Safe service account are excluded and are not counted towards
         * your monthly free limit.
         *
         * @param auditCollectedVolume the value to set
         * @return this builder
         */
        public Builder auditCollectedVolume(Long auditCollectedVolume) {
            this.auditCollectedVolume = auditCollectedVolume;
            this.__explicitlySet__.add("auditCollectedVolume");
            return this;
        }
        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
        private Boolean isOverrideGlobalRetentionSetting;

        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         *
         * @param isOverrideGlobalRetentionSetting the value to set
         * @return this builder
         */
        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            this.__explicitlySet__.add("isOverrideGlobalRetentionSetting");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditProfile build() {
            AuditProfile model =
                    new AuditProfile(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.targetId,
                            this.description,
                            this.auditTrails,
                            this.isPaidUsageEnabled,
                            this.onlineMonths,
                            this.offlineMonths,
                            this.auditCollectedVolume,
                            this.isOverrideGlobalRetentionSetting,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditProfile model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("auditTrails")) {
                this.auditTrails(model.getAuditTrails());
            }
            if (model.wasPropertyExplicitlySet("isPaidUsageEnabled")) {
                this.isPaidUsageEnabled(model.getIsPaidUsageEnabled());
            }
            if (model.wasPropertyExplicitlySet("onlineMonths")) {
                this.onlineMonths(model.getOnlineMonths());
            }
            if (model.wasPropertyExplicitlySet("offlineMonths")) {
                this.offlineMonths(model.getOfflineMonths());
            }
            if (model.wasPropertyExplicitlySet("auditCollectedVolume")) {
                this.auditCollectedVolume(model.getAuditCollectedVolume());
            }
            if (model.wasPropertyExplicitlySet("isOverrideGlobalRetentionSetting")) {
                this.isOverrideGlobalRetentionSetting(model.getIsOverrideGlobalRetentionSetting());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the audit profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the audit profile.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the audit. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the audit.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the audit profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the audit profile.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The date and time the audit profile was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the audit profile was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the audit profile was updated, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the audit profile was updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the audit profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditProfileLifecycleState lifecycleState;

    /**
     * The current state of the audit profile.
     *
     * @return the value
     */
    public AuditProfileLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the audit profile in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the audit profile in Data Safe.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The OCID of the Data Safe target for which the audit profile is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the Data Safe target for which the audit profile is created.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The description of the audit profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the audit profile.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicates the list of available audit trails on the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditTrails")
    private final java.util.List<AuditTrail> auditTrails;

    /**
     * Indicates the list of available audit trails on the target.
     *
     * @return the value
     */
    public java.util.List<AuditTrail> getAuditTrails() {
        return auditTrails;
    }

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     *
     * @return the value
     */
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe
     * audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    private final Integer onlineMonths;

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe
     * audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
     *
     * @return the value
     */
    public Integer getOnlineMonths() {
        return onlineMonths;
    }

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe
     * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit
     * data even longer in archive, please contact the Oracle Support.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    private final Integer offlineMonths;

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe
     * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit
     * data even longer in archive, please contact the Oracle Support.
     *
     * @return the value
     */
    public Integer getOfflineMonths() {
        return offlineMonths;
    }

    /**
     * Indicates number of audit records collected by Data Safe in the current calendar month. Audit
     * records for the Data Safe service account are excluded and are not counted towards your
     * monthly free limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
    private final Long auditCollectedVolume;

    /**
     * Indicates number of audit records collected by Data Safe in the current calendar month. Audit
     * records for the Data Safe service account are excluded and are not counted towards your
     * monthly free limit.
     *
     * @return the value
     */
    public Long getAuditCollectedVolume() {
        return auditCollectedVolume;
    }

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    private final Boolean isOverrideGlobalRetentionSetting;

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     * @return the value
     */
    public Boolean getIsOverrideGlobalRetentionSetting() {
        return isOverrideGlobalRetentionSetting;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuditProfile(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", auditTrails=").append(String.valueOf(this.auditTrails));
        sb.append(", isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append(", onlineMonths=").append(String.valueOf(this.onlineMonths));
        sb.append(", offlineMonths=").append(String.valueOf(this.offlineMonths));
        sb.append(", auditCollectedVolume=").append(String.valueOf(this.auditCollectedVolume));
        sb.append(", isOverrideGlobalRetentionSetting=")
                .append(String.valueOf(this.isOverrideGlobalRetentionSetting));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditProfile)) {
            return false;
        }

        AuditProfile other = (AuditProfile) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.auditTrails, other.auditTrails)
                && java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(this.onlineMonths, other.onlineMonths)
                && java.util.Objects.equals(this.offlineMonths, other.offlineMonths)
                && java.util.Objects.equals(this.auditCollectedVolume, other.auditCollectedVolume)
                && java.util.Objects.equals(
                        this.isOverrideGlobalRetentionSetting,
                        other.isOverrideGlobalRetentionSetting)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.auditTrails == null ? 43 : this.auditTrails.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaidUsageEnabled == null
                                ? 43
                                : this.isPaidUsageEnabled.hashCode());
        result = (result * PRIME) + (this.onlineMonths == null ? 43 : this.onlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineMonths == null ? 43 : this.offlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.auditCollectedVolume == null
                                ? 43
                                : this.auditCollectedVolume.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideGlobalRetentionSetting == null
                                ? 43
                                : this.isOverrideGlobalRetentionSetting.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
