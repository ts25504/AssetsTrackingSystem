<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	response.setContentType("text/html;charset=utf-8");
	request.setCharacterEncoding("utf-8");
%>
<script type="text/javascript">
	function jianyan() {
		var name = document.form1.userid.value;
		var mima = document.form1.password.value;
		if (name == "") {
			alert("用户名不能为空！");
			return false;
		} else {
			if (mima == "") {
				alert("密码不能为空");
				return false;
			} else
				return true;
		}
	}
</script>



<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>固定资产管理系统——登录</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
 <form name="form1" action="login.action" method="post" class="login" onsubmit="return jianyan()"> 
    <p>
      <label for="login">userid</label>
      <input type="text" name="userid" id="login">
    </p>

    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password">
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

   
  </form>

  <section class="about">
   
    <p class="about-author">
      &copy; 2012&ndash;2013 <a href="http://thibaut.me" target="_blank">Thibaut Courouble</a> -
      <a href="http://www.cssflow.com/mit-license" target="_blank">MIT License</a><br>
      Original PSD by <a href="http://365psd.com/day/2-234/" target="_blank">Rich McNabb</a>
  </section>
</body>
</html>