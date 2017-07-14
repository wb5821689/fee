package com.landray.kmss.fs.base.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.landray.kmss.sys.organization.model.SysOrgPerson;
import com.landray.kmss.common.model.BaseModel;
import com.landray.kmss.common.convertor.ModelToFormPropertyMap;
import com.landray.kmss.common.convertor.ModelConvertor_ModelListToString;
import com.landray.kmss.common.convertor.ModelConvertor_ModelListToFormList;

import com.landray.kmss.sys.organization.model.SysOrgElement;
import com.landray.kmss.fs.base.model.FsBaseInvoicePool;

import com.landray.kmss.fs.base.forms.FsBaseInvoicePoolForm;
import com.landray.kmss.sys.organization.forms.SysOrgElementForm;


import net.sf.cglib.transform.impl.InterceptFieldEnabled;

/**
 * 发票池
 * 
 * @author 
 * @version 1.0 2017-06-14
 */
public class FsBaseInvoicePool  extends BaseModel  implements InterceptFieldEnabled{

	/**
	 * 发票号码
	 */
	private String fdInvoiceNo;
	
	/**
	 * @return 发票号码
	 */
	public String getFdInvoiceNo() {
		return this.fdInvoiceNo;
	}
	
	/**
	 * @param fdInvoiceNo 发票号码
	 */
	public void setFdInvoiceNo(String fdInvoiceNo) {
		this.fdInvoiceNo = fdInvoiceNo;
	}
	
	/**
	 * 发票代码
	 */
	private String fdInvoiceCode;
	
	/**
	 * @return 发票代码
	 */
	public String getFdInvoiceCode() {
		return this.fdInvoiceCode;
	}
	
	/**
	 * @param fdInvoiceCode 发票代码
	 */
	public void setFdInvoiceCode(String fdInvoiceCode) {
		this.fdInvoiceCode = fdInvoiceCode;
	}
	
	/**
	 * 校验码
	 */
	private String fdCheckCode;
	
	/**
	 * @return 校验码
	 */
	public String getFdCheckCode() {
		return this.fdCheckCode;
	}
	
	/**
	 * @param fdCheckCode 校验码
	 */
	public void setFdCheckCode(String fdCheckCode) {
		this.fdCheckCode = fdCheckCode;
	}
	
	/**
	 * 单价
	 */
	private String fdInvoicePrice;
	
	/**
	 * @return 单价
	 */
	public String getFdInvoicePrice() {
		return this.fdInvoicePrice;
	}
	
	/**
	 * @param fdInvoicePrice 单价
	 */
	public void setFdInvoicePrice(String fdInvoicePrice) {
		this.fdInvoicePrice = fdInvoicePrice;
	}
	
	/**
	 * 开票日期
	 */
	private String fdInvoiceDate;
	
	/**
	 * @return 开票日期
	 */
	public String getFdInvoiceDate() {
		return this.fdInvoiceDate;
	}
	
	/**
	 * @param fdInvoiceDate 开票日期
	 */
	public void setFdInvoiceDate(String fdInvoiceDate) {
		this.fdInvoiceDate = fdInvoiceDate;
	}
	
	/**
	 * 内容
	 */
	private String docContent;
	
	/**
	 * @return 内容
	 */
	public String getDocContent() {
		return (String) readLazyField("docContent", this.docContent);
	}
	
	/**
	 * @param docContent 内容
	 */
	public void setDocContent(String docContent) {
		this.docContent = (String) writeLazyField("docContent",
				this.docContent, docContent);
	}

	/**
	 * 所属文档id
	 */
	private String fdModelId;
	
	/**
	 * @return 所属文档id
	 */
	public String getFdModelId() {
		return this.fdModelId;
	}
	
	/**
	 * @param fdModelId 所属文档id
	 */
	public void setFdModelId(String fdModelId) {
		this.fdModelId = fdModelId;
	}
	
	/**
	 * 所属文档name
	 */
	private String fdModelName;
	
	/**
	 * @return 所属文档name
	 */
	public String getFdModelName() {
		return this.fdModelName;
	}
	
	/**
	 * @param fdModelName 所属文档name
	 */
	public void setFdModelName(String fdModelName) {
		this.fdModelName = fdModelName;
	}
	
	/**
	 * 描述
	 */
	private String fdDescription;
	
	/**
	 * @return 描述
	 */
	public String getFdDescription() {
		return this.fdDescription;
	}
	
	/**
	 * @param fdDescription 描述
	 */
	public void setFdDescription(String fdDescription) {
		this.fdDescription = fdDescription;
	}
	
	/**
	 * 文档状态
	 */
	private String docStatus;
	
	/**
	 * @return 文档状态
	 */
	public String getDocStatus() {
		return this.docStatus;
	}
	
	/**
	 * @param docStatus 文档状态
	 */
	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
	
	/**
	 * 创建时间
	 */
	private Date docCreateTime;
	
	/**
	 * @return 创建时间
	 */
	public Date getDocCreateTime() {
		return this.docCreateTime;
	}
	
	/**
	 * @param docCreateTime 创建时间
	 */
	public void setDocCreateTime(Date docCreateTime) {
		this.docCreateTime = docCreateTime;
	}
	
	/**
	 * 更新时间
	 */
	private Date fdLastModifiedTime;
	
	/**
	 * @return 更新时间
	 */
	public Date getFdLastModifiedTime() {
		return this.fdLastModifiedTime;
	}
	
	/**
	 * @param fdLastModifiedTime 更新时间
	 */
	public void setFdLastModifiedTime(Date fdLastModifiedTime) {
		this.fdLastModifiedTime = fdLastModifiedTime;
	}
	
	/**
	 * 创建者
	 */
	private SysOrgPerson docCreator;
	
	/**
	 * @return 创建者
	 */
	public SysOrgPerson getDocCreator() {
		return this.docCreator;
	}
	
	/**
	 * @param docCreator 创建者
	 */
	public void setDocCreator(SysOrgPerson docCreator) {
		this.docCreator = docCreator;
	}
	

	//机制开始
	//机制结束

	public Class<FsBaseInvoicePoolForm> getFormClass() {
		return FsBaseInvoicePoolForm.class;
	}

	private static ModelToFormPropertyMap toFormPropertyMap;

	public ModelToFormPropertyMap getToFormPropertyMap() {
		if (toFormPropertyMap == null) {
			toFormPropertyMap = new ModelToFormPropertyMap();
			toFormPropertyMap.putAll(super.getToFormPropertyMap());
			toFormPropertyMap.put("docCreator.fdId", "docCreatorId");
			toFormPropertyMap.put("docCreator.fdName", "docCreatorName");
		}
		return toFormPropertyMap;
	}
}
