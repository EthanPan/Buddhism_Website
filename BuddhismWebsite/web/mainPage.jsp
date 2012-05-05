<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title>果硕普利协会</title>
</head>
<body >
<div class="wrapper">
        <%@ include file="/jsp/banner_nav.jsp" %>
        <div class="content">
		<div class="primary">
			<div id="pictureswall_bk">
			
			<div id="pictures_bg" >
			<div id="pictures_info"></div> <!--标题-->
			<ul>
				<li class="on">1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
			</ul>

			</div>  <!--标题背景-->
			
			<div id="pictureswall">	
			    
			   <div id="pictures">
			        <a href="#" target="_blank"><img src="imgs/p1.jpg" title="嘉定校区风光1" alt="嘉定校区风光1" /></a>
			        <a href="#" target="_blank"><img src="imgs/p2.jpg" title="嘉定校区风光2" alt="嘉定校区风光2" /></a>
			        <a href="#" target="_blank"><img src="imgs/p3.jpg" title="嘉定校区风光3" alt="嘉定校区风光3" /></a>
			        <a href="#" target="_blank"><img src="imgs/p4.jpg" title="嘉定校区风光4" alt="嘉定校区风光4" /></a>
			   </div>
			</div>
			</div>	  	
	  		<div class="three">
	  			<div class="two">
	  				<div class="left">
	  					<div id="left_title">甘露教言</div>
                                                <s:iterator value="buddleWords" id="buddleWord">
                                                        <p><s:property value="#buddleWord.postTitle"/></p>
                                                </s:iterator>
                                        </div>
	  				<div class="right">
	  					<div id="left_title">正法蘭若</div>
	  					second
	  				</div>
	  			</div>
	  			<div class="last">
	  			<div id="left_title">清涼共享</div>
                                    <s:iterator value="experienceShare" id="share">
                                        <p><s:property value="#share.postTitle"/></p>
                                    </s:iterator>
	  			</div>
	  		</div>
		</div>
		<div class="secondly">
			<div class="teacherbox">
				<div id="right_title">指導上師</div>
			<h3>right</h3>
			<p>sdfasdfasdfasdfsadfasdfasdf</p>
			</div>
			<div class="notificationbox">
			<div id="right_title">重要公告</div>
                                <s:iterator value="informs" id="inform">
                                    <p><s:property value="#inform.postTitle"/></p>
                                </s:iterator>                        
			</div>
			<div class="newsbox">
                        <div id="right_title">最新法訊</div>
                                <s:iterator value="lastestLaw" id="law">
                                    <p><s:property value="#law.postTitle"/></p>
                                </s:iterator>                                
			</div>
			<div class="supportbox">
			<div id="right_title">贊助護持</div>
			</div>
			
		</div>
<!--		文章列表-->
		<div class="article">
			<div class="title"></div>
		</div>
		<div class="article">
			<div class="title"></div>
		</div>
		<div class="article">
			<div class="title"></div>
		</div>
	        <div id="viewmore">瀏覽更多資訊</div>

</div>

        <%@include  file="/jsp/footer.jsp" %>
</div>
</body>
</html>
     
