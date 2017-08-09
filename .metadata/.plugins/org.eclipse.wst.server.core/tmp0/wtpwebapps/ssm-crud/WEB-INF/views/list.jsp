<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<% pageContext.setAttribute("APP_PATH", request.getContextPath());%>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>SSM-CRUD</h1>
			</div>
		</div>
		<!-- 新增删除栏 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary ">新增</button>
				<button class="btn btn-danger ">删除</button>
			</div>
		</div>
		<!-- 数据 -->
		<div class="row">
			<table class="table table-hover">
				<tr>
					<th>#</th>
					<th>lastName</th>
					<th>email</th>
					<th>gender</th>
					<th>deptName</th>
					<th>操作</th>
				</tr>
				
					<c:forEach items="${pageInfo.list }" var="emp">
					<tr>
						<td>${emp.empId }</td>
						<td>${emp.empName }</td>
						<td>${emp.empEmail }</td>
						<td>${emp.empGender }</td>
						<td>${emp.dept.deptName }</td>
						<td>
							<button class="btn btn-primary btn-sm">
								<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
							</button>
							<button class="btn btn-danger btn-sm">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
							</button>
						</td>
					</tr>
					</c:forEach>

				
			</table>
		</div>
		<!-- 分页栏 -->
		<div class="row">
			<div class="col-md-6">当前第 ${pageInfo.pageNum } 页，共有  ${pageInfo.pages } 页，总计 ${pageInfo.total } 条记录</div>
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${APP_PATH }/emps?pn=1">首页</a></li>
					<c:if test="${pageInfo.isHasPreviousPage() }">
						<li>
							<a href="#" aria-label="Previous">
						 	<span aria-hidden="true">&laquo;</span>
							</a>
					</li>
					</c:if>
					
					<c:forEach items="${pageInfo.navigatepageNums }" var="temp">
						<c:if test="${temp == pageInfo.pageNum }">
							<li class="active"><a href="#">${temp }</a></li>
						</c:if>
						<c:if test="${temp != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/emps?pn=${temp }">${temp }</a></li>
						</c:if>
					</c:forEach>
					<!-- 					<li><a href="#">1</a></li> -->
<!-- 					<li><a href="#">2</a></li> -->
<!-- 					<li><a href="#">3</a></li> -->
<!-- 					<li><a href="#">4</a></li> -->
<!-- 					<li><a href="#">5</a></li> -->
					<c:if test="${pageInfo.isHasNextPage() }">
						<li>
						<a href="#" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
						</a>
						</li>
					</c:if>
					
					<li><a href="${APP_PATH }/emps?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>