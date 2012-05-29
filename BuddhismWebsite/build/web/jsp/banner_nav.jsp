<%-- 
    Document   : banner_nav
    Created on : 2012-4-5, 16:02:16
    Author     : EthanPan
--%>
<%-- any content can be specified here e.g.: --%>
<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="header"></div>
	<div>
		<ul id="nav">
			<li><a href="mainPage.action">網站首頁</a></li>
			<li><a href="WEB-INF/jsp/teachers.jsp" rel='dropmenu1'>指導上師</a></li>
			<li><a href="WEB-INF/jsp/importantPosts.jsp">重要公告</a></li>
			<li><a href="WEB-INF/jsp/news.jsp" rel='dropmenu2'>最新法訊</a></li>
			<li><a href="WEB-INF/jsp/buddleWords.jsp">甘露教言</a></li>
			<li><a href="WEB-INF/jsp/temples.jsp" rel='dropmenu3'>正法蘭若</a></li>
			<li><a href="WEB-INF/jsp/activities.jsp">活動剪影</a></li> 
			<li><a href="WEB-INF/jsp/latestMessage.jsp">最新法訊</a></li>     
			<li><a href="WEB-INF/jsp/shares.jsp" rel='dropmenu4'>清涼共享</a></li>   
                        <li><a href="WEB-INF/jsp/videos.jsp">影音專區</a></li>   
			<li><a href="WEB-INF/jsp/aboutUs.jsp" rel='dropmenu5'>關於我們</a></li>         
			<li><a href="logIn.action">管理</a></li>         
		</ul>
		<script type="text/javascript">cssdropdown.startchrome("nav")</script> 
	</div>
	
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

	
        <div id="message"></div>

