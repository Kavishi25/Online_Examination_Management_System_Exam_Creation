/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-20 09:37:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"home.png\" />\r\n");
      out.write("    <title>SmartExam</title>\r\n");
      out.write("    \r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"RegistrationAssets/CSS/homestyles.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">SmartExam</a>\r\n");
      out.write("      <button\r\n");
      out.write("        class=\"navbar-toggler\"\r\n");
      out.write("        type=\"button\"\r\n");
      out.write("        data-bs-toggle=\"collapse\"\r\n");
      out.write("        data-bs-target=\"#navbarNav\"\r\n");
      out.write("        aria-controls=\"navbarNav\"\r\n");
      out.write("        aria-expanded=\"false\"\r\n");
      out.write("        aria-label=\"Toggle navigation\"\r\n");
      out.write("      >\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"collapse navbar-collapse justify-content-between\"\r\n");
      out.write("        id=\"navbarNav\"\r\n");
      out.write("      >\r\n");
      out.write("        <ul class=\"navbar-nav justify-content-center flex-grow-1 pe-3\">\r\n");
      out.write("          <li class=\"nav-item active\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"Home.jsp\">Home</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"pricelist.jsp\">Courses</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"login.jsp\">Results</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"login.jsp\">Exams</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div>\r\n");
      out.write("        <a href=\"login.jsp\">\r\n");
      out.write("          <button class=\"btn btn-outline-primary mx-1\">Student Log In</button>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a href=\"teacherLogin.jsp\">\r\n");
      out.write("          <button class=\"btn btn-outline-primary mx-1\">Teacher Log In</button>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <header class=\"bg-image\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1>Exams Made Easy, <br />Anytime, Anywhere...</h1>\r\n");
      out.write("        <a href=\"login.jsp\">\r\n");
      out.write("        <button class=\"button-35\" role=\"button\">GET START</button>\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Why Smart Tuition Section -->\r\n");
      out.write("    <main class=\"l-card\">\r\n");
      out.write("      <section class=\"l-card__text\">\r\n");
      out.write("        <p>\r\n");
      out.write("          Your site demonstrates a strong foundation in both design and functionality, which is crucial for an online educational platform.\r\n");
      out.write("        </p>\r\n");
      out.write("      </section>\r\n");
      out.write("      <section class=\"l-card__user\">\r\n");
      out.write("        <div class=\"l-card__userImage\">\r\n");
      out.write("          <img src=\"https://avatars.githubusercontent.com/u/20525486?v=4\" alt=\"Naruto\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"l-card__userInfo\">\r\n");
      out.write("          <span>dasun</span>\r\n");
      out.write("          <span>dasun</span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </main>\r\n");
      out.write("    <main class=\"l-card\">\r\n");
      out.write("      <section class=\"l-card__text\">\r\n");
      out.write("        <p>\r\n");
      out.write("          Your platform’s emphasis on online examinations positions it as a valuable tool in assessing students’ knowledge effectively. \r\n");
      out.write("        </p>\r\n");
      out.write("      </section>\r\n");
      out.write("      <section class=\"l-card__user\">\r\n");
      out.write("        <div class=\"l-card__userImage\">\r\n");
      out.write("          <img src=\"https://avatars.githubusercontent.com/u/20525486?v=4\" alt=\"Naruto\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"l-card__userInfo\">\r\n");
      out.write("          <span>nethupul</span>\r\n");
      out.write("          <span>nethupul</span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </main>\r\n");
      out.write("    <main class=\"l-card\">\r\n");
      out.write("      <section class=\"l-card__text\">\r\n");
      out.write("        <p>\r\n");
      out.write("          You’ve used subtle animations like the fadeInUp effect to create a dynamic feel, which is engaging for users.knowledge effectively \r\n");
      out.write("        </p>\r\n");
      out.write("      </section>\r\n");
      out.write("      <section class=\"l-card__user\">\r\n");
      out.write("        <div class=\"l-card__userImage\">\r\n");
      out.write("          <img src=\"https://avatars.githubusercontent.com/u/20525486?v=4\" alt=\"Naruto\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"l-card__userInfo\">\r\n");
      out.write("          <span>thavidu</span>\r\n");
      out.write("          <span>thavidu</span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </main>\r\n");
      out.write("      <footer class=\"footer-section\">\r\n");
      out.write("        <div class=\"dcontainer\">\r\n");
      out.write("            <div class=\"footer-content\">\r\n");
      out.write("              <!-- <div class=\"footer-logo\">\r\n");
      out.write("                    <a href=\"Home.html\"><img src=\"https://i.ibb.co/QDy827D/ak-logo.png\" alt=\"Logo\"></a>\r\n");
      out.write("                </div>  -->\r\n");
      out.write("                <div class=\"footer-links\">\r\n");
      out.write("                    <h3>Quick Links</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"Home.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("                        <li><a href=\"login.jsp\">concerns</a></li>\r\n");
      out.write("                        <li><a href=\"pricelist.jsp\">Courses</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-contact\">\r\n");
      out.write("                    <h3>Contact Us</h3>\r\n");
      out.write("                    <p><i class=\"fas fa-map-marker-alt\"></i> 123 Street, City, Country</p>\r\n");
      out.write("                    <p><i class=\"fas fa-phone\"></i> +123 456 789</p>\r\n");
      out.write("                    <p><i class=\"fas fa-envelope\"></i> info@example.com</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-subscribe\">\r\n");
      out.write("                    <h3>Subscribe to our Newsletter</h3>\r\n");
      out.write("                    <form action=\"#\">\r\n");
      out.write("                        <input type=\"email\" placeholder=\"Your Email Address\" required>\r\n");
      out.write("                        <button type=\"submit\"><i class=\"fas fa-paper-plane\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <p>&copy; 2024 Your Company. All rights reserved.</p>\r\n");
      out.write("                <div class=\"footer-socials\">\r\n");
      out.write("                    <a href=\"https://facebook.com\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
