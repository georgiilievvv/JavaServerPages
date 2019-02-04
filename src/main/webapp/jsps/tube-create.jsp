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
                <h1>{{tittle}}</h1>
            </div>
        </div>
        <hr/>
        <form action="/tubes/create" method="post">
            <div class="row">
                <div class="col col-md-12 d-flex justify-content-center">
                    <lable for="InputName">Name:</lable>
                </div>
                <div class="col col-md-12 d-flex justify-content-center">
                    <input type="text" name="name" id="InputName"/>
                </div>
            </div>
            <hr/>
            <div class="row">
                <div class="col col-md-12 d-flex justify-content-center">
                    <lable for="InputDescription">Description:</lable>
                </div>
                <div class="col col-md-12 d-flex justify-content-center">
                    <textarea name="description" id="InputDescription" rows="4" cols="22"></textarea>
                </div>
            </div>
            <hr/>
            <div class="row">
                <div class="col col-md-12 d-flex justify-content-center">
                    <lable for="InputLink">Youtube Link:</lable>
                </div>
                <div class="col col-md-12 d-flex justify-content-center">
                    <input type="text" name="link" id="InputLink"/>
                </div>
            </div>
            <hr/>
            <div class="row">
                <div class="col col-md-12 d-flex justify-content-center">
                    <lable for="InputUploader">Uploader:</lable>
                </div>
                <div class="col col-md-12 d-flex justify-content-center">
                    <input type="text" name="uploader" id="InputUploader" />
                </div>
            </div>
            <hr/>
            <div class="col col-md-12 d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Create Tube</button>
            </div>
        </form>
    </main>
    <footer>
        <c:import url="templates/footer.jsp"/>
    </footer>
</div>
</body>
</html>
