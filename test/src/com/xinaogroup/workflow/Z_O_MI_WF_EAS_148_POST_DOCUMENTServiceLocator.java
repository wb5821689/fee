/**
 * Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.workflow;

public class Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator extends org.apache.axis.client.Service implements com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTService {

    public Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator() {
    }


    public Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Z_O_MI_WF_EAS_148_POST_DOCUMENTPort
    private java.lang.String Z_O_MI_WF_EAS_148_POST_DOCUMENTPort_address = "http://10.0.146.101:8102/XISOAPAdapter/MessageServlet?channel=:BS_LOTUS_WORKFLOW:Z_SOAP_SENDER_WF_EAS_148_POST_DOCUMENT&version=3.0&Sender.Party=http%3A%2F%2Fsap.com%2Fxi%2FXI%3AXIParty%3A*&Sender.Service=*&Interface=http%3A%2F%2Fxinaogroup.com%2Fworkflow%5EZ_O_MI_WF_EAS_148_POST_DOCUMENT";

    public java.lang.String getZ_O_MI_WF_EAS_148_POST_DOCUMENTPortAddress() {
        return Z_O_MI_WF_EAS_148_POST_DOCUMENTPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Z_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName = "Z_O_MI_WF_EAS_148_POST_DOCUMENTPort";

    public java.lang.String getZ_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName() {
        return Z_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName;
    }

    public void setZ_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName(java.lang.String name) {
        Z_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName = name;
    }

    public com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT getZ_O_MI_WF_EAS_148_POST_DOCUMENTPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Z_O_MI_WF_EAS_148_POST_DOCUMENTPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZ_O_MI_WF_EAS_148_POST_DOCUMENTPort(endpoint);
    }

    public com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT getZ_O_MI_WF_EAS_148_POST_DOCUMENTPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTBindingStub _stub = new com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTBindingStub(portAddress, this);
            _stub.setPortName(getZ_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZ_O_MI_WF_EAS_148_POST_DOCUMENTPortEndpointAddress(java.lang.String address) {
        Z_O_MI_WF_EAS_148_POST_DOCUMENTPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTBindingStub _stub = new com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTBindingStub(new java.net.URL(Z_O_MI_WF_EAS_148_POST_DOCUMENTPort_address), this);
                _stub.setPortName(getZ_O_MI_WF_EAS_148_POST_DOCUMENTPortWSDDServiceName());
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
        if ("Z_O_MI_WF_EAS_148_POST_DOCUMENTPort".equals(inputPortName)) {
            return getZ_O_MI_WF_EAS_148_POST_DOCUMENTPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_O_MI_WF_EAS_148_POST_DOCUMENTService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_O_MI_WF_EAS_148_POST_DOCUMENTPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Z_O_MI_WF_EAS_148_POST_DOCUMENTPort".equals(portName)) {
            setZ_O_MI_WF_EAS_148_POST_DOCUMENTPortEndpointAddress(address);
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
