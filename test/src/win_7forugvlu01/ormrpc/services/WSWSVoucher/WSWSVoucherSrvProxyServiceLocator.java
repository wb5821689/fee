/**
 * WSWSVoucherSrvProxyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package win_7forugvlu01.ormrpc.services.WSWSVoucher;

public class WSWSVoucherSrvProxyServiceLocator extends org.apache.axis.client.Service implements win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSrvProxyService {

    public WSWSVoucherSrvProxyServiceLocator() {
    }


    public WSWSVoucherSrvProxyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSWSVoucherSrvProxyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSWSVoucher
    private java.lang.String WSWSVoucher_address = "http://win-7forugvlu01:6888/ormrpc/services/WSWSVoucher";

    public java.lang.String getWSWSVoucherAddress() {
        return WSWSVoucher_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSWSVoucherWSDDServiceName = "WSWSVoucher";

    public java.lang.String getWSWSVoucherWSDDServiceName() {
        return WSWSVoucherWSDDServiceName;
    }

    public void setWSWSVoucherWSDDServiceName(java.lang.String name) {
        WSWSVoucherWSDDServiceName = name;
    }

    public win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSrvProxy getWSWSVoucher() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSWSVoucher_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSWSVoucher(endpoint);
    }

    public win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSrvProxy getWSWSVoucher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSoapBindingStub _stub = new win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSWSVoucherWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSWSVoucherEndpointAddress(java.lang.String address) {
        WSWSVoucher_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSrvProxy.class.isAssignableFrom(serviceEndpointInterface)) {
                win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSoapBindingStub _stub = new win_7forugvlu01.ormrpc.services.WSWSVoucher.WSWSVoucherSoapBindingStub(new java.net.URL(WSWSVoucher_address), this);
                _stub.setPortName(getWSWSVoucherWSDDServiceName());
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
        if ("WSWSVoucher".equals(inputPortName)) {
            return getWSWSVoucher();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://win-7forugvlu01:6888/ormrpc/services/WSWSVoucher", "WSWSVoucherSrvProxyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://win-7forugvlu01:6888/ormrpc/services/WSWSVoucher", "WSWSVoucher"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSWSVoucher".equals(portName)) {
            setWSWSVoucherEndpointAddress(address);
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
