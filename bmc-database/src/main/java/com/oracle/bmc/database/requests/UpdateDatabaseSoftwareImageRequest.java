/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDatabaseSoftwareImageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDatabaseSoftwareImageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDatabaseSoftwareImageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails> {

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String databaseSoftwareImageId;

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }
    /**
     * Request to update the properties of a DB system.
     */
    private com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails
            updateDatabaseSoftwareImageDetails;

    /**
     * Request to update the properties of a DB system.
     */
    public com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails
            getUpdateDatabaseSoftwareImageDetails() {
        return updateDatabaseSoftwareImageDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails getBody$() {
        return updateDatabaseSoftwareImageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDatabaseSoftwareImageRequest,
                    com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String databaseSoftwareImageId = null;

        /**
         * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param databaseSoftwareImageId the value to set
         * @return this builder instance
         */
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            return this;
        }

        /**
         * Request to update the properties of a DB system.
         */
        private com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails
                updateDatabaseSoftwareImageDetails = null;

        /**
         * Request to update the properties of a DB system.
         * @param updateDatabaseSoftwareImageDetails the value to set
         * @return this builder instance
         */
        public Builder updateDatabaseSoftwareImageDetails(
                com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails
                        updateDatabaseSoftwareImageDetails) {
            this.updateDatabaseSoftwareImageDetails = updateDatabaseSoftwareImageDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateDatabaseSoftwareImageRequest o) {
            databaseSoftwareImageId(o.getDatabaseSoftwareImageId());
            updateDatabaseSoftwareImageDetails(o.getUpdateDatabaseSoftwareImageDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseSoftwareImageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDatabaseSoftwareImageRequest
         */
        public UpdateDatabaseSoftwareImageRequest build() {
            UpdateDatabaseSoftwareImageRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateDatabaseSoftwareImageDetails body) {
            updateDatabaseSoftwareImageDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseSoftwareImageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDatabaseSoftwareImageRequest
         */
        public UpdateDatabaseSoftwareImageRequest buildWithoutInvocationCallback() {
            UpdateDatabaseSoftwareImageRequest request = new UpdateDatabaseSoftwareImageRequest();
            request.databaseSoftwareImageId = databaseSoftwareImageId;
            request.updateDatabaseSoftwareImageDetails = updateDatabaseSoftwareImageDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDatabaseSoftwareImageRequest(databaseSoftwareImageId, updateDatabaseSoftwareImageDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseSoftwareImageId(databaseSoftwareImageId)
                .updateDatabaseSoftwareImageDetails(updateDatabaseSoftwareImageDetails)
                .ifMatch(ifMatch);
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
        sb.append(",databaseSoftwareImageId=").append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(",updateDatabaseSoftwareImageDetails=")
                .append(String.valueOf(this.updateDatabaseSoftwareImageDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseSoftwareImageRequest)) {
            return false;
        }

        UpdateDatabaseSoftwareImageRequest other = (UpdateDatabaseSoftwareImageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(
                        this.updateDatabaseSoftwareImageDetails,
                        other.updateDatabaseSoftwareImageDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDatabaseSoftwareImageDetails == null
                                ? 43
                                : this.updateDatabaseSoftwareImageDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
