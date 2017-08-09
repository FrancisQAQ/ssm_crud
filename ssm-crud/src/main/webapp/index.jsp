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

<!-- 	员工编辑 -->
	<div class="modal fade" id="emp_edit_modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改员工信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="emp_edit_form">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">lastName</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="empName_edit_p"></p>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">email</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="empEmail" id="empEmail_edit_input"
									placeholder="empEmail@qq.com" >
									<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">gender</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="empGender" id="genderM" value="M" checked="checked">
									男
								</label> <label class="radio-inline"> <input type="radio"
									name="empGender" id="genderF" value="F">
									女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">department</label>
							<div class="col-sm-3">
								<select class="form-control" id="dept_edit_select" name="dId">
									
								</select>
							</div>
						</div>
						
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="emp_edit_modal_save">保存修改</button>
				</div>
			</div>
		</div>
	</div>


<!-- 	员工添加 -->
	<div class="modal fade" id="emp_add_modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加新员工</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="emp_add_form">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">lastName</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="empName" id="empName_add_input"
									placeholder="empName">
									<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">email</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="empEmail" id="empEmail_add_input"
									placeholder="empEmail@qq.com" >
									<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">gender</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="empGender" id="genderM" value="M" checked="checked">
									男
								</label> <label class="radio-inline"> <input type="radio"
									name="empGender" id="genderF" value="F">
									女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">department</label>
							<div class="col-sm-3">
								<select class="form-control" id="dept_add_select" name="dId">
									
								</select>
							</div>
						</div>
						
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="emp_add_modal_save">保存</button>
				</div>
			</div>
		</div>
	</div>

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
				<button class="btn btn-primary " id="emp_add">新增</button>
				<button class="btn btn-danger " id="emp_delete">删除</button>
			</div>
		</div>
		<!-- 数据 -->
		<div class="row">
			<table class="table table-hover" id="emps_table">
				<thead>
					<tr>
						<th><input type="checkbox" class="check_all"/></th>
						<th>#</th>
						<th>lastName</th>
						<th>gender</th>
						<th>email</th>					
						<th>deptName</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>

				</tbody>

			</table>
		</div>
		<!-- 分页栏 -->
		<div class="row">
			<div class="col-md-6" id="recordInfo"></div>
			<!--//查询到的记录信息 -->
			<div class="col-md-6" id="splitArea">
				<nav aria-label="Page navigation">
					<ul class="pagination" id="pagination">
