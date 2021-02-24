
package com.main.donor;

import com.main.util.JConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateProfile")
public class UpdateProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String address = request.getParameter("address");
        String phone = request.getParameter("phNo");
        String email = request.getParameter("email");
        String avail = request.getParameter("avail");
        
        Statement st = JConnect.getStatement();
        try{
            int i = st.executeUpdate("UPDATE `donorregister` SET `address`='"+address+"', `phoneNo`='"+phone+"', `email`='"+email+"', `availability`='"+avail+"' WHERE username='"+user+"'");
            
            if(i>0){
                RequestDispatcher rd = request.getRequestDispatcher("DonorHome.jsp");
                request.setAttribute("cp","Profile Update Successful!");
                rd.forward(request,response);
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("DonorHome.jsp");
                request.setAttribute("cp","There is Something Wrong in update! try after some time.");
                rd.forward(request,response);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
