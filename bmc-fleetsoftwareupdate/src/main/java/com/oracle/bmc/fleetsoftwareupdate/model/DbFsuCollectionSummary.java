/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * 'DB' type Exadata Fleet Update Collection summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbFsuCollectionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbFsuCollectionSummary extends FsuCollectionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private CollectionServiceTypes serviceType;

        public Builder serviceType(CollectionServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activeFsuCycle")
        private ActiveCycleDetails activeFsuCycle;

        public Builder activeFsuCycle(ActiveCycleDetails activeFsuCycle) {
            this.activeFsuCycle = activeFsuCycle;
            this.__explicitlySet__.add("activeFsuCycle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
        private Integer targetCount;

        public Builder targetCount(Integer targetCount) {
            this.targetCount = targetCount;
            this.__explicitlySet__.add("targetCount");
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
        private CollectionLifecycleStates lifecycleState;

        public Builder lifecycleState(CollectionLifecycleStates lifecycleState) {
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
        /**
         * Database Major Version of targets to be included in the Exadata Fleet Update Collection.
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
         * Only Database targets that match the version specified in this value would be added to
         * the Exadata Fleet Update Collection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
        private DbSourceMajorVersions sourceMajorVersion;

        /**
         * Database Major Version of targets to be included in the Exadata Fleet Update Collection.
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
         * Only Database targets that match the version specified in this value would be added to
         * the Exadata Fleet Update Collection.
         *
         * @param sourceMajorVersion the value to set
         * @return this builder
         */
        public Builder sourceMajorVersion(DbSourceMajorVersions sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            this.__explicitlySet__.add("sourceMajorVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbFsuCollectionSummary build() {
            DbFsuCollectionSummary model =
                    new DbFsuCollectionSummary(
                            this.id,
                            this.displayName,
                            this.serviceType,
                            this.compartmentId,
                            this.activeFsuCycle,
                            this.targetCount,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.sourceMajorVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbFsuCollectionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("activeFsuCycle")) {
                this.activeFsuCycle(model.getActiveFsuCycle());
            }
            if (model.wasPropertyExplicitlySet("targetCount")) {
                this.targetCount(model.getTargetCount());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("sourceMajorVersion")) {
                this.sourceMajorVersion(model.getSourceMajorVersion());
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

    @Deprecated
    public DbFsuCollectionSummary(
            String id,
            String displayName,
            CollectionServiceTypes serviceType,
            String compartmentId,
            ActiveCycleDetails activeFsuCycle,
            Integer targetCount,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            CollectionLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            DbSourceMajorVersions sourceMajorVersion) {
        super(
                id,
                displayName,
                serviceType,
                compartmentId,
                activeFsuCycle,
                targetCount,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.sourceMajorVersion = sourceMajorVersion;
    }

    /**
     * Database Major Version of targets to be included in the Exadata Fleet Update Collection.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
     * Only Database targets that match the version specified in this value would be added to the
     * Exadata Fleet Update Collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMajorVersion")
    private final DbSourceMajorVersions sourceMajorVersion;

    /**
     * Database Major Version of targets to be included in the Exadata Fleet Update Collection.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions
     * Only Database targets that match the version specified in this value would be added to the
     * Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public DbSourceMajorVersions getSourceMajorVersion() {
        return sourceMajorVersion;
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
        sb.append("DbFsuCollectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceMajorVersion=").append(String.valueOf(this.sourceMajorVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbFsuCollectionSummary)) {
            return false;
        }

        DbFsuCollectionSummary other = (DbFsuCollectionSummary) o;
        return java.util.Objects.equals(this.sourceMajorVersion, other.sourceMajorVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourceMajorVersion == null
                                ? 43
                                : this.sourceMajorVersion.hashCode());
        return result;
    }
}
