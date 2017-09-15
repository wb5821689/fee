package com.xinaogroup.workflow;

public class Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy implements com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT {
  private String _endpoint = null;
  private com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT = null;
  
  public Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy() {
    _initZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy();
  }

  public Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy();
  }
  
  private void _initZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy() {
    try {
      z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT = (new com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTServiceLocator()).getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTPort();
      if (z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT != null)
      ((javax.xml.rpc.Stub)z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xinaogroup.workflow.Z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT getZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT() {
    if (z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT == null)
      _initZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy();
    return z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT;
  }
  
  public com.xinaogroup.workflow.Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT(com.xinaogroup.workflow.Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT z_MT_WF_EAS_133_POST_DOCUMENT_SUBJECT) throws java.rmi.RemoteException, com.xinaogroup.ccs.FaultMT{
    if (z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT == null)
      _initZ_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECTProxy();
    return z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT.z_O_MI_WF_EAS_133_POST_DOCUMENT_SUBJECT(z_MT_WF_EAS_133_POST_DOCUMENT_SUBJECT);
  }
  
  
}