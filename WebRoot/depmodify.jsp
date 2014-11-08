<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>固定资产管理系统</title>
<%
	Object isLogin = session.getAttribute("userid");
	String authority = (String)session.getAttribute("authority");
	if (isLogin == null || authority == "user") {
		response.sendRedirect("login.jsp");
	}
%>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/unicorn.main.css" />
<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

	<div id="header"></div>


	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav btn-group">
			<li class="btn btn-inverse" id="menu-messages"><a
				href="about.jsp"> <i class="icon icon-envelope"></i>about</a>
			</li>
			<li class="btn btn-inverse"><a title="" href="logout.jsp"> <i
					class="icon icon-share-alt"></i> <span class="text">Logout</span> </a>
			</li>
		</ul>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			Dashboard</a>
		<ul>
			<li><a href="index.jsp"><i
					class="icon icon-home"></i> <span>首页</span> </a>
			</li>
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>人员管理</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="personneladd.jsp">增加人员</a></li>
					<li><a href="personnelmodify.jsp">修改人员</a></li>
					<li><a href="personneldelete.jsp">删除人员</a></li>
					<li><a href="personnel_show.action">查看人员</a></li>
				</ul></li>

			<li class="active submenu open"><a href="#"><i class="icon icon-tint"></i>
					<span>部门信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="depadd.jsp">增加部门</a></li>
					<li><a href="depmodify.jsp">修改部门</a></li>
					<li><a href="depdelete.jsp">删除部门</a></li>
					<li><a href="dep_show.action">查看部门</a></li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-pencil"></i>
					<span>资产信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="assetsadd.jsp">增加资产</a></li>
					<li><a href="assetsmodify.jsp">修改资产</a></li>
					<li><a href="assetsdelete.jsp">删除资产</a></li>
					<li><a href="assets_show.action">查看资产</a></li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon icon-th"></i>
					<span>合同信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="purchaseadd.jsp">增加合同</a></li>
					<li><a href="purchasemodify.jsp">修改合同</a></li>
					<li><a href="purchasedelete.jsp">删除合同</a></li>
					<li><a href="purchase_show.action">查看合同</a></li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon icon-th"></i>
					<span>报表信息</span> <span class="label">3</span> </a>
				<ul>
					<li><a href="compform.action">公司报表</a></li>
					<li><a href="depform.action">部门报表</a></li>
					<li><a href="personnelform.action">个人报表</a></li>
				</ul></li>
	</div>

	<div id="style-switcher">
		<i class="icon-arrow-left icon-white"></i> <span>Style:</span> <a
			href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
		<a href="#blue" style="background-color: #2D2F57;"></a> <a href="#red"
			style="background-color: #673232;"></a>
	</div>

	<div id="content">
		<div id="content-header">
			<h1>Tables</h1>

		</div>
		<div id="breadcrumb">
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>修改部门页面</h5>
						</div>
						<div class="widget-content nopadding">
							<form action="dep_modify.action" method="get" class="form-horizontal">
							<div class="control-group">
								<label class="control-label">部门ID：</label>
								<div class="controls">
									<input type="text"  name="id"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">部门名称：</label>
								<div class="controls">
									<input type="text"  name="depName" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">部门级别：</label>
								<div class="controls">
									<input type="text" name="depLeavel"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">部门经理：</label>
								<div class="controls">
									<input type="text"  name="depManager" /> 
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary"  name="button">提交</button>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div id="footer" class="span12">
					2012 &copy; Unicorn Admin. Brought to you by <a
						href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
				</div>
			</div>
		</div>


	</div>



	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.ui.custom.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.uniform.js"></script>
	<script src="js/select2.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/unicorn.js"></script>
	<script src="js/unicorn.tables.js"></script>
</body>
</html>