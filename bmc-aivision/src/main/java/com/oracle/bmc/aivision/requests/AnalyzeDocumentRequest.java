/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.requests;

import com.oracle.bmc.aivision.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aivision/AnalyzeDocumentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AnalyzeDocumentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class AnalyzeDocumentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aivision.model.AnalyzeDocumentDetails> {

    /** The details of how to analyze a document. */
    private com.oracle.bmc.aivision.model.AnalyzeDocumentDetails analyzeDocumentDetails;

    /** The details of how to analyze a document. */
    public com.oracle.bmc.aivision.model.AnalyzeDocumentDetails getAnalyzeDocumentDetails() {
        return analyzeDocumentDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.aivision.model.AnalyzeDocumentDetails getBody$() {
        return analyzeDocumentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AnalyzeDocumentRequest, com.oracle.bmc.aivision.model.AnalyzeDocumentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details of how to analyze a document. */
        private com.oracle.bmc.aivision.model.AnalyzeDocumentDetails analyzeDocumentDetails = null;

        /**
         * The details of how to analyze a document.
         *
         * @param analyzeDocumentDetails the value to set
         * @return this builder instance
         */
        public Builder analyzeDocumentDetails(
                com.oracle.bmc.aivision.model.AnalyzeDocumentDetails analyzeDocumentDetails) {
            this.analyzeDocumentDetails = analyzeDocumentDetails;
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
        public Builder copy(AnalyzeDocumentRequest o) {
            analyzeDocumentDetails(o.getAnalyzeDocumentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AnalyzeDocumentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AnalyzeDocumentRequest
         */
        public AnalyzeDocumentRequest build() {
            AnalyzeDocumentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.aivision.model.AnalyzeDocumentDetails body) {
            analyzeDocumentDetails(body);
            return this;
        }

        /**
         * Build the instance of AnalyzeDocumentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AnalyzeDocumentRequest
         */
        public AnalyzeDocumentRequest buildWithoutInvocationCallback() {
            AnalyzeDocumentRequest request = new AnalyzeDocumentRequest();
            request.analyzeDocumentDetails = analyzeDocumentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new AnalyzeDocumentRequest(analyzeDocumentDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .analyzeDocumentDetails(analyzeDocumentDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",analyzeDocumentDetails=").append(String.valueOf(this.analyzeDocumentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeDocumentRequest)) {
            return false;
        }

        AnalyzeDocumentRequest other = (AnalyzeDocumentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.analyzeDocumentDetails, other.analyzeDocumentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.analyzeDocumentDetails == null
                                ? 43
                                : this.analyzeDocumentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
