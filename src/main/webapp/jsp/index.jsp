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
<link rel="stylesheet" href="static/css/index.css">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="common/js/bootstrap.min.js"></script>

<c:set var="userList" value="${ IndexWebDto.userList}"></c:set>

</head>

<body>
	<div class="page">分页</div>
	<div style="width: 50em; height: 50em;float:center;">
		<table>
			<caption>用户信息</caption>
			<tr>
				<th id="userId">ID</th>
				<th id="userName">NAME</th>
			</tr>
			<c:forEach var="user" items="${ userList }" varStatus="status">
				<tr>
					<td><c:out value="${user.id}"></c:out></td>
					<td><c:out value="${user.name}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<ul class="pagination">
		<li><a href="?start=0">首页</a></li>
		<li><a href="?">上一页</a></li>
		<li><a href="?">下一页</a></li>
		<li><a href="?">末页</a></li>
	</ul>

</body>
</html>