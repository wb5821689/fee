/**
 * WSGLWebServiceFacadeSrvProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.landray.kmss.fs.third.eas.webservice.services.WSWSVoucher;

import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAccountBalance;
import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAssistBalance;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSInvokeException;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSWSVoucher;

public interface WSGLWebServiceFacadeSrvProxy extends java.rmi.Remote {
	public int deleteVoucher(java.lang.String companyNumber,
			java.lang.String period, java.lang.String voucherNumber,
			java.lang.String fexp) throws java.rmi.RemoteException,
			WSInvokeException;

	public int deleteVoucherByID(java.lang.String companyNumber,
			java.lang.String voucherID) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String
			importAccountBalance(WSWSAccountBalance[] accountBalanceCols)
					throws java.rmi.RemoteException,
					WSInvokeException;

	public java.lang.String exploreVoucher(java.lang.String companyId, int year,
			int periodNumber, java.lang.String voucherType,
			java.lang.String number) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String
			importInitAccountBalance(WSWSAccountBalance[] initAccountBalanceCol)
					throws java.rmi.RemoteException,
					WSInvokeException;

	public java.lang.String checkVoucher(java.lang.String comNumber, int year,
			int periodNumber, java.lang.String number, double amount)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String
			importAssistBalance(WSWSAssistBalance[] assistBalanceCol)
					throws java.rmi.RemoteException,
					WSInvokeException;

	public java.lang.String[] findVoucher(java.lang.String comNumber, int year,
			int periodNnumber) throws java.rmi.RemoteException,
			WSInvokeException;

	public void importInitAssistBalance(
			WSWSAssistBalance[] initAssistBalanceBalance)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public boolean deleteBalance(java.lang.String companyNumber, int year,
			int period) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[] importVoucher(WSWSVoucher[] col, int isSubmit,
			int isVerify, int isCashflow) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[] importVoucherOfReturnID(WSWSVoucher[] col,
			int isSubmit, int isVerify, int isCashflow)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getOrg(java.lang.String number)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAcctType(java.lang.String orgNumber)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAsstActType(java.lang.String orgNumber,
			java.lang.String acctTypeNum) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAcctTypeDetail(java.lang.String orgNumber,
			java.lang.String asstActTypeNum) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAccount(java.lang.String orgNumber,
			int fromRow, int toRow) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAccountBalance(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getAssitBalance(java.lang.String orgnumber,
			java.lang.String accountNumber, java.lang.String year,
			java.lang.String period, int fromRow, int toRow)
			throws java.rmi.RemoteException,
			WSInvokeException;

	public java.lang.String[][] getVoucher(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException,
			WSInvokeException;
}
