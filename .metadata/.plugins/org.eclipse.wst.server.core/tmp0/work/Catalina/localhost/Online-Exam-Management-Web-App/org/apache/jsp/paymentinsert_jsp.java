/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-20 12:58:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentinsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Payment Gateway</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        function validateForm() {\r\n");
      out.write("            const amountInput = document.querySelector('input[name=\"amount\"]');\r\n");
      out.write("            const amountValue = parseFloat(amountInput.value);\r\n");
      out.write("            const errorMessage = document.getElementById('error-message');\r\n");
      out.write("            errorMessage.style.display = 'none'; \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            if (isNaN(amountValue) || amountValue <= 0) {\r\n");
      out.write("                errorMessage.style.display = 'block'; \r\n");
      out.write("                return false; \r\n");
      out.write("            }\r\n");
      out.write("            return true; \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function isNumber(evt) {\r\n");
      out.write("            const char = String.fromCharCode(evt.which);\r\n");
      out.write("            if (!/[\\d-]/.test(char)) {\r\n");
      out.write("                evt.preventDefault();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function formatCardNumber(input) {\r\n");
      out.write("            let value = input.value.replace(/\\D/g, '');\r\n");
      out.write("            const formattedValue = value.replace(/(\\d{4})(?=\\d)/g, '$1-');\r\n");
      out.write("            input.value = formattedValue; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <form action=\"inserservelat\" method=\"post\"  onsubmit=\"return validateForm()\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h3 class=\"title\">\r\n");
      out.write("                        user details\r\n");
      out.write("                    </h3>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"name\">\r\n");
      out.write("                              Full Name:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" \r\n");
      out.write("                               placeholder=\"ex-kalana karunarathna\" \r\n");
      out.write("                               required pattern=\"^[a-zA-Z]+ [a-zA-Z]+$\"\r\n");
      out.write("                               title=\"Full name must include at least two parts separated by a space (e.g., 'John Doe')\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"email\">\r\n");
      out.write("                              Email:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"email\" \r\n");
      out.write("                               placeholder=\"example@gmail.com\" \r\n");
      out.write("                               required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"address\">\r\n");
      out.write("                              Addresss\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"address\" \r\n");
      out.write("                               placeholder=\"Enter address\" \r\n");
      out.write("                               required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"city\">\r\n");
      out.write("                              City:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"city\" \r\n");
      out.write("                               placeholder=\"Enter city\" \r\n");
      out.write("                               required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"flex\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"inputBox\">\r\n");
      out.write("                            <label for=\"state\">\r\n");
      out.write("                                  State:\r\n");
      out.write("                              </label>\r\n");
      out.write("                            <input type=\"text\" name=\"state\" \r\n");
      out.write("                                   placeholder=\"Enter state\" \r\n");
      out.write("                                   required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"inputBox\">\r\n");
      out.write("                            <label for=\"zip\">\r\n");
      out.write("                                  Zip Code:\r\n");
      out.write("                              </label>\r\n");
      out.write("                            <input type=\"number\" name=\"zipcode\" \r\n");
      out.write("                                   placeholder=\"123 456\" maxlength=\"6\"  min=\"100000\" max=\"999999\"\r\n");
      out.write("                                   required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h3 class=\"title\">Payment</h3>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"name\">\r\n");
      out.write("                              Card Accepted:\r\n");
      out.write("                          </label>\r\n");
      out.write("                  <img src=\"https://upload.wikimedia.org/wikipedia/commons/0/04/Visa.svg\" alt=\"Visa\" width=\"50px\">\r\n");
      out.write("                            <img src=\"https://upload.wikimedia.org/wikipedia/commons/b/b5/PayPal.svg\" alt=\"PayPal\" width=\"50px\">\r\n");
      out.write("                            <img src=\"https://upload.wikimedia.org/wikipedia/commons/a/a4/Mastercard_2019_logo.svg\" alt=\"MasterCard\" width=\"50px\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"cardName\">\r\n");
      out.write("                              Name On Card:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"cardname\" \r\n");
      out.write("                               placeholder=\"Enter card name\" \r\n");
      out.write("                               required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"cardNum\">\r\n");
      out.write("                              Credit Card Number:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"cardnumber\" \r\n");
      out.write("                               placeholder=\"1111-2222-3333-4444\" \r\n");
      out.write("                               maxlength=\"19\" pattern=\"\\d{4}-\\d{4}-\\d{4}-\\d{4}\" title=\"Enter a valid card number (format: xxxx-xxxx-xxxx-xxxx)\" \r\n");
      out.write("                               required onkeypress=\"return isNumber(event)\" \r\n");
      out.write("                           oninput=\"formatCardNumber(this)\">\r\n");
      out.write("                               >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"inputBox\">\r\n");
      out.write("    <label for=\"year\">Expire Year:</label>\r\n");
      out.write("    <select name=\"expyear\" required>\r\n");
      out.write("        <option value=\"\" disabled selected>Select a year</option>\r\n");
      out.write("    \r\n");
      out.write("        <option value=\"2024\">2024</option>\r\n");
      out.write("        <option value=\"2023\">2023</option>\r\n");
      out.write("        <option value=\"2022\">2022</option>\r\n");
      out.write("        <option value=\"2024\">2021</option>\r\n");
      out.write("        <option value=\"2023\">2020</option>\r\n");
      out.write("        <option value=\"2022\">2019</option>\r\n");
      out.write("         <option value=\"2024\">2018</option>\r\n");
      out.write("        <option value=\"2023\">2017</option>\r\n");
      out.write("        <option value=\"2022\">2016</option>\r\n");
      out.write(" \r\n");
      out.write("    </select>\r\n");
      out.write("</div>\r\n");
      out.write("               <div class=\"inputBox\">\r\n");
      out.write("    <label for=\"year\">Expire month:</label>\r\n");
      out.write("    <select name=\"expmonth\" required>\r\n");
      out.write("        <option value=\"\" disabled selected>Select a month</option>\r\n");
      out.write("    \r\n");
      out.write("        <option value=\"january\">january</option>\r\n");
      out.write("        <option value=\"february\">february</option>\r\n");
      out.write("        <option value=\"march\">march</option>\r\n");
      out.write("        <option value=\"april\">april</option>\r\n");
      out.write("        <option value=\"may\">may</option>\r\n");
      out.write("        <option value=\"june\">june</option>\r\n");
      out.write("         <option value=\"july\">july</option>\r\n");
      out.write("        <option value=\"august\">august</option>\r\n");
      out.write("        <option value=\"september\">september</option>\r\n");
      out.write("        <option value=\"october\">october</option>\r\n");
      out.write("        <option value=\"november\">november</option>\r\n");
      out.write("        <option value=\"december\">december</option>\r\n");
      out.write(" \r\n");
      out.write("    </select>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"cvv\">\r\n");
      out.write("                              cvv:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"cvv\" \r\n");
      out.write("                               placeholder=\"Enter cvv\" \r\n");
      out.write("                              maxlength=\"3\" pattern=\"\\d{3}\" title=\"CVV must be 3 digits\"  required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("   <div class=\"inputBox\">\r\n");
      out.write("                        <label for=\"cvv\">\r\n");
      out.write("                              amount:\r\n");
      out.write("                          </label>\r\n");
      out.write("                        <input type=\"text\" name=\"amount\" \r\n");
      out.write("                               placeholder=\"amount$\" \r\n");
      out.write("                             min=\"0\"  required > \r\n");
      out.write("                              <span id=\"error-message\" style=\"color: red; display: none;\">Enter a valid amount (greater than 0)</span>\r\n");
      out.write("                    </div>                  \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                       <input type=\"submit\" value=\"save\" \r\n");
      out.write("                   class=\"submit_btn\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("</form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}