<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Person articles Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
    </head>
    <body>
        <h1>Articles list</h1>
        <br/><br/>
        <div>
            <table border="1">
                <tr>
                    <td>Article name</td>
                    <td>Author ID</td>
                    <td>Article ID</td>
                </tr>
                <c:forEach items="${articles}" var="article">
                    <tr>
                        <td>${article.name}</td>
                        <td>${article.authorId}</td>
                        <td>${article.id}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>