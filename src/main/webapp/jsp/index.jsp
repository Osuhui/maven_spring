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
<title>主页</title>
</head>

<body>
	<%=LoginConstant.LOGIN%>
	<c:out value="${loginWebdto.userName}"></c:out>
</body>
</html>