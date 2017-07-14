<%@ page language="java" contentType="text/json; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/KmssConfig/sys/person/person.tld" prefix="person"%>
<%@ include file="/sys/ui/jsp/common.jsp"%>
<list:data>
	<list:data-columns var="fsBaseInvoicePool" list="${queryPage.list}" varIndex="status" mobile="true">
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
		<list:data-column col="summary" title="${lfn:message('fs-base:fsBaseInvoicePool.fdDescription')}">
		    <c:out value="${fsBaseInvoicePool.fsBaseInvoicePool.fdDescription}"/>
		</list:data-column>
		<list:data-column property="docStatus" title="${ lfn:message('fs-base:fsBaseInvoicePool.docStatus') }">
		</list:data-column>
		<list:data-column col="created" title="${lfn:message('fs-base:fsBaseInvoicePool.docCreateTime')}">
	        <kmss:showDate value="${fsBaseInvoicePool.fsBaseInvoicePool.docCreateTime}" type="date"></kmss:showDate>
      	</list:data-column>
		<list:data-column property="fdLastModifiedTime" title="${ lfn:message('fs-base:fsBaseInvoicePool.fdLastModifiedTime') }">
		</list:data-column>
		<list:data-column col="href" escape="false">
			/fs/base/fs_base_invoice_pool/fsBaseInvoicePool.do?method=view&fdId=${fsBaseInvoicePool.fdId}
		</list:data-column>
	</list:data-columns>
	<list:data-paging currentPage="${queryPage.pageno}"
		pageSize="${queryPage.rowsize}" totalSize="${queryPage.totalrows}">
	</list:data-paging>
</list:data>	
