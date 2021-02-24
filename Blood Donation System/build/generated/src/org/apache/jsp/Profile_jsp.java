package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.main.util.JConnect;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            margin-left: 30%;\n");
      out.write("            margin-top: 3%;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            padding: 15px 30px;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            width: 120%;\n");
      out.write("        }\n");
      out.write("        textarea{\n");
      out.write("            width: 120%;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            padding: 2px 25px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user = null;
            String name = null;
            String age = null;
            String bloodgrp = null;
            String gender = null;
            String address = null;
            String phNo = null;
            String email = null;
            String avail = null;
            ResultSet rs = null;
            Cookie[] cookies = request.getCookies();
            if(cookies!=null){
                for(Cookie cookie:cookies){
                    if(cookie.getName().equals("user"))
                        user = cookie.getValue();
                }
            }
            if(user!=null){
                Statement st = JConnect.getStatement();
                rs = st.executeQuery("select * from donorregister where username='"+user+"'");
                if(rs.next()){
                    name=rs.getString("name");
                    age=rs.getString("age");
                    bloodgrp=rs.getString("bloodGrp");
                    gender=rs.getString("gender");
                    address=rs.getString("address");
                    phNo=rs.getString("phoneNo");
                    email=rs.getString("email");
                    avail=rs.getString("availability");
                }
            }
            else{
                response.sendRedirect("login.jsp");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h1>Welcome </h1>\n");
      out.write("            <form method=\"post\" action=\"updateProfile\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"user\" value=\"");
      out.print(user);
      out.write("\" readonly></td>\n");
      out.write("                        <td>*Not Changeable</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name :</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(name);
      out.write("\" readonly></td>\n");
      out.write("                        <td>*Not Changeable</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Age :</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(age);
      out.write("\" readonly></td>\n");
      out.write("                        <td>*Not Changeable</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Blood Group :</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(bloodgrp);
      out.write("\" readonly></td>\n");
      out.write("                        <td>*Not Changeable</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender :</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(gender);
      out.write("\" readonly></td>\n");
      out.write("                        <td>*Not Changeable</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address :</td>\n");
      out.write("                        <td><textarea rows=\"4\" id=\"address\" name=\"address\" readonly>");
      out.print(address);
      out.write("</textarea></td>\n");
      out.write("                        <td><input type=\"button\" value=\"Edit\" onclick=\"edit('address')\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phone Number :</td>\n");
      out.write("                        <td><input type=\"text\" id=\"phNo\" name=\"phNo\" value=\"");
      out.print(phNo);
      out.write("\" readonly></td>\n");
      out.write("                        <td><input type=\"button\" value=\"Edit\" onclick=\"edit('phNo')\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email :</td>\n");
      out.write("                        <td><input type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" readonly></td>\n");
      out.write("                        <td><input type=\"button\" value=\"Edit\" onclick=\"edit('email')\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Availability :</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"avail\" id=\"avail\">\n");
      out.write("                                <option value=\"available\">Available</option>\n");
      out.write("                                <option value=\"unavailable\">Unavailable</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                        ");

                            if(avail.equals("available")){
                        
      out.write("\n");
      out.write("                                <script>document.getElementById('avail').value = \"available\";</script>\n");
      out.write("                        ");

                            }
                            else{
                        
      out.write("\n");
      out.write("                                <script>document.getElementById('avail').value = \"unavailable\";</script>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Update\" style=\"height: 40px; width: 150px;\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function edit(id){\n");
      out.write("            document.getElementById(id).readOnly = false;\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
