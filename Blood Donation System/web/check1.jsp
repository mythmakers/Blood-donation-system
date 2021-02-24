
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String bg = request.getParameter("blood-grp");
        Cookie cookie = new Cookie("bg",bg);
        response.addCookie(cookie);
        cookie.setMaxAge(90*60);
        response.sendRedirect("Details.jsp");
        %>
    </body>
</html>
