/**
 * FaultMT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xinaogroup.ccs;

public class FaultMT  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.xinaogroup.workflow.ExchangeFaultData standard;

    public FaultMT() {
    }

    public FaultMT(
           com.xinaogroup.workflow.ExchangeFaultData standard) {
        this.standard = standard;
    }


    /**
     * Gets the standard value for this FaultMT.
     * 
     * @return standard
     */
    public com.xinaogroup.workflow.ExchangeFaultData getStandard() {
        return standard;
    }


    /**
     * Sets the standard value for this FaultMT.
     * 
     * @param standard
     */
    public void setStandard(com.xinaogroup.workflow.ExchangeFaultData standard) {
        this.standard = standard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultMT)) return false;
        FaultMT other = (FaultMT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.standard==null && other.getStandard()==null) || 
             (this.standard!=null &&
              this.standard.equals(other.getStandard())));
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
        if (getStandard() != null) {
            _hashCode += getStandard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultMT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/ccs", ">FaultMT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xinaogroup.com/workflow", "ExchangeFaultData"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
