<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="default.view">
	<template:replace name="title">
		<c:out value="${ lfn:message('fs-base:module.fs.base') }"></c:out>
	</template:replace>
	<template:replace name="toolbar">
		<script>
		function deleteDoc(delUrl){
			seajs.use(['lui/dialog'],function(dialog){
				dialog.confirm('<bean:message key="page.comfirmDelete"/>',function(isOk){
					if(isOk){
						Com_OpenWindow(delUrl,'_self');
					}	
				});
			});
		}
		</script>
		<ui:toolbar id="toolbar" layout="sys.ui.toolbar.float" count="3">
			<kmss:auth requestURL="/fs/base/fs_base_invoice_pool/fsBaseInvoicePool.do?method=edit&fdId=${param.fdId}" requestMethod="GET">
				<ui:button text="${lfn:message('button.edit')}" 
							onclick="Com_OpenWindow('fsBaseInvoicePool.do?method=edit&fdId=${param.fdId}','_self');" order="2">
				</ui:button>
			</kmss:auth>
			<kmss:auth requestURL="/fs/base/fs_base_invoice_pool/fsBaseInvoicePool.do?method=delete&fdId=${param.fdId}" requestMethod="GET">
				<ui:button text="${lfn:message('button.delete')}" order="4"
							onclick="deleteDoc('fsBaseInvoicePool.do?method=delete&fdId=${param.fdId}');">
				</ui:button> 
			</kmss:auth>
			<ui:button text="${lfn:message('button.close')}" order="5" onclick="Com_CloseWindow();">
			</ui:button>
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
		<div class='lui_form_title_frame'>
			<div class='lui_form_subject'>
				<%--
				<c:if test="${isHasNewVersion=='true'}">
				     <span style="color:red">(<bean:message bundle="sys-doc" key="kmDoc.kmDocKnowledge.has" /><bean:message bundle="sys-doc" key="kmDoc.kmDocKnowledge.NewVersion" />)</span>
		        </c:if>
				--%>
			</div>
			<div class='lui_form_baseinfo'>
				<%--
				${ lfn:message('fs-base:fsBaseInvoicePool.docCreator') }：
				<ui:person bean="${fsBaseInvoicePool.docCreator}"></ui:person>&nbsp;
				<c:if test="${ not empty fsBaseInvoicePoolForm.docPublishTime }">
					<bean:write name="fsBaseInvoicePoolForm" property="docPublishTime" />
				</c:if>&nbsp;
				<c:if test="${fsBaseInvoicePoolForm.docStatus == '30'}">
				 <bean:message key="sysEvaluationMain.tab.evaluation.label" bundle="sys-evaluation"/>
					 <span data-lui-mark='sys.evaluation.fdEvaluateCount' class="com_number">
						 <c:choose>
						   <c:when test="${not empty fsBaseInvoicePoolForm.evaluationForm.fdEvaluateCount}">
						      ${ fsBaseInvoicePoolForm.evaluationForm.fdEvaluateCount }
						   </c:when>
						   <c:otherwise>(0)</c:otherwise>
						 </c:choose>
					 </span>
				</c:if>
				<bean:message key="sysReadLog.tab.readlog.label" bundle="sys-readlog"/><span data-lui-mark="sys.readlog.fdReadCount" class="com_number">(${ fsBaseInvoicePoolForm.readLogForm.fdReadCount })</span>
				 --%>
			</div>
		</div>
		<%-- 文档概览
		<c:if test="${ not empty fsBaseInvoicePoolForm.fdDescription }">
			<div class="lui_form_summary_frame">			
				<bean:write	name="fsBaseInvoicePoolForm" property="fdDescription" />
			</div>
		</c:if>
		--%>
		<div class="lui_form_content_frame">
			<%-- 文档内容 --%>
			<c:if test="${not empty fsBaseInvoicePoolForm.docContent}">
				<div style="min-height: 200px;">
					${fsBaseInvoicePoolForm.docContent }	
				</div>			
			</c:if>
			<%-- 其它字段 --%>
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
						<c:out value="${fsBaseInvoicePoolForm.docCreatorName}" />
					</td>
					<td class="td_normal_title" width=15%>&nbsp;</td>
					<td width=35%>&nbsp;</td>
				</tr>
			</table> 
		</div>
		<ui:tabpage expand="false">
		</ui:tabpage>
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