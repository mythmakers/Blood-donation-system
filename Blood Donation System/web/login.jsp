
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .division{
            position: absolute;
            height: 50%;
            width: 50%;
            background-color: cyan;
            margin-left: 25%;
            margin-top: 10%;
            text-align: center;
        }
        td{
            padding: 10px;
        }
        .bt{
            padding: 5px 22px;
            border: none;
            outline: none;
            background-color: red;
            color: white;
        }
        .bt:hover{
            cursor: pointer;
        }
    </style>
    <body style="background-image:url('bg.jpg');">
        <%
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
        %>
        <script>
            window.alert("<%=request.getAttribute("msg")%>");
            window.location="login.jsp";
        </script>
        
        <%
                }
        %>
        
        <div class="division">
            <h2>Login User</h2>
            <form method="post" action="loginDonor">
                <table style="margin-left: 30%">
                    <tr>
                        <td><strong>Username :</strong></td>
                        <td><input type="text" name="username" placeholder="username" required><br></td>
                    </tr>
                    <tr>
                        <td><strong>Password :</strong></td>
                        <td><input type="password" name="password" placeholder="password" required><br></td>
                    </tr>
                    <%
                    if(request.getAttribute("loginmsg")!=null){
                        out.println(request.getAttribute("loginmsg"));
                    }
                    %>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login" class="bt">
                        <input type="reset" value="Reset" class="bt"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
