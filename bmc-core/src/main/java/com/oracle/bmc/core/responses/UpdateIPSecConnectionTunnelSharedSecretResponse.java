/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIPSecConnectionTunnelSharedSecretResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned IPSecConnectionTunnelSharedSecret instance.
     */
    private com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret
            iPSecConnectionTunnelSharedSecret;

    /**
     * The returned IPSecConnectionTunnelSharedSecret instance.
     * @return the value
     */
    public com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret
            getIPSecConnectionTunnelSharedSecret() {
        return iPSecConnectionTunnelSharedSecret;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "iPSecConnectionTunnelSharedSecret"
    })
    private UpdateIPSecConnectionTunnelSharedSecretResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret
                    iPSecConnectionTunnelSharedSecret) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.iPSecConnectionTunnelSharedSecret = iPSecConnectionTunnelSharedSecret;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned IPSecConnectionTunnelSharedSecret instance.
         */
        private com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret
                iPSecConnectionTunnelSharedSecret;

        /**
         * The returned IPSecConnectionTunnelSharedSecret instance.
         * @param iPSecConnectionTunnelSharedSecret the value to set
         * @return this builder
         */
        public Builder iPSecConnectionTunnelSharedSecret(
                com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret
                        iPSecConnectionTunnelSharedSecret) {
            this.iPSecConnectionTunnelSharedSecret = iPSecConnectionTunnelSharedSecret;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateIPSecConnectionTunnelSharedSecretResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            iPSecConnectionTunnelSharedSecret(o.getIPSecConnectionTunnelSharedSecret());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateIPSecConnectionTunnelSharedSecretResponse build() {
            return new UpdateIPSecConnectionTunnelSharedSecretResponse(
                    __httpStatusCode__, etag, opcRequestId, iPSecConnectionTunnelSharedSecret);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",iPSecConnectionTunnelSharedSecret=")
                .append(String.valueOf(iPSecConnectionTunnelSharedSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecConnectionTunnelSharedSecretResponse)) {
            return false;
        }

        UpdateIPSecConnectionTunnelSharedSecretResponse other =
                (UpdateIPSecConnectionTunnelSharedSecretResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.iPSecConnectionTunnelSharedSecret,
                        other.iPSecConnectionTunnelSharedSecret);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.iPSecConnectionTunnelSharedSecret == null
                                ? 43
                                : this.iPSecConnectionTunnelSharedSecret.hashCode());
        return result;
    }
}
