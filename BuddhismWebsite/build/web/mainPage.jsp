<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
</head>
<body >
<div class="wrapper">
	<div class="header">
	
	</div>
	<div>
		<ul id="nav">
			<li><a href="#">網站首頁</a></li>
			<li><a href="#" rel='dropmenu1'>指導上師</a></li>
			<li><a href="#">重要公告</a></li>
			<li><a href="#" rel='dropmenu2'>最新法訊</a></li>
			<li><a href="#">甘露教言</a></li>
			<li><a href="#" rel='dropmenu3'>正法蘭若</a></li>
			<li><a href="#">活動剪影</a></li> 
			<li><a href="#">最新法訊</a></li>     
			<li><a href="#" rel='dropmenu4'>清涼共享</a></li>   
		    <li><a href="#">影音專區</a></li>   
			<li><a href="#" rel='dropmenu5'>關於我們</a></li>         
			<li><a href="#">管理</a></li>         
		</ul>
		
	</div>
	
	<script type='text/javascript' src='js/dropdown.js'></script>
	 <ul id="dropmenu1" class="dropMenu">
		<li><s:a href="teacher1.jsp">嘉傑 果碩仁波切</s:a></li>
		<li><s:a href="teacher2.jsp">經論講座老師 </s:a></li>
	</ul>
	<ul id="dropmenu2" class="dropMenu">
		<li><s:a href="associationRule.jsp">协会法讯</s:a></li>
		<li><s:a href="eventsCalendar.jsp">行事历</s:a></li>
	</ul>
	<ul id="dropmenu3" class="dropMenu">
		<li><s:a href="temple1.jsp">康果洛寺</s:a></li>
		<li><s:a href="temple2.jsp">尼泊尔圆满法洲寺</s:a></li>
	</ul>
	<ul id="dropmenu4" class="dropMenu">
		<li><s:a href="wisdoms.jsp">智慧点滴</s:a></li>
		<li><s:a href="experience.jsp">心得分享</s:a></li>
	</ul>
        <ul id="dropmenu5" class="dropMenu">
		<li><s:a href="knowUs.jsp">认识我们</s:a></li>
		<li><s:a href="contactUs.jsp">联系我们</s:a></li>
            <li><s:a href="joinUs.jsp">加入我们</s:a></li>
	</ul>

	<script type="text/javascript">cssdropdown.startchrome("nav")</script> 
	
	<div class="content">
		<div class="primary">
		<h3>left</h3>
		<button onclick="alert('aaaaa');">ddddd</button>
		<p>sdfasdfasdfasdfsadfasdfasdf</p>
	</div>
	<div class="secondary">
		<h3>right</h3>
	<p>sdfasdfasdfasdfsadfasdfasdf</p>
	</div>
	</div>
	<div class="footer">
		<div class="logo"></div>
		<div class="connect">
			<div class="title">
			友善連結
			</div>
			<ul>
				<li><a href="#">His Eminence Gosok Rinpoche</a></li>
				<li><a href="#">Stichting Chenrezig Nederland</a></li>
				<li><a href="#">Aid project</a></li>
				<li><a href="#">Gosok rinpoche's center in Paris</a></li>
			</ul>
		</div>
		<div class="copyright">
			Copyright © Gosok Kunphen Association All Rights Reserved. 
		</div>
	</div>
</div>
</body>
</html>
     
