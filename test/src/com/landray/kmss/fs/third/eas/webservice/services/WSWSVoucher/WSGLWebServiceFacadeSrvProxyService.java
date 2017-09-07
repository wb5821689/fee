/**
 * WSGLWebServiceFacadeSrvProxyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.landray.kmss.fs.third.eas.webservice.services.WSWSVoucher;

public interface WSGLWebServiceFacadeSrvProxyService extends javax.xml.rpc.Service {
    public java.lang.String getWSGLWebServiceFacadeAddress();

	public WSGLWebServiceFacadeSrvProxy getWSGLWebServiceFacade()
			throws javax.xml.rpc.ServiceException;

	public WSGLWebServiceFacadeSrvProxy getWSGLWebServiceFacade(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
