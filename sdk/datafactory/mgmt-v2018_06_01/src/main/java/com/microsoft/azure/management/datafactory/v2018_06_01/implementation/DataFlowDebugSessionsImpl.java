/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowDebugSessions;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2018_06_01.CreateDataFlowDebugSessionResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowDebugSessionInfo;
import com.microsoft.azure.management.datafactory.v2018_06_01.AddDataFlowToDebugSessionResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowDebugCommandResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.CreateDataFlowDebugSessionRequest;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowDebugPackage;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowDebugCommandRequest;

class DataFlowDebugSessionsImpl extends WrapperImpl<DataFlowDebugSessionsInner> implements DataFlowDebugSessions {
    private final DataFactoryManager manager;

    DataFlowDebugSessionsImpl(DataFactoryManager manager) {
        super(manager.inner().dataFlowDebugSessions());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CreateDataFlowDebugSessionResponse> createAsync(String resourceGroupName, String factoryName, CreateDataFlowDebugSessionRequest request) {
        DataFlowDebugSessionsInner client = this.inner();
        return client.createAsync(resourceGroupName, factoryName, request)
        .map(new Func1<CreateDataFlowDebugSessionResponseInner, CreateDataFlowDebugSessionResponse>() {
            @Override
            public CreateDataFlowDebugSessionResponse call(CreateDataFlowDebugSessionResponseInner inner) {
                return new CreateDataFlowDebugSessionResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DataFlowDebugSessionInfo> queryByFactoryAsync(final String resourceGroupName, final String factoryName) {
        DataFlowDebugSessionsInner client = this.inner();
        return client.queryByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<DataFlowDebugSessionInfoInner>, Iterable<DataFlowDebugSessionInfoInner>>() {
            @Override
            public Iterable<DataFlowDebugSessionInfoInner> call(Page<DataFlowDebugSessionInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataFlowDebugSessionInfoInner, DataFlowDebugSessionInfo>() {
            @Override
            public DataFlowDebugSessionInfo call(DataFlowDebugSessionInfoInner inner) {
                return new DataFlowDebugSessionInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AddDataFlowToDebugSessionResponse> addDataFlowAsync(String resourceGroupName, String factoryName, DataFlowDebugPackage request) {
        DataFlowDebugSessionsInner client = this.inner();
        return client.addDataFlowAsync(resourceGroupName, factoryName, request)
        .map(new Func1<AddDataFlowToDebugSessionResponseInner, AddDataFlowToDebugSessionResponse>() {
            @Override
            public AddDataFlowToDebugSessionResponse call(AddDataFlowToDebugSessionResponseInner inner) {
                return new AddDataFlowToDebugSessionResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName) {
        DataFlowDebugSessionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName).toCompletable();
    }

    @Override
    public Observable<DataFlowDebugCommandResponse> executeCommandAsync(String resourceGroupName, String factoryName, DataFlowDebugCommandRequest request) {
        DataFlowDebugSessionsInner client = this.inner();
        return client.executeCommandAsync(resourceGroupName, factoryName, request)
        .map(new Func1<DataFlowDebugCommandResponseInner, DataFlowDebugCommandResponse>() {
            @Override
            public DataFlowDebugCommandResponse call(DataFlowDebugCommandResponseInner inner) {
                return new DataFlowDebugCommandResponseImpl(inner, manager());
            }
        });
    }

}
