

<%@page import="java.sql.*"%>
<%@page import="com.main.util.JConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .header{
                position: absolute;
                width: 40%;
                right: 0;
            }
            .h-bt{
                float: left;
                width: 33%;
                height: 50px;
                background-color: #04e900;
                color: white;
                border: none;
                outline: none;
                font-size: 16px;
            }
            .h-bt:hover{
                background-color: #b32d00;
                cursor: pointer;
            }
            h1{
                position: absolute;
                margin-left: 20%;
                margin-top: 10%;
                font-size: 64px;
            }
        </style>
    </head>
    <body style="background-color: whitesmoke;">
        <div class="header">
            <button onclick="location.href='Profile.jsp'" class="h-bt">Edit Profile</button>
            <button onclick="location.href='ChangePassword.jsp'" class="h-bt">Change password</button>
            <button onclick="location.href='logout'" class="h-bt">Log Out</button>
        </div>
        <%
            if(request.getAttribute("cp")!=null){
                %>
                <script>
                    window.alert("<%=request.getAttribute("cp")%>");
                    window.location = 'DonorHome.jsp';
                </script>
                <%
            }
            
            String user = null;
            String name = null;
            Cookie[] cookies = request.getCookies();
            if(cookies!=null){
                for(Cookie cookie:cookies){
                    if(cookie.getName().equals("user"))
                        user = cookie.getValue();
                }
                if(user!=null){
                    try{
                        Statement st = JConnect.getStatement();
                        ResultSet rs = st.executeQuery("select name from donorregister where username='"+user+"'");
                        if(rs.next())
                            name = rs.getString(1);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                else{
                    response.sendRedirect("login.jsp");
                }
            }
            else{
                response.sendRedirect("login.jsp");
            }
        %>
        <div>
            <h1>Welcome <%=name%></h1>
        </div>
        
    </body>
</html>
