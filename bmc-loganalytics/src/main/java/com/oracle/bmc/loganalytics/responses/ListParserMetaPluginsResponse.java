/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListParserMetaPluginsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the previous batch of items.
     *
     */
    private String opcPrevPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the previous batch of items.
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
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
     * The returned LogAnalyticsParserMetaPluginCollection instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
            logAnalyticsParserMetaPluginCollection;

    /**
     * The returned LogAnalyticsParserMetaPluginCollection instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
            getLogAnalyticsParserMetaPluginCollection() {
        return logAnalyticsParserMetaPluginCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcPrevPage",
        "opcNextPage",
        "opcRequestId",
        "logAnalyticsParserMetaPluginCollection"
    })
    private ListParserMetaPluginsResponse(
            int __httpStatusCode__,
            String opcPrevPage,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
                    logAnalyticsParserMetaPluginCollection) {
        super(__httpStatusCode__);
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.logAnalyticsParserMetaPluginCollection = logAnalyticsParserMetaPluginCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
         * subsequent request to get the previous batch of items.
         *
         */
        private String opcPrevPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
         * subsequent request to get the previous batch of items.
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
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
         * The returned LogAnalyticsParserMetaPluginCollection instance.
         */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
                logAnalyticsParserMetaPluginCollection;

        /**
         * The returned LogAnalyticsParserMetaPluginCollection instance.
         * @param logAnalyticsParserMetaPluginCollection the value to set
         * @return this builder
         */
        public Builder logAnalyticsParserMetaPluginCollection(
                com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
                        logAnalyticsParserMetaPluginCollection) {
            this.logAnalyticsParserMetaPluginCollection = logAnalyticsParserMetaPluginCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListParserMetaPluginsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            logAnalyticsParserMetaPluginCollection(o.getLogAnalyticsParserMetaPluginCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListParserMetaPluginsResponse build() {
            return new ListParserMetaPluginsResponse(
                    __httpStatusCode__,
                    opcPrevPage,
                    opcNextPage,
                    opcRequestId,
                    logAnalyticsParserMetaPluginCollection);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",logAnalyticsParserMetaPluginCollection=")
                .append(String.valueOf(logAnalyticsParserMetaPluginCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListParserMetaPluginsResponse)) {
            return false;
        }

        ListParserMetaPluginsResponse other = (ListParserMetaPluginsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.logAnalyticsParserMetaPluginCollection,
                        other.logAnalyticsParserMetaPluginCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsParserMetaPluginCollection == null
                                ? 43
                                : this.logAnalyticsParserMetaPluginCollection.hashCode());
        return result;
    }
}
