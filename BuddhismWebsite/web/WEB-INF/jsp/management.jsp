<%-- 
    Document   : success
    Created on : 2012-4-18, 16:36:40
    Author     : Trine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title>管理</title>
</head>
    <body>
        <s:if test="#session.User == null">
            请以管理员身份登入。
        </s:if>
        <s:else>
        <div class="wrapper">
            <%@ include file="/jsp/banner_nav.jsp" %>
            <table border="0">
                <tr>
                    <th>文章ID&nbsp;&nbsp;</th>
                    <th>文章名称&nbsp;&nbsp; </th>
                    <th>文章类型&nbsp;&nbsp; </th>
                    <th>文章内容&nbsp;&nbsp; </th>
                    <th>设置&nbsp;&nbsp;</th>
                </tr>
                <s:iterator value="posts" id="singlePost">
                    <tr>
                        <td><s:property value="#singlePost.id"/></td>
                        <td><s:property value="#singlePost.postTitle"/></td>
                        <td><s:property value="#singlePost.type"/></td>
                        <td><s:property value="#singlePost.postContent"/></td>
                        <s:if test="#singlePost.postMedia == true">
                            <td>
                                <s:form action="UpAction.action">
                                    <s:hidden name="title" value="%{#singlePost.postTitle}" />
                                <s:if test="#singlePost.postUp == true">
                                    <s:hidden name="isUp" value="false"/>
                                    <s:submit value="取消放于首页"/>
                                </s:if>
                                <s:else>
                                    <s:hidden name="isUp" value="true"/>
                                    <s:submit value="放于首页"/>
                                </s:else>
                                </s:form>
                            </td>
                        </s:if>
                    </tr>
                </s:iterator>
            </table>
            <s:form action="managementAction.action">
                <s:if test="#currentIndex != #maxPage">
                    <s:submit value="下一页" align="right" method="nextPage" />
                </s:if>
                <s:if test="currentIndex != 0">
                    <s:submit value="上一页" align="left" method="previousPage"/>
                </s:if>
                <s:submit value="新建文章"  action="newPage"/>    
                <s:if test="#session.User.adLevel == 0">
                    <s:a href="register.jsp">新建管理员</s:a>
                </s:if>
                <s:submit value="登出" action="logOut"/>
            </s:form>
            <%@include  file="/jsp/footer.jsp" %>
        </div>
        </s:else>
    </body>
</html>