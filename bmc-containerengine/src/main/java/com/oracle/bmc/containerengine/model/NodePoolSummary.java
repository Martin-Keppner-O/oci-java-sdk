/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a node pool summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodePoolSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodePoolSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "clusterId",
        "name",
        "kubernetesVersion",
        "nodeImageId",
        "nodeImageName",
        "nodeShapeConfig",
        "nodeSource",
        "nodeSourceDetails",
        "nodeShape",
        "initialNodeLabels",
        "sshPublicKey",
        "quantityPerSubnet",
        "subnetIds",
        "nodeConfigDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public NodePoolSummary(
            String id,
            String compartmentId,
            String clusterId,
            String name,
            String kubernetesVersion,
            String nodeImageId,
            String nodeImageName,
            NodeShapeConfig nodeShapeConfig,
            NodeSourceOption nodeSource,
            NodeSourceDetails nodeSourceDetails,
            String nodeShape,
            java.util.List<KeyValue> initialNodeLabels,
            String sshPublicKey,
            Integer quantityPerSubnet,
            java.util.List<String> subnetIds,
            NodePoolNodeConfigDetails nodeConfigDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.clusterId = clusterId;
        this.name = name;
        this.kubernetesVersion = kubernetesVersion;
        this.nodeImageId = nodeImageId;
        this.nodeImageName = nodeImageName;
        this.nodeShapeConfig = nodeShapeConfig;
        this.nodeSource = nodeSource;
        this.nodeSourceDetails = nodeSourceDetails;
        this.nodeShape = nodeShape;
        this.initialNodeLabels = initialNodeLabels;
        this.sshPublicKey = sshPublicKey;
        this.quantityPerSubnet = quantityPerSubnet;
        this.subnetIds = subnetIds;
        this.nodeConfigDetails = nodeConfigDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the node pool.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment in which the node pool exists.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which the node pool exists.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the cluster to which this node pool is attached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The OCID of the cluster to which this node pool is attached.
         * @param clusterId the value to set
         * @return this builder
         **/
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /**
         * The name of the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the node pool.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of Kubernetes running on the nodes in the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes running on the nodes in the node pool.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * Deprecated. see {@code nodeSource}. The OCID of the image running on the nodes in the node pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeImageId")
        private String nodeImageId;

        /**
         * Deprecated. see {@code nodeSource}. The OCID of the image running on the nodes in the node pool.
         *
         * @param nodeImageId the value to set
         * @return this builder
         **/
        public Builder nodeImageId(String nodeImageId) {
            this.nodeImageId = nodeImageId;
            this.__explicitlySet__.add("nodeImageId");
            return this;
        }
        /**
         * Deprecated. see {@code nodeSource}. The name of the image running on the nodes in the node pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
        private String nodeImageName;

        /**
         * Deprecated. see {@code nodeSource}. The name of the image running on the nodes in the node pool.
         *
         * @param nodeImageName the value to set
         * @return this builder
         **/
        public Builder nodeImageName(String nodeImageName) {
            this.nodeImageName = nodeImageName;
            this.__explicitlySet__.add("nodeImageName");
            return this;
        }
        /**
         * The shape configuration of the nodes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
        private NodeShapeConfig nodeShapeConfig;

        /**
         * The shape configuration of the nodes.
         * @param nodeShapeConfig the value to set
         * @return this builder
         **/
        public Builder nodeShapeConfig(NodeShapeConfig nodeShapeConfig) {
            this.nodeShapeConfig = nodeShapeConfig;
            this.__explicitlySet__.add("nodeShapeConfig");
            return this;
        }
        /**
         * Deprecated. see {@code nodeSourceDetails}. Source running on the nodes in the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeSource")
        private NodeSourceOption nodeSource;

        /**
         * Deprecated. see {@code nodeSourceDetails}. Source running on the nodes in the node pool.
         * @param nodeSource the value to set
         * @return this builder
         **/
        public Builder nodeSource(NodeSourceOption nodeSource) {
            this.nodeSource = nodeSource;
            this.__explicitlySet__.add("nodeSource");
            return this;
        }
        /**
         * Source running on the nodes in the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
        private NodeSourceDetails nodeSourceDetails;

        /**
         * Source running on the nodes in the node pool.
         * @param nodeSourceDetails the value to set
         * @return this builder
         **/
        public Builder nodeSourceDetails(NodeSourceDetails nodeSourceDetails) {
            this.nodeSourceDetails = nodeSourceDetails;
            this.__explicitlySet__.add("nodeSourceDetails");
            return this;
        }
        /**
         * The name of the node shape of the nodes in the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
        private String nodeShape;

        /**
         * The name of the node shape of the nodes in the node pool.
         * @param nodeShape the value to set
         * @return this builder
         **/
        public Builder nodeShape(String nodeShape) {
            this.nodeShape = nodeShape;
            this.__explicitlySet__.add("nodeShape");
            return this;
        }
        /**
         * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
        private java.util.List<KeyValue> initialNodeLabels;

        /**
         * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
         * @param initialNodeLabels the value to set
         * @return this builder
         **/
        public Builder initialNodeLabels(java.util.List<KeyValue> initialNodeLabels) {
            this.initialNodeLabels = initialNodeLabels;
            this.__explicitlySet__.add("initialNodeLabels");
            return this;
        }
        /**
         * The SSH public key on each node in the node pool on launch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
        private String sshPublicKey;

        /**
         * The SSH public key on each node in the node pool on launch.
         * @param sshPublicKey the value to set
         * @return this builder
         **/
        public Builder sshPublicKey(String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            this.__explicitlySet__.add("sshPublicKey");
            return this;
        }
        /**
         * The number of nodes in each subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
        private Integer quantityPerSubnet;

        /**
         * The number of nodes in each subnet.
         * @param quantityPerSubnet the value to set
         * @return this builder
         **/
        public Builder quantityPerSubnet(Integer quantityPerSubnet) {
            this.quantityPerSubnet = quantityPerSubnet;
            this.__explicitlySet__.add("quantityPerSubnet");
            return this;
        }
        /**
         * The OCIDs of the subnets in which to place nodes for this node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * The OCIDs of the subnets in which to place nodes for this node pool.
         * @param subnetIds the value to set
         * @return this builder
         **/
        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }
        /**
         * The configuration of nodes in the node pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
        private NodePoolNodeConfigDetails nodeConfigDetails;

        /**
         * The configuration of nodes in the node pool.
         * @param nodeConfigDetails the value to set
         * @return this builder
         **/
        public Builder nodeConfigDetails(NodePoolNodeConfigDetails nodeConfigDetails) {
            this.nodeConfigDetails = nodeConfigDetails;
            this.__explicitlySet__.add("nodeConfigDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolSummary build() {
            NodePoolSummary __instance__ =
                    new NodePoolSummary(
                            id,
                            compartmentId,
                            clusterId,
                            name,
                            kubernetesVersion,
                            nodeImageId,
                            nodeImageName,
                            nodeShapeConfig,
                            nodeSource,
                            nodeSourceDetails,
                            nodeShape,
                            initialNodeLabels,
                            sshPublicKey,
                            quantityPerSubnet,
                            subnetIds,
                            nodeConfigDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .clusterId(o.getClusterId())
                            .name(o.getName())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .nodeImageId(o.getNodeImageId())
                            .nodeImageName(o.getNodeImageName())
                            .nodeShapeConfig(o.getNodeShapeConfig())
                            .nodeSource(o.getNodeSource())
                            .nodeSourceDetails(o.getNodeSourceDetails())
                            .nodeShape(o.getNodeShape())
                            .initialNodeLabels(o.getInitialNodeLabels())
                            .sshPublicKey(o.getSshPublicKey())
                            .quantityPerSubnet(o.getQuantityPerSubnet())
                            .subnetIds(o.getSubnetIds())
                            .nodeConfigDetails(o.getNodeConfigDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the node pool.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment in which the node pool exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which the node pool exists.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the cluster to which this node pool is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The OCID of the cluster to which this node pool is attached.
     * @return the value
     **/
    public String getClusterId() {
        return clusterId;
    }

    /**
     * The name of the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the node pool.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of Kubernetes running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes running on the nodes in the node pool.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * Deprecated. see {@code nodeSource}. The OCID of the image running on the nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeImageId")
    private final String nodeImageId;

    /**
     * Deprecated. see {@code nodeSource}. The OCID of the image running on the nodes in the node pool.
     *
     * @return the value
     **/
    public String getNodeImageId() {
        return nodeImageId;
    }

    /**
     * Deprecated. see {@code nodeSource}. The name of the image running on the nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
    private final String nodeImageName;

    /**
     * Deprecated. see {@code nodeSource}. The name of the image running on the nodes in the node pool.
     *
     * @return the value
     **/
    public String getNodeImageName() {
        return nodeImageName;
    }

    /**
     * The shape configuration of the nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
    private final NodeShapeConfig nodeShapeConfig;

    /**
     * The shape configuration of the nodes.
     * @return the value
     **/
    public NodeShapeConfig getNodeShapeConfig() {
        return nodeShapeConfig;
    }

    /**
     * Deprecated. see {@code nodeSourceDetails}. Source running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSource")
    private final NodeSourceOption nodeSource;

    /**
     * Deprecated. see {@code nodeSourceDetails}. Source running on the nodes in the node pool.
     * @return the value
     **/
    public NodeSourceOption getNodeSource() {
        return nodeSource;
    }

    /**
     * Source running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
    private final NodeSourceDetails nodeSourceDetails;

    /**
     * Source running on the nodes in the node pool.
     * @return the value
     **/
    public NodeSourceDetails getNodeSourceDetails() {
        return nodeSourceDetails;
    }

    /**
     * The name of the node shape of the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
    private final String nodeShape;

    /**
     * The name of the node shape of the nodes in the node pool.
     * @return the value
     **/
    public String getNodeShape() {
        return nodeShape;
    }

    /**
     * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
    private final java.util.List<KeyValue> initialNodeLabels;

    /**
     * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     * @return the value
     **/
    public java.util.List<KeyValue> getInitialNodeLabels() {
        return initialNodeLabels;
    }

    /**
     * The SSH public key on each node in the node pool on launch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
    private final String sshPublicKey;

    /**
     * The SSH public key on each node in the node pool on launch.
     * @return the value
     **/
    public String getSshPublicKey() {
        return sshPublicKey;
    }

    /**
     * The number of nodes in each subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
    private final Integer quantityPerSubnet;

    /**
     * The number of nodes in each subnet.
     * @return the value
     **/
    public Integer getQuantityPerSubnet() {
        return quantityPerSubnet;
    }

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool.
     * @return the value
     **/
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * The configuration of nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
    private final NodePoolNodeConfigDetails nodeConfigDetails;

    /**
     * The configuration of nodes in the node pool.
     * @return the value
     **/
    public NodePoolNodeConfigDetails getNodeConfigDetails() {
        return nodeConfigDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodePoolSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", nodeImageId=").append(String.valueOf(this.nodeImageId));
        sb.append(", nodeImageName=").append(String.valueOf(this.nodeImageName));
        sb.append(", nodeShapeConfig=").append(String.valueOf(this.nodeShapeConfig));
        sb.append(", nodeSource=").append(String.valueOf(this.nodeSource));
        sb.append(", nodeSourceDetails=").append(String.valueOf(this.nodeSourceDetails));
        sb.append(", nodeShape=").append(String.valueOf(this.nodeShape));
        sb.append(", initialNodeLabels=").append(String.valueOf(this.initialNodeLabels));
        sb.append(", sshPublicKey=").append(String.valueOf(this.sshPublicKey));
        sb.append(", quantityPerSubnet=").append(String.valueOf(this.quantityPerSubnet));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", nodeConfigDetails=").append(String.valueOf(this.nodeConfigDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodePoolSummary)) {
            return false;
        }

        NodePoolSummary other = (NodePoolSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.nodeImageId, other.nodeImageId)
                && java.util.Objects.equals(this.nodeImageName, other.nodeImageName)
                && java.util.Objects.equals(this.nodeShapeConfig, other.nodeShapeConfig)
                && java.util.Objects.equals(this.nodeSource, other.nodeSource)
                && java.util.Objects.equals(this.nodeSourceDetails, other.nodeSourceDetails)
                && java.util.Objects.equals(this.nodeShape, other.nodeShape)
                && java.util.Objects.equals(this.initialNodeLabels, other.initialNodeLabels)
                && java.util.Objects.equals(this.sshPublicKey, other.sshPublicKey)
                && java.util.Objects.equals(this.quantityPerSubnet, other.quantityPerSubnet)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(this.nodeConfigDetails, other.nodeConfigDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result = (result * PRIME) + (this.nodeImageId == null ? 43 : this.nodeImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeImageName == null ? 43 : this.nodeImageName.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeShapeConfig == null ? 43 : this.nodeShapeConfig.hashCode());
        result = (result * PRIME) + (this.nodeSource == null ? 43 : this.nodeSource.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeSourceDetails == null ? 43 : this.nodeSourceDetails.hashCode());
        result = (result * PRIME) + (this.nodeShape == null ? 43 : this.nodeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.initialNodeLabels == null ? 43 : this.initialNodeLabels.hashCode());
        result = (result * PRIME) + (this.sshPublicKey == null ? 43 : this.sshPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.quantityPerSubnet == null ? 43 : this.quantityPerSubnet.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeConfigDetails == null ? 43 : this.nodeConfigDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
