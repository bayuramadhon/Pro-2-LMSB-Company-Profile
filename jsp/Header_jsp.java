package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("   <ul id=\"nav\" class=\"sf-menu\">\n");
      out.write("                    <li class=\"current-menu-item\"><a href=\"index.html\">HOME</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"blog.html\">PRODUCT & SOLUTION</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"Home/Education.jsp\">Education </a></li>\n");
      out.write("                            <li><a href=\"Home/Software.jsp\">Software</a></li>\n");
      out.write("                            <li><a href=\"Home/Web_application.jsp\">Web Aplication</a></li>\n");
      out.write("                            <li><a href=\"Home/IoT.jsp\">IoT</a></li>\n");
      out.write("                            <li><a href=\"Home/Robotic.jsp\">Robotic</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"page.html\">TECHNOLOGY</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"Home/Aplication_Development.jsp\">Aplication Development</a></li>\n");
      out.write("                            <li><a href=\"Home/Robotic_Automation.jsp\">Robotic & Automation</a></li>\n");
      out.write("                            <li><a href=\"Home/WebDeveloper.jsp\">Web Developer</a></li>\n");
      out.write("                            <li><a href=\"Home/IoT_Development.jsp\">IoT Development</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("                </ul>");
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
