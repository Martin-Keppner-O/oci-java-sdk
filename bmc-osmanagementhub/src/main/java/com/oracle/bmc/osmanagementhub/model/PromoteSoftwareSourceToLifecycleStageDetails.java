/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * A versioned custom software source OCID (softwareSourceId) is required when promoting software
 * source content to lifecycle stage rank one. Software source content must be promoted to lifecycle
 * stage rank one before being eligible for promotion to subsequent lifecycle stages, else an error
 * is returned. Software source content is expected to be promoted in order starting with lifecycle
 * stage rank one, followed by rank two, then rank three and so on.
 *
 * <p>When promoting software source content to lifecycle stage rank two, three, four or five,
 * softwareSourceId is optional. If a softwareSourceId is provided for a lifecycle stage between two
 * and five, the system validates that the softwareSourceId is already promoted to the previous
 * lifecycle stage. If the softwareSourceId from the previous lifecycle stage does not match the
 * provided softwareSourceId an error returns. If a softwareSourceId is not provided for a lifecycle
 * stage between two and five, the system promotes the softwareSourceId from the previous lifecycle
 * stage. If the previous lifecycle stage has no SourceSource content an error returns. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PromoteSoftwareSourceToLifecycleStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PromoteSoftwareSourceToLifecycleStageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workRequestDetails"})
    public PromoteSoftwareSourceToLifecycleStageDetails(WorkRequestDetails workRequestDetails) {
        super();
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
        private WorkRequestDetails workRequestDetails;

        public Builder workRequestDetails(WorkRequestDetails workRequestDetails) {
            this.workRequestDetails = workRequestDetails;
            this.__explicitlySet__.add("workRequestDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PromoteSoftwareSourceToLifecycleStageDetails build() {
            PromoteSoftwareSourceToLifecycleStageDetails model =
                    new PromoteSoftwareSourceToLifecycleStageDetails(this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromoteSoftwareSourceToLifecycleStageDetails model) {
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
    private final WorkRequestDetails workRequestDetails;

    public WorkRequestDetails getWorkRequestDetails() {
        return workRequestDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PromoteSoftwareSourceToLifecycleStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromoteSoftwareSourceToLifecycleStageDetails)) {
            return false;
        }

        PromoteSoftwareSourceToLifecycleStageDetails other =
                (PromoteSoftwareSourceToLifecycleStageDetails) o;
        return java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
