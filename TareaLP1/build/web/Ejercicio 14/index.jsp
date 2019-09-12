<%-- 
    Document   : index
    Created on : 07/09/2019, 11:48:35 PM
    Author     : fabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="#">
        <p>Lista de cursos</p>
        <label>
            <input type="checkbox" name="courses" value="JavaScript">JavaScript
        </label>
        <label>
            <input type="checkbox" name="courses" value="MySQL">MySQL
        </label>
        <label>
            <input type="checkbox" name="courses" value="Matemática I">Matemática I
        </label>
        <label>
            <input type="checkbox" name="courses" value="UML">UML
        </label>
        <label>
            <input type="checkbox" name="courses" value="Angular">Angular
        </label>
        <input type="button" name="" id="button" value="Procesar">
    </form>
    <textarea name="result" id="result" cols="30" rows="10"></textarea>
    <script src="script.js"></script>
    </body>
</html>
