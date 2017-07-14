<%@ page language="java" contentType="text/json; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<list:data>
	<list:data-columns var="fsBaseInvoicePool" list="${queryPage.list}" varIndex="status">
		<list:data-column property="fdId">
		</list:data-column>
		<list:data-column col="index">
		  ${status+1}
		</list:data-column>
		
		<list:data-column property="fdInvoiceNo" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdInvoiceNo') }">
		</list:data-column>
		<list:data-column property="fdInvoiceCode" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdInvoiceCode') }">
		</list:data-column>
		<list:data-column property="fdCheckCode" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdCheckCode') }">
		</list:data-column>
		<list:data-column property="fdInvoicePrice" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdInvoicePrice') }">
		</list:data-column>
		<list:data-column property="fdInvoiceDate" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdInvoiceDate') }">
		</list:data-column>
		<list:data-column property="fdModelId" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdModelId') }">
		</list:data-column>
		<list:data-column property="fdModelName" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdModelName') }">
		</list:data-column>
		<list:data-column property="fdDescription" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdDescription') }">
		</list:data-column>
		<list:data-column col="docStatus" title="${ lfn:message('fs-base:fsBaseInvoicePool.docStatus') }">
			<sunbor:enumsShow
				value="${fsBaseInvoicePool.docStatus}"
				enumsType="common_status" />
		</list:data-column>
		<list:data-column property="docCreateTime" title="${ lfn:message('fs-base:fsBaseInvoicePool.docCreateTime') }">
		</list:data-column>
		<list:data-column property="fdLastModifiedTime" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdLastModifiedTime') }">
		</list:data-column>
		<list:data-column col="docCreator.fdName" title="${ lfn:message('fs-base:fsBaseInvoicePool.docCreator') }">
			<c:out value="${fsBaseInvoicePool.docCreator.fdName}" />
		</list:data-column>
	</list:data-columns>
	
	<list:data-paging page="${queryPage}" />
</list:data>