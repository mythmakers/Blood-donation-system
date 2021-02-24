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


@WebServlet("/donorRegister")
public class DonorRegisteration extends HttpServlet {


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
        String confirmPass = request.getParameter("conf-pass");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String bloodGroup = request.getParameter("blood-grp");
        String gender = request.getParameter("gen");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("ph-no");
        String avail = request.getParameter("avail");
        
        Statement st = JConnect.getStatement();
        RequestDispatcher rd=null;
	ResultSet rs=null;
        
        try {
            rs = st.executeQuery("select username from donorregister where username='"+username+"'");
            if(rs.next()){
                rd=request.getRequestDispatcher("Donor-Register.jsp");
                request.setAttribute("msg","User already exists! try another");
                rd.forward(request, response);
            }
            else{
                if(!password.equals(confirmPass)){
                    rd=request.getRequestDispatcher("Donor-Register.jsp");
                    request.setAttribute("msg","Password and Confirm Password doesn't match");
                    rd.forward(request, response);
                }
                else{
                    st.executeUpdate("insert into donorregister values('"+username+"','"+password+"','"+name+"','"+age+"','"+bloodGroup+"','"+gender+"','"+address+"','"+email+"','"+phone+"','"+avail+"')");
                    rd=request.getRequestDispatcher("login.jsp");
                    request.setAttribute("msg","Registered Successfully. You can login now!");
                    rd.forward(request, response);
                }
            }
	}
        catch (SQLException e1){
            e1.printStackTrace();
	}
        
    }

}
