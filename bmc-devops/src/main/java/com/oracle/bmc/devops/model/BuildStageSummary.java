/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the build stage.
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
    builder = BuildStageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BuildStageSummary extends BuildPipelineStageSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
        private String buildPipelineId;

        public Builder buildPipelineId(String buildPipelineId) {
            this.buildPipelineId = buildPipelineId;
            this.__explicitlySet__.add("buildPipelineId");
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
        private BuildPipelineStage.LifecycleState lifecycleState;

        public Builder lifecycleState(BuildPipelineStage.LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessorCollection")
        private BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection;

        public Builder buildPipelineStagePredecessorCollection(
                BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection) {
            this.buildPipelineStagePredecessorCollection = buildPipelineStagePredecessorCollection;
            this.__explicitlySet__.add("buildPipelineStagePredecessorCollection");
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
         * Image for the build environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private BuildStage.Image image;

        /**
         * Image for the build environment.
         * @param image the value to set
         * @return this builder
         **/
        public Builder image(BuildStage.Image image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
        private String buildSpecFile;

        /**
         * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         * @param buildSpecFile the value to set
         * @return this builder
         **/
        public Builder buildSpecFile(String buildSpecFile) {
            this.buildSpecFile = buildSpecFile;
            this.__explicitlySet__.add("buildSpecFile");
            return this;
        }
        /**
         * Timeout for the build stage execution. Specify value in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
        private Integer stageExecutionTimeoutInSeconds;

        /**
         * Timeout for the build stage execution. Specify value in seconds.
         * @param stageExecutionTimeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder stageExecutionTimeoutInSeconds(Integer stageExecutionTimeoutInSeconds) {
            this.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
            this.__explicitlySet__.add("stageExecutionTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
        private BuildSourceCollection buildSourceCollection;

        public Builder buildSourceCollection(BuildSourceCollection buildSourceCollection) {
            this.buildSourceCollection = buildSourceCollection;
            this.__explicitlySet__.add("buildSourceCollection");
            return this;
        }
        /**
         * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
        private String primaryBuildSource;

        /**
         * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         * @param primaryBuildSource the value to set
         * @return this builder
         **/
        public Builder primaryBuildSource(String primaryBuildSource) {
            this.primaryBuildSource = primaryBuildSource;
            this.__explicitlySet__.add("primaryBuildSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildStageSummary build() {
            BuildStageSummary __instance__ =
                    new BuildStageSummary(
                            id,
                            displayName,
                            projectId,
                            buildPipelineId,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            description,
                            buildPipelineStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            systemTags,
                            image,
                            buildSpecFile,
                            stageExecutionTimeoutInSeconds,
                            buildSourceCollection,
                            primaryBuildSource);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildStageSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .projectId(o.getProjectId())
                            .buildPipelineId(o.getBuildPipelineId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .description(o.getDescription())
                            .buildPipelineStagePredecessorCollection(
                                    o.getBuildPipelineStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .image(o.getImage())
                            .buildSpecFile(o.getBuildSpecFile())
                            .stageExecutionTimeoutInSeconds(o.getStageExecutionTimeoutInSeconds())
                            .buildSourceCollection(o.getBuildSourceCollection())
                            .primaryBuildSource(o.getPrimaryBuildSource());

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
    public BuildStageSummary(
            String id,
            String displayName,
            String projectId,
            String buildPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BuildPipelineStage.LifecycleState lifecycleState,
            String lifecycleDetails,
            String description,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            BuildStage.Image image,
            String buildSpecFile,
            Integer stageExecutionTimeoutInSeconds,
            BuildSourceCollection buildSourceCollection,
            String primaryBuildSource) {
        super(
                id,
                displayName,
                projectId,
                buildPipelineId,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                description,
                buildPipelineStagePredecessorCollection,
                freeformTags,
                definedTags,
                systemTags);
        this.image = image;
        this.buildSpecFile = buildSpecFile;
        this.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
        this.buildSourceCollection = buildSourceCollection;
        this.primaryBuildSource = primaryBuildSource;
    }

    /**
     * Image for the build environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final BuildStage.Image image;

    /**
     * Image for the build environment.
     * @return the value
     **/
    public BuildStage.Image getImage() {
        return image;
    }

    /**
     * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
    private final String buildSpecFile;

    /**
     * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     * @return the value
     **/
    public String getBuildSpecFile() {
        return buildSpecFile;
    }

    /**
     * Timeout for the build stage execution. Specify value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
    private final Integer stageExecutionTimeoutInSeconds;

    /**
     * Timeout for the build stage execution. Specify value in seconds.
     * @return the value
     **/
    public Integer getStageExecutionTimeoutInSeconds() {
        return stageExecutionTimeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
    private final BuildSourceCollection buildSourceCollection;

    public BuildSourceCollection getBuildSourceCollection() {
        return buildSourceCollection;
    }

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
    private final String primaryBuildSource;

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     * @return the value
     **/
    public String getPrimaryBuildSource() {
        return primaryBuildSource;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BuildStageSummary(");
        sb.append("super=").append(super.toString());
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", buildSpecFile=").append(String.valueOf(this.buildSpecFile));
        sb.append(", stageExecutionTimeoutInSeconds=")
                .append(String.valueOf(this.stageExecutionTimeoutInSeconds));
        sb.append(", buildSourceCollection=").append(String.valueOf(this.buildSourceCollection));
        sb.append(", primaryBuildSource=").append(String.valueOf(this.primaryBuildSource));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildStageSummary)) {
            return false;
        }

        BuildStageSummary other = (BuildStageSummary) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.buildSpecFile, other.buildSpecFile)
                && java.util.Objects.equals(
                        this.stageExecutionTimeoutInSeconds, other.stageExecutionTimeoutInSeconds)
                && java.util.Objects.equals(this.buildSourceCollection, other.buildSourceCollection)
                && java.util.Objects.equals(this.primaryBuildSource, other.primaryBuildSource)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result =
                (result * PRIME)
                        + (this.buildSpecFile == null ? 43 : this.buildSpecFile.hashCode());
        result =
                (result * PRIME)
                        + (this.stageExecutionTimeoutInSeconds == null
                                ? 43
                                : this.stageExecutionTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.buildSourceCollection == null
                                ? 43
                                : this.buildSourceCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryBuildSource == null
                                ? 43
                                : this.primaryBuildSource.hashCode());
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
