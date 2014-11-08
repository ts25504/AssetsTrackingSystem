<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

</head>
<script type="text/javascript" src="WEB-INF/jquery-1.9.0.js"></script>
<script>
	function check() {
		if (document.getElementById("username") == null) {
			alert("用户名不能为空");
		}

		if (document.getElementById("pwd") == null) {
			alert("密码不能为空");
		}
	}
	
	$(document).ready(function(){
	
	$("#username").blur();
	});
</script>

<body>
	<h1>test1</h1>
	用户名：
	<input type="text" id="username" name="username"> 密码：
	<input type="text" id="pwd" name="pwd">
	<input type="button" value="登陆" onclick="check">
	<br>
</body>
</html>
