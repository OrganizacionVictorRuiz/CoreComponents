<%-- 
    Document   : index
    Created on : 14-dic-2016, 16:26:26
    Author     : Zack
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="../CSS/css2.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../JS/jquery-3.1.1.js" type="text/javascript"></script>
        <script src="../JS/bootstrap.js" type="text/javascript"></script>
        <script src="../JS/bootstrap.min.js" type="text/javascript"></script>
        <title>Inicio</title>
    </head>
    <body>
        <jsp:include page="cabecera.jsp" ></jsp:include>
        <jsp:include page="navegador.jsp" ></jsp:include>
        <table style="background-color: white;">
            <tr>
                <td>
            <div id="myCarousel" style="background: linear-gradient(to right, rgba(240,255,199,1) 0%, rgba(197,243,155,1) 100%); margin-top: -10px; width: 900px;" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <legend style="text-align: center;margin-left: -50px;"><img src="../IMG/ofertas.png" width="180px" height="50px"></legend>

                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                </ol>

                <!-- Wrapper for slides -->
                
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="../IMG/1001.1.jpg" width="400px" height="300px">
                    </div>

                    <div class="item">
                        <img src="../IMG/1003.1.jpg" width="400px" height="300px">
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
                </td><td style="background-color: white;"><div></div></td>
        </tr>
        </table>
        <jsp:include page="pie.jsp" ></jsp:include>
    </body>
</html>
