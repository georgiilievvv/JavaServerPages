<%@ page import="myTybe.domain.entities.Tube" %>
<%@ page import="myTybe.service.TubeService" %>
<%@ page import="myTybe.service.TubeServiceImpl" %>
<%@ page import="myTybe.domain.models.binding.TubeCreateBindingModel" %>
<%@ page import="myTybe.repository.TubeRepository" %>
<%@ page import="java.util.List" %>
<%@ page import="myTybe.domain.models.view.TubeAllViewModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <c:import url="templates/head.jsp"/>
</head>
<body>
<%List<TubeAllViewModel> allTubes = (List<TubeAllViewModel>) request.getAttribute("allTubes");%>
<div class="container">
    <main class="jumbotron">
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h1>All Tubes</h1>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <h3>Check our tubes below.</h3>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col col-md-12 d-flex justify-content-center">
                <ul>
                    <%for (TubeAllViewModel tube : allTubes) {%>
                    <li><a href="/tubes/details?name=<%=tube.getName()%>"><%=tube.getName()%></a></li>
                    <% }%>
                </ul>
            </div>
        </div>
        <hr/>
        <div class="col col-md-12 d-flex justify-content-center">
            <a href="home">Back to Home.</a>
        </div>
    </main>
    <footer>
        <c:import url="templates/footer.jsp"/>
    </footer>
</div>
</body>
</html>
