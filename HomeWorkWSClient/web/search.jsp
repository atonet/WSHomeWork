<%@ page import="com.mark.hw.WS_Service" %>
<%@ page import="com.mark.hw.ArrayOfCourseScore" %>
<%@ page import="com.mark.hw.CourseScore" %>
<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 12-11-2
  Time: 下午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<table border="1px">
    <%
        String no = request.getParameter("no");
        WS_Service ws = new WS_Service();
        ArrayOfCourseScore alCourseScore = ws.getWSHttpPort().getScoresByStudentNo(no);
        for (int i = 0; i < alCourseScore.getCourseScore().size(); i++) {
            CourseScore courseScore = alCourseScore.getCourseScore().get(i);
            out.println("<tr><td>" + courseScore.getStudent().getValue().getName().getValue() + "</td>  ");
            out.println("<td>" + courseScore.getCourse().getValue().getName().getValue() + "</td>");
            out.println("<td>" + courseScore.getScore().getValue() + "</td></tr>");
        }
    %>
    <a href="index.jsp" name="">back</a>
</table>
</body>
</html>