/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/RestoreVaultFromFileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RestoreVaultFromFileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class RestoreVaultFromFileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The content length of the body.
     */
    public Long getContentLength() {
        return contentLength;
    }
    /**
     * The encrypted backup file to upload to restore the vault.
     */
    private java.io.InputStream restoreVaultFromFileDetails;

    /**
     * The encrypted backup file to upload to restore the vault.
     */
    public java.io.InputStream getRestoreVaultFromFileDetails() {
        return restoreVaultFromFileDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The base64-encoded MD5 hash value of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
     * If the Content-MD5 header is present, Key Management performs an integrity check on the body of the HTTP request by computing the MD5
     * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes don't match, the object is rejected and
     * a response with 400 Unmatched Content MD5 error is returned, along with the message: "The computed MD5 of the request body (ACTUAL_MD5)
     * does not match the Content-MD5 header (HEADER_MD5)."
     *
     */
    private String contentMd5;

    /**
     * The base64-encoded MD5 hash value of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
     * If the Content-MD5 header is present, Key Management performs an integrity check on the body of the HTTP request by computing the MD5
     * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes don't match, the object is rejected and
     * a response with 400 Unmatched Content MD5 error is returned, along with the message: "The computed MD5 of the request body (ACTUAL_MD5)
     * does not match the Content-MD5 header (HEADER_MD5)."
     *
     */
    public String getContentMd5() {
        return contentMd5;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
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
    public java.io.InputStream getBody$() {
        return restoreVaultFromFileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RestoreVaultFromFileRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The content length of the body.
         */
        private Long contentLength = null;

        /**
         * The content length of the body.
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * The encrypted backup file to upload to restore the vault.
         */
        private java.io.InputStream restoreVaultFromFileDetails = null;

        /**
         * The encrypted backup file to upload to restore the vault.
         * @param restoreVaultFromFileDetails the value to set
         * @return this builder instance
         */
        public Builder restoreVaultFromFileDetails(
                java.io.InputStream restoreVaultFromFileDetails) {
            this.restoreVaultFromFileDetails = restoreVaultFromFileDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
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
         * The base64-encoded MD5 hash value of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
         * If the Content-MD5 header is present, Key Management performs an integrity check on the body of the HTTP request by computing the MD5
         * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes don't match, the object is rejected and
         * a response with 400 Unmatched Content MD5 error is returned, along with the message: "The computed MD5 of the request body (ACTUAL_MD5)
         * does not match the Content-MD5 header (HEADER_MD5)."
         *
         */
        private String contentMd5 = null;

        /**
         * The base64-encoded MD5 hash value of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
         * If the Content-MD5 header is present, Key Management performs an integrity check on the body of the HTTP request by computing the MD5
         * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes don't match, the object is rejected and
         * a response with 400 Unmatched Content MD5 error is returned, along with the message: "The computed MD5 of the request body (ACTUAL_MD5)
         * does not match the Content-MD5 header (HEADER_MD5)."
         *
         * @param contentMd5 the value to set
         * @return this builder instance
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
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
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
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
        public Builder copy(RestoreVaultFromFileRequest o) {
            compartmentId(o.getCompartmentId());
            contentLength(o.getContentLength());
            restoreVaultFromFileDetails(o.getRestoreVaultFromFileDetails());
            ifMatch(o.getIfMatch());
            contentMd5(o.getContentMd5());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RestoreVaultFromFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RestoreVaultFromFileRequest
         */
        public RestoreVaultFromFileRequest build() {
            RestoreVaultFromFileRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            restoreVaultFromFileDetails(body);
            return this;
        }

        /**
         * Build the instance of RestoreVaultFromFileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RestoreVaultFromFileRequest
         */
        public RestoreVaultFromFileRequest buildWithoutInvocationCallback() {
            RestoreVaultFromFileRequest request = new RestoreVaultFromFileRequest();
            request.compartmentId = compartmentId;
            request.contentLength = contentLength;
            request.restoreVaultFromFileDetails = restoreVaultFromFileDetails;
            request.ifMatch = ifMatch;
            request.contentMd5 = contentMd5;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RestoreVaultFromFileRequest(compartmentId, contentLength, restoreVaultFromFileDetails, ifMatch, contentMd5, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .contentLength(contentLength)
                .restoreVaultFromFileDetails(restoreVaultFromFileDetails)
                .ifMatch(ifMatch)
                .contentMd5(contentMd5)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",restoreVaultFromFileDetails=")
                .append(String.valueOf(this.restoreVaultFromFileDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",contentMd5=").append(String.valueOf(this.contentMd5));
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
        if (!(o instanceof RestoreVaultFromFileRequest)) {
            return false;
        }

        RestoreVaultFromFileRequest other = (RestoreVaultFromFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(
                        this.restoreVaultFromFileDetails, other.restoreVaultFromFileDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.restoreVaultFromFileDetails == null
                                ? 43
                                : this.restoreVaultFromFileDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
