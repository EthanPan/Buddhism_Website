package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.buddhism.model.Post;
import com.buddhism.model.Post;
import java.util.List;
import com.buddhism.model.Constants;
import com.buddhism.service.postServiceImpl;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
}
