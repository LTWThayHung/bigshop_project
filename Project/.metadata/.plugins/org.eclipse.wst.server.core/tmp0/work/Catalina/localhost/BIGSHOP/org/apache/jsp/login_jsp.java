/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2024-01-22 12:28:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1703217776000L));
    _jspx_dependants.put("jar:file:/E:/WEBDEVELOP/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BIGSHOP/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Big store a Ecommerce Online Shopping Category Flat\r\n");
      out.write("	Bootstrap Responsive Website Template | Login :: w3layouts</title>\r\n");
      out.write("<!-- for-mobile-apps -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta property=\"og:title\" content=\"Vide\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Big store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("	 addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("</script>\r\n");
      out.write("<!-- //for-mobile-apps -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	jQuery(document).ready(function($) {\r\n");
      out.write("		$(\".scroll\").click(function(event) {\r\n");
      out.write("			event.preventDefault();\r\n");
      out.write("			$('html,body').animate({\r\n");
      out.write("				scrollTop : $(this.hash).offset().top\r\n");
      out.write("			}, 1000);\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Noto+Sans:400,700'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--- start-rate---->\r\n");
      out.write("<script src=\"js/jstarbox.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\"\r\n");
      out.write("	media=\"screen\" charset=\"utf-8\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	jQuery(function() {\r\n");
      out.write("		jQuery('.starbox')\r\n");
      out.write("				.each(\r\n");
      out.write("						function() {\r\n");
      out.write("							var starbox = jQuery(this);\r\n");
      out.write("							starbox\r\n");
      out.write("									.starbox(\r\n");
      out.write("											{\r\n");
      out.write("												average : starbox\r\n");
      out.write("														.attr('data-start-value'),\r\n");
      out.write("												changeable : starbox\r\n");
      out.write("														.hasClass('unchangeable') ? false\r\n");
      out.write("														: starbox\r\n");
      out.write("																.hasClass('clickonce') ? 'once'\r\n");
      out.write("																: true,\r\n");
      out.write("												ghosting : starbox\r\n");
      out.write("														.hasClass('ghosting'),\r\n");
      out.write("												autoUpdateAverage : starbox\r\n");
      out.write("														.hasClass('autoupdate'),\r\n");
      out.write("												buttons : starbox\r\n");
      out.write("														.hasClass('smooth') ? false\r\n");
      out.write("														: starbox\r\n");
      out.write("																.attr('data-button-count') || 5,\r\n");
      out.write("												stars : starbox\r\n");
      out.write("														.attr('data-star-count') || 5\r\n");
      out.write("											})\r\n");
      out.write("									.bind(\r\n");
      out.write("											'starbox-value-changed',\r\n");
      out.write("											function(event, value) {\r\n");
      out.write("												if (starbox.hasClass('random')) {\r\n");
      out.write("													var val = Math.random();\r\n");
      out.write("													starbox.next().text(\r\n");
      out.write("															' ' + val);\r\n");
      out.write("													return val;\r\n");
      out.write("												}\r\n");
      out.write("											})\r\n");
      out.write("						});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<!---//End-rate---->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<a href=\"offer.html\"><img src=\"images/download.png\"\r\n");
      out.write("		class=\"img-head\" alt=\"\"></a>\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"logo\">\r\n");
      out.write("				<h1>\r\n");
      out.write("					<a href=\"index.jsp\"><b>T<br>H<br>E\r\n");
      out.write("					</b>Big Store<span>The Best Supermarket</span></a>\r\n");
      out.write("				</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"head-t\">\r\n");
      out.write("				<ul class=\"card\">\r\n");
      out.write("					<li><a href=\"wishlist.jsp\"><i class=\"fa fa-heart\"\r\n");
      out.write("							aria-hidden=\"true\"></i>Wishlist</a></li>\r\n");
      out.write("					<li><a href=\"login.jsp\"><i class=\"fa fa-user\"\r\n");
      out.write("							aria-hidden=\"true\"></i>Login</a></li>\r\n");
      out.write("					<li><a href=\"signup.jsp\"><i class=\"fa fa-arrow-right\"\r\n");
      out.write("							aria-hidden=\"true\"></i>Sign up</a></li>\r\n");
      out.write("					<li><a href=\"about.jsp\"><i class=\"fa fa-file-text-o\"\r\n");
      out.write("							aria-hidden=\"true\"></i>Order History</a></li>\r\n");
      out.write("					<li><a href=\"shipping.jsp\"><i class=\"fa fa-ship\"\r\n");
      out.write("							aria-hidden=\"true\"></i>Shipping</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"header-ri\">\r\n");
      out.write("				<ul class=\"social-top\">\r\n");
      out.write("					<li><a href=\"#\" class=\"icon facebook\"><i\r\n");
      out.write("							class=\"fa fa-facebook\" aria-hidden=\"true\"></i><span></span></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\"icon twitter\"><i\r\n");
      out.write("							class=\"fa fa-twitter\" aria-hidden=\"true\"></i><span></span></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\"icon pinterest\"><i\r\n");
      out.write("							class=\"fa fa-pinterest-p\" aria-hidden=\"true\"></i><span></span></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\"icon dribbble\"><i\r\n");
      out.write("							class=\"fa fa-dribbble\" aria-hidden=\"true\"></i><span></span></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"nav-top\">\r\n");
      out.write("				<nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"navbar-header nav_2\">\r\n");
      out.write("						<button type=\"button\"\r\n");
      out.write("							class=\"navbar-toggle collapsed navbar-toggle1\"\r\n");
      out.write("							data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\r\n");
      out.write("							<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("								class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("								class=\"icon-bar\"></span>\r\n");
      out.write("						</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\r\n");
      out.write("						<ul class=\"nav navbar-nav \">\r\n");
      out.write("							 <li class=\"\"><a href=\"");
      out.print(request.getContextPath());
      out.write("\" class=\"hyper \"><span>Home</span></a></li> \r\n");
      out.write("							\r\n");
      out.write("							");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							<li><a href=\"contact.jsp\" class=\"hyper\"><span>Contact\r\n");
      out.write("										Us</span></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</nav>\r\n");
      out.write("				<div class=\"cart\">\r\n");
      out.write("\r\n");
      out.write("					<span class=\"fa fa-shopping-cart my-cart-icon\"><span\r\n");
      out.write("						class=\"badge badge-notify my-cart-badge\"></span></span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!---->\r\n");
      out.write("	<!--banner-->\r\n");
      out.write("	<div class=\"banner-top\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h3>Login</h3>\r\n");
      out.write("			<h4>\r\n");
      out.write("				<a href=\"index.jsp\">Home</a><label>/</label>Login\r\n");
      out.write("			</h4>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!--login-->\r\n");
      out.write("\r\n");
      out.write("	<div class=\"login\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"main-agileits\">\r\n");
      out.write("			<div class=\"form-w3agile\">\r\n");
      out.write("				<h3>Login</h3>\r\n");
      out.write("				<form action=\"login\" method=\"post\">\r\n");
      out.write("				<p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mess}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("					<div class=\"key\">\r\n");
      out.write("						<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i> <input\r\n");
      out.write("							type=\"text\" value=\"Username\" name=\"user\" onfocus=\"this.value = '';\"\r\n");
      out.write("							onblur=\"if (this.value == '') {this.value = 'username';}\"\r\n");
      out.write("							required=\"\">\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"key\">\r\n");
      out.write("						<i class=\"fa fa-lock\" aria-hidden=\"true\"></i> <input\r\n");
      out.write("							type=\"password\" value=\"Password\" name=\"pass\"\r\n");
      out.write("							onfocus=\"this.value = '';\"\r\n");
      out.write("							onblur=\"if (this.value == '') {this.value = 'Password';}\"\r\n");
      out.write("							required=\"\">\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<input type=\"submit\" value=\"Login\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"forg\">\r\n");
      out.write("				<a href=\"#\" class=\"forg-left\">Forgot Password</a> \r\n");
      out.write("				<a href=\"signup.jsp\" class=\"forg-right\">Sign up</a>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!--footer-->\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("				<h3>About Us</h3>\r\n");
      out.write("				<p>Nam libero tempore, cum soluta nobis est eligendi optio\r\n");
      out.write("					cumque nihil impedit quo minus id quod maxime placeat facere\r\n");
      out.write("					possimus.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-3 footer-grid \">\r\n");
      out.write("				<h3>Menu</h3>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("					<li><a href=\"kitchen.jsp\">Kitchen</a></li>\r\n");
      out.write("					<li><a href=\"care.jsp\">Personal Care</a></li>\r\n");
      out.write("					<li><a href=\"hold.jsp\">Household</a></li>\r\n");
      out.write("					<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-3 footer-grid \">\r\n");
      out.write("				<h3>Customer Services</h3>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"shipping.jsp\">Shipping</a></li>\r\n");
      out.write("					<li><a href=\"terms.jsp\">Terms & Conditions</a></li>\r\n");
      out.write("					<li><a href=\"faqs.jsp\">Faqs</a></li>\r\n");
      out.write("					<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("					<li><a href=\"offer.jsp\">Online Shopping</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("				<h3>My Account</h3>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("					<li><a href=\"signup.jsp\">Sign Up</a></li>\r\n");
      out.write("					<li><a href=\"wishlist.jsp\">Wishlist</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("			<div class=\"footer-bottom\">\r\n");
      out.write("				<h2>\r\n");
      out.write("					<a href=\"index.jsp\"><b>T<br>H<br>E\r\n");
      out.write("					</b>Big Store<span>The Best Supermarket</span></a>\r\n");
      out.write("				</h2>\r\n");
      out.write("				<p class=\"fo-para\">Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("					adipiscing elit, sed do eiusmod tempor incididunt ut labore et\r\n");
      out.write("					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud\r\n");
      out.write("					exercitation ullamco laboris</p>\r\n");
      out.write("				<ul class=\"social-fo\">\r\n");
      out.write("					<li><a href=\"#\" class=\" face\"><i class=\"fa fa-facebook\"\r\n");
      out.write("							aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\" twi\"><i class=\"fa fa-twitter\"\r\n");
      out.write("							aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\" pin\"><i class=\"fa fa-pinterest-p\"\r\n");
      out.write("							aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"#\" class=\" dri\"><i class=\"fa fa-dribbble\"\r\n");
      out.write("							aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<div class=\" address\">\r\n");
      out.write("					<div class=\"col-md-4 fo-grid1\">\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fa fa-home\" aria-hidden=\"true\"></i>12K Street , 45\r\n");
      out.write("							Building Road Canada.\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-4 fo-grid1\">\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+1234 758 839 ,\r\n");
      out.write("							+1273 748 730\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-4 fo-grid1\">\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"mailto:info@example.com\"><i class=\"fa fa-envelope-o\"\r\n");
      out.write("								aria-hidden=\"true\"></i>info@example1.com</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"copy-right\">\r\n");
      out.write("				<p>\r\n");
      out.write("					&copy; 2016 Big store. All Rights Reserved | Design by <a\r\n");
      out.write("						href=\"http://w3layouts.com/\"> W3layouts</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //footer-->\r\n");
      out.write("	<!-- smooth scrolling -->\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			/*\r\n");
      out.write("				var defaults = {\r\n");
      out.write("				containerID: 'toTop', // fading element id\r\n");
      out.write("				containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("				scrollSpeed: 1200,\r\n");
      out.write("				easingType: 'linear' \r\n");
      out.write("				};\r\n");
      out.write("			 */\r\n");
      out.write("			$().UItoTop({\r\n");
      out.write("				easingType : 'easeOutQuart'\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span\r\n");
      out.write("		id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\r\n");
      out.write("	<!-- //smooth scrolling -->\r\n");
      out.write("	<!-- for bootstrap working -->\r\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("	<!-- //for bootstrap working -->\r\n");
      out.write("	<script type='text/javascript' src=\"js/jquery.mycart.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(function() {\r\n");
      out.write("\r\n");
      out.write("			var goToCartIcon = function($addTocartBtn) {\r\n");
      out.write("				var $cartIcon = $(\".my-cart-icon\");\r\n");
      out.write("				var $image = $(\r\n");
      out.write("						'<img width=\"30px\" height=\"30px\" src=\"'\r\n");
      out.write("								+ $addTocartBtn.data(\"image\") + '\"/>').css({\r\n");
      out.write("					\"position\" : \"fixed\",\r\n");
      out.write("					\"z-index\" : \"999\"\r\n");
      out.write("				});\r\n");
      out.write("				$addTocartBtn.prepend($image);\r\n");
      out.write("				var position = $cartIcon.position();\r\n");
      out.write("				$image.animate({\r\n");
      out.write("					top : position.top,\r\n");
      out.write("					left : position.left\r\n");
      out.write("				}, 500, \"linear\", function() {\r\n");
      out.write("					$image.remove();\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			$('.my-cart-btn').myCart({\r\n");
      out.write("				classCartIcon : 'my-cart-icon',\r\n");
      out.write("				classCartBadge : 'my-cart-badge',\r\n");
      out.write("				affixCartIcon : true,\r\n");
      out.write("				checkoutCart : function(products) {\r\n");
      out.write("					$.each(products, function() {\r\n");
      out.write("						console.log(this);\r\n");
      out.write("					});\r\n");
      out.write("				},\r\n");
      out.write("				clickOnAddToCart : function($addTocart) {\r\n");
      out.write("					goToCartIcon($addTocart);\r\n");
      out.write("				},\r\n");
      out.write("				getDiscountPrice : function(products) {\r\n");
      out.write("					var total = 0;\r\n");
      out.write("					$.each(products, function() {\r\n");
      out.write("						total += this.quantity * this.price;\r\n");
      out.write("					});\r\n");
      out.write("					return total * 1;\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /login.jsp(154,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/login.jsp(154,7) '${listAllCategory}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listAllCategory}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /login.jsp(154,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("c");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("							\r\n");
            out.write("							<li class=\"");
            out.write("\"><a href=\"category?cid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\" hyper\"><span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></a>\r\n");
            out.write("							</li>\r\n");
            out.write("							\r\n");
            out.write("							");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
