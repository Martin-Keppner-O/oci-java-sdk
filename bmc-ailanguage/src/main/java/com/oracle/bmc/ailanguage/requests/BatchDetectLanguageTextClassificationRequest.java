/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageTextClassificationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BatchDetectLanguageTextClassificationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class BatchDetectLanguageTextClassificationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails> {

    /** The details to make text classification detect call. */
    private com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails
            batchDetectLanguageTextClassificationDetails;

    /** The details to make text classification detect call. */
    public com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails
            getBatchDetectLanguageTextClassificationDetails() {
        return batchDetectLanguageTextClassificationDetails;
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
    public com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails getBody$() {
        return batchDetectLanguageTextClassificationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BatchDetectLanguageTextClassificationRequest,
                    com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details to make text classification detect call. */
        private com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails
                batchDetectLanguageTextClassificationDetails = null;

        /**
         * The details to make text classification detect call.
         *
         * @param batchDetectLanguageTextClassificationDetails the value to set
         * @return this builder instance
         */
        public Builder batchDetectLanguageTextClassificationDetails(
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails
                        batchDetectLanguageTextClassificationDetails) {
            this.batchDetectLanguageTextClassificationDetails =
                    batchDetectLanguageTextClassificationDetails;
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
        public Builder copy(BatchDetectLanguageTextClassificationRequest o) {
            batchDetectLanguageTextClassificationDetails(
                    o.getBatchDetectLanguageTextClassificationDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BatchDetectLanguageTextClassificationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BatchDetectLanguageTextClassificationRequest
         */
        public BatchDetectLanguageTextClassificationRequest build() {
            BatchDetectLanguageTextClassificationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationDetails body) {
            batchDetectLanguageTextClassificationDetails(body);
            return this;
        }

        /**
         * Build the instance of BatchDetectLanguageTextClassificationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BatchDetectLanguageTextClassificationRequest
         */
        public BatchDetectLanguageTextClassificationRequest buildWithoutInvocationCallback() {
            BatchDetectLanguageTextClassificationRequest request =
                    new BatchDetectLanguageTextClassificationRequest();
            request.batchDetectLanguageTextClassificationDetails =
                    batchDetectLanguageTextClassificationDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // BatchDetectLanguageTextClassificationRequest(batchDetectLanguageTextClassificationDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchDetectLanguageTextClassificationDetails(
                        batchDetectLanguageTextClassificationDetails)
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
        sb.append(",batchDetectLanguageTextClassificationDetails=")
                .append(String.valueOf(this.batchDetectLanguageTextClassificationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectLanguageTextClassificationRequest)) {
            return false;
        }

        BatchDetectLanguageTextClassificationRequest other =
                (BatchDetectLanguageTextClassificationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.batchDetectLanguageTextClassificationDetails,
                        other.batchDetectLanguageTextClassificationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchDetectLanguageTextClassificationDetails == null
                                ? 43
                                : this.batchDetectLanguageTextClassificationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
