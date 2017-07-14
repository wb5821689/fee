package com.landray.kmss.fs.base.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import com.landray.kmss.common.forms.ExtendForm;
import com.landray.kmss.util.AutoArrayList;

import com.landray.kmss.common.convertor.FormToModelPropertyMap;
import com.landray.kmss.common.convertor.FormConvertor_FormListToModelList;
import com.landray.kmss.common.convertor.FormConvertor_IDToModel;
import com.landray.kmss.common.convertor.FormConvertor_IDsToModelList;

import com.landray.kmss.sys.organization.model.SysOrgElement;
import com.landray.kmss.fs.base.model.FsBaseInvoicePool;



/**
 * 发票池 Form
 * 
 * @author 
 * @version 1.0 2017-06-14
 */
public class FsBaseInvoicePoolForm  extends ExtendForm  {

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
		return this.docContent;
	}
	
	/**
	 * @param docContent 内容
	 */
	public void setDocContent(String docContent) {
		this.docContent = docContent;
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
	private String docCreateTime;
	
	/**
	 * @return 创建时间
	 */
	public String getDocCreateTime() {
		return this.docCreateTime;
	}
	
	/**
	 * @param docCreateTime 创建时间
	 */
	public void setDocCreateTime(String docCreateTime) {
		this.docCreateTime = docCreateTime;
	}
	
	/**
	 * 更新时间
	 */
	private String fdLastModifiedTime;
	
	/**
	 * @return 更新时间
	 */
	public String getFdLastModifiedTime() {
		return this.fdLastModifiedTime;
	}
	
	/**
	 * @param fdLastModifiedTime 更新时间
	 */
	public void setFdLastModifiedTime(String fdLastModifiedTime) {
		this.fdLastModifiedTime = fdLastModifiedTime;
	}
	
	/**
	 * 创建者的ID
	 */
	private String docCreatorId;
	
	/**
	 * @return 创建者的ID
	 */
	public String getDocCreatorId() {
		return this.docCreatorId;
	}
	
	/**
	 * @param docCreatorId 创建者的ID
	 */
	public void setDocCreatorId(String docCreatorId) {
		this.docCreatorId = docCreatorId;
	}
	
	/**
	 * 创建者的名称
	 */
	private String docCreatorName;
	
	/**
	 * @return 创建者的名称
	 */
	public String getDocCreatorName() {
		return this.docCreatorName;
	}
	
	/**
	 * @param docCreatorName 创建者的名称
	 */
	public void setDocCreatorName(String docCreatorName) {
		this.docCreatorName = docCreatorName;
	}
	
	//机制开始 
	//机制结束

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		fdInvoiceNo = null;
		fdInvoiceCode = null;
		fdCheckCode = null;
		fdInvoicePrice = null;
		fdInvoiceDate = null;
		docContent = null;
		fdModelId = null;
		fdModelName = null;
		fdDescription = null;
		docStatus = null;
		docCreateTime = null;
		fdLastModifiedTime = null;
		docCreatorId = null;
		docCreatorName = null;
		
 
		super.reset(mapping, request);
	}

	public Class<FsBaseInvoicePool> getModelClass() {
		return FsBaseInvoicePool.class;
	}
	
	private static FormToModelPropertyMap toModelPropertyMap;

	public FormToModelPropertyMap getToModelPropertyMap() {
		if (toModelPropertyMap == null) {
			toModelPropertyMap = new FormToModelPropertyMap();
			toModelPropertyMap.putAll(super.getToModelPropertyMap());
			toModelPropertyMap.put("docCreatorId",
					new FormConvertor_IDToModel("docCreator",
						SysOrgElement.class));
		}
		return toModelPropertyMap;
	}
}
