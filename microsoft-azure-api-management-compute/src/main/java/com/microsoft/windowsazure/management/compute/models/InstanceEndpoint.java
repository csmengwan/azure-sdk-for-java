// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.net.InetAddress;

/**
* Objects that provide instance endpoint details.
*/
public class InstanceEndpoint
{
    private Integer localPort;
    
    /**
    * Specifies the internal port on which the virtual machine is listening to
    * serve the endpoint. This element is only listed for Virtual Machine
    * deployments.
    */
    public Integer getLocalPort() { return this.localPort; }
    
    /**
    * Specifies the internal port on which the virtual machine is listening to
    * serve the endpoint. This element is only listed for Virtual Machine
    * deployments.
    */
    public void setLocalPort(Integer localPort) { this.localPort = localPort; }
    
    private String name;
    
    /**
    * Specifies the name for the external endpoint. This element is only listed
    * for Virtual Machine deployments.
    */
    public String getName() { return this.name; }
    
    /**
    * Specifies the name for the external endpoint. This element is only listed
    * for Virtual Machine deployments.
    */
    public void setName(String name) { this.name = name; }
    
    private int port;
    
    /**
    * The external port of the role instance endpoint.
    */
    public int getPort() { return this.port; }
    
    /**
    * The external port of the role instance endpoint.
    */
    public void setPort(int port) { this.port = port; }
    
    private String protocol;
    
    /**
    * Specifies the transport protocol for the endpoint.
    */
    public String getProtocol() { return this.protocol; }
    
    /**
    * Specifies the transport protocol for the endpoint.
    */
    public void setProtocol(String protocol) { this.protocol = protocol; }
    
    private InetAddress virtualIPAddress;
    
    /**
    * The Virtual IP of the role endpoint.
    */
    public InetAddress getVirtualIPAddress() { return this.virtualIPAddress; }
    
    /**
    * The Virtual IP of the role endpoint.
    */
    public void setVirtualIPAddress(InetAddress virtualIPAddress) { this.virtualIPAddress = virtualIPAddress; }
    
    /**
    * Initializes a new instance of the InstanceEndpoint class.
    *
    */
    public InstanceEndpoint()
    {
    }
}
