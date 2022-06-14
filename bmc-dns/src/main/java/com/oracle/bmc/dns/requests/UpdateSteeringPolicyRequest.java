/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateSteeringPolicyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSteeringPolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateSteeringPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails> {

    /**
     * The OCID of the target steering policy.
     */
    private String steeringPolicyId;

    /**
     * The OCID of the target steering policy.
     */
    public String getSteeringPolicyId() {
        return steeringPolicyId;
    }
    /**
     * New data for the steering policy.
     */
    private com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails updateSteeringPolicyDetails;

    /**
     * New data for the steering policy.
     */
    public com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails getUpdateSteeringPolicyDetails() {
        return updateSteeringPolicyDetails;
    }
    /**
     * The {@code If-Match} header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is {@code *}, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    private String ifMatch;

    /**
     * The {@code If-Match} header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is {@code *}, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The {@code If-Unmodified-Since} header field makes the request method
     * conditional on the selected representation's last modification date being
     * earlier than or equal to the date provided in the field-value.  This
     * field accomplishes the same purpose as If-Match for cases where the user
     * agent does not have an entity-tag for the representation.
     *
     */
    private String ifUnmodifiedSince;

    /**
     * The {@code If-Unmodified-Since} header field makes the request method
     * conditional on the selected representation's last modification date being
     * earlier than or equal to the date provided in the field-value.  This
     * field accomplishes the same purpose as If-Match for cases where the user
     * agent does not have an entity-tag for the representation.
     *
     */
    public String getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails getBody$() {
        return updateSteeringPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSteeringPolicyRequest,
                    com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the target steering policy.
         */
        private String steeringPolicyId = null;

        /**
         * The OCID of the target steering policy.
         * @param steeringPolicyId the value to set
         * @return this builder instance
         */
        public Builder steeringPolicyId(String steeringPolicyId) {
            this.steeringPolicyId = steeringPolicyId;
            return this;
        }

        /**
         * New data for the steering policy.
         */
        private com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails updateSteeringPolicyDetails =
                null;

        /**
         * New data for the steering policy.
         * @param updateSteeringPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateSteeringPolicyDetails(
                com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails updateSteeringPolicyDetails) {
            this.updateSteeringPolicyDetails = updateSteeringPolicyDetails;
            return this;
        }

        /**
         * The {@code If-Match} header field makes the request method conditional on the
         * existence of at least one current representation of the target resource,
         * when the field-value is {@code *}, or having a current representation of the
         * target resource that has an entity-tag matching a member of the list of
         * entity-tags provided in the field-value.
         *
         */
        private String ifMatch = null;

        /**
         * The {@code If-Match} header field makes the request method conditional on the
         * existence of at least one current representation of the target resource,
         * when the field-value is {@code *}, or having a current representation of the
         * target resource that has an entity-tag matching a member of the list of
         * entity-tags provided in the field-value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The {@code If-Unmodified-Since} header field makes the request method
         * conditional on the selected representation's last modification date being
         * earlier than or equal to the date provided in the field-value.  This
         * field accomplishes the same purpose as If-Match for cases where the user
         * agent does not have an entity-tag for the representation.
         *
         */
        private String ifUnmodifiedSince = null;

        /**
         * The {@code If-Unmodified-Since} header field makes the request method
         * conditional on the selected representation's last modification date being
         * earlier than or equal to the date provided in the field-value.  This
         * field accomplishes the same purpose as If-Match for cases where the user
         * agent does not have an entity-tag for the representation.
         *
         * @param ifUnmodifiedSince the value to set
         * @return this builder instance
         */
        public Builder ifUnmodifiedSince(String ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
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
        public Builder copy(UpdateSteeringPolicyRequest o) {
            steeringPolicyId(o.getSteeringPolicyId());
            updateSteeringPolicyDetails(o.getUpdateSteeringPolicyDetails());
            ifMatch(o.getIfMatch());
            ifUnmodifiedSince(o.getIfUnmodifiedSince());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSteeringPolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSteeringPolicyRequest
         */
        public UpdateSteeringPolicyRequest build() {
            UpdateSteeringPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.UpdateSteeringPolicyDetails body) {
            updateSteeringPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSteeringPolicyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSteeringPolicyRequest
         */
        public UpdateSteeringPolicyRequest buildWithoutInvocationCallback() {
            UpdateSteeringPolicyRequest request = new UpdateSteeringPolicyRequest();
            request.steeringPolicyId = steeringPolicyId;
            request.updateSteeringPolicyDetails = updateSteeringPolicyDetails;
            request.ifMatch = ifMatch;
            request.ifUnmodifiedSince = ifUnmodifiedSince;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new UpdateSteeringPolicyRequest(steeringPolicyId, updateSteeringPolicyDetails, ifMatch, ifUnmodifiedSince, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .steeringPolicyId(steeringPolicyId)
                .updateSteeringPolicyDetails(updateSteeringPolicyDetails)
                .ifMatch(ifMatch)
                .ifUnmodifiedSince(ifUnmodifiedSince)
                .opcRequestId(opcRequestId)
                .scope(scope);
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
        sb.append(",steeringPolicyId=").append(String.valueOf(this.steeringPolicyId));
        sb.append(",updateSteeringPolicyDetails=")
                .append(String.valueOf(this.updateSteeringPolicyDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifUnmodifiedSince=").append(String.valueOf(this.ifUnmodifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSteeringPolicyRequest)) {
            return false;
        }

        UpdateSteeringPolicyRequest other = (UpdateSteeringPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.steeringPolicyId, other.steeringPolicyId)
                && java.util.Objects.equals(
                        this.updateSteeringPolicyDetails, other.updateSteeringPolicyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifUnmodifiedSince, other.ifUnmodifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.steeringPolicyId == null ? 43 : this.steeringPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSteeringPolicyDetails == null
                                ? 43
                                : this.updateSteeringPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifUnmodifiedSince == null ? 43 : this.ifUnmodifiedSince.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
