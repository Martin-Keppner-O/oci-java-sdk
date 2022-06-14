/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/StopDbSystemExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use StopDbSystemRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class StopDbSystemRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.mysql.model.StopDbSystemDetails> {

    /**
     * The DB System [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String dbSystemId;

    /**
     * The DB System [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * Optional parameters for the stop action.
     */
    private com.oracle.bmc.mysql.model.StopDbSystemDetails stopDbSystemDetails;

    /**
     * Optional parameters for the stop action.
     */
    public com.oracle.bmc.mysql.model.StopDbSystemDetails getStopDbSystemDetails() {
        return stopDbSystemDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code If-Match} header to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code If-Match} header to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.mysql.model.StopDbSystemDetails getBody$() {
        return stopDbSystemDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    StopDbSystemRequest, com.oracle.bmc.mysql.model.StopDbSystemDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB System [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String dbSystemId = null;

        /**
         * The DB System [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * Optional parameters for the stop action.
         */
        private com.oracle.bmc.mysql.model.StopDbSystemDetails stopDbSystemDetails = null;

        /**
         * Optional parameters for the stop action.
         * @param stopDbSystemDetails the value to set
         * @return this builder instance
         */
        public Builder stopDbSystemDetails(
                com.oracle.bmc.mysql.model.StopDbSystemDetails stopDbSystemDetails) {
            this.stopDbSystemDetails = stopDbSystemDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code If-Match} header to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code If-Match} header to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(StopDbSystemRequest o) {
            dbSystemId(o.getDbSystemId());
            stopDbSystemDetails(o.getStopDbSystemDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of StopDbSystemRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of StopDbSystemRequest
         */
        public StopDbSystemRequest build() {
            StopDbSystemRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.mysql.model.StopDbSystemDetails body) {
            stopDbSystemDetails(body);
            return this;
        }

        /**
         * Build the instance of StopDbSystemRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of StopDbSystemRequest
         */
        public StopDbSystemRequest buildWithoutInvocationCallback() {
            StopDbSystemRequest request = new StopDbSystemRequest();
            request.dbSystemId = dbSystemId;
            request.stopDbSystemDetails = stopDbSystemDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new StopDbSystemRequest(dbSystemId, stopDbSystemDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .stopDbSystemDetails(stopDbSystemDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",stopDbSystemDetails=").append(String.valueOf(this.stopDbSystemDetails));
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
        if (!(o instanceof StopDbSystemRequest)) {
            return false;
        }

        StopDbSystemRequest other = (StopDbSystemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.stopDbSystemDetails, other.stopDbSystemDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.stopDbSystemDetails == null
                                ? 43
                                : this.stopDbSystemDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
