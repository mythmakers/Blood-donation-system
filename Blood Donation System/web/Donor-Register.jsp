

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Register</title>
    </head>
    <style>
        .header{
            position: absolute;
            left: 0;
            top: 0;
            border-bottom: 4px solid black;
            height: 40px;
            width: 100%;
            text-align: center;
            margin-top: 10px;
        }
        a{
            position: absolute;
            text-decoration: none;
            margin-left: 47%;
            margin-top: 1%;
        }
        a:hover{
            color: red;
        }
        .left{
            float: left;
            width: 40%;
            height: 100%;
            margin-top: 5%;
            margin-left: 15%;
        }
        .right{
            float: left;
            width: 45%;
            height: 100%;
            margin-top: 4%;
        }
        td{
            padding: 12px 14px;
            color: red;
        }
        .bt{
            padding: 8px 18px;
            background-color: red;
            color: white;
            outline: none;
            border: none;
        }
        .bt:hover{
            cursor: pointer;
        }
    </style>
    <body>
        <div class="header">
            <a href="index.jsp">< Back to home page</a>
            <strong style="font-size: 170%; color: red;">Blood Donor Form</strong>
        </div>
        <div class="left">
            <%
                if(request.getAttribute("msg")!=null){
                    out.println(request.getAttribute("msg"));
                }
            %>
            <form method="post" action="donorRegister">
                <table>
                    <tr>
                        <td><strong>Username :</strong></td>
                        <td><input type="text" name="username" required></td>
                    </tr>
                    <tr>
                        <td><strong>Password :</strong></td>
                        <td><input type="password" name="password" required></td>
                    </tr>
                    <tr>
                        <td><strong>Confirm Password :</strong></td>
                        <td><input type="password" name="conf-pass" required></td>
                    </tr>
                    <tr>
                        <td><strong>Name :</strong></td>
                        <td><input type="text" name="name" required></td>
                    </tr>
                    <tr>
                        <td><strong>Age :</strong></td>
                        <td><input type="number" name="age" required></td>
                    </tr>
                    <tr>
                        <td><strong>Blood Group :</strong></td>
                        <td><select id="blood-grp" name="blood-grp">
                                <option value="O+">O+</option>
                                <option value="O-">O-</option>
                                <option value="A+">A+</option>
                                <option value="A-">A-</option>
                                <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Gender :</strong></td>
                        <td><input type="radio" name="gen" value="male" required>Male
                        <input type="radio" name="gen" value="female" required>Female</td>
                    </tr>
                    <tr>
                        <td><strong>Address :</strong></td>
                        <td><textarea name="address" rows="4" required></textarea></td>
                    </tr>
                    <tr>
                        <td><strong>Email :</strong></td>
                        <td><input type="text" name="email" required></td>
                    </tr>
                    <tr>
                        <td><strong>Phone Number :</strong></td>
                        <td><input type="text" name="ph-no" required></td>
                    </tr>
                    <tr>
                        <td><strong>Availability :</strong></td>
                        <td><select name="avail">
                                <option value="available">available</option>
                                <option value="unavailable">unavailable</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="bt"></td>
                        <td><input type="reset" class="bt"></td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="right">
            <img src="registerimage.jpg" height="430px" width="430px">
            <img src="image1.jpg" height="200px" width="450px">
        </div>
    </body>
</html>
