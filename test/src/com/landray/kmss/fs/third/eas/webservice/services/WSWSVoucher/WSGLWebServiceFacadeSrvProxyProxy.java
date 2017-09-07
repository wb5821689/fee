package com.landray.kmss.fs.third.eas.webservice.services.WSWSVoucher;

import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAccountBalance;
import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAssistBalance;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSInvokeException;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSWSVoucher;

public class WSGLWebServiceFacadeSrvProxyProxy implements WSGLWebServiceFacadeSrvProxy {
  private String _endpoint = null;
  private WSGLWebServiceFacadeSrvProxy wSGLWebServiceFacadeSrvProxy = null;
  
  public WSGLWebServiceFacadeSrvProxyProxy() {
    _initWSGLWebServiceFacadeSrvProxyProxy();
  }
  
  public WSGLWebServiceFacadeSrvProxyProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSGLWebServiceFacadeSrvProxyProxy();
  }
  
  private void _initWSGLWebServiceFacadeSrvProxyProxy() {
    try {
      wSGLWebServiceFacadeSrvProxy = (new WSGLWebServiceFacadeSrvProxyServiceLocator()).getWSGLWebServiceFacade();
      if (wSGLWebServiceFacadeSrvProxy != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSGLWebServiceFacadeSrvProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSGLWebServiceFacadeSrvProxy)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSGLWebServiceFacadeSrvProxy != null)
      ((javax.xml.rpc.Stub)wSGLWebServiceFacadeSrvProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
	public WSGLWebServiceFacadeSrvProxy
			getWSGLWebServiceFacadeSrvProxy() {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy;
  }
  
	public int deleteVoucher(java.lang.String companyNumber,
			java.lang.String period, java.lang.String voucherNumber,
			java.lang.String fexp)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.deleteVoucher(companyNumber, period, voucherNumber, fexp);
  }
  
	public int deleteVoucherByID(java.lang.String companyNumber,
			java.lang.String voucherID)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.deleteVoucherByID(companyNumber, voucherID);
  }
  
	public java.lang.String importAccountBalance(
			WSWSAccountBalance[] accountBalanceCols)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.importAccountBalance(accountBalanceCols);
  }
  
	public java.lang.String exploreVoucher(java.lang.String companyId, int year,
			int periodNumber, java.lang.String voucherType,
			java.lang.String number)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.exploreVoucher(companyId, year, periodNumber, voucherType, number);
  }
  
	public java.lang.String importInitAccountBalance(
			WSWSAccountBalance[] initAccountBalanceCol)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.importInitAccountBalance(initAccountBalanceCol);
  }
  
	public java.lang.String checkVoucher(java.lang.String comNumber, int year,
			int periodNumber, java.lang.String number, double amount)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.checkVoucher(comNumber, year, periodNumber, number, amount);
  }
  
	public java.lang.String importAssistBalance(
			WSWSAssistBalance[] assistBalanceCol)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.importAssistBalance(assistBalanceCol);
  }
  
	public java.lang.String[] findVoucher(java.lang.String comNumber, int year,
			int periodNnumber)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.findVoucher(comNumber, year, periodNnumber);
  }
  
	public void importInitAssistBalance(
			WSWSAssistBalance[] initAssistBalanceBalance)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    wSGLWebServiceFacadeSrvProxy.importInitAssistBalance(initAssistBalanceBalance);
  }
  
	public boolean deleteBalance(java.lang.String companyNumber, int year,
			int period) throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.deleteBalance(companyNumber, year, period);
  }
  
	public java.lang.String[] importVoucher(WSWSVoucher[] col,
			int isSubmit, int isVerify, int isCashflow)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.importVoucher(col, isSubmit, isVerify, isCashflow);
  }
  
	public java.lang.String[] importVoucherOfReturnID(
			WSWSVoucher[] col, int isSubmit, int isVerify,
			int isCashflow) throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.importVoucherOfReturnID(col, isSubmit, isVerify, isCashflow);
  }
  
	public java.lang.String[][] getOrg(java.lang.String number)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getOrg(number);
  }
  
	public java.lang.String[][] getAcctType(java.lang.String orgNumber)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAcctType(orgNumber);
  }
  
	public java.lang.String[][] getAsstActType(java.lang.String orgNumber,
			java.lang.String acctTypeNum)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAsstActType(orgNumber, acctTypeNum);
  }
  
	public java.lang.String[][] getAcctTypeDetail(java.lang.String orgNumber,
			java.lang.String asstActTypeNum)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAcctTypeDetail(orgNumber, asstActTypeNum);
  }
  
	public java.lang.String[][] getAccount(java.lang.String orgNumber,
			int fromRow, int toRow)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAccount(orgNumber, fromRow, toRow);
  }
  
	public java.lang.String[][] getAccountBalance(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAccountBalance(orgNumber, year, period, fromRow, toRow);
  }
  
	public java.lang.String[][] getAssitBalance(java.lang.String orgnumber,
			java.lang.String accountNumber, java.lang.String year,
			java.lang.String period, int fromRow, int toRow)
			throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getAssitBalance(orgnumber, accountNumber, year, period, fromRow, toRow);
  }
  
	public java.lang.String[][] getVoucher(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException, WSInvokeException {
    if (wSGLWebServiceFacadeSrvProxy == null)
      _initWSGLWebServiceFacadeSrvProxyProxy();
    return wSGLWebServiceFacadeSrvProxy.getVoucher(orgNumber, year, period, fromRow, toRow);
  }
  
  
}