<%@ page import="myTybe.domain.models.view.TubeDetailsViewModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <c:import url="templates/head.jsp"/>
</head>
<body>
<% TubeDetailsViewModel tdvm =
        (TubeDetailsViewModel) request.getAttribute("tubeDetailsViewModel");%>
<div class="container">
    <main class="jumbotron">
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h1><%=tdvm.getName()%></h1>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h3><%=tdvm.getDescription()%></h3>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-6 d-flex justify-content-center">
                <a href="<%=tdvm.getYouTubeLink()%>" >Link to video.</a>
            </div>
            <div class="col col-md-6 d-flex justify-content-center">
                <div><%=tdvm.getUploader()%></div>
            </div>
        </div>
        <hr/>
        <div class="col col-md-12 d-flex justify-content-center">
            <a href="/home" >Back to Home.</a>
        </div>
    </main>
    <footer>
        <c:import url="templates/footer.jsp"/>
    </footer>
</div>
</body>
</html>