<!-- 						<li><a href="#" aria-label="Previous"> <span -->
<!-- 							aria-hidden="true">&laquo;</span> -->
<!-- 						</a></li> -->
<!-- 						<li><a href="#">1</a></li> -->
<!-- 						<li><a href="#">2</a></li> -->
<!-- 						<li><a href="#">3</a></li> -->
<!-- 						<li><a href="#">4</a></li> -->
<!-- 						<li><a href="#">5</a></li> -->
<!-- 						<li><a href="#" aria-label="Next"> <span -->
<!-- 							aria-hidden="true">&raquo;</span> -->
<!-- 						</a></li> -->
					</ul>
				</nav>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var totalRecord,currPage;
		var currDept;
		//1.页面加载完毕之后直接发送ajax请求，要到分页数据
		$(function(){
			to_page(1);
		});
		
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/emps",
				data:"pn=" + pn,
				type: "GET",
				success:function(result){
					totalRecord = result.extend.pageInfo.total;
					currPage = result.extend.pageInfo.pageNum;
					//console.log(result);
					//1.解析并显示员工数据
					build_emps_table(result);
					//2.解析并显示分页数据
					build_emps_page(result);
					//3.解析并显示分页栏数据
					build_emps_pagination(result);
				}
			});
		}
		
		function build_emps_table(result){
			$("#emps_table tbody").empty();
			var emps = result.extend.pageInfo.list;
			$.each(emps,function(index,emp){
				var empCheck = $("<td></td>").append("<input type=\"checkbox\" class=\"empCheck\"/>")
				var empId = $("<td></td>").append(emp.empId);
				var empName = $("<td></td>").append(emp.empName);
				var empGender = $("<td></td>").append((emp.empGender == "M" ? "男" : "女"));
				var empEmail = $("<td></td>").append(emp.empEmail);
				var deptName = $("<td></td>").append(emp.dept.deptName);
				var operation = $("<td></td>");
				/**
				<button class="btn btn-primary btn-sm">
								<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
							</button>
							<button class="btn btn-danger btn-sm">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
							</button>
				*/
				var button_edit = $("<button></button>").addClass("btn btn-primary btn-sm emp_edit").append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑").attr("emp_id",emp.empId);
				var button_delete = $("<button></button>").addClass("btn btn-danger btn-sm emp_delete").append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除").attr("emp_id",emp.empId);
				operation.append(button_edit).append(" ").append(button_delete);
				
				
				$("<tr></tr>").append(empCheck)
				.append(empId)
				.append(empName)
				.append(empGender)
				.append(empEmail)								
				.append(deptName)
				.append(operation)
				.appendTo("#emps_table tbody");
			});
		}
		
		function build_emps_page(result){
			$("#recordInfo").empty();
			var pageInfo = result.extend.pageInfo;
			var recordInfo = $("#recordInfo");
			recordInfo.append("当前第 " + pageInfo.pageNum + " 页")
			.append("，共有 " + pageInfo.pages + " 页")
			.append(",总计 " + pageInfo.total + " 条记录");
		}
		
		function build_emps_pagination(result){
			$("#pagination").empty();
			var navigatepageNums = result.extend.pageInfo.navigatepageNums;
			var pagination = $("#pagination");
			var firstPage = $("<li></li>").append($("<a></a>").attr("href","#").append("首页"));
			var previousPage = $("<li></li>")
			
			
			.append(
					$("<a></a>").attr("href","#").attr("aria-label","Previous")
						.append(
								$("<span></span>").attr("aria-hidden","true")
									.append("&laquo;")
					   		   )
				   );
			
			if(result.extend.pageInfo.hasPreviousPage == false){
				firstPage.addClass("disabled");
				previousPage.addClass("disabled");
			}else{
				firstPage.click(
						function(){
							to_page(1);
						});
				previousPage.click(function(){
					to_page(result.extend.pageInfo.pageNum - 1);
				});
			}
			
			pagination.append(firstPage).append(previousPage);
			
			$.each( navigatepageNums, function(i, temp){
				var midPage = $("<li></li>").append($("<a></a>").attr("href","#").append(temp));
				if(temp == result.extend.pageInfo.pageNum){
					midPage.addClass("active");
				}
				pagination.append(midPage);
				midPage.click(function(){
					to_page(temp);
				})
				
				});
			
			
			var nextPage = $("<li></li>")
			.append(
					$("<a></a>").attr("href","#").attr("aria-label","Previous")
						.append(
								$("<span></span>").attr("aria-hidden","true")
									.append("&raquo;")
					   		   )
				   );		
			var lastPage = $("<li></li>").append($("<a></a>").attr("href","#").append("末页"));
			
			if(result.extend.pageInfo.hasNextPage == false){
				nextPage.addClass("disabled");
				lastPage.addClass("disabled");
			}else{
				nextPage.click(
						function(){
							to_page(result.extend.pageInfo.pageNum + 1);
						}
						);
				lastPage.click(
						function(){
							to_page(result.extend.pageInfo.pages);
						});
			}
			pagination.append(nextPage).append(lastPage);
			
		}
		
		$("#emp_add").click(function(){
			$("#emp_add_modal form")[0].reset();
			$("#empName_add_input").parent().removeClass("has-success has-error");
			$("#empName_add_input").next("span").text("");
			$("#empEmail_add_input").parent().removeClass("has-success has-error");
			$("#empEmail_add_input").next("span").text("");
			
			//弹出模态框
			$("#emp_add_modal").modal(
					{
						backdrop : "static"
					}
			);
			getDepts("#dept_add_select");
			
		});
		
		
		//查询出下拉列表的部门信息
		function getDepts(ele){
			$.ajax({
				type: "GET",
				url: "${APP_PATH}/depts",
				success: function(result){
					
					var depts = result.extend.depts;
					$(ele).empty();
					$(ele).append($("<option></option>").attr("value",10).append("待显示页面"));
					$.each(depts,function(index,dept){
						if(dept.deptId == currDept){
							$(ele).append($("<option></option>").attr("selected",true).attr("value",dept.deptId).append(dept.deptName));
						}else{
							$(ele).append($("<option></option>").attr("value",dept.deptId).append(dept.deptName));
						}
					});
					//currDept = 0;
					
				}
			});
		}
		
		$("#empName_add_input").change(function(){
			alert("empName=" + this.value);
			$.ajax({
				type:"GET",
				url:"${APP_PATH}/judgeEmpName",
				data:"empName=" + this.value,
				success:function(result){
					var reason = result.reason;
					if(reason == "处理成功"){
						show_validate_msg("#empName_add_input","success","");
						$("#emp_add").attr("ajax-va","success");
					}else if(reason == "处理失败"){
						show_validate_msg("#empName_add_input","error",result.extend.val_msg);
						$("#emp_add").attr("ajax-va","error");
					}
				}
			});
		});
		
		//保存新员工信息
		$("#emp_add_modal_save").click(function(){
			//1.首先校验一下员工信息格式是否正确
			if(!validateEmpInfo()){
				return false;
			}
			if($("#emp_add").attr("ajax-va") == "error"){
				show_validate_msg("#empName_add_input","error","用户名已存在");
				return false;
			}
			//2.发送增加员工的ajax请求
			saveEmp();
		});
		
		function validateEmpInfo(){
 			var empName = $("#empName_add_input").val();
 			var regEmpName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
 			if(!regEmpName.test(empName)){
 				show_validate_msg("#empName_add_input","error","用户名格式错误，正确格式：6~16位字母、数字或者下划线，2~5位中文");
 				return false;
 			}else {
 				show_validate_msg("#empName_add_input","success","");
 				
 			}	
 			
 			var empEmail = $("#empEmail_add_input").val();
	 		var regEmpEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	 		if(!regEmpEmail.test(empEmail)){
	 			show_validate_msg("#empEmail_add_input","error","邮箱格式不正确");
	 			//alert("邮箱格式不正确");
	 			return false;
	 		}else{
	 			show_validate_msg("#empEmail_add_input","success","");
	 		}
			return true;
		}
		
		
		function show_validate_msg(column,status,msg){
			$(column).parent().removeClass("has-success has-error");
			$(column).next("span").text("");
			if(status == "success"){
				$(column).parent().addClass("has-success");
				$(column).next("span").text(msg);
			}else if(status = "error"){
				$(column).parent().addClass("has-error");
				$(column).next("span").text(msg);
			}
		}
		
		function saveEmp(){
			$.ajax({
				type:"POST",
				url:"${APP_PATH}/emp",
				data:$("#emp_add_form").serialize(),
				success:function(result){
					
					if(result.reason == "处理失败"){
						if(result.extend.errorMsg.empName != undefined){
							show_validate_msg("#empName_add_input","error",result.extend.errorMsg.empName);
						}
						if(result.extend.errorMsg.empEmail != undefined){
							show_validate_msg("#empEmail_add_input","error",result.extend.errorMsg.empEmail);
						}
						console.log(result);
					}else {
						$("#emp_add_modal").modal('hide');
						to_page(totalRecord);
					}
					

					//alert(result.reason);
				}
			});
		}
		
		//1.绑定click事件是在编辑元素创建出来之前进行的，所以无法成功
		//2.Jquery新版本去掉了live方法，用on方法替代
		$(document).on("click",".emp_edit",function(){
			$("#emp_edit_modal_save").attr("emp_id",$(this).attr("emp_id"));
			//1.获取员工信息并填充到编辑员工模态框中
			getEmpData($(this).attr("emp_id"));
			
			//2.显示模态框
			$("#emp_edit_modal").modal(
					{
						backdrop : "static"
					}
			);
			
		});
		
		function getEmpData(empId){
			$.ajax({
				type:"GET",
				url:"${APP_PATH}/emp/" + empId,
				success:function(result){
					var empData = result.extend.empData;
					$("#empName_edit_p").text(empData.empName);
					$("#empEmail_edit_input").val(empData.empEmail);
					$("#emp_edit_modal input[name=empGender]").val([empData.empGender]);
					//currDept = empData.dId;
					//alert(".dept_edit_select").val();
					 
		            var depts = result.extend.depts;
					$(dept_edit_select).empty();
					$(dept_edit_select).append($("<option></option>").attr("value",10).append("待显示页面"));
// 					alert("dept.deptId:" + dept.deptId);
// 					alert("empData.dId:" + empData.dId);
					$.each(depts,function(index,dept){
						if(dept.deptId == empData.dId){
							$(dept_edit_select).append($("<option></option>").attr("selected",true).attr("value",dept.deptId).append(dept.deptName));
						}else{
							$(dept_edit_select).append($("<option></option>").attr("value",dept.deptId).append(dept.deptName));
						}
					});
// 					$(".dept_edit_select").find("option[value=2]").attr("selected",true);
					console.log(result);
					
				}
			});
		}
		
		$("#emp_edit_modal_save").click(function(){
			$.ajax({
				type:"PUT",
				url:"${APP_PATH}/emp/" + $(this).attr("emp_id"),
				data:$("#emp_edit_form").serialize(),
				success:function(result){
					$("#emp_edit_modal").modal("hide");
					to_page(currPage);
				}
			});
			console.log($("#emp_edit_form").serialize());
		});
		
		
		$(document).on("click",".emp_delete",function(){
			var empName = $(this).parents("tr").find("td:eq(2)").text();
			var empId = $(this).attr("emp_id");
			if(confirm("确认删除【" + empName + "】吗？")){
				$.ajax({
					type:"DELETE",
					url:"${APP_PATH}/emp/" + empId,
					success:function(success){
						console.log(success);
						to_page(currPage);
					}
				});
			}
		});
		
		//全选选定按钮点击时间
		$(".check_all").click(function(){
			$(".empCheck").prop("checked",$(this).prop("checked"));
		});
		
		$(document).on("click",".empCheck",function(){
			var flag = $(".empCheck:checked").length == $(".empCheck").length;
				$(".check_all").prop("checked",flag);
		});
	</script>
</body>
</html>