<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    Integer pemissionNo = (Integer)request.getSession().getAttribute("pemissionNo");
%>
<!DOCTYPE html>
<html>
	<body onload="index()">
		<p>跳转中...</p>
		<form action="" method="post">
		</form>
	</body>
	<script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
	<script type="text/javascript">
		<%-- var basePath = "<%=basePath%>"; --%>
		var basePath = "http://192.168.31.149:8080/Travel/"
		//登录页面跳转
		function index(){
			var form = document.forms[0];
			form.action = basePath+"menu/index";
			form.method="GET";
			form.submit();
		}
	</script>
</html>

