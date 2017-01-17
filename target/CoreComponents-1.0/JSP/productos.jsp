

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="contexto" value="${pageContext.request.contextPath}" />
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/css2.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="JS/jquery-3.1.1.js" type="text/javascript"></script>
        <script src="JS/bootstrap.js" type="text/javascript"></script>
        <script src="JS/bootstrap.min.js" type="text/javascript"></script>
        <title>Productos</title>
    </head>
    <body>
        <header>
            <table>
                <tr>
                    <td>
                        <a href="JSP/Inicio.jsp"><img src="IMG/logo.png" alt="" width="100%" height="60px"/></a>
                    </td>
                    <td id="logear">
                        <div id="log">
                            <form method="post" action="registrado.jsp">
                                <b>Usuario</b>
                                <input type="text" name="UserName" placeholder=" username"> 
                                <b>Contraseña</b>
                                <input type="password" name="Clave" placeholder=" password">
                                <input id="loge" type="submit" value="Login">
                            </form>
                        </div>
                    </td>
                    <td style="padding: 20px;"></td>
                    <td>
                        <a style="color: white;" href="registro.jsp"><button style="background: radial-gradient(ellipse at center, rgba(73,155,234,1) 0%, rgba(32,124,229,1) 100%);">Registro</button></a>
                    </td>       
                </tr>
            </table>
        </header>
        <table id="productos">
            <tr style="background-color: green; text-align: center; color: white;"><td>Nombre</td><td>Descripcion</td><td>Precio</td><td>Imagen</td></tr>
            <c:forEach items="${producto}" var="productos">
                <tr><td>
                        <c:out value="${productos.denominacion}"/>
                    </td><td>
                        <c:out value="${productos.descripcion}"/>
                    </td><td><pre style="background-color: greenyellow;text-align: center;">
<c:out value="${productos.precioUnitario}"/> € </pre>
                    </td>
                    <td> 
                        <img src="IMG/${productos.imagen}" width="100px" heigth="100px">
                    </td></tr>

            </c:forEach>
        </table>
        <br/>
        <footer>
            <table id="pie" style="height: 10px;">
                <tr>
                    <td>

                        <a href="JSP/Inicio.jsp"><img src="IMG/logo.png" alt="" width="80%" height="60px"/></a>
                    </td>
                    <td width="15%">
                        <img src="IMG/contacto.png" alt="" width="100%" height="50px"/>
                    </td>
                    <td width="15%">
                        <img src="IMG/dire.png" alt="" width="100%" height="50px"/>
                    </td>
                    <td width="15%">
                        <img src="IMG/mail.png" alt="" width="100%" height="50px"/>
                    </td>
                    <td>
                        <div id="sociales">
                            <ul>
                                <li><img src="IMG/fb.png" ></li>
                                <li><img src="IMG/twitter.png" ></li>
                                <li><img src="IMG/gmail.png" ></li>
                            </ul>
                        </div>
                    </td>
                </tr>

            </table>
        </footer>
    </body>
</html>