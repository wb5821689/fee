package com.xinaogroup.workflow;

public class Z_O_MI_WF_EAS_148_POST_DOCUMENTProxy implements com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT {
  private String _endpoint = null;
  private com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT z_O_MI_WF_EAS_148_POST_DOCUMENT = null;
  
  public Z_O_MI_WF_EAS_148_POST_DOCUMENTProxy() {
    _initZ_O_MI_WF_EAS_148_POST_DOCUMENTProxy();
  }
  
  public Z_O_MI_WF_EAS_148_POST_DOCUMENTProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_O_MI_WF_EAS_148_POST_DOCUMENTProxy();
  }
  
  private void _initZ_O_MI_WF_EAS_148_POST_DOCUMENTProxy() {
    try {
      z_O_MI_WF_EAS_148_POST_DOCUMENT = (new com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENTServiceLocator()).getZ_O_MI_WF_EAS_148_POST_DOCUMENTPort();
      if (z_O_MI_WF_EAS_148_POST_DOCUMENT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_O_MI_WF_EAS_148_POST_DOCUMENT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_O_MI_WF_EAS_148_POST_DOCUMENT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_O_MI_WF_EAS_148_POST_DOCUMENT != null)
      ((javax.xml.rpc.Stub)z_O_MI_WF_EAS_148_POST_DOCUMENT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xinaogroup.workflow.Z_O_MI_WF_EAS_148_POST_DOCUMENT getZ_O_MI_WF_EAS_148_POST_DOCUMENT() {
    if (z_O_MI_WF_EAS_148_POST_DOCUMENT == null)
      _initZ_O_MI_WF_EAS_148_POST_DOCUMENTProxy();
    return z_O_MI_WF_EAS_148_POST_DOCUMENT;
  }
  
  public com.xinaogroup.workflow.Z_DT_WF_EAS_148_POST_DOCUMENT_RESP z_O_MI_WF_EAS_148_POST_DOCUMENT(com.xinaogroup.workflow.Z_DT_WF_EAS_148_POST_DOCUMENT z_MT_WF_EAS_148_POST_DOCUMENT) throws java.rmi.RemoteException, com.xinaogroup.ccs.FaultMT{
    if (z_O_MI_WF_EAS_148_POST_DOCUMENT == null)
      _initZ_O_MI_WF_EAS_148_POST_DOCUMENTProxy();
    return z_O_MI_WF_EAS_148_POST_DOCUMENT.z_O_MI_WF_EAS_148_POST_DOCUMENT(z_MT_WF_EAS_148_POST_DOCUMENT);
  }
  
  
}