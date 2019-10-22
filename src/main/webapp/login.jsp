<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSP 标准标签库（JSTL） -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--  constant宣言-->
<%@ page import="com.huiwl.util.constant.LoginConstant"%>

<!-- 画面变量的宣言 -->
<c:set var="loginWebdto" value="${LoginWebDto}"></c:set>

<html>
<head>

<!-- 导入外部css式样 -->
<link rel="stylesheet" media="screen" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/reset.css" />

<!-- 导入JQuery库 -->
<!-- <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
<script type="text/javascript" src="common/js/jquery-3.4.1.min.js"></script>
<!-- 导入js文件 -->
<script type="text/javascript" src="js/particles.min.js"></script>

<script type="text/javascript" src="js/login.js"></script>


</head>

<body>
	<div id="particles-js">
		<form class="login" action="login" method="post">
			<div class="login-top">登录</div>

			<div class="login-center clearfix">
				<div class="login-center-img">
					<img src="images/name.png" />
				</div>
				<div class="login-center-input">
					<input type="text" id="login-userName" name="userName"
						value="<c:out value="${loginWebdto.userName }"></c:out>"
						placeholder="用户名" onfocus="this.placeholder=''"
						onblur="this.placeholder='用户名'" />
					<div class="login-center-input-text">用户名</div>
				</div>
			</div>

			<div class="login-center clearfix">
				<div class="login-center-img">
					<img src="images/password.png" />
				</div>
				<div class="login-center-input">
					<input type="password" id="login-userPwd" name="userPwd"
						value="<c:out value="${loginWebdto.userPwd }"></c:out>"
						placeholder="密码" onfocus="this.placeholder=''"
						onblur="this.placeholder='密码'" />
					<div class="login-center-input-text">密码</div>
				</div>

			</div>
			<div class="login-center clearfix">
				<button class="login-button" onclick="login()">登录</button>
			</div>

		</form>
	</div>
	<script type="text/javascript" src="js/app.js"></script>
</body>

</html>
