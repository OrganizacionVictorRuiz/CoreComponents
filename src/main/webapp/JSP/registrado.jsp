<%-- 
    Document   : registrado
    Created on : 12-ene-2017, 18:22:25
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
        <jsp:include page="cabeceraIn.jsp" ></jsp:include>
        <jsp:include page="navegador.jsp" ></jsp:include>
            <div class="sliderHome" style="margin-left:27%;padding:20px;">
                <table>
                    <tr class="mySlides">
                        <td><a href=""><img src="../IMG/p1.png" width="400px" height="300px"></a></td><td>Hola</td>
                    </tr>
                    <tr class="mySlides">
                        <td><a href=""><img src="../IMG/p2.png" width="400px" height="300px"></a></td><td>Hola p2</td>
                    </tr>
                    <tr class="mySlides">
                        <td><a href=""><img src="../IMG/p3.png" width="400px" height="300px"></a></td><td>Hola p3</td>
                    </tr>
                    <tr class="mySlides">
                        <td><a href=""><img src="../IMG/p4.png" width="400px" height="300px"></a></td><td>Hola p4</td>
                    </tr>
                </table>
            </div>
            <script>
                var myIndex = 0;
                carousel();

                function carousel() {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    for (i = 0; i < x.length; i++) {
                        x[i].style.display = "none";
                    }
                    myIndex++;
                    if (myIndex > x.length) {
                        myIndex = 1;
                    }
                    x[myIndex - 1].style.display = "block";
                    setTimeout(carousel, 2000);
                }
            </script>
        <jsp:include page="pie.jsp" ></jsp:include>
    </body>
</html>

