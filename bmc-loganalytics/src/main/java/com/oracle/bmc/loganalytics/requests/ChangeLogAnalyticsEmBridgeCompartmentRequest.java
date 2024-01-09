/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeLogAnalyticsEmBridgeCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeLogAnalyticsEmBridgeCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ChangeLogAnalyticsEmBridgeCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The log analytics enterprise manager bridge OCID. */
    private String logAnalyticsEmBridgeId;

    /** The log analytics enterprise manager bridge OCID. */
    public String getLogAnalyticsEmBridgeId() {
        return logAnalyticsEmBridgeId;
    }
    /** Log analytics enterprise manager bridge compartment Id to be updated. */
    private com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
            changeLogAnalyticsEmBridgeCompartmentDetails;

    /** Log analytics enterprise manager bridge compartment Id to be updated. */
    public com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
            getChangeLogAnalyticsEmBridgeCompartmentDetails() {
        return changeLogAnalyticsEmBridgeCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
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
    public com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
            getBody$() {
        return changeLogAnalyticsEmBridgeCompartmentDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogAnalyticsEmBridgeCompartmentRequest,
                    com.oracle.bmc.loganalytics.model
                            .ChangeLogAnalyticsEmBridgeCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** The log analytics enterprise manager bridge OCID. */
        private String logAnalyticsEmBridgeId = null;

        /**
         * The log analytics enterprise manager bridge OCID.
         *
         * @param logAnalyticsEmBridgeId the value to set
         * @return this builder instance
         */
        public Builder logAnalyticsEmBridgeId(String logAnalyticsEmBridgeId) {
            this.logAnalyticsEmBridgeId = logAnalyticsEmBridgeId;
            return this;
        }

        /** Log analytics enterprise manager bridge compartment Id to be updated. */
        private com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
                changeLogAnalyticsEmBridgeCompartmentDetails = null;

        /**
         * Log analytics enterprise manager bridge compartment Id to be updated.
         *
         * @param changeLogAnalyticsEmBridgeCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeLogAnalyticsEmBridgeCompartmentDetails(
                com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
                        changeLogAnalyticsEmBridgeCompartmentDetails) {
            this.changeLogAnalyticsEmBridgeCompartmentDetails =
                    changeLogAnalyticsEmBridgeCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
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
        public Builder copy(ChangeLogAnalyticsEmBridgeCompartmentRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsEmBridgeId(o.getLogAnalyticsEmBridgeId());
            changeLogAnalyticsEmBridgeCompartmentDetails(
                    o.getChangeLogAnalyticsEmBridgeCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogAnalyticsEmBridgeCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogAnalyticsEmBridgeCompartmentRequest
         */
        public ChangeLogAnalyticsEmBridgeCompartmentRequest build() {
            ChangeLogAnalyticsEmBridgeCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.loganalytics.model.ChangeLogAnalyticsEmBridgeCompartmentDetails
                        body) {
            changeLogAnalyticsEmBridgeCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLogAnalyticsEmBridgeCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLogAnalyticsEmBridgeCompartmentRequest
         */
        public ChangeLogAnalyticsEmBridgeCompartmentRequest buildWithoutInvocationCallback() {
            ChangeLogAnalyticsEmBridgeCompartmentRequest request =
                    new ChangeLogAnalyticsEmBridgeCompartmentRequest();
            request.namespaceName = namespaceName;
            request.logAnalyticsEmBridgeId = logAnalyticsEmBridgeId;
            request.changeLogAnalyticsEmBridgeCompartmentDetails =
                    changeLogAnalyticsEmBridgeCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeLogAnalyticsEmBridgeCompartmentRequest(namespaceName,
            // logAnalyticsEmBridgeId, changeLogAnalyticsEmBridgeCompartmentDetails, ifMatch,
            // opcRequestId, opcRetryToken);
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
                .logAnalyticsEmBridgeId(logAnalyticsEmBridgeId)
                .changeLogAnalyticsEmBridgeCompartmentDetails(
                        changeLogAnalyticsEmBridgeCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",logAnalyticsEmBridgeId=").append(String.valueOf(this.logAnalyticsEmBridgeId));
        sb.append(",changeLogAnalyticsEmBridgeCompartmentDetails=")
                .append(String.valueOf(this.changeLogAnalyticsEmBridgeCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof ChangeLogAnalyticsEmBridgeCompartmentRequest)) {
            return false;
        }

        ChangeLogAnalyticsEmBridgeCompartmentRequest other =
                (ChangeLogAnalyticsEmBridgeCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.logAnalyticsEmBridgeId, other.logAnalyticsEmBridgeId)
                && java.util.Objects.equals(
                        this.changeLogAnalyticsEmBridgeCompartmentDetails,
                        other.changeLogAnalyticsEmBridgeCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.logAnalyticsEmBridgeId == null
                                ? 43
                                : this.logAnalyticsEmBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLogAnalyticsEmBridgeCompartmentDetails == null
                                ? 43
                                : this.changeLogAnalyticsEmBridgeCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
