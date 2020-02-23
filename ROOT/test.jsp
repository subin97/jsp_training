<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html">
    <title>Main</title>
</head>
<body>
    <p>Test</p>
    <p>한글 테스트</p>
    <%  int total=0;
        for (int cnt=1;cnt<=100;cnt++)
            total+=cnt;
    %>
    1+2+3+...+100=<%= total %>
</body>
</html>