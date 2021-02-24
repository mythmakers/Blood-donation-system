
package com.main.donor;

import com.main.util.JConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/change")
public class Change extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opass = request.getParameter("opassword");
        String npass = request.getParameter("npassword");
        String cpass = request.getParameter("cpassword");
        String tpass = "";
        String user = null;
        
        Cookie cookies[] = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("user"))
                    user = cookie.getValue();
            }
            if(user!=null){
            }
            else{
                response.sendRedirect("login.jsp");
            }
        }else{
            response.sendRedirect("login.jsp");
        }
        
        if(npass.equals(cpass)){
            try{
                Statement st = JConnect.getStatement();
                ResultSet rs = st.executeQuery("select password from donorregister where username='"+user+"'");

                if(rs.next()){
                    tpass = rs.getString(1);
                    if(tpass.equals(opass)){
                        int i = st.executeUpdate("UPDATE `donorregister` SET `password`='"+npass+"' WHERE username='"+user+"'");
                        if(i>0){
                            RequestDispatcher rd = request.getRequestDispatcher("DonorHome.jsp");
                            request.setAttribute("cp","Password Changed Successfully!");
                            rd.forward(request,response);
                        }
                        else{
                            RequestDispatcher rd = request.getRequestDispatcher("DonorHome.jsp");
                            request.setAttribute("cp","Error in Changing Password! Try After Sometime.");
                            rd.forward(request,response);
                        }
                    }
                    else{
                        RequestDispatcher rd = request.getRequestDispatcher("ChangePassword.jsp");
                        request.setAttribute("changemsg","Please enter correct current password!");
                        rd.forward(request,response);
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("ChangePassword.jsp");
            request.setAttribute("changemsg","Confirm password doesn't match!");
            rd.forward(request,response);
        }
    }

}
