
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


@WebServlet("/loginDonor")
public class DonorLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Cookie cookie = new Cookie("user",username);
        cookie.setMaxAge(90*60);
        response.addCookie(cookie);
        
        Statement st = JConnect.getStatement();
        
        try{
            ResultSet rs = st.executeQuery("select password from donorregister where username='"+username+"'");
            if(rs.next()){
                if(password.equals(rs.getString(1))){
                    response.sendRedirect("DonorHome.jsp");
                }
                else{
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    request.setAttribute("loginmsg","Incorrect email or password!");
                    rd.forward(request,response);
                }
            }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		request.setAttribute("loginmsg","User doesn't exists");
		rd.forward(request,response);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
