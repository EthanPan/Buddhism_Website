<%-- 
    Document   : newArticle
    Created on : 2012-4-19, 14:56:25
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
    <title>管理</title>
</head>
    <body>
        <div class="wrapper">
            <%@ include file="/jsp/banner_nav.jsp" %>
            <s:form action="articleAction.action" method="post" enctype="multipart/form-data" >
            <ul>
                <li>
                    <s:textfield name="title" label="标题" required="true"/>
                </li>
                <li>
                    <s:select list="cataList" label="选择文章类别 " name="articleCat" listKey="catId" listValue="catName" emptyOption="false"/>
                </li>
                <li>
                 <s:file name="file" label="上传图片"></s:file>
                </li>
                <li>
                    <s:textarea name="content" label="正文" required="true"/>
                </li>
            </ul>
           
                <s:submit value="发布" method="deliver"/>
                <s:submit value="取消" method="cancel" />    
            </s:form>
                        
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>