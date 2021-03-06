﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	function doDel(uId) {
		layer
				.confirm(
						'确认删除？',
						{
							btn : [ '确认', '取消' ]
						//按钮
						},
						function() {
							window.location.href = "${pageContext.request.contextPath}/user/deleteStudent?uId="
									+ uId;
						}, function() {

						});
	}

	function doUpdate(uId) {
		window.location.href = "${pageContext.request.contextPath}/user/updateStudent?uId="
				+ uId;
	}

	function dodetail(uId) {
		window.location.href = "${pageContext.request.contextPath}/credit/creditDetail?uId="
				+ uId;
	}

	function doSearch() {
		var search = $("#search").val();
		if (search == "") {
			window.location.href = "${pageContext.request.contextPath}/user/studentTable";
		} else {
			window.location.href = "${pageContext.request.contextPath}/user/searchStudent?search="
					+ search;
		}
	}

	function doAdd() {
		window.location.href = "${pageContext.request.contextPath}/user/insertStudent";
	}
</script>

<div class="table-responsive text-center">
	<form action="">
		<div>
			<div>
				<h1>会员列表</h1>
			</div>

			<div class="container">
				<div class="input-group col-xs-3">
					<input type="text" class="form-control input-sm" id="search"
						name="search"> <span
						class="input-group-addon btn btn-primary" href="javascript:;"
						onclick="doSearch();">搜索</span>
				</div>
			</div>
		</div>
		<div>
			<table class="table table-striped table-bordered">
				<tr class="demo-table-hover">
					<td>编号</td>
					<td>姓名</td>
					<td>手机</td>
					<td>性别</td>
					<td>邮箱</td>
					<td>剩余积分</td>
					<td><a class="btn btn-success btn-xs" role="button"
						href="javascript:;" onclick="doAdd();">新&nbsp;增</a></td>
				</tr>
				<c:forEach items="${pageInfo.list}" var="students">
					<tr>
						<td>${students.uId}</td>
						<td>${students.uName}</td>
						<td>${students.uPhone}</td>
						<td>${students.uSex}</td>
						<td>${students.uEmail}</td>
						<td>${students.credit}<a class="btn btn-success btn-xs"
							role="button" href="javascript:;"
							onclick="dodetail('${students.uId}');">详&nbsp;情</a>
						</td>
						<td><a class="btn btn-primary btn-xs" role="button"
							href="javascript:;" onclick="doUpdate('${students.uId}');">修改</a>
							<a class="btn btn-danger btn-xs" role="button"
							href="javascript:;" onclick="doDel('${students.uId}');">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</form>
</div>

<div class="text-center">
	<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总
		${pageInfo.total}条记录</p>
	<a class="btn btn-info" href="studentTable?pageNum=1">首&nbsp;页</a>
	<c:if test="${pageInfo.hasPreviousPage}">
		<a class="btn btn-info"
			href="studentTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
	</c:if>
	<c:if test="${pageInfo.hasNextPage}">
		<a class="btn btn-info"
			href="studentTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
	</c:if>
	<a class="btn btn-info" href="studentTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
</div>