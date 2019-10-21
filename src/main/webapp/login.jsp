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

<!-- 导入外部式样 -->
<link rel="stylesheet" href="/static/css/center.css">
<!-- 导入js文件 -->
<script src="/static/js/common.js" charset="UTF-8"></script>

</head>
<body>
	<form action="login" method="post">
		<table id="login_table" style="text-align: center; margin: auto;">
			<tr>
				<td>用户名：</td>
				<td><input name="userName" type="text"
					value="<c:out value="${loginWebdto.userName}"></c:out>"
					maxlength="20"></td>
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

		<footer style="text-align: center;">
			<c:import url="jsp/index.jsp"></c:import>
		</footer>

	</form>
</body>
</html>
