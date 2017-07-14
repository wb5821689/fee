<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="default.edit">
	<template:replace name="title">
		<c:choose>
			<c:when test="${fsBaseInvoicePoolForm.method_GET == 'add' }">
				<c:out value="${ lfn:message('operation.create') } - ${ lfn:message('fs-base:module.fs.base') }"></c:out>	
			</c:when>
			<c:otherwise>
				<c:out value="${ lfn:message('fs-base:module.fs.base') }"></c:out>
			</c:otherwise>
		</c:choose>
	</template:replace>
	<template:replace name="toolbar">
		<ui:toolbar id="toolbar" layout="sys.ui.toolbar.float" count="3"> 
			<c:choose>
				<c:when test="${ fsBaseInvoicePoolForm.method_GET == 'edit' }">
					<ui:button text="${ lfn:message('button.update') }" onclick="Com_Submit(document.fsBaseInvoicePoolForm, 'update');"></ui:button>
				</c:when>
				<c:when test="${ fsBaseInvoicePoolForm.method_GET == 'add' }">
					<ui:button text="${ lfn:message('button.save') }" onclick="Com_Submit(document.fsBaseInvoicePoolForm, 'save');"></ui:button>
					<ui:button text="${ lfn:message('button.saveadd') }" onclick="Com_Submit(document.fsBaseInvoicePoolForm, 'saveadd');"></ui:button>
				</c:when>
			</c:choose>
			<ui:button text="${ lfn:message('button.close') }" onclick="Com_CloseWindow();"></ui:button>	
		</ui:toolbar>
	</template:replace>
	<template:replace name="path">			
		<ui:menu layout="sys.ui.menu.nav"> 
			<ui:menu-item text="${ lfn:message('home.home') }" icon="lui_icon_s_home">
			</ui:menu-item>	
			<ui:menu-item text="${ lfn:message('fs-base:module.fs.base') }">
			</ui:menu-item>
		</ui:menu>
	</template:replace>	
	<template:replace name="content">
		<html:form action="/fs/base/fs_base_invoice_pool/fsBaseInvoicePool.do">
			<div class="lui_form_content_frame" style="padding-top:20px">
				<table class="tb_simple" width=100%>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdInvoiceNo"/>
						</td>
						<td width="35%">
							<xform:text property="fdInvoiceNo" style="width:85%" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdInvoiceCode"/>
						</td>
						<td width="35%">
							<xform:text property="fdInvoiceCode" style="width:85%" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdCheckCode"/>
						</td>
						<td width="35%">
							<xform:text property="fdCheckCode" style="width:85%" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdInvoicePrice"/>
						</td>
						<td width="35%">
							<xform:text property="fdInvoicePrice" style="width:85%" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdInvoiceDate"/>
						</td>
						<td width="35%">
							<xform:text property="fdInvoiceDate" style="width:85%" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.docContent"/>
						</td>
						<td width="35%">
							<xform:rtf property="docContent" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdModelId"/>
						</td>
						<td width="35%">
							<xform:text property="fdModelId" style="width:85%" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdModelName"/>
						</td>
						<td width="35%">
							<xform:text property="fdModelName" style="width:85%" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdDescription"/>
						</td>
						<td width="35%">
							<xform:textarea property="fdDescription" style="width:85%" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.docStatus"/>
						</td>
						<td width="35%">
							<xform:text property="docStatus" style="width:85%" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.docCreateTime"/>
						</td>
						<td width="35%">
							<xform:datetime property="docCreateTime" />
						</td>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.fdLastModifiedTime"/>
						</td>
						<td width="35%">
							<xform:datetime property="fdLastModifiedTime" />
						</td>
					</tr>
					<tr>
						<td class="td_normal_title" width=15%>
							<bean:message bundle="fs-base" key="fsBaseInvoicePool.docCreator"/>
						</td>
						<td width="35%">
							<xform:address propertyId="docCreatorId" propertyName="docCreatorName" orgType="ORG_TYPE_PERSON" showStatus="view" />
						</td>
						<td class="td_normal_title" width=15%>&nbsp;</td><td width=35%>&nbsp;</td>
					</tr>
				</table>
			</div>
			<ui:tabpage expand="false">
			</ui:tabpage>
		<html:hidden property="fdId" />
		<html:hidden property="method_GET" />
		</html:form>
		<script>
			$KMSSValidation(document.forms['fsBaseInvoicePoolForm']);
		</script>
	</template:replace>
	<%--
	<template:replace name="nav">
		<div style="min-width:200px;"></div>
		<ui:accordionpanel style="min-width:200px;"> 
			<ui:content title="${ lfn:message('sys-doc:kmDoc.kmDocKnowledge.docInfo') }" toggle="false">
				<c:import url="/sys/evaluation/import/sysEvaluationMain_view_star.jsp" charEncoding="UTF-8">
					<c:param name="formName" value="fsBaseInvoicePoolForm" />
				</c:import>
				<ul class='lui_form_info'>
					<li><bean:message bundle="fs-base" key="fsBaseInvoicePool.docCreator" />：
					<ui:person personId="${fsBaseInvoicePoolForm.docCreatorId}" personName="${fsBaseInvoicePoolForm.docCreatorName}"></ui:person></li>
					<li><bean:message bundle="fs-base" key="fsBaseInvoicePool.docDept" />：${fsBaseInvoicePoolForm.docDeptName}</li>
					<li><bean:message bundle="fs-base" key="fsBaseInvoicePool.docStatus" />：<sunbor:enumsShow value="${fsBaseInvoicePoolForm.docStatus}" enumsType="common_status" /></li>
					<li><bean:message bundle="fs-base" key="fsBaseInvoicePool.docCreateTime" />：${fsBaseInvoicePoolForm.docCreateTime }</li>				
				</ul>
			</ui:content>
		</ui:accordionpanel>
	</template:replace>
	--%>
</template:include>