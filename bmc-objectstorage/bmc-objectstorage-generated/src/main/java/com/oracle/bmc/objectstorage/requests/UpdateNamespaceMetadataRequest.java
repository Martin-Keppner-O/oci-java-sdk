/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateNamespaceMetadataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateNamespaceMetadataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateNamespaceMetadataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** Request object for update NamespaceMetadata. */
    private com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails
            updateNamespaceMetadataDetails;

    /** Request object for update NamespaceMetadata. */
    public com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails
            getUpdateNamespaceMetadataDetails() {
        return updateNamespaceMetadataDetails;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails getBody$() {
        return updateNamespaceMetadataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNamespaceMetadataRequest,
                    com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** Request object for update NamespaceMetadata. */
        private com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails
                updateNamespaceMetadataDetails = null;

        /**
         * Request object for update NamespaceMetadata.
         *
         * @param updateNamespaceMetadataDetails the value to set
         * @return this builder instance
         */
        public Builder updateNamespaceMetadataDetails(
                com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails
                        updateNamespaceMetadataDetails) {
            this.updateNamespaceMetadataDetails = updateNamespaceMetadataDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
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
        public Builder copy(UpdateNamespaceMetadataRequest o) {
            namespaceName(o.getNamespaceName());
            updateNamespaceMetadataDetails(o.getUpdateNamespaceMetadataDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNamespaceMetadataRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateNamespaceMetadataRequest
         */
        public UpdateNamespaceMetadataRequest build() {
            UpdateNamespaceMetadataRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails body) {
            updateNamespaceMetadataDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNamespaceMetadataRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNamespaceMetadataRequest
         */
        public UpdateNamespaceMetadataRequest buildWithoutInvocationCallback() {
            UpdateNamespaceMetadataRequest request = new UpdateNamespaceMetadataRequest();
            request.namespaceName = namespaceName;
            request.updateNamespaceMetadataDetails = updateNamespaceMetadataDetails;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new UpdateNamespaceMetadataRequest(namespaceName, updateNamespaceMetadataDetails,
            // opcClientRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .updateNamespaceMetadataDetails(updateNamespaceMetadataDetails)
                .opcClientRequestId(opcClientRequestId);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",updateNamespaceMetadataDetails=")
                .append(String.valueOf(this.updateNamespaceMetadataDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNamespaceMetadataRequest)) {
            return false;
        }

        UpdateNamespaceMetadataRequest other = (UpdateNamespaceMetadataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.updateNamespaceMetadataDetails, other.updateNamespaceMetadataDetails)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNamespaceMetadataDetails == null
                                ? 43
                                : this.updateNamespaceMetadataDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
