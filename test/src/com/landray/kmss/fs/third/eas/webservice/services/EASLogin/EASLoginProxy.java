/**
 * EASLoginProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.landray.kmss.fs.third.eas.webservice.services.EASLogin;

import com.landray.kmss.fs.third.eas.webservice.client.WSContext;

public interface EASLoginProxy extends java.rmi.Remote {
	public WSContext login(java.lang.String userName, java.lang.String password,
			java.lang.String slnName, java.lang.String dcName,
			java.lang.String language, int dbType)
			throws java.rmi.RemoteException;

	public WSContext login(java.lang.String userName, java.lang.String password,
			java.lang.String slnName, java.lang.String dcName,
			java.lang.String language, int dbType, java.lang.String authPattern)
			throws java.rmi.RemoteException;
}
