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
<%
	response.setContentType("text/html;charset=utf-8");
	request.setCharacterEncoding("utf-8");
%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="refresh" content="2;url=login.jsp">

<base href="<%=basePath%>">

<title>logout</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/style.css">
<style type="text/css">
.text {
	font-family: "微软雅黑";
	font-style: normal;
	color:#CCC;
}
</style>

</head>

<body>
	<%
		Object isLogin = session.getAttribute("userid");
		if (isLogin == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<div align="center" class="text">
		注销成功，2秒后回到登录页面...
		<%
		session.invalidate();
	%>
	</div>
</body>
</html>
