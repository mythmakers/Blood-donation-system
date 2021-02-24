package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .division{\n");
      out.write("            position: absolute;\n");
      out.write("            height: 50%;\n");
      out.write("            width: 50%;\n");
      out.write("            background-color: cyan;\n");
      out.write("            margin-left: 25%;\n");
      out.write("            margin-top: 10%;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        .bt{\n");
      out.write("            padding: 5px 22px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            background-color: red;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .bt:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body style=\"background-image:url('bg.jpg');\">\n");
      out.write("        ");

            String user = null;
            Cookie cookies[] = request.getCookies();
            if(cookies!=null)
            {
                for(Cookie cookie:cookies)
                {
                    if(cookie.getName().equals("user"))
                        user = cookie.getValue();
                    if(user!=null)
                        response.sendRedirect("DonorHome.jsp");
                }
            }
                if(request.getAttribute("msg")!=null){
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"");
      out.print(request.getAttribute("msg"));
      out.write("\");\n");
      out.write("            window.location=\"login.jsp\";\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        ");

                }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"division\">\n");
      out.write("            <h2>Login User</h2>\n");
      out.write("            <form method=\"post\" action=\"loginDonor\">\n");
      out.write("                <table style=\"margin-left: 30%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Username :</strong></td>\n");
      out.write("                        <td><input type=\"text\" name=\"username\" placeholder=\"username\" required><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Password :</strong></td>\n");
      out.write("                        <td><input type=\"password\" name=\"password\" placeholder=\"password\" required><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    if(request.getAttribute("loginmsg")!=null){
                        out.println(request.getAttribute("loginmsg"));
                    }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Login\" class=\"bt\">\n");
      out.write("                        <input type=\"reset\" value=\"Reset\" class=\"bt\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
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
