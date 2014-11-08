<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="refresh" content="2;url=index.jsp">

<title>无标题文档</title>
<link rel="stylesheet" href="css/style.css">

<style type="text/css">
.text {
	font-family: "微软雅黑";
	font-style: normal;
	color: #CCC;
}
</style>
<%
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
 %>
 
</head>

<body>
<%
		Object isLogin = session.getAttribute("userid");
		if (isLogin == null) {
			response.sendRedirect("login.jsp");
		}
	%>
<div align="center" class="text">
登陆成功！<br/>
欢迎来到固定资产管理系统
</div>
</body>
</html>