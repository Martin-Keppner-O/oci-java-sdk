/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/ChangeDatabaseRegistrationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeDatabaseRegistrationCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ChangeDatabaseRegistrationCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails> {

    /**
     * A unique DatabaseRegistration identifier.
     *
     */
    private String databaseRegistrationId;

    /**
     * A unique DatabaseRegistration identifier.
     *
     */
    public String getDatabaseRegistrationId() {
        return databaseRegistrationId;
    }
    /**
     * Properties to change the compartment of a DatabaseRegistration.
     *
     */
    private com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails
            changeDatabaseRegistrationCompartmentDetails;

    /**
     * Properties to change the compartment of a DatabaseRegistration.
     *
     */
    public com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails
            getChangeDatabaseRegistrationCompartmentDetails() {
        return changeDatabaseRegistrationCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.  The resource is updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.  The resource is updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error, without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request is rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error, without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request is rejected.
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
    public com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails getBody$() {
        return changeDatabaseRegistrationCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDatabaseRegistrationCompartmentRequest,
                    com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A unique DatabaseRegistration identifier.
         *
         */
        private String databaseRegistrationId = null;

        /**
         * A unique DatabaseRegistration identifier.
         *
         * @param databaseRegistrationId the value to set
         * @return this builder instance
         */
        public Builder databaseRegistrationId(String databaseRegistrationId) {
            this.databaseRegistrationId = databaseRegistrationId;
            return this;
        }

        /**
         * Properties to change the compartment of a DatabaseRegistration.
         *
         */
        private com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails
                changeDatabaseRegistrationCompartmentDetails = null;

        /**
         * Properties to change the compartment of a DatabaseRegistration.
         *
         * @param changeDatabaseRegistrationCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDatabaseRegistrationCompartmentDetails(
                com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails
                        changeDatabaseRegistrationCompartmentDetails) {
            this.changeDatabaseRegistrationCompartmentDetails =
                    changeDatabaseRegistrationCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.  The resource is updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.  The resource is updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
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
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error, without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request is rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error, without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request is rejected.
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
        public Builder copy(ChangeDatabaseRegistrationCompartmentRequest o) {
            databaseRegistrationId(o.getDatabaseRegistrationId());
            changeDatabaseRegistrationCompartmentDetails(
                    o.getChangeDatabaseRegistrationCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseRegistrationCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeDatabaseRegistrationCompartmentRequest
         */
        public ChangeDatabaseRegistrationCompartmentRequest build() {
            ChangeDatabaseRegistrationCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.goldengate.model.ChangeDatabaseRegistrationCompartmentDetails body) {
            changeDatabaseRegistrationCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseRegistrationCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDatabaseRegistrationCompartmentRequest
         */
        public ChangeDatabaseRegistrationCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDatabaseRegistrationCompartmentRequest request =
                    new ChangeDatabaseRegistrationCompartmentRequest();
            request.databaseRegistrationId = databaseRegistrationId;
            request.changeDatabaseRegistrationCompartmentDetails =
                    changeDatabaseRegistrationCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeDatabaseRegistrationCompartmentRequest(databaseRegistrationId, changeDatabaseRegistrationCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseRegistrationId(databaseRegistrationId)
                .changeDatabaseRegistrationCompartmentDetails(
                        changeDatabaseRegistrationCompartmentDetails)
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
        sb.append(",databaseRegistrationId=").append(String.valueOf(this.databaseRegistrationId));
        sb.append(",changeDatabaseRegistrationCompartmentDetails=")
                .append(String.valueOf(this.changeDatabaseRegistrationCompartmentDetails));
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
        if (!(o instanceof ChangeDatabaseRegistrationCompartmentRequest)) {
            return false;
        }

        ChangeDatabaseRegistrationCompartmentRequest other =
                (ChangeDatabaseRegistrationCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseRegistrationId, other.databaseRegistrationId)
                && java.util.Objects.equals(
                        this.changeDatabaseRegistrationCompartmentDetails,
                        other.changeDatabaseRegistrationCompartmentDetails)
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
                        + (this.databaseRegistrationId == null
                                ? 43
                                : this.databaseRegistrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDatabaseRegistrationCompartmentDetails == null
                                ? 43
                                : this.changeDatabaseRegistrationCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
