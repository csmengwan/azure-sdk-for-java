/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_05_15.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2019_05_15.implementation.DataConnectionValidationListResultInner;
import java.util.List;

/**
 * Type representing DataConnectionValidationListResult.
 */
public interface DataConnectionValidationListResult extends HasInner<DataConnectionValidationListResultInner>, HasManager<KustoManager> {
    /**
     * @return the value value.
     */
    List<DataConnectionValidationResult> value();

}
