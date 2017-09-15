/**
 * Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.workflow;

public class Z_DT_WF_EAS_148_POST_DOCUMENT_RESP  implements java.io.Serializable {
    /* 凭证号 */
    private java.lang.String AC_DOC_NO;

    /* 返回码 */
    private java.lang.String FLAG;

    /* 返回信息 */
    private java.lang.String ERROR_MSG;

    public Z_DT_WF_EAS_148_POST_DOCUMENT_RESP() {
    }

    public Z_DT_WF_EAS_148_POST_DOCUMENT_RESP(
           java.lang.String AC_DOC_NO,
           java.lang.String FLAG,
           java.lang.String ERROR_MSG) {
           this.AC_DOC_NO = AC_DOC_NO;
           this.FLAG = FLAG;
           this.ERROR_MSG = ERROR_MSG;
    }


    /**
     * Gets the AC_DOC_NO value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @return AC_DOC_NO   * 凭证号
     */
    public java.lang.String getAC_DOC_NO() {
        return AC_DOC_NO;
    }


    /**
     * Sets the AC_DOC_NO value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @param AC_DOC_NO   * 凭证号
     */
    public void setAC_DOC_NO(java.lang.String AC_DOC_NO) {
        this.AC_DOC_NO = AC_DOC_NO;
    }


    /**
     * Gets the FLAG value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @return FLAG   * 返回码
     */
    public java.lang.String getFLAG() {
        return FLAG;
    }


    /**
     * Sets the FLAG value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @param FLAG   * 返回码
     */
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }


    /**
     * Gets the ERROR_MSG value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @return ERROR_MSG   * 返回信息
     */
    public java.lang.String getERROR_MSG() {
        return ERROR_MSG;
    }


    /**
     * Sets the ERROR_MSG value for this Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.
     * 
     * @param ERROR_MSG   * 返回信息
     */
    public void setERROR_MSG(java.lang.String ERROR_MSG) {
        this.ERROR_MSG = ERROR_MSG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_DT_WF_EAS_148_POST_DOCUMENT_RESP)) return false;
        Z_DT_WF_EAS_148_POST_DOCUMENT_RESP other = (Z_DT_WF_EAS_148_POST_DOCUMENT_RESP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AC_DOC_NO==null && other.getAC_DOC_NO()==null) || 
             (this.AC_DOC_NO!=null &&
              this.AC_DOC_NO.equals(other.getAC_DOC_NO()))) &&
            ((this.FLAG==null && other.getFLAG()==null) || 
             (this.FLAG!=null &&
              this.FLAG.equals(other.getFLAG()))) &&
            ((this.ERROR_MSG==null && other.getERROR_MSG()==null) || 
             (this.ERROR_MSG!=null &&
              this.ERROR_MSG.equals(other.getERROR_MSG())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAC_DOC_NO() != null) {
            _hashCode += getAC_DOC_NO().hashCode();
        }
        if (getFLAG() != null) {
            _hashCode += getFLAG().hashCode();
        }
        if (getERROR_MSG() != null) {
            _hashCode += getERROR_MSG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_DT_WF_EAS_148_POST_DOCUMENT_RESP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_DT_WF_EAS_148_POST_DOCUMENT_RESP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC_DOC_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AC_DOC_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERROR_MSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
