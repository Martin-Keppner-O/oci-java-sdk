/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLogAnalyticsEntityTopologyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned LogAnalyticsEntityTopologyCollection instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
            logAnalyticsEntityTopologyCollection;

    /**
     * The returned LogAnalyticsEntityTopologyCollection instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
            getLogAnalyticsEntityTopologyCollection() {
        return logAnalyticsEntityTopologyCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "logAnalyticsEntityTopologyCollection"
    })
    private ListLogAnalyticsEntityTopologyResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
                    logAnalyticsEntityTopologyCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.logAnalyticsEntityTopologyCollection = logAnalyticsEntityTopologyCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
         * subsequent request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
         * subsequent request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned LogAnalyticsEntityTopologyCollection instance.
         */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
                logAnalyticsEntityTopologyCollection;

        /**
         * The returned LogAnalyticsEntityTopologyCollection instance.
         * @param logAnalyticsEntityTopologyCollection the value to set
         * @return this builder
         */
        public Builder logAnalyticsEntityTopologyCollection(
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
                        logAnalyticsEntityTopologyCollection) {
            this.logAnalyticsEntityTopologyCollection = logAnalyticsEntityTopologyCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLogAnalyticsEntityTopologyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            logAnalyticsEntityTopologyCollection(o.getLogAnalyticsEntityTopologyCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListLogAnalyticsEntityTopologyResponse build() {
            return new ListLogAnalyticsEntityTopologyResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    logAnalyticsEntityTopologyCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",logAnalyticsEntityTopologyCollection=")
                .append(String.valueOf(logAnalyticsEntityTopologyCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogAnalyticsEntityTopologyResponse)) {
            return false;
        }

        ListLogAnalyticsEntityTopologyResponse other = (ListLogAnalyticsEntityTopologyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.logAnalyticsEntityTopologyCollection,
                        other.logAnalyticsEntityTopologyCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsEntityTopologyCollection == null
                                ? 43
                                : this.logAnalyticsEntityTopologyCollection.hashCode());
        return result;
    }
}
