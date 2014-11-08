<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	if (isLogin == null) {
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
				href="about.jsp"> <i class="icon icon-envelope"></i>about</a></li>
			<li class="btn btn-inverse"><a title="" href="logout.jsp"> <i
					class="icon icon-share-alt"></i> <span class="text">Logout</span> </a>
			</li>
		</ul>
	</div>

	<div id="sidebar">
		<ul>
			<li><a href="index.jsp"><i class="icon icon-home"></i> <span>首页</span>
			</a>
			</li>
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>人员信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="personneladd.jsp">增加人员</a>
					</li>
					<li><a href="personnelmodify.jsp">修改人员</a>
					</li>
					<li><a href="personneldelete.jsp">删除人员</a>
					</li>
					<li><a href="personnel_show.action">查看人员</a>
					</li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-tint"></i>
					<span>部门信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="depadd.jsp">增加部门</a>
					</li>
					<li><a href="depmodify.jsp">修改部门</a>
					</li>
					<li><a href="depdelete.jsp">删除部门</a>
					</li>
					<li><a href="dep_show.action">查看部门</a>
					</li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-pencil"></i>
					<span>资产信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="assetsadd.jsp">增加资产</a>
					</li>
					<li><a href="assetsmodify.jsp">修改资产</a>
					</li>
					<li><a href="assetsdelete.jsp">删除资产</a>
					</li>
					<li><a href="assets_show.action">查看资产</a>
					</li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon icon-th"></i>
					<span>合同信息</span> <span class="label">4</span> </a>
				<ul>
					<li><a href="purchaseadd.jsp">增加合同</a>
					</li>
					<li><a href="purchasemodify.jsp">修改合同</a>
					</li>
					<li><a href="purchasedelete.jsp">删除合同</a>
					</li>
					<li><a href="purchase_show.action">查看合同</a>
					</li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon icon-th"></i>
					<span>报表信息</span> <span class="label">3</span> </a>
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

	<div id="style-switcher">
		<i class="icon-arrow-left icon-white"></i> <span>Style:</span> <a
			href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
		<a href="#blue" style="background-color: #2D2F57;"></a> <a href="#red"
			style="background-color: #673232;"></a>
	</div>

	<div id="content">
		<div id="content-header">
			<h1></h1>

		</div>
		<div id="breadcrumb">
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i>about</a> <a href="#" class="current">公司简介:</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">

							<h4>公司名称</h4>
						</div>

						<div class="widget-content nopadding">
							<p style="color: black;font-style:inherit;">唐氏软件开发公司</p>
						</div>
						<div class="widget-title">
							<h4>公司信息</h4>
						</div>
						<div class="widget-content nopadding">
							<p style="font-style: inherit;">&nbsp;&nbsp;唐氏软件开发公司位于湖南省长沙市岳麓山下，湘江湖畔，大学城高新技术开发区，
								本公司成立于2011年9月17日，距今已有三年的历史，是在高新技术应用领域中从事应用软件开发、
								信息安全服务的高新技术企业，本公司长期专注于物业管理、房地产、市政运营管理等相关行业的信息化领域，
								凭借多年在软件开发以及信息安全服务积累的经验，已成为该领域内首屈一指的软件开发提供商。<br>
								&nbsp;&nbsp;唐氏软件开发公司倡导“专业、高效、创新、务实”的企业精神，具有良好的内部机制，优良的工作环境，以及诱人的福利机制，吸引了
								一批又一批年轻的、有学识的人才，是本公司在当今激烈的市场竞争中立于不败之地的保障。<br> 我们可以提供：<br>
								&nbsp;&nbsp;--安全完整的软件策划和设计<br> &nbsp;&nbsp;--先进专业的技术支持<br>
								&nbsp;&nbsp;--完善、快速的售后服务
							</p>
						</div>
						<div class="widget-title">

							<h4>开发者</h4>
						</div>

						<div class="widget-content nopadding">
							<p style="font-size: medium;color: black;">
								本系统由中南大学赴广州中软国际实训中心实训第五小组开发，小组成员有：<br>
							</p>
							唐盛、帅华、王维、杨会媛、华英草、杜茂鹏
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

	<script src="js/excanvas.min.js"></script>
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.ui.custom.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<script src="js/jquery.peity.min.js"></script>
	<script src="js/fullcalendar.min.js"></script>
	<script src="js/unicorn.js"></script>
	<script src="js/unicorn.dashboard.js"></script>
</body>
</html>
