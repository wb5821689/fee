<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<template:include ref="mobile.view" compatibleMode="true">
	<template:replace name="title">
		<c:out value="${ lfn:message('fs-base:module.fs.base') }"/>
	</template:replace>
	<template:replace name="content">
		<div data-dojo-type="mui/view/DocScrollableView" id="fsBaseInvoicePoolForm">
			<div class="muiDocFrame">
				<div class="muiDocSubject">
				</div>
				<div class="muiDocInfo">
					<span> <c:out value="${fsBaseInvoicePoolForm.docCreateTime  }" />
					</span>
				</div>
				<span class="muiDocContent"> 
					<xform:rtf property="docContent" mobile="true"></xform:rtf>
				</span>
				<c:if
					test="${fsBaseInvoicePoolForm.fdDescription!=null && fsBaseInvoicePoolForm.fdDescription!='' }">
					<div class="muiDocSummary">
						<div class="muiDocSummarySign">摘要</div>
						<c:out value="${fsBaseInvoicePoolForm.fdDescription}" />
					</div>
				</c:if>
			</div>
			<c:if test="${fsBaseInvoicePoolForm.docStatus >= '30' }">
				<ul data-dojo-type="mui/tabbar/TabBar" fixed="bottom" >
				  <li data-dojo-type="mui/back/BackButton"></li>
				   <li data-dojo-type="mui/tabbar/TabBarButtonGroup" data-dojo-props="icon1:'mui mui-more'">
				    	<div data-dojo-type="mui/back/HomeButton"></div>
				    </li>
				</ul>
			</c:if>
			<c:if test="${fsBaseInvoicePoolForm.docStatus < '30' }">
				<ul data-dojo-type="mui/tabbar/TabBar" fixed="bottom" >
				  <li data-dojo-type="mui/back/BackButton"></li>
				  <li data-dojo-type="mui/tabbar/TabBarButtonGroup" data-dojo-props="icon1:'mui mui-more'">
				    	<div data-dojo-type="mui/back/HomeButton"></div>
				  </li>
				</ul>
			</c:if>
		</div>
	</template:replace>
</template:include>
