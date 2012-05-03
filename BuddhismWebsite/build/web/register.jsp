<%-- 
    Document   : newAdminstration
    Created on : 2012-5-3, 14:51:34
    Author     : Trine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title>加入我们</title>
</head>
    <body>
        <div class="wrapper">
        <%@ include file="/jsp/banner_nav.jsp" %>
        <s:form action="register.action">
            <s:textfield name="userName" label="用户名" required="true"/>
            <s:password name="password" label="密码" required="true"/>
            <s:password name="passwordAck" label="确认密码" required="true"/>
            <s:submit value="注册"/>
            <s:submit value="取消" method="cancel"/>
        </s:form>
        
        <%@include  file="/jsp/footer.jsp" %>
</div>
    </body>
</html>