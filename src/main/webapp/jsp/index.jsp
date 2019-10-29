<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSP 标准标签库（JSTL） -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--  constant宣言-->
<%@ page import="com.huiwl.util.constant.LoginConstant"%>

<!-- 画面变量的宣言 -->

<html>
<head>
<title>主页</title>
</head>

<body>
	<c:out value="welcome! ${loginWebDto.userName}"></c:out>
	<div>
		<a href="">分页</a>
	</div>
</body>
</html>