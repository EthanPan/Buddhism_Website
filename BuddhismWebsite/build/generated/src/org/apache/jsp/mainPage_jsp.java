package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.buddhism.model.Post;
import com.buddhism.model.Post;
import java.util.List;
import com.buddhism.model.Constants;
import com.buddhism.service.postServiceImpl;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/jsp/banner_nav.jsp");
    _jspx_dependants.add("/jsp/content.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_a_href.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" >\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"all\" type=\"text/css\" href=\"css/buddhism_page.css\">\r\n");
      out.write("    <script type='text/javascript' src='js/dropdown.js'></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("    <script type='text/javascript' src='js/picture_show.js'></script>\t\r\n");
      out.write("    <title>果硕普利协会</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\"></div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t<li><a href=\"mainPage.jsp\">網站首頁</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"teachers.jsp\" rel='dropmenu1'>指導上師</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"importantPosts.jsp\">重要公告</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"news.jsp\" rel='dropmenu2'>最新法訊</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"buddleWords.jsp\">甘露教言</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"temples.jsp\" rel='dropmenu3'>正法蘭若</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"activities.jsp\">活動剪影</a></li> \r\n");
      out.write("\t\t\t<li><a href=\"latestMessage.jsp\">最新法訊</a></li>     \r\n");
      out.write("\t\t\t<li><a href=\"shares.jsp\" rel='dropmenu4'>清涼共享</a></li>   \r\n");
      out.write("                        <li><a href=\"videos.jsp\">影音專區</a></li>   \r\n");
      out.write("\t\t\t<li><a href=\"aboutUs.jsp\" rel='dropmenu5'>關於我們</a></li>         \r\n");
      out.write("\t\t\t<li><a href=\"logIn.jsp\">管理</a></li>         \r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<script type=\"text/javascript\">cssdropdown.startchrome(\"nav\")</script> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t <ul id=\"dropmenu1\" class=\"dropMenu\">\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_0(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_1(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul id=\"dropmenu2\" class=\"dropMenu\">\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_2(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_3(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul id=\"dropmenu3\" class=\"dropMenu\">\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_4(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_5(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul id=\"dropmenu4\" class=\"dropMenu\">\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_6(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_7(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("        <ul id=\"dropmenu5\" class=\"dropMenu\">\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_8(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t<li>");
      if (_jspx_meth_s_a_9(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("                <li>");
      if (_jspx_meth_s_a_10(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("        <div id=\"message\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\t\t<div class=\"primary\">\r\n");
      out.write("\t\t\t<div id=\"pictureswall_bk\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"pictures_bg\" >\r\n");
      out.write("\t\t\t<div id=\"pictures_info\"></div> <!--标题-->\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"on\">1</li>\r\n");
      out.write("\t\t\t\t<li>2</li>\r\n");
      out.write("\t\t\t\t<li>3</li>\r\n");
      out.write("\t\t\t\t<li>4</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>  <!--标题背景-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"pictureswall\">\t\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t   <div id=\"pictures\">\r\n");
      out.write("\t\t\t        <a href=\"#\" target=\"_blank\"><img src=\"imgs/p1.jpg\" title=\"嘉定校区风光1\" alt=\"嘉定校区风光1\" /></a>\r\n");
      out.write("\t\t\t        <a href=\"#\" target=\"_blank\"><img src=\"imgs/p2.jpg\" title=\"嘉定校区风光2\" alt=\"嘉定校区风光2\" /></a>\r\n");
      out.write("\t\t\t        <a href=\"#\" target=\"_blank\"><img src=\"imgs/p3.jpg\" title=\"嘉定校区风光3\" alt=\"嘉定校区风光3\" /></a>\r\n");
      out.write("\t\t\t        <a href=\"#\" target=\"_blank\"><img src=\"imgs/p4.jpg\" title=\"嘉定校区风光4\" alt=\"嘉定校区风光4\" /></a>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t  \t\r\n");
      out.write("\t  \t\t<div class=\"three\">\r\n");
      out.write("\t  \t\t\t<div class=\"two\">\r\n");
      out.write("\t  \t\t\t\t<div class=\"left\">\r\n");
      out.write("\t  \t\t\t\t\t<div id=\"left_title\">甘露教言</div>\r\n");
      out.write("                                                ");

                                                    postServiceImpl service = new postServiceImpl();
                                                    List<Post> posts = null;
                                                    posts = service.getPost((short)Constants.buddleWords);
                                                    
                                                    if (posts != null)
                                                    {
                                                        for (int i = posts.size() - 1; i > 0 && posts.size() - i < 5; i--)
                                                        {
                                                
      out.write("\r\n");
      out.write("                                                <p>");
      out.print( posts.get(i).getPostTitle() );
      out.write("</p>\r\n");
      out.write("                                                \r\n");
      out.write("                                                ");

                                                        }
                                                    }    
                                                
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("\t  \t\t\t\t<div class=\"right\">\r\n");
      out.write("\t  \t\t\t\t\t<div id=\"left_title\">正法蘭若</div>\r\n");
      out.write("\t  \t\t\t\t\tsecond\r\n");
      out.write("\t  \t\t\t\t</div>\r\n");
      out.write("\t  \t\t\t</div>\r\n");
      out.write("\t  \t\t\t<div class=\"last\">\r\n");
      out.write("\t  \t\t\t<div id=\"left_title\">清涼共享</div>\r\n");
      out.write("\t  \t\t\tlast\r\n");
      out.write("\t  \t\t\t</div>\r\n");
      out.write("\t  \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"secondly\">\r\n");
      out.write("\t\t\t<div class=\"teacherbox\">\r\n");
      out.write("\t\t\t\t<div id=\"right_title\">指導上師</div>\r\n");
      out.write("\t\t\t<h3>right</h3>\r\n");
      out.write("\t\t\t<p>sdfasdfasdfasdfsadfasdfasdf</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"notificationbox\">\r\n");
      out.write("\t\t\t\t<div id=\"right_title\">重要公告</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"newsbox\">\r\n");
      out.write("\t\t\t\t<div id=\"right_title\">最新法訊</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"supportbox\">\r\n");
      out.write("\t\t\t\t<div id=\"right_title\">贊助護持</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<!--\t\t文章列表-->\r\n");
      out.write("\t\t<div class=\"article\">\r\n");
      out.write("\t\t\t<div class=\"title\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"article\">\r\n");
      out.write("\t\t\t<div class=\"title\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"article\">\r\n");
      out.write("\t\t\t<div class=\"title\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t        <div id=\"viewmore\">瀏覽更多資訊</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"logo\"></div>\r\n");
      out.write("\t\t<div class=\"connect\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t友善連結\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">His Eminence Gosok Rinpoche</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Stichting Chenrezig Nederland</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Aid project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Gosok rinpoche's center in Paris</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\tCopyright © Gosok Kunphen Association All Rights Reserved. \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("     \r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_a_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent(null);
    _jspx_th_s_a_0.setHref("teacher1.jsp");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("嘉傑 果碩仁波切");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_a_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_1.setPageContext(_jspx_page_context);
    _jspx_th_s_a_1.setParent(null);
    _jspx_th_s_a_1.setHref("teacher2.jsp");
    int _jspx_eval_s_a_1 = _jspx_th_s_a_1.doStartTag();
    if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_1.doInitBody();
      }
      do {
        out.write("經論講座老師 ");
        int evalDoAfterBody = _jspx_th_s_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
    return false;
  }

  private boolean _jspx_meth_s_a_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_2.setPageContext(_jspx_page_context);
    _jspx_th_s_a_2.setParent(null);
    _jspx_th_s_a_2.setHref("associationRule.jsp");
    int _jspx_eval_s_a_2 = _jspx_th_s_a_2.doStartTag();
    if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_2.doInitBody();
      }
      do {
        out.write("协会法讯");
        int evalDoAfterBody = _jspx_th_s_a_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
    return false;
  }

  private boolean _jspx_meth_s_a_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_3.setPageContext(_jspx_page_context);
    _jspx_th_s_a_3.setParent(null);
    _jspx_th_s_a_3.setHref("eventsCalendar.jsp");
    int _jspx_eval_s_a_3 = _jspx_th_s_a_3.doStartTag();
    if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_3.doInitBody();
      }
      do {
        out.write("行事历");
        int evalDoAfterBody = _jspx_th_s_a_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
    return false;
  }

  private boolean _jspx_meth_s_a_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_4.setPageContext(_jspx_page_context);
    _jspx_th_s_a_4.setParent(null);
    _jspx_th_s_a_4.setHref("temple1.jsp");
    int _jspx_eval_s_a_4 = _jspx_th_s_a_4.doStartTag();
    if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_4.doInitBody();
      }
      do {
        out.write("康果洛寺");
        int evalDoAfterBody = _jspx_th_s_a_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
    return false;
  }

  private boolean _jspx_meth_s_a_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_5.setPageContext(_jspx_page_context);
    _jspx_th_s_a_5.setParent(null);
    _jspx_th_s_a_5.setHref("temple2.jsp");
    int _jspx_eval_s_a_5 = _jspx_th_s_a_5.doStartTag();
    if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_5.doInitBody();
      }
      do {
        out.write("尼泊尔圆满法洲寺");
        int evalDoAfterBody = _jspx_th_s_a_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
    return false;
  }

  private boolean _jspx_meth_s_a_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_6 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_6.setPageContext(_jspx_page_context);
    _jspx_th_s_a_6.setParent(null);
    _jspx_th_s_a_6.setHref("wisdoms.jsp");
    int _jspx_eval_s_a_6 = _jspx_th_s_a_6.doStartTag();
    if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_6.doInitBody();
      }
      do {
        out.write("智慧点滴");
        int evalDoAfterBody = _jspx_th_s_a_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
    return false;
  }

  private boolean _jspx_meth_s_a_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_7 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_7.setPageContext(_jspx_page_context);
    _jspx_th_s_a_7.setParent(null);
    _jspx_th_s_a_7.setHref("experience.jsp");
    int _jspx_eval_s_a_7 = _jspx_th_s_a_7.doStartTag();
    if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_7.doInitBody();
      }
      do {
        out.write("心得分享");
        int evalDoAfterBody = _jspx_th_s_a_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
    return false;
  }

  private boolean _jspx_meth_s_a_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_8 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_8.setPageContext(_jspx_page_context);
    _jspx_th_s_a_8.setParent(null);
    _jspx_th_s_a_8.setHref("knowUs.jsp");
    int _jspx_eval_s_a_8 = _jspx_th_s_a_8.doStartTag();
    if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_8.doInitBody();
      }
      do {
        out.write("认识我们");
        int evalDoAfterBody = _jspx_th_s_a_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
    return false;
  }

  private boolean _jspx_meth_s_a_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_9 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_9.setPageContext(_jspx_page_context);
    _jspx_th_s_a_9.setParent(null);
    _jspx_th_s_a_9.setHref("contactUs.jsp");
    int _jspx_eval_s_a_9 = _jspx_th_s_a_9.doStartTag();
    if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_9.doInitBody();
      }
      do {
        out.write("联系我们");
        int evalDoAfterBody = _jspx_th_s_a_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
    return false;
  }

  private boolean _jspx_meth_s_a_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_10 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_10.setPageContext(_jspx_page_context);
    _jspx_th_s_a_10.setParent(null);
    _jspx_th_s_a_10.setHref("joinUs.jsp");
    int _jspx_eval_s_a_10 = _jspx_th_s_a_10.doStartTag();
    if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_10.doInitBody();
      }
      do {
        out.write("加入我们");
        int evalDoAfterBody = _jspx_th_s_a_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
    return false;
  }
}
