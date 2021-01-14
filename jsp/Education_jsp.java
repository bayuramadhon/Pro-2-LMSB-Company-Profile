package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Education_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\"/>\n");
      out.write("\t\t<title>LMSB </title>\n");
      out.write("\t\t\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" media=\"all\" href=\"../css/style.css\"/>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("\t\t<!-- Adding \"maximum-scale=1\" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<!-- JS -->\n");
      out.write("\t\t<script src=\"js/jquery-1.7.1.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/custom.js\"></script>\n");
      out.write("\t\t<script src=\"js/tabs.js\"></script>\n");
      out.write("\t\t<script src=\"js/css3-mediaqueries.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.columnizer.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Isotope -->\n");
      out.write("\t\t<script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Lof slider -->\n");
      out.write("\t\t<script src=\"js/jquery.easing.js\"></script>\n");
      out.write("\t\t<script src=\"js/lof-slider.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/lof-slider.css\" media=\"all\"  /> \n");
      out.write("\t\t<!-- ENDS slider -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Tweet -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/jquery.tweet.css\" media=\"all\"  /> \n");
      out.write("\t\t<script src=\"js/tweet/jquery.tweet.js\" ></script> \n");
      out.write("\t\t<!-- ENDS Tweet -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- superfish -->\n");
      out.write("\t\t<link rel=\"stylesheet\" media=\"screen\" href=\"../css/superfish.css\" /> \n");
      out.write("\t\t<script  src=\"js/superfish-1.4.8/js/hoverIntent.js\"></script>\n");
      out.write("\t\t<script  src=\"js/superfish-1.4.8/js/superfish.js\"></script>\n");
      out.write("\t\t<script  src=\"js/superfish-1.4.8/js/supersubs.js\"></script>\n");
      out.write("\t\t<!-- ENDS superfish -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- prettyPhoto -->\n");
      out.write("\t\t<script  src=\"js/prettyPhoto/js/jquery.prettyPhoto.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"js/prettyPhoto/css/prettyPhoto.css\"  media=\"screen\" />\n");
      out.write("\t\t<!-- ENDS prettyPhoto -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- poshytip -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"js/poshytip-1.1/src/tip-twitter/tip-twitter.css\"  />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css\"  />\n");
      out.write("\t\t<script  src=\"js/poshytip-1.1/src/jquery.poshytip.min.js\"></script>\n");
      out.write("\t\t<!-- ENDS poshytip -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- JCarousel -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.jcarousel.min.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" media=\"screen\" href=\"../css/carousel.css\" /> \n");
      out.write("\t\t<!-- ENDS JCarousel -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- GOOGLE FONTS -->\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Voltaire' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t\t<!-- modernizr -->\n");
      out.write("\t\t<script src=\"js/modernizr.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- SKIN -->\n");
      out.write("\t\t<link rel=\"stylesheet\" media=\"all\" href=\"../css/skin.css\"/>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Less framework -->\n");
      out.write("\t\t<link rel=\"stylesheet\" media=\"all\" href=\"../css/lessframework.css\"/>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- jplayer -->\n");
      out.write("\t\t<link href=\"player-skin/jplayer-black-and-yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.jplayer.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- flexslider -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/flexslider.css\" >\n");
      out.write("\t\t<script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("\t\n");
      out.write("\t\t<!-- HEADER -->\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<div class=\"wrapper cf\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img  src=\"img/logo.png\" alt=\"Simpler\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- nav -->\n");
      out.write("\t\t\t\t<ul id=\"nav\" class=\"sf-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\"><span>HOME</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"blog.html\">BLOG</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"page.html\">ABOUT</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page-elements.html\">Elements</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page-icons.html\">Icons</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page-typography.html\">Typography</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"current-menu-item\"><a href=\"portfolio.html\">WORK</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div id=\"combo-holder\"></div>\n");
      out.write("\t\t\t\t<!-- ends nav -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<!-- ENDS HEADER -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- MAIN -->\n");
      out.write("\t\t<div id=\"main\">\n");
      out.write("\t\t\t<div class=\"wrapper cf\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<!-- portfolio content-->\n");
      out.write("        \t<div id=\"portfolio-content\" class=\"cf\">        \t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- project pager -->\n");
      out.write("\t\t\t\t<div class=\"project-pager cf\">\n");
      out.write("\t\t\t\t\t<a class=\"previous-project\" href=\"#\">&#8592; Previous project</a>\n");
      out.write("\t\t\t\t\t<a class=\"next-project\" href=\"#\">Next project &#8594;</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- ENDS project pager -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- project box -->\n");
      out.write("\t\t\t\t<div id=\"project-box\" class=\"cf\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- slider -->\n");
      out.write("\t\t\t\t\t<div class=\"project-slider\">\n");
      out.write("\t\t\t\t        <div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t\t  <ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t\t      <img src=\"../image/mblr.jpg\" alt=\"alt text\" />\n");
      out.write("\t\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t\t      <img src=\"../image/rr.jpg\" alt=\"alt text\" />\n");
      out.write("\t\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t\t      <img src=\"../image/uav.jpg\" alt=\"alt text\" />\n");
      out.write("\t\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t        \t<!-- ENDS slider -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"info\">\n");
      out.write("\t        \t\t\t<p><strong>Client </strong> Mr. Tanaka</p>\n");
      out.write("\t        \t\t\t<p><strong>Date </strong> April 25, 2012</p>\n");
      out.write("\t        \t\t\t<p><a href=\"http://www.luiszuno.com\" class=\"launch\" >Launch Project</a></p>\n");
      out.write("\t        \t\t</div>\n");
      out.write("\t        \t\t\n");
      out.write("\t        \t\t<!-- entry-content -->\n");
      out.write("\t        \t\t<div class=\"entry-content\">\n");
      out.write("\t        \t\t\n");
      out.write("\t        \t\t\t<h2 class=\"heading\">Project Name</h2>\n");
      out.write("\t        \t\t\t\n");
      out.write("\t        \t\t\t<div class=\"multicolumn\">\n");
      out.write("\t        \t\t\t<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\t        \t\t\t\n");
      out.write("\t        \t\t\t<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\t        \t\t\t\n");
      out.write("\t        \t\t\t<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus.</p>\n");
      out.write("\t        \t\t\t\n");
      out.write("\t        \t\t\t</div>\n");
      out.write("\t        \t\t</div>\n");
      out.write("\t        \t\t<!-- ENDS entry content -->\n");
      out.write("\t        \t\t\n");
      out.write("\t        \t</div>\n");
      out.write("\t\t    \t<!-- ENDS project box -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<!-- related -->\n");
      out.write("\t\t\t\t<div class=\"related-projects\">\n");
      out.write("\t\t\t\t\t<h4 class=\"related-heading\">Related projects</h4>\n");
      out.write("\t\t\t\t\t<div class=\"related-list cf\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"=../image/uav.jpg\" alt= \"Alt text\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/02.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<figure> \n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/03.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/slides/04.jpg\" alt=\"Alt text\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\" class=\"heading\">Pellentesque habitant morbi</a>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- ENDS related -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<!-- ENDS portfolio content-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div><!-- ENDS WRAPPER -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ENDS MAIN -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- FOOTER -->\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<div class=\"wrapper cf\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<!-- widgets -->\n");
      out.write("\t\t\t\t<ul  class=\"widget-cols cf\">\n");
      out.write("\t\t\t\t\t<li class=\"first-col\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-block\">\n");
      out.write("\t\t\t\t\t\t\t<h4>RECENT POSTS</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-post cf\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-post cf\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-post cf\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"thumb\"><img src=\"img/dummies/54x54.gif\" alt=\"Post\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"second-col\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-block\">\n");
      out.write("\t\t\t\t\t\t\t<h4>ABOUT</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Folder it's completely free this means you don't have to pay anything <a href=\"http://luiszuno.com/blog/license\" tar >read license</a>.</p> \n");
      out.write("\t\t\t\t\t\t\t<p>Visit <a href=\"http://templatecreme.com/\" >Template Creme</a> and find the most beautiful free templates up to date.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"third-col\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-block\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tweets\" class=\"footer-col tweet\">\n");
      out.write("\t\t         \t\t\t\t<h4>TWITTER WIDGET</h4>\n");
      out.write("\t\t         \t\t\t</div>\n");
      out.write("\t\t         \t\t</div>\n");
      out.write("\t\t         \t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"fourth-col\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-block\">\n");
      out.write("\t\t\t\t\t\t\t<h4>CATEGORIES</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >Design</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >Photo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >Art</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >Game</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >Film</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"cat-item\"><a href=\"#\" >TV</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t         \t\t\n");
      out.write("\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- ENDS widgets -->\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- bottom -->\n");
      out.write("\t\t\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"left\">by <a href=\"http://luiszuno.com\" >luiszuno.com</a></div>\n");
      out.write("\t\t\t\t\t\t<ul id=\"social-bar\" class=\"cf sb\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.facebook.com\"  title=\"Become a fan\" class=\"facebook\">Facebbok</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.twitter.com\" title=\"Follow my tweets\" class=\"twitter\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://plus.google.com\" title=\"Enter my circles\" class=\"plus\"></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t<!-- ENDS bottom -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!-- ENDS FOOTER -->\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
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