<%-- 
    Document   : addArticle
    Created on : 2012-6-28, 22:42:57
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
    String path = request.getContextPath(); 
%>      
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>发布文章</title>
<link href="<%=path%>/admin/styles/layout.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/admin/styles/wysiwyg.css" rel="stylesheet" type="text/css" />
<!-- Theme Start -->
<link href="<%=path%>/admin/themes/blue/styles.css" rel="stylesheet" type="text/css" />
<!-- Theme End -->

 <link href="<%=path%>/css/uploadify.css" rel="stylesheet" type="text/css" />

 <script type="text/javascript" src="<%=path%>/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.uploadify-3.1.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#fileupload").uploadify({
                                    /*注意前    面需要书写path的代码*/ 

        'swf'            : '<%=path%>/images/uploadify.swf', 
        'uploader'       : '<%=path%>/upload', 
        'cancelImg'      : '<%=path%>/images/cancel.png', 
        //'queueID'        : 'fileQueue',  //和存放队列的DIV的id一致 
        'fileObjName'    : 'fileupload', //和以下input的name属性一致 
        'auto'           : true, //是否自动开始 
        'multi'          : false, //是否支持多文件上传 
        'buttonText'     : '上传照片', //按钮上的文字 

        'fileSizeLimit'  : '5MB', //设置单个文件大小限制5m 
        'queueSizeLimit' : 2, //队列中同时存在的文件个数限制 
        'fileTypeDesc'       : '支持格式:jpg/gif/jpeg/png/bmp.', //如果配置了以下的'fileExt'属性，那么这个属性是必须的 
        'fileTypeExt'        : '*.jpg;*.gif;*.jpeg;*.png;*.bmp',//允许的格式   
        'onUploadSuccess'    : function(file, data, response) { 
            filepath =eval("(" + data + ")");                  
            $("#target").attr("src", filepath);
        }, 
        'onUploadError' : function(file, errorCode, errorMsg, errorString) {
            // $.facebox('文件' + file.name + '不能上传' + errorString);
        },
        'onCancel' : function(file) {
            // $.facebox('文件 ' + file.name + '取消了上传');
        } 
    }); 

    })
</script>





</head>
<body id="homepage">
	<div id="header">
    	<a href="" title=""><img src="<%=path%>/admin/img/cp_logo.png" alt="Control Panel" class="logo" /></a>
    	<div id="searcharea">
            
            <input type="text" class="searchbox" value="输入查询内容" onclick="if (this.value =='输入查询内容'){this.value=''}"/>
            <input type="submit" value="查找" class="searchbtn" />
        </div>
    </div>
        
    <!-- Top Breadcrumb Start -->
    <div id="breadcrumb">
    	<ul>	
        	<li><img src="<%=path%>/admin/img/icons/icon_breadcrumb.png" alt="Location" /></li>
        	<li><strong>当前位置:</strong></li>
            <li><a href="#" title="">文章管理</a></li>
            <li>/</li>
            <li class="current">发布文章</li>
        </ul>
    </div>
    <!-- Top Breadcrumb End -->
     
    <!-- Right Side/Main Content Start -->
    <div id="rightside">

        
        <div class="contentbox">
            <form action="articleAction.action" method="post" enctype="multipart/form-data">
                <p>		
                    <label for="textfield"><strong>文章标题</strong></label>
                    <input type="text" name="title" id="textfield" class="inputbox" style="width: 580px;"/> 
                    <span class="smltxt">文章类别</span>
                    <s:select list="cataList" name="articleCat" listKey="catId" listValue="catName" emptyOption="false"/> 
                </p>
                <textarea class="text-input textarea" id="wysiwyg" name="content" ></textarea>
                <input type="file" name="fileupload" id="fileupload" />
                 <img id="target" src=""/>
                <input type="submit" value="发布" class="btn" /> 
            </form>
         </div>        
        <div style="clear:both;"></div>

        
        <div id="footer">
        	&copy; Copyright 2012 
        </div> 
          
    </div>
    <!-- Right Side/Main Content End -->
    
        <!-- Left Dark Bar Start -->
    <div id="leftside">
    	<div class="user">
        	<img src="<%=path%>/admin/img/avatar.png" width="44" height="44" class="hoverimg" alt="Avatar" />
            <p>帐户信息</p>
            <p class="username"></p>
            <p class="userbtn"><a href="#" title="">资料</a></p>
            <p class="userbtn"><a href="logOut" title="">登出</a></p>
        </div>

        <ul id="nav">
        	<li>
                <ul class="navigation">
                    <li><a href="adminIndex">网站状态</a></li>
                    <li  class="heading selected">发布文章</li>
                    <li><a href="#" title="">上传照片</a></li>
                </ul>
            </li>
            <li>
                <a class="expanded heading">文章管理</a>
                 <ul class="navigation">
                    <li><a href="#" title="">发布文章</a></li>
                    <li><a href="managementAction" title="">文章列表</a></li>
                    <li><a href="articleTrash" title="">文章回收站</a></li>
                </ul>
            </li>
            <li><a class="expanded heading">相册管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">上传照片</a></li>
                    <li><a href="#" title="">相册管理</a></li>
                </ul>
            </li>
            <li><a class="expanded heading">帐户管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">用户资料</a></li>
                    <s:if test="#session.User.adLevel == 0">
                        <li><a href="#" title="">添加帐户</a></li>
                    </s:if>
                </ul>
            </li>            
        </ul>
    </div>
    <!-- Left Dark Bar End --> 
   
    <!-- Notifications Box/Pop-Up End --> 
    
    <script type="text/javascript" src="http://dwpe.googlecode.com/svn/trunk/_shared/EnhanceJS/enhance.js"></script>	
    <script type='text/javascript' src='http://dwpe.googlecode.com/svn/trunk/charting/js/excanvas.js'></script>
    <script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js'></script>
	<script type='text/javascript' src='<%=path%>/admin/scripts/jquery.wysiwyg.js'></script>
    <script type='text/javascript' src='<%=path%>/admin/scripts/visualize.jQuery.js'></script>
    <script type="text/javascript" src='<%=path%>/admin/scripts/functions.js'></script>
    
    <!--[if IE 6]>
    <script type='text/javascript' src='scripts/png_fix.js'></script>
    <script type='text/javascript'>
      DD_belatedPNG.fix('img, .notifycount, .selected');
    </script>
    <![endif]--> 
</body>
</html>
