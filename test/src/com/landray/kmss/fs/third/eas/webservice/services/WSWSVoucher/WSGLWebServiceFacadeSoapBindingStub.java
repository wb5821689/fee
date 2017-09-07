/**
 * WSGLWebServiceFacadeSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.landray.kmss.fs.third.eas.webservice.services.WSWSVoucher;

import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAccountBalance;
import com.landray.kmss.fs.third.eas.webservice.gl.app.WSWSAssistBalance;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSBean;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSInvokeException;
import com.landray.kmss.fs.third.eas.webservice.wsvoucher.client.WSWSVoucher;

public class WSGLWebServiceFacadeSoapBindingStub extends
		org.apache.axis.client.Stub implements WSGLWebServiceFacadeSrvProxy {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[20];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "period"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "voucherNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fexp"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "deleteVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteVoucherByID");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "voucherID"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "deleteVoucherByIDReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importAccountBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "accountBalanceCols"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns2_WSWSAccountBalance"),
				WSWSAccountBalance[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"importAccountBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("exploreVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "periodNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "voucherType"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "number"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "exploreVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importInitAccountBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "initAccountBalanceCol"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns2_WSWSAccountBalance"),
				WSWSAccountBalance[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"importInitAccountBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("checkVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "comNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "periodNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "number"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "amount"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "double"),
				double.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "checkVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importAssistBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "assistBalanceCol"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns2_WSWSAssistBalance"),
				WSWSAssistBalance[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "importAssistBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("findVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "comNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "periodNnumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "findVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importInitAssistBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "initAssistBalanceBalance"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns2_WSWSAssistBalance"),
				WSWSAssistBalance[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "period"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		oper.setReturnClass(boolean.class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "deleteBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "col"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns3_WSWSVoucher"),
				WSWSVoucher[].class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isSubmit"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isVerify"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isCashflow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "importVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importVoucherOfReturnID");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "col"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"ArrayOf_tns3_WSWSVoucher"),
				WSWSVoucher[].class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isSubmit"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isVerify"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "isCashflow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("",
				"importVoucherOfReturnIDReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrg");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "number"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getOrgReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAcctType");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAcctTypeReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAsstActType");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "acctTypeNum"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAsstActTypeReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAcctTypeDetail");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "asstActTypeNum"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAcctTypeDetailReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAccount");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fromRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "toRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAccountReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAccountBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "period"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fromRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "toRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAccountBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getAssitBalance");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgnumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "accountNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "period"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fromRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "toRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getAssitBalanceReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getVoucher");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "orgNumber"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "year"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "period"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fromRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "toRow"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"),
				int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string"));
		oper.setReturnClass(java.lang.String[][].class);
		oper.setReturnQName(
				new javax.xml.namespace.QName("", "getVoucherReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName(
						"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
						"fault"),
				"WSInvokeException",
				new javax.xml.namespace.QName("urn:client.glwebservicefacade",
						"WSInvokeException"),
				true));
		_operations[19] = oper;

	}

	public WSGLWebServiceFacadeSoapBindingStub()
			throws org.apache.axis.AxisFault {
		this(null);
	}

	public WSGLWebServiceFacadeSoapBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public WSGLWebServiceFacadeSoapBindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName(
				"http://app.gl.fi.eas.kingdee.com", "WSWSAccountBalance");
		cachedSerQNames.add(qName);
		cls = WSWSAccountBalance.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://app.gl.fi.eas.kingdee.com", "WSWSAssistBalance");
		cachedSerQNames.add(qName);
		cls = WSWSAssistBalance.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_tns2_WSWSAccountBalance");
		cachedSerQNames.add(qName);
		cls = WSWSAccountBalance[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://app.gl.fi.eas.kingdee.com", "WSWSAccountBalance");
		qName2 = null;
		cachedSerFactories.add(
				new org.apache.axis.encoding.ser.ArraySerializerFactory(qName,
						qName2));
		cachedDeserFactories.add(
				new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_tns2_WSWSAssistBalance");
		cachedSerQNames.add(qName);
		cls = WSWSAssistBalance[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://app.gl.fi.eas.kingdee.com", "WSWSAssistBalance");
		qName2 = null;
		cachedSerFactories.add(
				new org.apache.axis.encoding.ser.ArraySerializerFactory(qName,
						qName2));
		cachedDeserFactories.add(
				new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_tns3_WSWSVoucher");
		cachedSerQNames.add(qName);
		cls = WSWSVoucher[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:client.wsvoucher",
				"WSWSVoucher");
		qName2 = null;
		cachedSerFactories.add(
				new org.apache.axis.encoding.ser.ArraySerializerFactory(qName,
						qName2));
		cachedDeserFactories.add(
				new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOf_xsd_string");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string");
		qName2 = null;
		cachedSerFactories.add(
				new org.apache.axis.encoding.ser.ArraySerializerFactory(qName,
						qName2));
		cachedDeserFactories.add(
				new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://win-7forugvlu01:6888/ormrpc/services/WSGLWebServiceFacade",
				"ArrayOfArrayOf_xsd_string");
		cachedSerQNames.add(qName);
		cls = java.lang.String[][].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string");
		qName2 = null;
		cachedSerFactories.add(
				new org.apache.axis.encoding.ser.ArraySerializerFactory(qName,
						qName2));
		cachedDeserFactories.add(
				new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:client.glwebservicefacade",
				"WSBean");
		cachedSerQNames.add(qName);
		cls = WSBean.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:client.glwebservicefacade",
				"WSInvokeException");
		cachedSerQNames.add(qName);
		cls = WSInvokeException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:client.wsvoucher",
				"WSWSVoucher");
		cachedSerQNames.add(qName);
		cls = WSWSVoucher.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setSOAPVersion(
							org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
					_call.setEncodingStyle(
							org.apache.axis.Constants.URI_SOAP11_ENC);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df,
									false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df,
									false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	public int deleteVoucher(java.lang.String companyNumber,
			java.lang.String period, java.lang.String voucherNumber,
			java.lang.String fexp) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"deleteVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					companyNumber, period, voucherNumber, fexp });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((java.lang.Integer) _resp).intValue();
				} catch (java.lang.Exception _exception) {
					return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
							.convert(_resp, int.class)).intValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public int deleteVoucherByID(java.lang.String companyNumber,
			java.lang.String voucherID) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"deleteVoucherByID"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(
					new java.lang.Object[] { companyNumber, voucherID });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((java.lang.Integer) _resp).intValue();
				} catch (java.lang.Exception _exception) {
					return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
							.convert(_resp, int.class)).intValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String importAccountBalance(
			WSWSAccountBalance[] accountBalanceCols)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importAccountBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { accountBalanceCols });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String exploreVoucher(java.lang.String companyId, int year,
			int periodNumber, java.lang.String voucherType,
			java.lang.String number) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"exploreVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					companyId, new java.lang.Integer(year),
					new java.lang.Integer(periodNumber), voucherType, number });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String importInitAccountBalance(
			WSWSAccountBalance[] initAccountBalanceCol)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importInitAccountBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { initAccountBalanceCol });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String checkVoucher(java.lang.String comNumber, int year,
			int periodNumber, java.lang.String number, double amount)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "checkVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					comNumber, new java.lang.Integer(year),
					new java.lang.Integer(periodNumber), number,
					new java.lang.Double(amount) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String importAssistBalance(
			WSWSAssistBalance[] assistBalanceCol)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importAssistBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { assistBalanceCol });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[] findVoucher(java.lang.String comNumber, int year,
			int periodNnumber) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "findVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					comNumber, new java.lang.Integer(year),
					new java.lang.Integer(periodNnumber) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public void importInitAssistBalance(
			WSWSAssistBalance[] initAssistBalanceBalance)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importInitAssistBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(
					new java.lang.Object[] { initAssistBalanceBalance });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public boolean deleteBalance(java.lang.String companyNumber, int year,
			int period) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"deleteBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					companyNumber, new java.lang.Integer(year),
					new java.lang.Integer(period) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((java.lang.Boolean) _resp).booleanValue();
				} catch (java.lang.Exception _exception) {
					return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
							.convert(_resp, boolean.class)).booleanValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[] importVoucher(WSWSVoucher[] col,
			int isSubmit, int isVerify, int isCashflow)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { col,
					new java.lang.Integer(isSubmit),
					new java.lang.Integer(isVerify),
					new java.lang.Integer(isCashflow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[] importVoucherOfReturnID(
			WSWSVoucher[] col, int isSubmit, int isVerify,
			int isCashflow) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"importVoucherOfReturnID"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { col,
					new java.lang.Integer(isSubmit),
					new java.lang.Integer(isVerify),
					new java.lang.Integer(isCashflow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getOrg(java.lang.String number)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "getOrg"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { number });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAcctType(java.lang.String orgNumber)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "getAcctType"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { orgNumber });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAsstActType(java.lang.String orgNumber,
			java.lang.String acctTypeNum) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"getAsstActType"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { orgNumber, acctTypeNum });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAcctTypeDetail(java.lang.String orgNumber,
			java.lang.String asstActTypeNum) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"getAcctTypeDetail"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(
					new java.lang.Object[] { orgNumber, asstActTypeNum });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAccount(java.lang.String orgNumber,
			int fromRow, int toRow) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "getAccount"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					orgNumber, new java.lang.Integer(fromRow),
					new java.lang.Integer(toRow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAccountBalance(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"getAccountBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					orgNumber, year, period, new java.lang.Integer(fromRow),
					new java.lang.Integer(toRow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getAssitBalance(java.lang.String orgnumber,
			java.lang.String accountNumber, java.lang.String year,
			java.lang.String period, int fromRow, int toRow)
			throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com",
				"getAssitBalance"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { orgnumber, accountNumber,
							year, period, new java.lang.Integer(fromRow),
							new java.lang.Integer(toRow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	public java.lang.String[][] getVoucher(java.lang.String orgNumber,
			java.lang.String year, java.lang.String period, int fromRow,
			int toRow) throws java.rmi.RemoteException,
			WSInvokeException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(
				org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://webservice.app.gl.fi.eas.kingdee.com", "getVoucher"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					orgNumber, year, period, new java.lang.Integer(fromRow),
					new java.lang.Integer(toRow) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String[][]) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String[][]) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String[][].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof WSInvokeException) {
					throw (WSInvokeException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

}
