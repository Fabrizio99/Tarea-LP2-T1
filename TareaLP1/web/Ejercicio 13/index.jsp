<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="#" id="form">
            <p>Lista de cursos</p>
            <label>
                <input type="checkbox" value="Java" name="courses" onchange="change()">Java
            </label>
            <label>
                <input type="checkbox" value="HTML" name="courses" onchange="change()">HTML
            </label>
            <label>
                <input type="checkbox" value="JavaScript" name="courses" onchange="change()">JavaScript
            </label>
            <label>
                <input type="checkbox" value="Base de Datos" name="courses" onchange="change()">Base de Datos
            </label>
            <label>
                <input type="checkbox" value="Diseño de Sistemas" name="courses" onchange="change()">Diseño de Sistemas
            </label>
    </form>
    <p>Cursos Seleccionados</p>
    <textarea id="result" cols="30" rows="10"></textarea>
    <script src="script.js"></script>
    </body>
</html>
