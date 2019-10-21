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



</head>

<body>
	<div id="particles-js">
		<div class="login">
			<div class="login-top">登录</div>
			<div class="login-center clearfix">
				<div class="login-center-img">
					<img src="images/name.png" />
				</div>
				<div class="login-center-input">
					<input type="text" name="" value="" placeholder="用户名"
						onfocus="this.placeholder=''" onblur="this.placeholder='用户名'" />
					<div class="login-center-input-text">用户名</div>
				</div>
			</div>
			<div class="login-center clearfix">
				<div class="login-center-img">
					<img src="images/password.png" />
				</div>
				<div class="login-center-input">
					<input type="password" name="" value="" placeholder="密码"
						onfocus="this.placeholder=''" onblur="this.placeholder='密码'" />
					<div class="login-center-input-text">密码</div>
				</div>
			</div>
			<div class="login-button">登录</div>
		</div>
		<!-- <div class="sk-rotating-plane"></div> -->
		<script type="text/javascript" src="js/particles.min.js"></script>
		<script type="text/javascript" src="js/app.js"></script>
		<script type="text/javascript" src="js/login.js"></script>
	</div>

</body>

</html>
