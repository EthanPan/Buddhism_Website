<%-- 
    Document   : mainPageArticles
    Created on : 2012-6-30, 22:55:30
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>



<s:iterator id="post" value="posts">
<div class="article">
    <a href="articlePage?id=${id}"><div class="title" style="color: black"><s:property value="postTitle" /></div></a>
    <div class="content"><s:property  value="postContent" /></div>
</div>
</s:iterator>
