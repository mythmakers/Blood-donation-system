package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Doner_002dRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doner Register</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .header{\n");
      out.write("            position: absolute;\n");
      out.write("            left: 0;\n");
      out.write("            top: 0;\n");
      out.write("            border-bottom: 4px solid black;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .left{\n");
      out.write("            float: left;\n");
      out.write("            width: 55%;\n");
      out.write("            height: 100%;\n");
      out.write("            margin-top: 5%;\n");
      out.write("            margin-left: 5%;\n");
      out.write("        }\n");
      out.write("        .right{\n");
      out.write("            float: left;\n");
      out.write("            width: 40%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            padding: 10px;\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        .bt{\n");
      out.write("            padding: 8px 18px;\n");
      out.write("            background-color: red;\n");
      out.write("            color: white;\n");
      out.write("            outline: none;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("        .bt:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <strong style=\"font-size: 170%; color: red;\">Blood Doner Form</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            ");

                if(request.getAttribute("msg")!=null){
                    out.println(request.getAttribute("msg"));
                }
            
      out.write("\n");
      out.write("            <form method=\"post\" action=\"donerRegister\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Username :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"username\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Password :</strong></td>\n");
      out.write("                        <td><input type=\"password\" name=\"password\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Confirm Password :</strong></td>\n");
      out.write("                        <td><input type=\"password\" name=\"conf-pass\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Name :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Age :</strong></td>\n");
      out.write("                        <td><input type=\"number\" name=\"age\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Blood Group :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"blood-grp\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Gender :</strong></td>\n");
      out.write("                        <td><input type=\"radio\" name=\"gen\" value=\"male\" required>Male\n");
      out.write("                        <input type=\"radio\" name=\"gen\" value=\"female\" required>Female</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Address :</strong></td>\n");
      out.write("                        <td><textarea name=\"address\" rows=\"4\" required></textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Email :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Phone Number :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"ph-no\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" class=\"bt\"></td>\n");
      out.write("                        <td><input type=\"reset\" class=\"bt\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            ");

            
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
