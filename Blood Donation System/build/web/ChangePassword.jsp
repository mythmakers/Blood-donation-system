

<%@page import="java.sql.*"%>
<%@page import="com.main.util.JConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .tab{
                margin-left: 40%;
                margin-top: 15%;
            }
            td{
                padding: 10px 15px;
                color: red;
            }
            .bt{
                padding: 8px 25px;
                border: none;
                outline: none;
                background-color: red;
                color: white;
                font: bold;
                }
                .bt:hover{
                    cursor: pointer;
                }
            
        </style>
    </head>
    <body >
        <%
            String user = null;
            Cookie[] cookies = request.getCookies();
            if(cookies!=null){
                for(Cookie cookie:cookies){
                    if(cookie.getName().equals("user"))
                        user = cookie.getValue();
                }
            }
            if(user!=null){
                
            }
            else{
                response.sendRedirect("login.jsp");
            }
        %>
        <div class="tab">
            <form method="post" action="change">
                <table>
                    <tr>
                        <td><strong>Current password</strong></td>
                        <td><input type="password" name="opassword" placeholder="Current password"></td>
                    </tr>
                     <tr>
                         <td><strong>New password</strong></td>
                        <td><input type="password" name="npassword" placeholder="New password"></td>
                    </tr>
                    <tr>
                        <td><strong>Confirm password</strong></td>
                        <td><input type="password" name="cpassword" placeholder="Confirm password"></td> 
                    </tr>
                    <tr>
                        <td colspan="2">
                            <%
                                if(request.getAttribute("changemsg")!=null){
                                    out.print(request.getAttribute("changemsg"));
                                }
                            %>
                        </td>
                    </tr>
                    <tr>
                        <td><input class="bt" type="submit" value="Update"></td>
                        <td><input class="bt" type="reset" value="Reset"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
