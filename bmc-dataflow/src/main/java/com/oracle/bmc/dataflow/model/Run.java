/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A run object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Run.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Run {
    @Deprecated
    @java.beans.ConstructorProperties({
        "archiveUri",
        "arguments",
        "applicationId",
        "className",
        "compartmentId",
        "configuration",
        "dataReadInBytes",
        "dataWrittenInBytes",
        "definedTags",
        "displayName",
        "driverShape",
        "driverShapeConfig",
        "execute",
        "executorShape",
        "executorShapeConfig",
        "fileUri",
        "freeformTags",
        "id",
        "language",
        "lifecycleDetails",
        "lifecycleState",
        "logsBucketUri",
        "metastoreId",
        "numExecutors",
        "opcRequestId",
        "ownerPrincipalId",
        "ownerUserName",
        "parameters",
        "privateEndpointDnsZones",
        "privateEndpointMaxHostCount",
        "privateEndpointNsgIds",
        "privateEndpointId",
        "privateEndpointSubnetId",
        "runDurationInMilliseconds",
        "sparkVersion",
        "timeCreated",
        "timeUpdated",
        "totalOCpu",
        "type",
        "warehouseBucketUri"
    })
    public Run(
            String archiveUri,
            java.util.List<String> arguments,
            String applicationId,
            String className,
            String compartmentId,
            java.util.Map<String, String> configuration,
            Long dataReadInBytes,
            Long dataWrittenInBytes,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String driverShape,
            ShapeConfig driverShapeConfig,
            String execute,
            String executorShape,
            ShapeConfig executorShapeConfig,
            String fileUri,
            java.util.Map<String, String> freeformTags,
            String id,
            ApplicationLanguage language,
            String lifecycleDetails,
            RunLifecycleState lifecycleState,
            String logsBucketUri,
            String metastoreId,
            Integer numExecutors,
            String opcRequestId,
            String ownerPrincipalId,
            String ownerUserName,
            java.util.List<ApplicationParameter> parameters,
            java.util.List<String> privateEndpointDnsZones,
            Integer privateEndpointMaxHostCount,
            java.util.List<String> privateEndpointNsgIds,
            String privateEndpointId,
            String privateEndpointSubnetId,
            Long runDurationInMilliseconds,
            String sparkVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer totalOCpu,
            ApplicationType type,
            String warehouseBucketUri) {
        super();
        this.archiveUri = archiveUri;
        this.arguments = arguments;
        this.applicationId = applicationId;
        this.className = className;
        this.compartmentId = compartmentId;
        this.configuration = configuration;
        this.dataReadInBytes = dataReadInBytes;
        this.dataWrittenInBytes = dataWrittenInBytes;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.driverShape = driverShape;
        this.driverShapeConfig = driverShapeConfig;
        this.execute = execute;
        this.executorShape = executorShape;
        this.executorShapeConfig = executorShapeConfig;
        this.fileUri = fileUri;
        this.freeformTags = freeformTags;
        this.id = id;
        this.language = language;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.logsBucketUri = logsBucketUri;
        this.metastoreId = metastoreId;
        this.numExecutors = numExecutors;
        this.opcRequestId = opcRequestId;
        this.ownerPrincipalId = ownerPrincipalId;
        this.ownerUserName = ownerUserName;
        this.parameters = parameters;
        this.privateEndpointDnsZones = privateEndpointDnsZones;
        this.privateEndpointMaxHostCount = privateEndpointMaxHostCount;
        this.privateEndpointNsgIds = privateEndpointNsgIds;
        this.privateEndpointId = privateEndpointId;
        this.privateEndpointSubnetId = privateEndpointSubnetId;
        this.runDurationInMilliseconds = runDurationInMilliseconds;
        this.sparkVersion = sparkVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.totalOCpu = totalOCpu;
        this.type = type;
        this.warehouseBucketUri = warehouseBucketUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
        private String archiveUri;

        /**
         * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param archiveUri the value to set
         * @return this builder
         **/
        public Builder archiveUri(String archiveUri) {
            this.archiveUri = archiveUri;
            this.__explicitlySet__.add("archiveUri");
            return this;
        }
        /**
         * The arguments passed to the running application as command line arguments.  An argument is
         * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
         * map.  Each placeholder specified must be represented in the parameters map else the request
         * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
         * {@code Service Api Spec}, where {@code name} is the name of the parameter.
         * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
         * If "input_file" has a value of "mydata.xml", then the value above will be translated to
         * {@code --input mydata.xml --name "John Doe"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * The arguments passed to the running application as command line arguments.  An argument is
         * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
         * map.  Each placeholder specified must be represented in the parameters map else the request
         * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
         * {@code Service Api Spec}, where {@code name} is the name of the parameter.
         * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
         * If "input_file" has a value of "mydata.xml", then the value above will be translated to
         * {@code --input mydata.xml --name "John Doe"}
         *
         * @param arguments the value to set
         * @return this builder
         **/
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /**
         * The application ID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The application ID.
         *
         * @param applicationId the value to set
         * @return this builder
         **/
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /**
         * The class for the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("className")
        private String className;

        /**
         * The class for the application.
         *
         * @param className the value to set
         * @return this builder
         **/
        public Builder className(String className) {
            this.className = className;
            this.__explicitlySet__.add("className");
            return this;
        }
        /**
         * The OCID of a compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Spark configuration passed to the running process.
         * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
         * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
         * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
         * not allowed to be overwritten will cause a 400 status to be returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, String> configuration;

        /**
         * The Spark configuration passed to the running process.
         * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
         * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
         * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
         * not allowed to be overwritten will cause a 400 status to be returned.
         *
         * @param configuration the value to set
         * @return this builder
         **/
        public Builder configuration(java.util.Map<String, String> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /**
         * The data read by the run in bytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
        private Long dataReadInBytes;

        /**
         * The data read by the run in bytes.
         *
         * @param dataReadInBytes the value to set
         * @return this builder
         **/
        public Builder dataReadInBytes(Long dataReadInBytes) {
            this.dataReadInBytes = dataReadInBytes;
            this.__explicitlySet__.add("dataReadInBytes");
            return this;
        }
        /**
         * The data written by the run in bytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
        private Long dataWrittenInBytes;

        /**
         * The data written by the run in bytes.
         *
         * @param dataWrittenInBytes the value to set
         * @return this builder
         **/
        public Builder dataWrittenInBytes(Long dataWrittenInBytes) {
            this.dataWrittenInBytes = dataWrittenInBytes;
            this.__explicitlySet__.add("dataWrittenInBytes");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * A user-friendly name. This name is not necessarily unique.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. This name is not necessarily unique.
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
         * The VM shape for the driver. Sets the driver cores and memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The VM shape for the driver. Sets the driver cores and memory.
         *
         * @param driverShape the value to set
         * @return this builder
         **/
        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
        private ShapeConfig driverShapeConfig;

        public Builder driverShapeConfig(ShapeConfig driverShapeConfig) {
            this.driverShapeConfig = driverShapeConfig;
            this.__explicitlySet__.add("driverShapeConfig");
            return this;
        }
        /**
         * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
         * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
         * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
         * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
         * Data Flow service will use derived information from execute input only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("execute")
        private String execute;

        /**
         * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
         * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
         * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
         * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
         * Data Flow service will use derived information from execute input only.
         *
         * @param execute the value to set
         * @return this builder
         **/
        public Builder execute(String execute) {
            this.execute = execute;
            this.__explicitlySet__.add("execute");
            return this;
        }
        /**
         * The VM shape for the executors. Sets the executor cores and memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The VM shape for the executors. Sets the executor cores and memory.
         *
         * @param executorShape the value to set
         * @return this builder
         **/
        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
        private ShapeConfig executorShapeConfig;

        public Builder executorShapeConfig(ShapeConfig executorShapeConfig) {
            this.executorShapeConfig = executorShapeConfig;
            this.__explicitlySet__.add("executorShapeConfig");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the file containing the application to execute.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileUri")
        private String fileUri;

        /**
         * An Oracle Cloud Infrastructure URI of the file containing the application to execute.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param fileUri the value to set
         * @return this builder
         **/
        public Builder fileUri(String fileUri) {
            this.fileUri = fileUri;
            this.__explicitlySet__.add("fileUri");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The ID of a run.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of a run.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The Spark language.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private ApplicationLanguage language;

        /**
         * The Spark language.
         *
         * @param language the value to set
         * @return this builder
         **/
        public Builder language(ApplicationLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /**
         * The detailed messages about the lifecycle state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The detailed messages about the lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The current state of this run.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private RunLifecycleState lifecycleState;

        /**
         * The current state of this run.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(RunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
        private String logsBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param logsBucketUri the value to set
         * @return this builder
         **/
        public Builder logsBucketUri(String logsBucketUri) {
            this.logsBucketUri = logsBucketUri;
            this.__explicitlySet__.add("logsBucketUri");
            return this;
        }
        /**
         * The OCID of OCI Hive Metastore.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The OCID of OCI Hive Metastore.
         *
         * @param metastoreId the value to set
         * @return this builder
         **/
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * The number of executor VMs requested.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
        private Integer numExecutors;

        /**
         * The number of executor VMs requested.
         *
         * @param numExecutors the value to set
         * @return this builder
         **/
        public Builder numExecutors(Integer numExecutors) {
            this.numExecutors = numExecutors;
            this.__explicitlySet__.add("numExecutors");
            return this;
        }
        /**
         * Unique Oracle assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         **/
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            this.__explicitlySet__.add("opcRequestId");
            return this;
        }
        /**
         * The OCID of the user who created the resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
        private String ownerPrincipalId;

        /**
         * The OCID of the user who created the resource.
         *
         * @param ownerPrincipalId the value to set
         * @return this builder
         **/
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            this.__explicitlySet__.add("ownerPrincipalId");
            return this;
        }
        /**
         * The username of the user who created the resource.  If the username of the owner does not exist,
         * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
        private String ownerUserName;

        /**
         * The username of the user who created the resource.  If the username of the owner does not exist,
         * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
         *
         * @param ownerUserName the value to set
         * @return this builder
         **/
        public Builder ownerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            this.__explicitlySet__.add("ownerUserName");
            return this;
        }
        /**
         * An array of name/value pairs used to fill placeholders found in properties like
         * {@code Application.arguments}.  The name must be a string of one or more word characters
         * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
         * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ApplicationParameter> parameters;

        /**
         * An array of name/value pairs used to fill placeholders found in properties like
         * {@code Application.arguments}.  The name must be a string of one or more word characters
         * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
         * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<ApplicationParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * An array of DNS zone names.
         * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsZones")
        private java.util.List<String> privateEndpointDnsZones;

        /**
         * An array of DNS zone names.
         * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
         *
         * @param privateEndpointDnsZones the value to set
         * @return this builder
         **/
        public Builder privateEndpointDnsZones(java.util.List<String> privateEndpointDnsZones) {
            this.privateEndpointDnsZones = privateEndpointDnsZones;
            this.__explicitlySet__.add("privateEndpointDnsZones");
            return this;
        }
        /**
         * The maximum number of hosts to be accessed through the private endpoint. This value is used
         * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
         * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
         * to 512.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMaxHostCount")
        private Integer privateEndpointMaxHostCount;

        /**
         * The maximum number of hosts to be accessed through the private endpoint. This value is used
         * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
         * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
         * to 512.
         *
         * @param privateEndpointMaxHostCount the value to set
         * @return this builder
         **/
        public Builder privateEndpointMaxHostCount(Integer privateEndpointMaxHostCount) {
            this.privateEndpointMaxHostCount = privateEndpointMaxHostCount;
            this.__explicitlySet__.add("privateEndpointMaxHostCount");
            return this;
        }
        /**
         * An array of network security group OCIDs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointNsgIds")
        private java.util.List<String> privateEndpointNsgIds;

        /**
         * An array of network security group OCIDs.
         *
         * @param privateEndpointNsgIds the value to set
         * @return this builder
         **/
        public Builder privateEndpointNsgIds(java.util.List<String> privateEndpointNsgIds) {
            this.privateEndpointNsgIds = privateEndpointNsgIds;
            this.__explicitlySet__.add("privateEndpointNsgIds");
            return this;
        }
        /**
         * The OCID of a private endpoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * The OCID of a private endpoint.
         *
         * @param privateEndpointId the value to set
         * @return this builder
         **/
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }
        /**
         * The OCID of a subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSubnetId")
        private String privateEndpointSubnetId;

        /**
         * The OCID of a subnet.
         *
         * @param privateEndpointSubnetId the value to set
         * @return this builder
         **/
        public Builder privateEndpointSubnetId(String privateEndpointSubnetId) {
            this.privateEndpointSubnetId = privateEndpointSubnetId;
            this.__explicitlySet__.add("privateEndpointSubnetId");
            return this;
        }
        /**
         * The duration of the run in milliseconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
        private Long runDurationInMilliseconds;

        /**
         * The duration of the run in milliseconds.
         *
         * @param runDurationInMilliseconds the value to set
         * @return this builder
         **/
        public Builder runDurationInMilliseconds(Long runDurationInMilliseconds) {
            this.runDurationInMilliseconds = runDurationInMilliseconds;
            this.__explicitlySet__.add("runDurationInMilliseconds");
            return this;
        }
        /**
         * The Spark version utilized to run the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        /**
         * The Spark version utilized to run the application.
         *
         * @param sparkVersion the value to set
         * @return this builder
         **/
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }
        /**
         * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
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
         * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2018-04-03T21:10:29.600Z}
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
         * The total number of oCPU requested by the run.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
        private Integer totalOCpu;

        /**
         * The total number of oCPU requested by the run.
         *
         * @param totalOCpu the value to set
         * @return this builder
         **/
        public Builder totalOCpu(Integer totalOCpu) {
            this.totalOCpu = totalOCpu;
            this.__explicitlySet__.add("totalOCpu");
            return this;
        }
        /**
         * The Spark application processing type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ApplicationType type;

        /**
         * The Spark application processing type.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(ApplicationType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
         * for BATCH SQL runs.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
         * for BATCH SQL runs.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param warehouseBucketUri the value to set
         * @return this builder
         **/
        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Run build() {
            Run __instance__ =
                    new Run(
                            archiveUri,
                            arguments,
                            applicationId,
                            className,
                            compartmentId,
                            configuration,
                            dataReadInBytes,
                            dataWrittenInBytes,
                            definedTags,
                            displayName,
                            driverShape,
                            driverShapeConfig,
                            execute,
                            executorShape,
                            executorShapeConfig,
                            fileUri,
                            freeformTags,
                            id,
                            language,
                            lifecycleDetails,
                            lifecycleState,
                            logsBucketUri,
                            metastoreId,
                            numExecutors,
                            opcRequestId,
                            ownerPrincipalId,
                            ownerUserName,
                            parameters,
                            privateEndpointDnsZones,
                            privateEndpointMaxHostCount,
                            privateEndpointNsgIds,
                            privateEndpointId,
                            privateEndpointSubnetId,
                            runDurationInMilliseconds,
                            sparkVersion,
                            timeCreated,
                            timeUpdated,
                            totalOCpu,
                            type,
                            warehouseBucketUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Run o) {
            Builder copiedBuilder =
                    archiveUri(o.getArchiveUri())
                            .arguments(o.getArguments())
                            .applicationId(o.getApplicationId())
                            .className(o.getClassName())
                            .compartmentId(o.getCompartmentId())
                            .configuration(o.getConfiguration())
                            .dataReadInBytes(o.getDataReadInBytes())
                            .dataWrittenInBytes(o.getDataWrittenInBytes())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .driverShape(o.getDriverShape())
                            .driverShapeConfig(o.getDriverShapeConfig())
                            .execute(o.getExecute())
                            .executorShape(o.getExecutorShape())
                            .executorShapeConfig(o.getExecutorShapeConfig())
                            .fileUri(o.getFileUri())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .language(o.getLanguage())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .logsBucketUri(o.getLogsBucketUri())
                            .metastoreId(o.getMetastoreId())
                            .numExecutors(o.getNumExecutors())
                            .opcRequestId(o.getOpcRequestId())
                            .ownerPrincipalId(o.getOwnerPrincipalId())
                            .ownerUserName(o.getOwnerUserName())
                            .parameters(o.getParameters())
                            .privateEndpointDnsZones(o.getPrivateEndpointDnsZones())
                            .privateEndpointMaxHostCount(o.getPrivateEndpointMaxHostCount())
                            .privateEndpointNsgIds(o.getPrivateEndpointNsgIds())
                            .privateEndpointId(o.getPrivateEndpointId())
                            .privateEndpointSubnetId(o.getPrivateEndpointSubnetId())
                            .runDurationInMilliseconds(o.getRunDurationInMilliseconds())
                            .sparkVersion(o.getSparkVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .totalOCpu(o.getTotalOCpu())
                            .type(o.getType())
                            .warehouseBucketUri(o.getWarehouseBucketUri());

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
     * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
    private final String archiveUri;

    /**
     * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getArchiveUri() {
        return archiveUri;
    }

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * {@code Service Api Spec}, where {@code name} is the name of the parameter.
     * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
     * If "input_file" has a value of "mydata.xml", then the value above will be translated to
     * {@code --input mydata.xml --name "John Doe"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * {@code Service Api Spec}, where {@code name} is the name of the parameter.
     * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
     * If "input_file" has a value of "mydata.xml", then the value above will be translated to
     * {@code --input mydata.xml --name "John Doe"}
     *
     * @return the value
     **/
    public java.util.List<String> getArguments() {
        return arguments;
    }

    /**
     * The application ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The application ID.
     *
     * @return the value
     **/
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The class for the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    private final String className;

    /**
     * The class for the application.
     *
     * @return the value
     **/
    public String getClassName() {
        return className;
    }

    /**
     * The OCID of a compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.Map<String, String> configuration;

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * The data read by the run in bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
    private final Long dataReadInBytes;

    /**
     * The data read by the run in bytes.
     *
     * @return the value
     **/
    public Long getDataReadInBytes() {
        return dataReadInBytes;
    }

    /**
     * The data written by the run in bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
    private final Long dataWrittenInBytes;

    /**
     * The data written by the run in bytes.
     *
     * @return the value
     **/
    public Long getDataWrittenInBytes() {
        return dataWrittenInBytes;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. This name is not necessarily unique.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. This name is not necessarily unique.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     * @return the value
     **/
    public String getDriverShape() {
        return driverShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
    private final ShapeConfig driverShapeConfig;

    public ShapeConfig getDriverShapeConfig() {
        return driverShapeConfig;
    }

    /**
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
     * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
     * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
     * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
     * Data Flow service will use derived information from execute input only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("execute")
    private final String execute;

    /**
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
     * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
     * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
     * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
     * Data Flow service will use derived information from execute input only.
     *
     * @return the value
     **/
    public String getExecute() {
        return execute;
    }

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     * @return the value
     **/
    public String getExecutorShape() {
        return executorShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
    private final ShapeConfig executorShapeConfig;

    public ShapeConfig getExecutorShapeConfig() {
        return executorShapeConfig;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the file containing the application to execute.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileUri")
    private final String fileUri;

    /**
     * An Oracle Cloud Infrastructure URI of the file containing the application to execute.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getFileUri() {
        return fileUri;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The ID of a run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of a run.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The Spark language.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final ApplicationLanguage language;

    /**
     * The Spark language.
     *
     * @return the value
     **/
    public ApplicationLanguage getLanguage() {
        return language;
    }

    /**
     * The detailed messages about the lifecycle state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The detailed messages about the lifecycle state.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The current state of this run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RunLifecycleState lifecycleState;

    /**
     * The current state of this run.
     *
     * @return the value
     **/
    public RunLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
    private final String logsBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getLogsBucketUri() {
        return logsBucketUri;
    }

    /**
     * The OCID of OCI Hive Metastore.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The OCID of OCI Hive Metastore.
     *
     * @return the value
     **/
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The number of executor VMs requested.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
    private final Integer numExecutors;

    /**
     * The number of executor VMs requested.
     *
     * @return the value
     **/
    public Integer getNumExecutors() {
        return numExecutors;
    }

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     **/
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The OCID of the user who created the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
    private final String ownerPrincipalId;

    /**
     * The OCID of the user who created the resource.
     *
     * @return the value
     **/
    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }

    /**
     * The username of the user who created the resource.  If the username of the owner does not exist,
     * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
    private final String ownerUserName;

    /**
     * The username of the user who created the resource.  If the username of the owner does not exist,
     * {@code null} will be returned and the caller should refer to the ownerPrincipalId value instead.
     *
     * @return the value
     **/
    public String getOwnerUserName() {
        return ownerUserName;
    }

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * {@code Application.arguments}.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ApplicationParameter> parameters;

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * {@code Application.arguments}.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
     *
     * @return the value
     **/
    public java.util.List<ApplicationParameter> getParameters() {
        return parameters;
    }

    /**
     * An array of DNS zone names.
     * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsZones")
    private final java.util.List<String> privateEndpointDnsZones;

    /**
     * An array of DNS zone names.
     * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
     *
     * @return the value
     **/
    public java.util.List<String> getPrivateEndpointDnsZones() {
        return privateEndpointDnsZones;
    }

    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used
     * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
     * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
     * to 512.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMaxHostCount")
    private final Integer privateEndpointMaxHostCount;

    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used
     * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
     * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
     * to 512.
     *
     * @return the value
     **/
    public Integer getPrivateEndpointMaxHostCount() {
        return privateEndpointMaxHostCount;
    }

    /**
     * An array of network security group OCIDs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointNsgIds")
    private final java.util.List<String> privateEndpointNsgIds;

    /**
     * An array of network security group OCIDs.
     *
     * @return the value
     **/
    public java.util.List<String> getPrivateEndpointNsgIds() {
        return privateEndpointNsgIds;
    }

    /**
     * The OCID of a private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * The OCID of a private endpoint.
     *
     * @return the value
     **/
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    /**
     * The OCID of a subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSubnetId")
    private final String privateEndpointSubnetId;

    /**
     * The OCID of a subnet.
     *
     * @return the value
     **/
    public String getPrivateEndpointSubnetId() {
        return privateEndpointSubnetId;
    }

    /**
     * The duration of the run in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
    private final Long runDurationInMilliseconds;

    /**
     * The duration of the run in milliseconds.
     *
     * @return the value
     **/
    public Long getRunDurationInMilliseconds() {
        return runDurationInMilliseconds;
    }

    /**
     * The Spark version utilized to run the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

    /**
     * The Spark version utilized to run the application.
     *
     * @return the value
     **/
    public String getSparkVersion() {
        return sparkVersion;
    }

    /**
     * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The total number of oCPU requested by the run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
    private final Integer totalOCpu;

    /**
     * The total number of oCPU requested by the run.
     *
     * @return the value
     **/
    public Integer getTotalOCpu() {
        return totalOCpu;
    }

    /**
     * The Spark application processing type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ApplicationType type;

    /**
     * The Spark application processing type.
     *
     * @return the value
     **/
    public ApplicationType getType() {
        return type;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    private final String warehouseBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getWarehouseBucketUri() {
        return warehouseBucketUri;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Run(");
        sb.append("archiveUri=").append(String.valueOf(this.archiveUri));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", className=").append(String.valueOf(this.className));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", dataReadInBytes=").append(String.valueOf(this.dataReadInBytes));
        sb.append(", dataWrittenInBytes=").append(String.valueOf(this.dataWrittenInBytes));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(", execute=").append(String.valueOf(this.execute));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", executorShapeConfig=").append(String.valueOf(this.executorShapeConfig));
        sb.append(", fileUri=").append(String.valueOf(this.fileUri));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", logsBucketUri=").append(String.valueOf(this.logsBucketUri));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", numExecutors=").append(String.valueOf(this.numExecutors));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(", ownerUserName=").append(String.valueOf(this.ownerUserName));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", privateEndpointDnsZones=")
                .append(String.valueOf(this.privateEndpointDnsZones));
        sb.append(", privateEndpointMaxHostCount=")
                .append(String.valueOf(this.privateEndpointMaxHostCount));
        sb.append(", privateEndpointNsgIds=").append(String.valueOf(this.privateEndpointNsgIds));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(", privateEndpointSubnetId=")
                .append(String.valueOf(this.privateEndpointSubnetId));
        sb.append(", runDurationInMilliseconds=")
                .append(String.valueOf(this.runDurationInMilliseconds));
        sb.append(", sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", totalOCpu=").append(String.valueOf(this.totalOCpu));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", warehouseBucketUri=").append(String.valueOf(this.warehouseBucketUri));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Run)) {
            return false;
        }

        Run other = (Run) o;
        return java.util.Objects.equals(this.archiveUri, other.archiveUri)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.className, other.className)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.dataReadInBytes, other.dataReadInBytes)
                && java.util.Objects.equals(this.dataWrittenInBytes, other.dataWrittenInBytes)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig)
                && java.util.Objects.equals(this.execute, other.execute)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.executorShapeConfig, other.executorShapeConfig)
                && java.util.Objects.equals(this.fileUri, other.fileUri)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.logsBucketUri, other.logsBucketUri)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.numExecutors, other.numExecutors)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(this.ownerUserName, other.ownerUserName)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(
                        this.privateEndpointDnsZones, other.privateEndpointDnsZones)
                && java.util.Objects.equals(
                        this.privateEndpointMaxHostCount, other.privateEndpointMaxHostCount)
                && java.util.Objects.equals(this.privateEndpointNsgIds, other.privateEndpointNsgIds)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(
                        this.privateEndpointSubnetId, other.privateEndpointSubnetId)
                && java.util.Objects.equals(
                        this.runDurationInMilliseconds, other.runDurationInMilliseconds)
                && java.util.Objects.equals(this.sparkVersion, other.sparkVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.totalOCpu, other.totalOCpu)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.warehouseBucketUri, other.warehouseBucketUri)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.archiveUri == null ? 43 : this.archiveUri.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result = (result * PRIME) + (this.className == null ? 43 : this.className.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result =
                (result * PRIME)
                        + (this.dataReadInBytes == null ? 43 : this.dataReadInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.dataWrittenInBytes == null
                                ? 43
                                : this.dataWrittenInBytes.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeConfig == null ? 43 : this.driverShapeConfig.hashCode());
        result = (result * PRIME) + (this.execute == null ? 43 : this.execute.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeConfig == null
                                ? 43
                                : this.executorShapeConfig.hashCode());
        result = (result * PRIME) + (this.fileUri == null ? 43 : this.fileUri.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.logsBucketUri == null ? 43 : this.logsBucketUri.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.numExecutors == null ? 43 : this.numExecutors.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerUserName == null ? 43 : this.ownerUserName.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointDnsZones == null
                                ? 43
                                : this.privateEndpointDnsZones.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointMaxHostCount == null
                                ? 43
                                : this.privateEndpointMaxHostCount.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointNsgIds == null
                                ? 43
                                : this.privateEndpointNsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointSubnetId == null
                                ? 43
                                : this.privateEndpointSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.runDurationInMilliseconds == null
                                ? 43
                                : this.runDurationInMilliseconds.hashCode());
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.totalOCpu == null ? 43 : this.totalOCpu.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.warehouseBucketUri == null
                                ? 43
                                : this.warehouseBucketUri.hashCode());
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
