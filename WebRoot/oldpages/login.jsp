<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
 %>
<style type="text/css">
#login {
	font-family: "黑体";
}

.password {
	font-family: 黑体;
}

#login2 div {
	font-family: "黑体";
	font-size: 24px;
	position: static;
}

.logintable {
	position: absolute;
}

.botton {
	left: 30%;
	top: 5%;
	height: 25px;
	width: 100px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>固定资产管理系统——登录</title>
</head>
<script type="text/javascript" src="jquery-1.4.2.js"></script>
<script>
$(function(){
	$("#userid").focus(function(){
		$(this).css("background-color","#FFCCCC");
		
		});
		$("#pwd").focus(function(){
			$(this).css("background-color","#FFCCCC");
			});
	$("#userid").click(function(){
		if(!(this).val){
			$(".nametip").html("用户名不能为空").css("color","red");
		}else if(this.val)
		{
			$(".nametip").hide(2000);
		}
		
			
});

	$("#pwd").click(function(){
		
		if(!(this).val){
		$(".pwdtip").html("密码不能为空").css("color","red");
		}
		if(this.val){
			$(".pwdtip").hide(2000);
		}
		
		 
			
		});
	});
</script>
<body background="images/bg.png" topmargin="20%"
	style="background-repeat:no-repeat; background-position:center;">

	<div align="center"></div>
	<div align="center">
		<table>
			<tr>
				<td colspan="2" id="login2"><div align="center"
						class="password">固定资产管理系统</div>
				</td>
			</tr>
			<form action="login.action" method="post">
				<tr>
					<td width="78" id="login"><div align="right">工号：</div>
					</td>
					<td width="227"><input type="text" name="userid" id="userid">
					</td>
					<td><span class="nametip"></span></td>
				</tr>

				<tr>
					<td height="43" class="password"><div align="right">密码：</div>
					</td>
					<td><input type="password" name="password" id="pwd">
					</td>
					<td><span class="pwdtip"></span></td>
				</tr>
				<tr>
					<td height="51" colspan="2">
						<div align="center">
								<div>
									<input type="submit" class="botton" value="登陆"> <input
										type="reset" class="botton" value="重置">
								</div>
						</div>
					</td>
				</tr>
	
			</form>
		</table>
	</div>
</body>
</html>