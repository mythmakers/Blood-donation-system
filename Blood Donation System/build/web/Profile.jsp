

<%@page import="java.sql.*"%>
<%@page import="com.main.util.JConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <style>
        table{
            margin-left: 30%;
            margin-top: 3%;
        }
        td{
            padding: 15px 30px;
        }
        input{
            width: 120%;
        }
        textarea{
            width: 120%;
        }
        button{
            padding: 2px 25px;
        }
    </style>
    <body>
        <%
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
           
        %>
        
        <div>
            <h1>Welcome </h1>
            <form method="post" action="updateProfile">
                <table>
                    <tr>
                        <td>Username :</td>
                        <td><input type="text" name="user" value="<%=user%>" readonly></td>
                        <td>*Not Changeable</td>
                    </tr>
                    <tr>
                        <td>Name :</td>
                        <td><input type="text" value="<%=name%>" readonly></td>
                        <td>*Not Changeable</td>
                    </tr>
                    <tr>
                        <td>Age :</td>
                        <td><input type="text" value="<%=age%>" readonly></td>
                        <td>*Not Changeable</td>
                    </tr>
                    <tr>
                        <td>Blood Group :</td>
                        <td><input type="text" value="<%=bloodgrp%>" readonly></td>
                        <td>*Not Changeable</td>
                    </tr>
                    <tr>
                        <td>Gender :</td>
                        <td><input type="text" value="<%=gender%>" readonly></td>
                        <td>*Not Changeable</td>
                    </tr>
                    <tr>
                        <td>Address :</td>
                        <td><textarea rows="4" id="address" name="address" readonly><%=address%></textarea></td>
                        <td><input type="button" value="Edit" onclick="edit('address')"></td>
                    </tr>
                    <tr>
                        <td>Phone Number :</td>
                        <td><input type="text" id="phNo" name="phNo" value="<%=phNo%>" readonly></td>
                        <td><input type="button" value="Edit" onclick="edit('phNo')"></td>
                    </tr>
                    <tr>
                        <td>Email :</td>
                        <td><input type="text" id="email" name="email" value="<%=email%>" readonly></td>
                        <td><input type="button" value="Edit" onclick="edit('email')"></td>
                    </tr>
                    <tr>
                        <td>Availability :</td>
                        <td>
                            <select name="avail" id="avail">
                                <option value="available">Available</option>
                                <option value="unavailable">Unavailable</option>
                            </select>
                        </td>
                        <%
                            if(avail.equals("available")){
                        %>
                                <script>document.getElementById('avail').value = "available";</script>
                        <%
                            }
                            else{
                        %>
                                <script>document.getElementById('avail').value = "unavailable";</script>
                        <%
                            }
            }
            else{
                response.sendRedirect("login.jsp");
            }
                        %>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Update" style="height: 40px; width: 150px;"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
    <script>
        function edit(id){
            document.getElementById(id).readOnly = false;
        }
    </script>
</html>
