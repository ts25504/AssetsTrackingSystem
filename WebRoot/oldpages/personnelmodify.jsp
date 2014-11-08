<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	response.setContentType("text/html;charset=utf-8");
	request.setCharacterEncoding("utf-8");
%>
<link href="css/myindexcss.css" rel="stylesheet" style="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<title>固定资产管理系统——修改人员</title>
<body background="images/bj.jpg">
	<%
		Object isLogin = session.getAttribute("userid");
		if (isLogin == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<div id="container">
		<div id="header">
			<h1 class="center">固定资产管理系统</h1>
			<a href="logout.jsp">注销</a> <a href="index.jsp">首页</a> <a
				href="about.jsp">关于</a>
		</div>
		<div id="menu">
			<%!String authority;%>
			<ul>
				<li>
					<h3>人员信息</h3>
					<ul>
						<%
							authority = (String) session.getAttribute("authority");
							if (authority != null && authority.equals("admin")) {
						%>
						<li><a href="personneladd.jsp">增加人员</a>
						</li>
						<li><a href="personnelmodify.jsp">修改人员</a>
						</li>
						<li><a href="personneldelete.jsp">删除人员</a>
						</li>
						<%
							}
						%>
						<li><a href="personnel_show.action">查看人员</a>
						</li>
					</ul></li>
				<li>
					<h3>部门信息</h3>
					<ul>
						<%
							authority = (String) session.getAttribute("authority");
							if (authority != null && authority.equals("admin")) {
						%>
						<li><a href="depadd.jsp">增加部门</a>
						</li>
						<li><a href="depmodify.jsp">修改部门</a>
						</li>
						<li><a href="depdelete.jsp">删除部门</a>
						</li>
						<%
							}
						%>
						<li><a href="dep_show.action">查看部门</a>
						</li>
					</ul></li>
				<li>
					<h3>资产信息</h3>
					<ul>
						<%
							authority = (String) session.getAttribute("authority");
							if (authority != null && authority.equals("admin")) {
						%>
						<li><a href="assetsadd.jsp">增加资产</a>
						</li>
						<li><a href="assetsmodify.jsp">修改资产</a>
						</li>
						<li><a href="assetsdelete.jsp">删除资产</a>
						</li>
						<%
							}
						%>
						<li><a href="assets_show.action">查看资产</a>
						</li>
					</ul></li>
				<li>
					<h3>合同信息</h3>
					<ul>
						<%
							authority = (String) session.getAttribute("authority");
							if (authority != null && authority.equals("admin")) {
						%>
						<li><a href="purchaseadd.jsp">增加合同</a>
						</li>
						<li><a href="purchasemodify.jsp">修改合同</a>
						</li>
						<li><a href="purchasedelete.jsp">删除合同</a>
						</li>
						<%
							}
						%>
						<li><a href="purchase_show.action">查看合同</a>
						</li>
					</ul></li>
				<li>
					<h3>报表信息</h3>
					<ul>
						<li><a href="compform.action">公司报表</a>
						</li>
						<li><a href="depform.action">部门报表</a>
						</li>
						<li><a href="personnelform.action">个人报表</a>
						</li>
					</ul></li>
			</ul>
		</div>
		<div id="content">
			<form action="personnel_modify.action" method="get">
				<table>

					<tr>
						<td>id:</td>
						<td><input name="id" type="text" class="textfield"
							id="textfield7">
						</td>
					</tr>
					<tr>

						<td>name:</td>
						<td><input name="personnelName" type="text" class="textfield"
							id="textfield"></td>
					</tr>
					<tr>
						<td>pwd:</td>
						<td><input name="personnelPwd" type="password"
							class="textfield" id="textfield2">
						</td>
					</tr>
					<tr>
						<td>sex:</td>
						<td><input name="personnelSex" type="text" class="textfield"
							id="textfield3">
						</td>
					</tr>
					<tr>
						<td>position:</td>
						<td><input name="personnelPositon" type="text"
							class="textfield" id="textfield4">
						</td>
					</tr>
					<tr>
						<td>phone:</td>
						<td><input name="personnelPhone" type="text"
							class="textfield" id="textfield5">
						</td>
					</tr>
					<tr>
						<td>pole</td>
						<td><input name="personnelPole" type="text" class="textfield"
							id="textfield6">
						</td>
					</tr>
					<tr>
						<td>dep_id</td>
						<td><input name="dep_id" type="text" class="textfield"
							id="textfield7">
						</td>
					</tr>

					<tr>
						<td height="55" colspan="2"><input name="button"
							type="submit" class="indexbutton" id="button" value="提交">
						</td>
					</tr>
				</table>
			</form>

		</div>
		<div id="footer">
			<div id="link">
				<span>关于我们</span><span>版权声明</span><span>联系我们</span><span>网站声明</span><span>来购联盟</span>Copyright
				CSU<br> COPYRIGHT (C) 2004-2007 DUTYFREE24 DONGWHA.All Rights
				Reserved.
			</div>
		</div>
	</div>

</body>
</html>