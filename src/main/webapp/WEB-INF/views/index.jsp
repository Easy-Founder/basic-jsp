<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>JSP Demo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index_style.css" type="text/css">
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>--%>
</head>
<body>
<div id="div_1">
    <input type="text" <%--style="height:100px;width:90%"--%> id="input_1"/>
</div>
<div id="dev_2">
    <input type="button" value="Click here" id="input_2"/>
</div>
<div id="dev_3">
    <img src="${pageContext.request.contextPath}/images/subway.jpg" alt="img"/>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</html>