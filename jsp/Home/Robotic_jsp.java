package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Robotic_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html> \n");
      out.write("<html class=\"no-js\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <title>LMSB</title>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link rel=\"stylesheet\" media=\"all\" href=\"../css/style.css\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("        <!-- Adding \"maximum-scale=1\" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->\t\t\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"../js/jquery-1.7.1.min.js\"></script>\n");
      out.write("        <script src=\"../js/custom.js\"></script>\n");
      out.write("        <script src=\"../js/tabs.js\"></script>\n");
      out.write("        <script src=\"../js/css3-mediaqueries.js\"></script>\n");
      out.write("        <script src=\"..js/jquery.columnizer.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Isotope -->\n");
      out.write("        <script src=\"../js/jquery.isotope.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Lof slider -->\n");
      out.write("        <script src=\"../js/jquery.easing.js\"></script>\n");
      out.write("        <script src=\"../js/lof-slider.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/lof-slider.css\" media=\"all\"  /> \n");
      out.write("        <!-- ENDS slider -->\n");
      out.write("\n");
      out.write("        <!-- Tweet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/jquery.tweet.css\" media=\"all\"  /> \n");
      out.write("        <script src=\"../js/tweet/jquery.tweet.js\" ></script> \n");
      out.write("        <!-- ENDS Tweet -->\n");
      out.write("\n");
      out.write("        <!-- superfish -->\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\"../css/superfish.css\" /> \n");
      out.write("        <script  src=\"../js/superfish-1.4.8/js/hoverIntent.js\"></script>\n");
      out.write("        <script  src=\"../js/superfish-1.4.8/js/superfish.js\"></script>\n");
      out.write("        <script  src=\"../js/superfish-1.4.8/js/supersubs.js\"></script>\n");
      out.write("        <!-- ENDS superfish -->\n");
      out.write("\n");
      out.write("        <!-- prettyPhoto -->\n");
      out.write("        <script  src=\"../js/prettyPhoto/js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/prettyPhoto/css/prettyPhoto.css\"  media=\"screen\" />\n");
      out.write("        <!-- ENDS prettyPhoto -->\n");
      out.write("\n");
      out.write("        <!-- poshytip -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/poshytip-1.1/src/tip-twitter/tip-twitter.css\"  />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css\"  />\n");
      out.write("        <script  src=\"../js/poshytip-1.1/src/jquery.poshytip.min.js\"></script>\n");
      out.write("        <!-- ENDS poshytip -->\n");
      out.write("\n");
      out.write("        <!-- JCarousel -->\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/jquery.jcarousel.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\"../css/carousel.css\" /> \n");
      out.write("        <!-- ENDS JCarousel -->\n");
      out.write("\n");
      out.write("        <!-- GOOGLE FONTS -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Voltaire' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- modernizr -->\n");
      out.write("        <script src=\"../js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- SKIN -->\n");
      out.write("        <link rel=\"stylesheet\" media=\"all\" href=\"../css/skin.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Less framework -->\n");
      out.write("        <link rel=\"stylesheet\" media=\"all\" href=\"../css/lessframework.css\"/>\n");
      out.write("\n");
      out.write("        <!-- jplayer -->\n");
      out.write("        <link href=\"player-skin/jplayer-black-and-yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/jquery.jplayer.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- flexslider -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/flexslider.css\" >\n");
      out.write("        <script src=\"..js/jquery.flexslider.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"wrapper cf\">\n");
      out.write("\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <a href=\"index.html\"><img  src=\"img/logo.png\" alt=\"Simpler\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- nav -->\n");
      out.write("           <ul id=\"nav\" class=\"sf-menu\">\n");
      out.write("                     <li class=\"current-menu-item\"><a href=\"../Home.jsp\">HOME</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"blog.html\">PRODUCT & SOLUTION</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <ul>\n");
      out.write("                            <li><a href=\"Education.jsp\">Education </a></li>\n");
      out.write("                            <li><a href=\"Software.jsp\">Software</a></li>\n");
      out.write("                            <li><a href=\"Web_application.jsp\">Web Aplication</a></li>\n");
      out.write("                            <li><a href=\"IoT.jsp\">IoT</a></li>\n");
      out.write("                            <li><a href=\"Robotic.jsp\">Robotic</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                   \n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"page.html\">TECHNOLOGY</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"Aplication_Development.jsp\">APLICATION DEVELOPMENT</a></li>\n");
      out.write("                                <li><a href=\"Robotic_Automation.jsp\">ROBOTIC & AUTOMATION</a></li>\n");
      out.write("                                <li><a href=\"WebDeveloper.jsp\">WEB DEVELOPER</a></li>\n");
      out.write("                                <li><a href=\"IoT.jsp\">IoT</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"contact.html\">CONTACT US</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"combo-holder\"></div>\n");
      out.write("                <!-- ends nav -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- ENDS HEADER -->\n");
      out.write("\n");
      out.write("        <!-- MAIN -->\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"wrapper cf\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- portfolio content-->\n");
      out.write("                <div id=\"portfolio-content\" class=\"cf\">        \t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- project pager -->\n");
      out.write("                    <div class=\"project-pager cf\">\n");
      out.write("                        <a class=\"previous-project\" href=\"#\">&#8592; Previous project</a>\n");
      out.write("                        <a class=\"next-project\" href=\"#\">Next project &#8594;</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ENDS project pager -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- project box -->\n");
      out.write("                    <div id=\"project-box\" class=\"cf\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- slider -->\n");
      out.write("                        <div class=\"project-slider\">\n");
      out.write("                            <div class=\"flexslider\">\n");
      out.write("                                <ul class=\"slides\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"../image/mblr.jpg\" alt=\"alt text\" />\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"../image/rr.jpg\" alt=\"alt text\" />\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"../image/uav.jpg\" alt=\"alt text\" />\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ENDS slider -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <p><strong>Client </strong> Mr. Tanaka</p>\n");
      out.write("                            <p><strong>Date </strong> April 25, 2012</p>\n");
      out.write("                            <p><a href=\"http://www.luiszuno.com\" class=\"launch\" >Launch Project</a></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- entry-content -->\n");
      out.write("                        <div class=\"entry-content\">\n");
      out.write("\n");
      out.write("                            <h2 class=\"heading\">Project Name</h2>\n");
      out.write("\n");
      out.write("                            <div class=\"multicolumn\">\n");
      out.write("                                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\n");
      out.write("                                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\n");
      out.write("                                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ENDS entry content -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ENDS project box -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- related -->\n");
      out.write("                    <div class=\"related-projects\">\n");
      out.write("                        <h4 class=\"related-heading\">Related projects</h4>\n");
      out.write("                        <div class=\"related-list cf\">\n");
      out.write("                            <figure>\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"=../image/uav.jpg\" alt= \"Alt text\" /></a>\n");
      out.write("                                <a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("                            </figure>\n");
      out.write("\n");
      out.write("                            <figure>\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/02.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("                                <a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("                            </figure>\n");
      out.write("\n");
      out.write("                            <figure> \n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/03.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("                                <a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("                            </figure>\n");
      out.write("\n");
      out.write("                            <figure>\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/04.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("                                <a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("                            </figure>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ENDS related -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- ENDS portfolio content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div><!-- ENDS WRAPPER -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ENDS MAIN -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"wrapper cf\">\n");
      out.write("\n");
      out.write("                <!-- widgets -->\n");
      out.write("                <ul  class=\"widget-cols cf\">\n");
      out.write("                    <li class=\"first-col\">\n");
      out.write("\n");
      out.write("                        <div class=\"widget-block\">\n");
      out.write("                            <h4>RECENT POSTS</h4>\n");
      out.write("                            <div class=\"recent-post cf\">\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("                                <div class=\"post-head\">\n");
      out.write("                                    <a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"recent-post cf\">\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("                                <div class=\"post-head\">\n");
      out.write("                                    <a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"recent-post cf\">\n");
      out.write("                                <a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("                                <div class=\"post-head\">\n");
      out.write("                                    <a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"second-col\">\n");
      out.write("\n");
      out.write("                        <div class=\"widget-block\">\n");
      out.write("                            <h4>ABOUT</h4>\n");
      out.write("                            <p>Folder it's completely free this means you don't have to pay anything <a href=\"http://luiszuno.com/blog/license\" tar >read license</a>.</p> \n");
      out.write("                            <p>Visit <a href=\"http://templatecreme.com/\" >Template Creme</a> and find the most beautiful free templates up to date.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"third-col\">\n");
      out.write("\n");
      out.write("                        <div class=\"widget-block\">\n");
      out.write("                            <div id=\"tweets\" class=\"footer-col tweet\">\n");
      out.write("                                <h4>TWITTER WIDGET</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"fourth-col\">\n");
      out.write("\n");
      out.write("                        <div class=\"widget-block\">\n");
      out.write("                            <h4>CATEGORIES</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >Design</a></li>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >Photo</a></li>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >Art</a></li>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >Game</a></li>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >Film</a></li>\n");
      out.write("                                <li class=\"cat-item\"><a href=\"#\" >TV</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </li>\t\n");
      out.write("                </ul>\n");
      out.write("                <!-- ENDS widgets -->\t\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- bottom -->\n");
      out.write("                <div class=\"footer-bottom\">\n");
      out.write("                    <div class=\"left\">by <a href=\"http://luiszuno.com\" >luiszuno.com</a></div>\n");
      out.write("                    <ul id=\"social-bar\" class=\"cf sb\">\n");
      out.write("                        <li><a href=\"http://www.facebook.com\"  title=\"Become a fan\" class=\"facebook\">Facebbok</a></li>\n");
      out.write("                        <li><a href=\"http://www.twitter.com\" title=\"Follow my tweets\" class=\"twitter\"></a></li>\n");
      out.write("                        <li><a href=\"http://plus.google.com\" title=\"Enter my circles\" class=\"plus\"></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\t\n");
      out.write("                <!-- ENDS bottom -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- ENDS FOOTER -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
