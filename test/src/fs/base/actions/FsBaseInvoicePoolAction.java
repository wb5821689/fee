package com.landray.kmss.fs.base.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.landray.kmss.common.actions.ExtendAction;
import com.landray.kmss.common.service.IBaseService;

import com.landray.kmss.fs.base.service.IFsBaseInvoicePoolService;
import com.landray.kmss.sys.organization.service.ISysOrgElementService;

import com.landray.kmss.util.CriteriaUtil;
import com.landray.kmss.util.CriteriaValue;
import com.landray.kmss.util.StringUtil;
import com.landray.kmss.common.dao.HQLInfo;
import com.landray.kmss.fs.base.model.FsBaseInvoicePool;
import com.landray.kmss.fs.base.forms.FsBaseInvoicePoolForm;
import com.landray.kmss.sys.organization.forms.SysOrgElementForm;

import com.landray.kmss.common.service.ICoreOuterService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.landray.kmss.common.actions.RequestContext;
import com.landray.kmss.sys.simplecategory.interfaces.SimpleCategoryUtil;


import com.landray.kmss.common.forms.IExtendForm;
 

import com.landray.kmss.sys.organization.model.SysOrgElement;
import com.landray.kmss.fs.base.model.FsBaseInvoicePool;

 
/**
 * 发票池 Action
 * 
 * @author 
 * @version 1.0 2017-06-14
 */
public class FsBaseInvoicePoolAction extends ExtendAction {
	protected IFsBaseInvoicePoolService fsBaseInvoicePoolService;

	protected IBaseService getServiceImp(HttpServletRequest request) {
		if(fsBaseInvoicePoolService == null){
			fsBaseInvoicePoolService = (IFsBaseInvoicePoolService)getBean("fsBaseInvoicePoolService");
		}
		return fsBaseInvoicePoolService;
	}

	protected void changeFindPageHQLInfo(HttpServletRequest request,
			HQLInfo hqlInfo) throws Exception {
		super.changeFindPageHQLInfo(request, hqlInfo);		
		CriteriaValue cv = new CriteriaValue(request);
		CriteriaUtil.buildHql(cv, hqlInfo, FsBaseInvoicePool.class);
	}
}

