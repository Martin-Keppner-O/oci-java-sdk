/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the configuration for updating a certificate based on the keys from an imported certificate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCertificateByImportingConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateCertificateByImportingConfigDetails
        extends UpdateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        private Stage stage;

        public Builder stage(Stage stage) {
            this.stage = stage;
            this.__explicitlySet__.add("stage");
            return this;
        }
        /**
         * The certificate chain (in PEM format) for the imported certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
        private String certChainPem;

        /**
         * The certificate chain (in PEM format) for the imported certificate.
         * @param certChainPem the value to set
         * @return this builder
         **/
        public Builder certChainPem(String certChainPem) {
            this.certChainPem = certChainPem;
            this.__explicitlySet__.add("certChainPem");
            return this;
        }
        /**
         * The private key (in PEM format) for the imported certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
        private String privateKeyPem;

        /**
         * The private key (in PEM format) for the imported certificate.
         * @param privateKeyPem the value to set
         * @return this builder
         **/
        public Builder privateKeyPem(String privateKeyPem) {
            this.privateKeyPem = privateKeyPem;
            this.__explicitlySet__.add("privateKeyPem");
            return this;
        }
        /**
         * The certificate (in PEM format) for the imported certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        /**
         * The certificate (in PEM format) for the imported certificate.
         * @param certificatePem the value to set
         * @return this builder
         **/
        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }
        /**
         * An optional passphrase for the private key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
        private String privateKeyPemPassphrase;

        /**
         * An optional passphrase for the private key.
         * @param privateKeyPemPassphrase the value to set
         * @return this builder
         **/
        public Builder privateKeyPemPassphrase(String privateKeyPemPassphrase) {
            this.privateKeyPemPassphrase = privateKeyPemPassphrase;
            this.__explicitlySet__.add("privateKeyPemPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateByImportingConfigDetails build() {
            UpdateCertificateByImportingConfigDetails __instance__ =
                    new UpdateCertificateByImportingConfigDetails(
                            versionName,
                            stage,
                            certChainPem,
                            privateKeyPem,
                            certificatePem,
                            privateKeyPemPassphrase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCertificateByImportingConfigDetails o) {
            Builder copiedBuilder =
                    versionName(o.getVersionName())
                            .stage(o.getStage())
                            .certChainPem(o.getCertChainPem())
                            .privateKeyPem(o.getPrivateKeyPem())
                            .certificatePem(o.getCertificatePem())
                            .privateKeyPemPassphrase(o.getPrivateKeyPemPassphrase());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdateCertificateByImportingConfigDetails(
            String versionName,
            Stage stage,
            String certChainPem,
            String privateKeyPem,
            String certificatePem,
            String privateKeyPemPassphrase) {
        super(versionName, stage);
        this.certChainPem = certChainPem;
        this.privateKeyPem = privateKeyPem;
        this.certificatePem = certificatePem;
        this.privateKeyPemPassphrase = privateKeyPemPassphrase;
    }

    /**
     * The certificate chain (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    private final String certChainPem;

    /**
     * The certificate chain (in PEM format) for the imported certificate.
     * @return the value
     **/
    public String getCertChainPem() {
        return certChainPem;
    }

    /**
     * The private key (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
    private final String privateKeyPem;

    /**
     * The private key (in PEM format) for the imported certificate.
     * @return the value
     **/
    public String getPrivateKeyPem() {
        return privateKeyPem;
    }

    /**
     * The certificate (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * The certificate (in PEM format) for the imported certificate.
     * @return the value
     **/
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * An optional passphrase for the private key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
    private final String privateKeyPemPassphrase;

    /**
     * An optional passphrase for the private key.
     * @return the value
     **/
    public String getPrivateKeyPemPassphrase() {
        return privateKeyPemPassphrase;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateCertificateByImportingConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", certChainPem=").append(String.valueOf(this.certChainPem));
        sb.append(", privateKeyPem=").append(String.valueOf(this.privateKeyPem));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(", privateKeyPemPassphrase=")
                .append(String.valueOf(this.privateKeyPemPassphrase));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCertificateByImportingConfigDetails)) {
            return false;
        }

        UpdateCertificateByImportingConfigDetails other =
                (UpdateCertificateByImportingConfigDetails) o;
        return java.util.Objects.equals(this.certChainPem, other.certChainPem)
                && java.util.Objects.equals(this.privateKeyPem, other.privateKeyPem)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && java.util.Objects.equals(
                        this.privateKeyPemPassphrase, other.privateKeyPemPassphrase)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.certChainPem == null ? 43 : this.certChainPem.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPem == null ? 43 : this.privateKeyPem.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPemPassphrase == null
                                ? 43
                                : this.privateKeyPemPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
