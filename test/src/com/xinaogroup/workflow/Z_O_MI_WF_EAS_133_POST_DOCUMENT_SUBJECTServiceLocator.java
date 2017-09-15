/**
 * Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.workflow;

public class Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator extends org.apache.axis.client.Service implements com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTService {

    public Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator() {
    }


    public Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort
    private java.lang.String Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort_address = "http://10.0.146.101:8102/XISOAPAdapter/MessageServlet?channel=:BS_LOTUS_WORKFLOW:Z_SOAP_SENDER_WF_EAS_133_POST_DOCUMENT_SUBJECT&version=3.0&Sender.Party=http%3A%2F%2Fsap.com%2Fxi%2FXI%3AXIParty%3A*&Sender.Service=*&Interface=http%3A%2F%2Fxinaogroup.com%2Fworkflow%5EZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT";

    public java.lang.String getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortAddress() {
        return Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName = "Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort";

    public java.lang.String getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName() {
        return Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName;
    }

    public void setZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName(java.lang.String name) {
        Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName = name;
    }

    public com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort(endpoint);
    }

    public com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTBindingStub _stub = new com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTBindingStub(portAddress, this);
            _stub.setPortName(getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortEndpointAddress(java.lang.String address) {
        Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTBindingStub _stub = new com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTBindingStub(new java.net.URL(Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort_address), this);
                _stub.setPortName(getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortWSDDServiceName());
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
        if ("Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort".equals(inputPortName)) {
            return getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort".equals(portName)) {
            setZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPortEndpointAddress(address);
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
