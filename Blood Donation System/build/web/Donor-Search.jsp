
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Details</title>
    </head>
    <style>
        a{
            text-decoration: none;
            margin-left: 90%;
        }
        a:hover{
            color: red;
        }
        .getDetail{
            margin-left: 10%;
            margin-top: 8%;
        }
        t{
            font-size: 20px;
            color: red;
            margin-right: 1%;
        }
        .bt{
            margin-left: 3%;
            padding: 15px 30px;
            border: none;
            outline: none;
            background-color: #04e900;
            color: white;
            font-size: 16px;
        }
    </style>
    <body>
        <a href="index.jsp">< Back to home page</a>
        <h1 style="color: red; margin-left: 10%">DONOR DETAILS</h1>
        <div class="getDetail">
            <form method="post" action="check1.jsp">
                <t><strong>SELECT BLOOD GROUP : </strong></t>
                <select id="blood-grp" name="blood-grp">
                    <option value="O+">O+</option>
                    <option value="O-">O-</option>
                    <option value="A+">A+</option>
                    <option value="A-">A-</option>
                    <option value="B+">B+</option>
                    <option value="B-">B-</option>
                    <option value="AB+">AB+</option>
                    <option value="AB-">AB-</option>
                </select><br><br><br><br><br>
                <input class="bt" type="submit" value="GET DETAILS">
                <%--<input class="bt" type="reset" value="RESET">--%>
            </form>
        </div>
    </body>
</html>
