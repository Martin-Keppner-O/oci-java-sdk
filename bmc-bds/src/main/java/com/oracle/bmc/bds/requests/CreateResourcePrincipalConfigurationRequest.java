/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/CreateResourcePrincipalConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateResourcePrincipalConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class CreateResourcePrincipalConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails> {

    /** The OCID of the cluster. */
    private String bdsInstanceId;

    /** The OCID of the cluster. */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /** Details of creating resource principal session token for the bds cluster. */
    private com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails
            createResourcePrincipalConfigurationDetails;

    /** Details of creating resource principal session token for the bds cluster. */
    public com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails
            getCreateResourcePrincipalConfigurationDetails() {
        return createResourcePrincipalConfigurationDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails getBody$() {
        return createResourcePrincipalConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateResourcePrincipalConfigurationRequest,
                    com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the cluster. */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         *
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /** Details of creating resource principal session token for the bds cluster. */
        private com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails
                createResourcePrincipalConfigurationDetails = null;

        /**
         * Details of creating resource principal session token for the bds cluster.
         *
         * @param createResourcePrincipalConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder createResourcePrincipalConfigurationDetails(
                com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails
                        createResourcePrincipalConfigurationDetails) {
            this.createResourcePrincipalConfigurationDetails =
                    createResourcePrincipalConfigurationDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(CreateResourcePrincipalConfigurationRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            createResourcePrincipalConfigurationDetails(
                    o.getCreateResourcePrincipalConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateResourcePrincipalConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateResourcePrincipalConfigurationRequest
         */
        public CreateResourcePrincipalConfigurationRequest build() {
            CreateResourcePrincipalConfigurationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.bds.model.CreateResourcePrincipalConfigurationDetails body) {
            createResourcePrincipalConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateResourcePrincipalConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateResourcePrincipalConfigurationRequest
         */
        public CreateResourcePrincipalConfigurationRequest buildWithoutInvocationCallback() {
            CreateResourcePrincipalConfigurationRequest request =
                    new CreateResourcePrincipalConfigurationRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.createResourcePrincipalConfigurationDetails =
                    createResourcePrincipalConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateResourcePrincipalConfigurationRequest(bdsInstanceId,
            // createResourcePrincipalConfigurationDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .createResourcePrincipalConfigurationDetails(
                        createResourcePrincipalConfigurationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",createResourcePrincipalConfigurationDetails=")
                .append(String.valueOf(this.createResourcePrincipalConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateResourcePrincipalConfigurationRequest)) {
            return false;
        }

        CreateResourcePrincipalConfigurationRequest other =
                (CreateResourcePrincipalConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(
                        this.createResourcePrincipalConfigurationDetails,
                        other.createResourcePrincipalConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.createResourcePrincipalConfigurationDetails == null
                                ? 43
                                : this.createResourcePrincipalConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
