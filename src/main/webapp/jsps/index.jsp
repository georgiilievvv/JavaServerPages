<%--
  Created by IntelliJ IDEA.
  User: joroi
  Date: 2/3/2019
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <c:import url="templates/head.jsp"/>
</head>
<body>
<div class="container">
    <main class="jumbotron">
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h1>Welcome to MeTube</h1>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h3>Cool app in beta version</h3>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-6 d-flex justify-content-center">
                <a href="/tubes/create" class="btn btn-primary"> Create Tube</a>
            </div>
            <div class="col col-md-6 d-flex justify-content-center">
                <a href="/tubes/all" class="btn btn-primary"> Create Tube</a>
            </div>
        </div>
    </main>
    <footer>
        <c:import url="templates/footer.jsp"/>
    </footer>
</div>
</body>
</html>