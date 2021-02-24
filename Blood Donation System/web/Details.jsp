

<%@page import="java.sql.*"%>
<%@page import="com.main.util.JConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Details</title>
    </head>
    <style>
        .heading{
            margin-left: 40%;
        }
        a{
            text-decoration: none;
            margin-left: 90%;
        }
        a:hover{
            color: red;
        }
        .head{
            background-color: #04e900;
            color: whitesmoke;
            font: bold;
        }
        table{
            width: 100%;
        }
        td{
            padding: 15px 10px;
        }
        .a{
            width: 20%;
        }
        .b{
            width: 7%;
        }
        .d{
            width: 8%;
        }
        .e{
            width: 20%;
        }
        .f{
            width: 15%;
        }
    </style>
    <body>
        <%
            String bloodg = null;
            Cookie cookies[] = request.getCookies();
            if(cookies!=null)
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("bg"))
                    bloodg = cookie.getValue();
            }
            if(bloodg==null){
                response.sendRedirect("Donor-Search.jsp");
            }
        %>
        <a href="Donor-Search.jsp">< Back to search page</a>
        <h1 class="heading"><span style="color: #cc0000; font-size: 45px"><%=bloodg%></span> <span style="color: #04e900">Donor Details</span></h1>
        <input type="radio" checked="checked" onclick="location.href='all'" id="all" name="avail" style="margin-left: 90%">All
        <input type="radio" onclick="location.href='available'" id="avai" name="avail" style="margin-left: 90%">Available
        <table>
            <tr class="head">
                <td class="a">DONOR NAME</td>
                <td class="b">AGE</td>
                <td class="d">GENDER</td>
                <td class="e">ADDRESS</td>
                <td class="f">PHONE NUMBER</td>
                <td class="e">EMAIL</td>
                <td>AVAILABILITY</td>
            </tr>
            <%
                try{
                    Statement st = JConnect.getStatement();
                    String query = null;
                    String avail = "available";
                    query = "select * from donorregister where bloodGrp='"+bloodg+"'";
                    if(request.getAttribute("availmsg")!=null){
                        if(request.getAttribute("availmsg").equals("available")){
                            %>
                            <script>
                                document.getElementById("avai").checked = true;
                            </script>
                            <%
                            query = "select * from donorregister where bloodGrp='"+bloodg+"' and availability='"+avail+"'";
                        }
                    }
                    ResultSet rs = st.executeQuery(query);
                    
                    while(rs.next()){
            %>                
            <tr>
                <td class="a"><%=rs.getString("name")%></td>
                <td class="b"><%=rs.getString("age")%></td>
                <td class="d"><%=rs.getString("gender")%></td>
                <td class="e"><%=rs.getString("address")%></td>
                <td class="f"><%=rs.getString("phoneNo")%></td>
                <td class="e"><%=rs.getString("email")%></td>
                <td><%=rs.getString("availability")%></td>
            </tr>
            <%
                    }
                }
                catch(Exception e){
                    
                }
            %>
        </table>
    </body>
</html>
