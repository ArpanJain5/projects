/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-24 09:50:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Seller;

public final class seller_002dchange_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Seller");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"Male_Fashion Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Male_Fashion, unica, creative, html\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Male-Fashion | Template</title>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("        addEventListener(\"load\", function() {\r\n");
      out.write("            setTimeout(hideURLbar, 0);\r\n");
      out.write("        }, false);\r\n");
      out.write("\r\n");
      out.write("        function hideURLbar() {\r\n");
      out.write("            window.scrollTo(0, 1);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

Seller s = null;
if(session.getAttribute("data")!=null){
	s = (Seller)session.getAttribute("data");
}
else{
	response.sendRedirect("seller-login.jsp");
}

      out.write("\r\n");
      out.write("    <!-- Page Preloder -->\r\n");
      out.write("    <div id=\"preloder\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Offcanvas Menu Begin -->\r\n");
      out.write("    <div class=\"offcanvas-menu-overlay\"></div>\r\n");
      out.write("    <div class=\"offcanvas-menu-wrapper\">\r\n");
      out.write("        <div class=\"offcanvas__option\">\r\n");
      out.write("            <div class=\"offcanvas__links\">\r\n");
      out.write("                <a href=\"#\">Sign in</a>\r\n");
      out.write("                <a href=\"#\">FAQs</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"offcanvas__top__hover\">\r\n");
      out.write("                <span>Usd <i class=\"arrow_carrot-down\"></i></span>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>USD</li>\r\n");
      out.write("                    <li>EUR</li>\r\n");
      out.write("                    <li>USD</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"offcanvas__nav__option\">\r\n");
      out.write("            <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\r\n");
      out.write("            <div class=\"price\">$0.00</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"mobile-menu-wrap\"></div>\r\n");
      out.write("        <div class=\"offcanvas__text\">\r\n");
      out.write("            <p>Free shipping, 30-day return or refund guarantee.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Offcanvas Menu End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Section Begin -->\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"header__top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-7\">\r\n");
      out.write("                        <div class=\"header__top__left\">\r\n");
      out.write("                            <p>Free shipping, 30-day return or refund guarantee.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-5\">\r\n");
      out.write("                        <div class=\"header__top__right\">\r\n");
      out.write("                            <div class=\"header__top__links\">\r\n");
      out.write("                                <a href=\"#\">Sign in</a>\r\n");
      out.write("                                <a href=\"#\">FAQs</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"header__top__hover\">\r\n");
      out.write("                                <span>Usd <i class=\"arrow_carrot-down\"></i></span>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>USD</li>\r\n");
      out.write("                                    <li>EUR</li>\r\n");
      out.write("                                    <li>USD</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__logo\">\r\n");
      out.write("                        <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"./index.html\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"./shop.html\">Shop</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Pages</a>\r\n");
      out.write("                                <ul class=\"dropdown\">\r\n");
      out.write("                                    <li><a href=\"./about.html\">About Us</a></li>\r\n");
      out.write("                                    <li><a href=\"./shop-details.html\">Shop Details</a></li>\r\n");
      out.write("                                    <li><a href=\"./shopping-cart.html\">Shopping Cart</a></li>\r\n");
      out.write("                                    <li><a href=\"./checkout.html\">Check Out</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">Registration</a>\r\n");
      out.write("                            <ul class=\"dropdown\">\r\n");
      out.write("                                    <li><a href=\"seller-registration.jsp\">Seller Registration</a></li>\r\n");
      out.write("                                    <li><a href=\"customer-registration.jsp\">Customer Registration</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"./contact.html\">Contacts</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__nav__option\">\r\n");
      out.write("                        <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\r\n");
      out.write("                        <div class=\"price\">$0.00</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Map Begin -->\r\n");
      out.write("    <div class=\"map\">\r\n");
      out.write("        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d111551.9926412813!2d-90.27317134641879!3d38.606612219170856!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54eab584e432360b%3A0x1c3bb99243deb742!2sUnited%20States!5e0!3m2!1sen!2sbd!4v1597926938024!5m2!1sen!2sbd\" height=\"500\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Map End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Contact Section Begin -->\r\n");
      out.write("    <section class=\"contact spad\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <div class=\"contact__text\">\r\n");
      out.write("                        <div class=\"section-title\">\r\n");
      out.write("                            <span>Information</span>\r\n");
      out.write("                            <h2>Contact Us</h2>\r\n");
      out.write("                            <p>As you might expect of a company that began as a high-end interiors contractor, we pay\r\n");
      out.write("                                strict attention.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <h4>America</h4>\r\n");
      out.write("                                <p>195 E Parker Square Dr, Parker, CO 801 <br />+43 982-314-0958</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <h4>France</h4>\r\n");
      out.write("                                <p>109 Avenue Léon, 63 Clermont-Ferrand <br />+12 345-423-9893</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <div class=\"contact__form\">\r\n");
      out.write("                        <form action=\"SellerController\" method=\"post\">\r\n");
      out.write("                        <input type=\"hidden\" class=\"email\" name=\"email\" value=\"");
      out.print(s.getEmail() );
      out.write("\">\r\n");
      out.write("                        <input type=\"password\" name=\"npassword\" placeholder=\"New Password\" required=\"\">\r\n");
      out.write("                        <input type=\"password\" name=\"cnpassword\" placeholder=\"Confirm New Password\" required=\"\">\r\n");
      out.write("                        <div class=\"read mt-3\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Change Password\" name=\"action\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Contact Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer Section Begin -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__about\">\r\n");
      out.write("                        <div class=\"footer__logo\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"img/footer-logo.png\" alt=\"\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>The customer is at the heart of our unique business model, which includes design.</p>\r\n");
      out.write("                        <a href=\"#\"><img src=\"img/payment.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2 offset-lg-1 col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>Shopping</h6>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Clothing Store</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Trending Shoes</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Sale</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2 col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>Shopping</h6>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Payment Methods</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Delivary</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Return & Exchanges</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 offset-lg-1 col-md-6 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>NewLetter</h6>\r\n");
      out.write("                        <div class=\"footer__newslatter\">\r\n");
      out.write("                            <p>Be the first to know about new arrivals, look books, sales & promos!</p>\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Your email\">\r\n");
      out.write("                                <button type=\"submit\"><span class=\"icon_mail_alt\"></span></button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <div class=\"footer__copyright__text\">\r\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                        <p>Copyright ©\r\n");
      out.write("                            <script>\r\n");
      out.write("                                document.write(new Date().getFullYear());\r\n");
      out.write("                            </script>2020\r\n");
      out.write("                            All rights reserved | This template is made with <i class=\"fa fa-heart-o\"\r\n");
      out.write("                                aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Footer Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Search Begin -->\r\n");
      out.write("    <div class=\"search-model\">\r\n");
      out.write("        <div class=\"h-100 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"search-close-switch\">+</div>\r\n");
      out.write("            <form class=\"search-model-form\">\r\n");
      out.write("                <input type=\"text\" id=\"search-input\" placeholder=\"Search here.....\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Search End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"js/mixitup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}