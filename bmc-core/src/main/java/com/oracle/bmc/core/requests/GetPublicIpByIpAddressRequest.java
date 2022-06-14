/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpByIpAddressExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetPublicIpByIpAddressRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPublicIpByIpAddressRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails> {

    /**
     * IP address details for fetching the public IP.
     */
    private com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails getPublicIpByIpAddressDetails;

    /**
     * IP address details for fetching the public IP.
     */
    public com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails
            getGetPublicIpByIpAddressDetails() {
        return getPublicIpByIpAddressDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails getBody$() {
        return getPublicIpByIpAddressDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPublicIpByIpAddressRequest,
                    com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * IP address details for fetching the public IP.
         */
        private com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails
                getPublicIpByIpAddressDetails = null;

        /**
         * IP address details for fetching the public IP.
         * @param getPublicIpByIpAddressDetails the value to set
         * @return this builder instance
         */
        public Builder getPublicIpByIpAddressDetails(
                com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails
                        getPublicIpByIpAddressDetails) {
            this.getPublicIpByIpAddressDetails = getPublicIpByIpAddressDetails;
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
        public Builder copy(GetPublicIpByIpAddressRequest o) {
            getPublicIpByIpAddressDetails(o.getGetPublicIpByIpAddressDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPublicIpByIpAddressRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetPublicIpByIpAddressRequest
         */
        public GetPublicIpByIpAddressRequest build() {
            GetPublicIpByIpAddressRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.GetPublicIpByIpAddressDetails body) {
            getPublicIpByIpAddressDetails(body);
            return this;
        }

        /**
         * Build the instance of GetPublicIpByIpAddressRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPublicIpByIpAddressRequest
         */
        public GetPublicIpByIpAddressRequest buildWithoutInvocationCallback() {
            GetPublicIpByIpAddressRequest request = new GetPublicIpByIpAddressRequest();
            request.getPublicIpByIpAddressDetails = getPublicIpByIpAddressDetails;
            return request;
            // new GetPublicIpByIpAddressRequest(getPublicIpByIpAddressDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().getPublicIpByIpAddressDetails(getPublicIpByIpAddressDetails);
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
        sb.append(",getPublicIpByIpAddressDetails=")
                .append(String.valueOf(this.getPublicIpByIpAddressDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPublicIpByIpAddressRequest)) {
            return false;
        }

        GetPublicIpByIpAddressRequest other = (GetPublicIpByIpAddressRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.getPublicIpByIpAddressDetails, other.getPublicIpByIpAddressDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.getPublicIpByIpAddressDetails == null
                                ? 43
                                : this.getPublicIpByIpAddressDetails.hashCode());
        return result;
    }
}
