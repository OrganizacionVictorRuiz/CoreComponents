<%-- 
    Document   : registro
    Created on : 14-dic-2016, 19:20:44
    Author     : Zack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../CSS/css2.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../JS/jquery-3.1.1.js" type="text/javascript"></script>
        <script src="../JS/bootstrap.js" type="text/javascript"></script>
        <script src="../JS/bootstrap.min.js" type="text/javascript"></script>
        <title>Pagina de registro</title>
    </head>
    <body>
        <jsp:include page="cabecera.jsp" ></jsp:include>
            <div id="formularioReg">  
                <form action="../Usuario" method="post">                
                    <fieldset>
                        <legend id="titulo">Datos Personales</legend>
                        <label>Nombre:</label>
                        <input type="text" name="Nombre" ><br/><br/>
                        <label>Apellidos:</label>
                        <input type="text" name="Apellidos" ><br/><br/>
                        <label>Email:</label>
                        <input type="text" name="Email" ><br/><br/>
                        <label>NIF:</label>
                        <input type="text" name="NIF" ><br/><br/>
                        <label>Fecha Nacimiento:</label>
                        <input type="text" name="FechaNacimiento" ><br/><br/>
                    </fieldset>
                    <br/>
                    <fieldset>
                        <legend id="titulo">Datos de Usuario</legend>
                        <label>Usuario:</label>
                        <input type="text" name="UserName" ><br/><br/>
                        <label>Password:</label>
                        <input type="password" name="Clave" ><br/><br/>
                    </fieldset>
                    <br/>
                    <fieldset style="margin-left: 31%">
                        <input type="submit" value="Confirmar" name="confirmar"/>
                        <input type="reset" value="Limpiar" />
                    </fieldset> 
                </form>
            </div>
        <jsp:include page="pie.jsp" ></jsp:include>
    </body>
</html>
