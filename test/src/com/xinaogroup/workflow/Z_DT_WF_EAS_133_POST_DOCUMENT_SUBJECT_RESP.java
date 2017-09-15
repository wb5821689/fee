/**
 * Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.workflow;

public class Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP  implements java.io.Serializable {
    /* 返回码 */
    private java.lang.String RETURN;

    /* 返回信息 */
    private java.lang.String MESSAGE;

    public Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP() {
    }

    public Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP(
           java.lang.String RETURN,
           java.lang.String MESSAGE) {
           this.RETURN = RETURN;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the RETURN value for this Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.
     * 
     * @return RETURN   * 返回码
     */
    public java.lang.String getRETURN() {
        return RETURN;
    }


    /**
     * Sets the RETURN value for this Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.
     * 
     * @param RETURN   * 返回码
     */
    public void setRETURN(java.lang.String RETURN) {
        this.RETURN = RETURN;
    }


    /**
     * Gets the MESSAGE value for this Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.
     * 
     * @return MESSAGE   * 返回信息
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.
     * 
     * @param MESSAGE   * 返回信息
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP)) return false;
        Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP other = (Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RETURN==null && other.getRETURN()==null) || 
             (this.RETURN!=null &&
              this.RETURN.equals(other.getRETURN()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
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
        if (getRETURN() != null) {
            _hashCode += getRETURN().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "Z_DT_WF_EAS_133_POST_DOCUMENT_SUBJECT_RESP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
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
