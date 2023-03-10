/**
 * WebDBConfigServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebDBConfigServiceLocator extends org.apache.axis.client.Service implements org.tempuri.WebDBConfigService {

    public WebDBConfigServiceLocator() {
    }


    public WebDBConfigServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebDBConfigServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebDBConfigServiceSoap
    private java.lang.String WebDBConfigServiceSoap_address = "http://dblogintest.ais.co.th/wsAuthenDB/webDBconfigService.asmx";

    public java.lang.String getWebDBConfigServiceSoapAddress() {
        return WebDBConfigServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebDBConfigServiceSoapWSDDServiceName = "WebDBConfigServiceSoap";

    public java.lang.String getWebDBConfigServiceSoapWSDDServiceName() {
        return WebDBConfigServiceSoapWSDDServiceName;
    }

    public void setWebDBConfigServiceSoapWSDDServiceName(java.lang.String name) {
        WebDBConfigServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.WebDBConfigServiceSoap getWebDBConfigServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebDBConfigServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebDBConfigServiceSoap(endpoint);
    }

    public org.tempuri.WebDBConfigServiceSoap getWebDBConfigServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebDBConfigServiceSoapStub _stub = new org.tempuri.WebDBConfigServiceSoapStub(portAddress, this);
            _stub.setPortName(getWebDBConfigServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebDBConfigServiceSoapEndpointAddress(java.lang.String address) {
        WebDBConfigServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebDBConfigServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebDBConfigServiceSoapStub _stub = new org.tempuri.WebDBConfigServiceSoapStub(new java.net.URL(WebDBConfigServiceSoap_address), this);
                _stub.setPortName(getWebDBConfigServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebDBConfigServiceSoap".equals(inputPortName)) {
            return getWebDBConfigServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebDBConfigService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebDBConfigServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebDBConfigServiceSoap".equals(portName)) {
            setWebDBConfigServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
