

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Donation</title>
    </head>
    <style>
        body{
            background-image: url('background.jpg');
            background-color: #b3d9ff;
            background-repeat: no-repeat;
            background-position-x: 47.9%;
            background-position-y: 69px;
            <%--background-size: 100% 9000%;--%>
        }
        .header{
            position: absolute;
            left: 0;
            top: 0;
            height: 60px;
            width: 100%;
            background-color: transparent;
        }
        .left{
            float: left;
            width: 70%;
            height: 100%;
        }
        .right{
            float: left;
            width: 30%;
            height: 100%;
        }
        .header-bt{
            height: 100%;
            width: 100px;
            font-size: 100%;
            margin-left: 10px;
            background-color: transparent;
            border: none;
            outline: none;
        }
        .header-bt:hover{
            background-color: red;
            color: white;
        }
        .reg-donor{
            position: absolute;
            height: 50px;
            width: 40%;
            margin-left: 28%;
            margin-top: 17%;
        }
        .bt-reg{
            height: 100%;
            width: 100%;
            background-color: #04e900;
            border: none;
            outline: none;
            color: white;
            font-size: 120%;
        }
        .bt-reg:hover{
            cursor: pointer;
        }
        .red{
            position: absolute;
            left: 0;
            height: 60px;
            width: 100%;
            margin-top: 31.75%;
        }
        .white{
            height: 100%;
            background-color: transparent;
            width: 52.36%;
            float: left;
        }
    </style>
    <body>
        <div class="header">
            <div class="left"></div>
            <div class="right">
                <button class="header-bt" onclick="location.href='index.jsp'">Home</button>
                <button class="header-bt" onclick="location.href='About-Us.html'">About Us</button>
                <button class="header-bt" onclick="location.href='login.jsp'">Login</button>
            </div>
        </div>
        <div class="red">
            <div style="background-color: #b32d00; width: 22.8%; height: 100%; float: left; opacity: 0.9"></div>
            <div class="white"></div>
            <div style="background-color: #b32d00; width: 24.8%; height: 100%; float: left; opacity: 0.9"></div>
        </div>
        <div class="reg-donor">
            <button class="bt-reg" onclick="location.href='Donor-Register.jsp'">Register as a Blood Donor</button>
        </div>
        <div class="reg-donor" style="margin-top: 32.4%;">
            <button class="bt-reg" onclick="location.href='Donor-Search.jsp'">Search as a Blood Donor</button>
        </div>
    </body>
</html>
