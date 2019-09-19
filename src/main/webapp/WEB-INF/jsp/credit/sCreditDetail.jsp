<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
	
		$(document).ready(function () {
			var uId = window.location.search.substring(window.location.search.indexOf("=")+1);
			console.info(uId);
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/credit/queryAllDetailById?uId='+uId,
	            method: 'post', 
	            columns: [
            	  
	                {
	                    sortable: "true",
	                    field: 'creditDate',
	                    title: '时间',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'creditSum',
	                    title: '积分',
	                    align: "center"
	                },
	                {	          
	                    field: 'creditText',
	                    title: '明细',
	                    align: "center"
	                }
	            ],
	            height: 580,
	            pagination: true,
	            pageList: [10, 15],
	            search: true,
	            showHeader: true,
	            pageNumber: 1,
	            pageSize: 10,
	            striped: false,
	            toolbar: '#toolbar',
	            showRefresh: true,
	            paginationPreText: "上一页",
	            paginationNextText: "下一页",
	            clickToSelect: true, //是否启用点击选中行
	            smartDisplay: false,//智能显示分页按钮
	            queryParams: function (params) {
	                return {
	                    rows: this.pageSize,
	                    page: this.pageNumber,
	                    sort: this.sortName,
	                    order: this.sortOrder
	                };
	            },
	            onLoadSuccess: function () {  
	                console.info("加载成功");
	            },
	            onLoadError: function () {  
	                console.info("加载数据失败");
	            },
	            onClickRow: function (row) {
	            	creditNum = row.creditNum;
	            	creditSum = row.creditSum;
	            	creditText = row.creditText;
	            	creditDate = row.creditDate;
	            }
	        });
	    })
	
		
		
		function doConsumtion() {
			var uId = window.location.search.substring(window.location.search.indexOf("=")+1);
			console.info("uId");
			window.location.href = "${pageContext.request.contextPath}/credit/creditConsumption1?uId="+uId;
		}
		function doHistory() {
			var uId = window.location.search.substring(window.location.search.indexOf("=")+1);
			console.info("uId");
			console.info("doHistory");
			window.location.href = "${pageContext.request.contextPath}/credit/creditHistoryBuy?uId="+uId;
		}
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>
	<div id="toolbar" class="btn-group">
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doConsumtion();" >
			<span >消费记录明细</span>
		</a>
		&nbsp;&nbsp;&nbsp;&nbsp;		
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doHistory();" >
			<span >历史购买订单</span>
		</a>
	</div>
	