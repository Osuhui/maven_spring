<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSP 标准标签库（JSTL） -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--  constant宣言-->
<%@ page import="com.huiwl.util.constant.LoginConstant"%>

<!-- 画面变量的宣言 -->

<!DOCTYPE HTML>
<html lang="zh">
<head>

<title>主页</title>

<!-- 导入JQuery库 -->
<script type="text/javascript" src="common/js/jquery-3.4.1.min.js"></script>

<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="common/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/css/index.css">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="common/js/bootstrap.min.js"></script>

</head>

<body>
	<c:out value="welcome! ${loginWebDto.userName}"></c:out>
	<div class = "page">分页</div>
	<ul class="pagination">
		<li><a href="#">&laquo;</a></li>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#">&raquo;</a></li>
	</ul>

</body>
</html>