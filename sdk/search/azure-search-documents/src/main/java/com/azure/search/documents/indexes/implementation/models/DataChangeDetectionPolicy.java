// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The DataChangeDetectionPolicy model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata\\.type",
        defaultImpl = DataChangeDetectionPolicy.class)
@JsonTypeName("DataChangeDetectionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy",
            value = HighWaterMarkChangeDetectionPolicy.class),
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy",
            value = SqlIntegratedChangeTrackingPolicy.class)
})
@JsonFlatten
@Immutable
public class DataChangeDetectionPolicy {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
