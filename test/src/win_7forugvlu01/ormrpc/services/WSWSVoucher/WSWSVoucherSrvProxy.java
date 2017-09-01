/**
 * WSWSVoucherSrvProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package win_7forugvlu01.ormrpc.services.WSWSVoucher;

public interface WSWSVoucherSrvProxy extends java.rmi.Remote {
    public com.kingdee.eas.fi.gl.app.WSWSRtnInfo[] importVoucher(wsvoucher.client.WSWSVoucher[] voucherCols, boolean isTempSave, boolean isVerify, boolean hasCashflow) throws java.rmi.RemoteException, wsvoucher.client.WSInvokeException;
    public java.lang.String[][] importVoucher(wsvoucher.client.WSWSVoucher[] voucherCols, int isVerify, int isImpCashflow) throws java.rmi.RemoteException, wsvoucher.client.WSInvokeException;
    public java.lang.String[][] importVoucherOfReturnID(wsvoucher.client.WSWSVoucher[] voucherCols, int isVerify, int isImpCashflow) throws java.rmi.RemoteException, wsvoucher.client.WSInvokeException;
}
