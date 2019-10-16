<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.huiwl.dto.webDto.LoginWebDto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<style type="text/css">
body {
	background-image: url(static/images/005.png);
	background-size: cover;
}

#center_div {
	width: 400px;
	height: 200px;
	background-color:;
	position: fixed;
}

#login_table {
	vertical-align: middle;
	margin: auto;
}
</style>

<script>
	window.onload = function() {
		var center_div = document.getElementById("center_div");//获取div块对象
		var height_browser = document.documentElement.clientHeight;//取得浏览器页面可视区域的宽度
		var width_browser = document.documentElement.clientWidth;//取得浏览器页面可视区域的宽度
		var height_div = center_div.offsetHeight;//获取div块的高度值
		var width_div = center_div.offsetWidth;//获取div块的宽度值
		center_div.style.top = (height_browser - height_div) / 2 + "px";
		center_div.style.left = (width_browser - width_div) / 2 + "px";

	}
</script>
<body>
	<form action="login" method="post">
		<div id="center_div">
			<table id="login_table">
				<tr>
					<td>用户名：</td>
					<td><input name="userName" type="text" value="" maxlength="20"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input name="userPwd" type="password" value=""
						maxlength="20"></td>
				</tr>
			</table>
			<div style="text-align: center; margin: auto;">
				<button type="submit">登录</button>
				<button type="reset">重置</button>
			</div>

		</div>

	</form>
</body>
</html>
