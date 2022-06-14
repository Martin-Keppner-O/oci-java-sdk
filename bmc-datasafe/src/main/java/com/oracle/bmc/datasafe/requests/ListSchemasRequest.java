/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSchemasExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSchemasRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSchemasRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the Data Safe target database.
     */
    private String targetDatabaseId;

    /**
     * The OCID of the Data Safe target database.
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * A filter to return only items related to specific schema name.
     */
    private java.util.List<String> schemaName;

    /**
     * A filter to return only items related to specific schema name.
     */
    public java.util.List<String> getSchemaName() {
        return schemaName;
    }
    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     *
     */
    private SortBy sortBy;

    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     *
     **/
    public enum SortBy {
        Schemaname("SCHEMANAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to return only items related to specific type of schema.
     */
    private Boolean isOracleMaintained;

    /**
     * A filter to return only items related to specific type of schema.
     */
    public Boolean getIsOracleMaintained() {
        return isOracleMaintained;
    }
    /**
     * A filter to return only items if schema name contains a specific string.
     */
    private String schemaNameContains;

    /**
     * A filter to return only items if schema name contains a specific string.
     */
    public String getSchemaNameContains() {
        return schemaNameContains;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSchemasRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the Data Safe target database.
         */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * A filter to return only items related to specific schema name.
         */
        private java.util.List<String> schemaName = null;

        /**
         * A filter to return only items related to specific schema name.
         * @param schemaName the value to set
         * @return this builder instance
         */
        public Builder schemaName(java.util.List<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific schema name.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder schemaName(String singularValue) {
            return this.schemaName(java.util.Arrays.asList(singularValue));
        }

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to return only items related to specific type of schema.
         */
        private Boolean isOracleMaintained = null;

        /**
         * A filter to return only items related to specific type of schema.
         * @param isOracleMaintained the value to set
         * @return this builder instance
         */
        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = isOracleMaintained;
            return this;
        }

        /**
         * A filter to return only items if schema name contains a specific string.
         */
        private String schemaNameContains = null;

        /**
         * A filter to return only items if schema name contains a specific string.
         * @param schemaNameContains the value to set
         * @return this builder instance
         */
        public Builder schemaNameContains(String schemaNameContains) {
            this.schemaNameContains = schemaNameContains;
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
        public Builder copy(ListSchemasRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            schemaName(o.getSchemaName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            isOracleMaintained(o.getIsOracleMaintained());
            schemaNameContains(o.getSchemaNameContains());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSchemasRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSchemasRequest
         */
        public ListSchemasRequest build() {
            ListSchemasRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSchemasRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSchemasRequest
         */
        public ListSchemasRequest buildWithoutInvocationCallback() {
            ListSchemasRequest request = new ListSchemasRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.schemaName = schemaName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.isOracleMaintained = isOracleMaintained;
            request.schemaNameContains = schemaNameContains;
            return request;
            // new ListSchemasRequest(targetDatabaseId, opcRequestId, limit, page, schemaName, sortOrder, sortBy, isOracleMaintained, schemaNameContains);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .schemaName(schemaName)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .isOracleMaintained(isOracleMaintained)
                .schemaNameContains(schemaNameContains);
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
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",isOracleMaintained=").append(String.valueOf(this.isOracleMaintained));
        sb.append(",schemaNameContains=").append(String.valueOf(this.schemaNameContains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSchemasRequest)) {
            return false;
        }

        ListSchemasRequest other = (ListSchemasRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.isOracleMaintained, other.isOracleMaintained)
                && java.util.Objects.equals(this.schemaNameContains, other.schemaNameContains);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleMaintained == null
                                ? 43
                                : this.isOracleMaintained.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaNameContains == null
                                ? 43
                                : this.schemaNameContains.hashCode());
        return result;
    }
}
