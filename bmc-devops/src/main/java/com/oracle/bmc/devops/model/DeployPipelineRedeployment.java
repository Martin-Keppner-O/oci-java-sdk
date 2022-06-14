/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Redeployment of the full pipeline of a previous deployment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeployPipelineRedeployment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeployPipelineRedeployment extends Deployment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineArtifacts")
        private DeployPipelineArtifactCollection deployPipelineArtifacts;

        public Builder deployPipelineArtifacts(
                DeployPipelineArtifactCollection deployPipelineArtifacts) {
            this.deployPipelineArtifacts = deployPipelineArtifacts;
            this.__explicitlySet__.add("deployPipelineArtifacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineEnvironments")
        private DeployPipelineEnvironmentCollection deployPipelineEnvironments;

        public Builder deployPipelineEnvironments(
                DeployPipelineEnvironmentCollection deployPipelineEnvironments) {
            this.deployPipelineEnvironments = deployPipelineEnvironments;
            this.__explicitlySet__.add("deployPipelineEnvironments");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentArguments")
        private DeploymentArgumentCollection deploymentArguments;

        public Builder deploymentArguments(DeploymentArgumentCollection deploymentArguments) {
            this.deploymentArguments = deploymentArguments;
            this.__explicitlySet__.add("deploymentArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactOverrideArguments")
        private DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments;

        public Builder deployArtifactOverrideArguments(
                DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments) {
            this.deployArtifactOverrideArguments = deployArtifactOverrideArguments;
            this.__explicitlySet__.add("deployArtifactOverrideArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentExecutionProgress")
        private DeploymentExecutionProgress deploymentExecutionProgress;

        public Builder deploymentExecutionProgress(
                DeploymentExecutionProgress deploymentExecutionProgress) {
            this.deploymentExecutionProgress = deploymentExecutionProgress;
            this.__explicitlySet__.add("deploymentExecutionProgress");
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
         * Specifies the OCID of the previous deployment to be redeployed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("previousDeploymentId")
        private String previousDeploymentId;

        /**
         * Specifies the OCID of the previous deployment to be redeployed.
         * @param previousDeploymentId the value to set
         * @return this builder
         **/
        public Builder previousDeploymentId(String previousDeploymentId) {
            this.previousDeploymentId = previousDeploymentId;
            this.__explicitlySet__.add("previousDeploymentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployPipelineRedeployment build() {
            DeployPipelineRedeployment __instance__ =
                    new DeployPipelineRedeployment(
                            deployPipelineArtifacts,
                            deployPipelineEnvironments,
                            id,
                            displayName,
                            projectId,
                            deployPipelineId,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            deploymentArguments,
                            deployArtifactOverrideArguments,
                            deploymentExecutionProgress,
                            freeformTags,
                            definedTags,
                            systemTags,
                            previousDeploymentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployPipelineRedeployment o) {
            Builder copiedBuilder =
                    deployPipelineArtifacts(o.getDeployPipelineArtifacts())
                            .deployPipelineEnvironments(o.getDeployPipelineEnvironments())
                            .id(o.getId())
                            .displayName(o.getDisplayName())
                            .projectId(o.getProjectId())
                            .deployPipelineId(o.getDeployPipelineId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .deploymentArguments(o.getDeploymentArguments())
                            .deployArtifactOverrideArguments(o.getDeployArtifactOverrideArguments())
                            .deploymentExecutionProgress(o.getDeploymentExecutionProgress())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .previousDeploymentId(o.getPreviousDeploymentId());

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
    public DeployPipelineRedeployment(
            DeployPipelineArtifactCollection deployPipelineArtifacts,
            DeployPipelineEnvironmentCollection deployPipelineEnvironments,
            String id,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DeploymentArgumentCollection deploymentArguments,
            DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments,
            DeploymentExecutionProgress deploymentExecutionProgress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String previousDeploymentId) {
        super(
                deployPipelineArtifacts,
                deployPipelineEnvironments,
                id,
                displayName,
                projectId,
                deployPipelineId,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                deploymentArguments,
                deployArtifactOverrideArguments,
                deploymentExecutionProgress,
                freeformTags,
                definedTags,
                systemTags);
        this.previousDeploymentId = previousDeploymentId;
    }

    /**
     * Specifies the OCID of the previous deployment to be redeployed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previousDeploymentId")
    private final String previousDeploymentId;

    /**
     * Specifies the OCID of the previous deployment to be redeployed.
     * @return the value
     **/
    public String getPreviousDeploymentId() {
        return previousDeploymentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeployPipelineRedeployment(");
        sb.append("super=").append(super.toString());
        sb.append(", previousDeploymentId=").append(String.valueOf(this.previousDeploymentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployPipelineRedeployment)) {
            return false;
        }

        DeployPipelineRedeployment other = (DeployPipelineRedeployment) o;
        return java.util.Objects.equals(this.previousDeploymentId, other.previousDeploymentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.previousDeploymentId == null
                                ? 43
                                : this.previousDeploymentId.hashCode());
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
