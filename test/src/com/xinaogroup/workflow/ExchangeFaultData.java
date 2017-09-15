/**
 * ExchangeFaultData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.workflow;

public class ExchangeFaultData  implements java.io.Serializable {
    private java.lang.String faultText;

    private java.lang.String faultUrl;

    private com.xinaogroup.workflow.ExchangeLogData[] faultDetail;

    public ExchangeFaultData() {
    }

    public ExchangeFaultData(
           java.lang.String faultText,
           java.lang.String faultUrl,
           com.xinaogroup.workflow.ExchangeLogData[] faultDetail) {
           this.faultText = faultText;
           this.faultUrl = faultUrl;
           this.faultDetail = faultDetail;
    }


    /**
     * Gets the faultText value for this ExchangeFaultData.
     * 
     * @return faultText
     */
    public java.lang.String getFaultText() {
        return faultText;
    }


    /**
     * Sets the faultText value for this ExchangeFaultData.
     * 
     * @param faultText
     */
    public void setFaultText(java.lang.String faultText) {
        this.faultText = faultText;
    }


    /**
     * Gets the faultUrl value for this ExchangeFaultData.
     * 
     * @return faultUrl
     */
    public java.lang.String getFaultUrl() {
        return faultUrl;
    }


    /**
     * Sets the faultUrl value for this ExchangeFaultData.
     * 
     * @param faultUrl
     */
    public void setFaultUrl(java.lang.String faultUrl) {
        this.faultUrl = faultUrl;
    }


    /**
     * Gets the faultDetail value for this ExchangeFaultData.
     * 
     * @return faultDetail
     */
    public com.xinaogroup.workflow.ExchangeLogData[] getFaultDetail() {
        return faultDetail;
    }


    /**
     * Sets the faultDetail value for this ExchangeFaultData.
     * 
     * @param faultDetail
     */
    public void setFaultDetail(com.xinaogroup.workflow.ExchangeLogData[] faultDetail) {
        this.faultDetail = faultDetail;
    }

    public com.xinaogroup.workflow.ExchangeLogData getFaultDetail(int i) {
        return this.faultDetail[i];
    }

    public void setFaultDetail(int i, com.xinaogroup.workflow.ExchangeLogData _value) {
        this.faultDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeFaultData)) return false;
        ExchangeFaultData other = (ExchangeFaultData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultText==null && other.getFaultText()==null) || 
             (this.faultText!=null &&
              this.faultText.equals(other.getFaultText()))) &&
            ((this.faultUrl==null && other.getFaultUrl()==null) || 
             (this.faultUrl!=null &&
              this.faultUrl.equals(other.getFaultUrl()))) &&
            ((this.faultDetail==null && other.getFaultDetail()==null) || 
             (this.faultDetail!=null &&
              java.util.Arrays.equals(this.faultDetail, other.getFaultDetail())));
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
        if (getFaultText() != null) {
            _hashCode += getFaultText().hashCode();
        }
        if (getFaultUrl() != null) {
            _hashCode += getFaultUrl().hashCode();
        }
        if (getFaultDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeFaultData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "ExchangeFaultData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "ExchangeLogData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
