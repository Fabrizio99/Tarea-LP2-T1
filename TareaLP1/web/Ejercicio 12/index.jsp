<%-- 
    Document   : index
    Created on : 07/09/2019, 11:20:55 PM
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
        <fieldset>
            <legend>Calculadora</legend>
            <label>Num1
                <input type="text" id="input1">
            </label>
            <label>Num2
                <input type="text" id="input2">
            </label>
            <div class="buttons">
                <input type="button" value="+" id="add">
                <input type="button" value="-" id="subtract">
                <input type="button" value="*" id="multiply">
                <input type="button" value="/" id="divide">
            </div>
            <label>
                Resultado
                <input type="text" name="result" id="result">
            </label>
        </fieldset>
    </form>
        <script src="script.js"></script>
    </body>
</html>
