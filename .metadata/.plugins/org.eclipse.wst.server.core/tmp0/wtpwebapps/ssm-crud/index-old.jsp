<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<% pageContext.setAttribute("APP_PATH",request.getContextPath()); %>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 	<button class="btn btn-info">注册游戏</button> -->
	<div>
		<select id="test">
			<option selected value="1">关羽</option>
			<option value="2">赵云</option>
			<option value="3">马超</option>
			<option value="4">黄忠</option>
			<option value="5">张飞</option>
		</select>
	</div>
	<div>
		<input type="text" id="sel_text"/><input type='button' value='设置选项' onclick="fun()"/>
	</div>

<script type="text/javascript">
function fun(){
    str = document.getElementById("sel_text").value;
    obj = document.getElementById("test");
    for(i=0;i<obj.length;i++){
        if(obj[i].value==str)
            obj[i].selected = true;
    }
}
</script>
</body>
</html>