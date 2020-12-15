/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.responses;

import com.oracle.bmc.rover.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetRoverEntitlementResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned RoverEntitlement instance.
     */
    private RoverEntitlement roverEntitlement;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRoverEntitlementResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            roverEntitlement(o.getRoverEntitlement());

            return this;
        }
    }
}
