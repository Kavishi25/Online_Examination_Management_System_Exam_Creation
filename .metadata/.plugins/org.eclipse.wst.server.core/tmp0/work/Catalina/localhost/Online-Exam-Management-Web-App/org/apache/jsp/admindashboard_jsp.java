/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-20 12:57:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"shortcut icon\" href=\"RegistrationAssets/IMGS/dash.png\">\r\n");
      out.write("    <title>ADMIN DASH</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"RegistrationAssets/CSS/adminstyle.css\" />\r\n");
      out.write("    <link\r\n");
      out.write("    href=\"https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css\"\r\n");
      out.write("    rel=\"stylesheet\"\r\n");
      out.write("  />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navigation\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon class=\"bx bxs-book-reader\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">SmartExam</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"admindashboard.jsp\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon name=\"home-outline\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Dashboard</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon class=\"bx bxs-envelope\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Exam Concerns</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"examForm.jsp\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon class =\"bx bxs-edit\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Create Exam</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"publishResults.jsp\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon name=\"megaphone\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Results Publishing</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon class= \"bx bxs-user\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Profile</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("  \r\n");
      out.write("           <br>\r\n");
      out.write("           <br>\r\n");
      out.write("           <br>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"Home.jsp\">\r\n");
      out.write("                <span class=\"icon\">\r\n");
      out.write("                  <ion-icon name=\"log-out-outline\"></ion-icon>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"title\">Sign Out</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"topbar\">\r\n");
      out.write("              <div class=\"toggle\">\r\n");
      out.write("                <ion-icon name=\"menu-outline\"></ion-icon>\r\n");
      out.write("              </div>\r\n");
      out.write("    \r\n");
      out.write("              <div class=\"search\">\r\n");
      out.write("                <label>\r\n");
      out.write("                  <input type=\"text\" placeholder=\"Search here\" />\r\n");
      out.write("                  <ion-icon name=\"search-outline\"></ion-icon>\r\n");
      out.write("                </label>\r\n");
      out.write("              </div>\r\n");
      out.write("    \r\n");
      out.write("              <div class=\"user\">\r\n");
      out.write("                <i class=\"bx bxs-user\" ></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cardBox\">\r\n");
      out.write("             \r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"numbers\">15   </div>\r\n");
      out.write("                    <a href=\"GetAllStudentServlet\">\r\n");
      out.write("                    <div class=\"cardName\"> All Students </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("              \r\n");
      out.write("      \r\n");
      out.write("                  <div class=\"iconBx\">\r\n");
      out.write("                    <i class=\"bx bxs-user\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("      \r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"numbers\">80</div>\r\n");
      out.write("                    <a href =\"paymentgetall\">\r\n");
      out.write("                    <div class=\"cardName\">Payments</div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("      \r\n");
      out.write("                  <div class=\"iconBx\">\r\n");
      out.write("                    <i class=\"bx bxs-wallet-alt\r\n");
      out.write("                    \"></i>\r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("      \r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"numbers\">284</div>\r\n");
      out.write("                    <a href =\"GetAllExamServlet\">\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"cardName\">Exams</div>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("      \r\n");
      out.write("                  <div class=\"iconBx\">\r\n");
      out.write("                    <i class=\"bx bxs-book\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("      \r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"numbers\">21</div>\r\n");
      out.write("                    <a href = \"getResultServlet\">\r\n");
      out.write("                    <div class=\"cardName\">Published Results</div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                     <div class=\"iconBx\">\r\n");
      out.write("                      <i class=\"bx bxs-file-blank\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"card\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <div class=\"numbers\">Admins</div>\r\n");
      out.write("                      <div class=\"cardName\"><ul>\r\n");
      out.write("                        <li>Dumindu</li>\r\n");
      out.write("                        <li>Kavishi</li>\r\n");
      out.write("                        <li>Hafsa</li>\r\n");
      out.write("                        <li>Kalana</li>\r\n");
      out.write("                        <li>Ravindu</li>\r\n");
      out.write("                      </ul></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                       <div class=\"iconBx\">\r\n");
      out.write("                        <i class=\"bx bxs-user\"></i>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                      <div>\r\n");
      out.write("                        <div class=\"numbers\">Instructors</div>\r\n");
      out.write("                        <div class=\"cardName\"><ul>\r\n");
      out.write("                          <li>Dumindu</li>\r\n");
      out.write("                          <li>Kavishi</li>\r\n");
      out.write("                          <li>Hafsa</li>\r\n");
      out.write("                          <li>Kalana</li>\r\n");
      out.write("                          <li>Ravindu</li>\r\n");
      out.write("                        </ul></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                         <div class=\"iconBx\">\r\n");
      out.write("                          <i class=\"bx bxs-user\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"card\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                          <div class=\"numbers\">Teachers</div>\r\n");
      out.write("                          <div class=\"cardName\"><ul>\r\n");
      out.write("                            <li>Dumindu</li>\r\n");
      out.write("                            <li>Kavishi</li>\r\n");
      out.write("                            <li>Hafsa</li>\r\n");
      out.write("                            <li>Kalana</li>\r\n");
      out.write("                            <li>Ravindu</li>\r\n");
      out.write("                          </ul></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                           <div class=\"iconBx\">\r\n");
      out.write("                            <i class=\"bx bxs-user\"></i>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                          <div>\r\n");
      out.write("                            <div class=\"numbers\">T.O</div>\r\n");
      out.write("                            <div class=\"cardName\"><ul>\r\n");
      out.write("                              <li>Dumindu</li>\r\n");
      out.write("                              <li>Kavishi</li>\r\n");
      out.write("                              <li>Hafsa</li>\r\n");
      out.write("                              <li>Kalana</li>\r\n");
      out.write("                              <li>Ravindu</li>\r\n");
      out.write("                            </ul></div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                             <div class=\"iconBx\">\r\n");
      out.write("                              <i class=\"bx bxs-user\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("              </div>\r\n");
      out.write("             \r\n");
      out.write("              \r\n");
      out.write("                \r\n");
      out.write("      \r\n");
      out.write("                \r\n");
      out.write("             \r\n");
      out.write("              \r\n");
      out.write("      \r\n");
      out.write("                \r\n");
      out.write("      \r\n");
      out.write("               \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("            <script src=\"RegistrationAssets/Script/admin.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        type=\"module\"\r\n");
      out.write("        src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"\r\n");
      out.write("      ></script>\r\n");
      out.write("      <script\r\n");
      out.write("        nomodule\r\n");
      out.write("        src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"\r\n");
      out.write("      ></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
