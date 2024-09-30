<!-- header.jsp -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="user" value="${sessionScope.user}"/>
<c:set var="isGuest" value="${empty user}"/>

<!DOCTYPE html>
<html>
<head>
    <title>My Website</title>

</head>
<body>
    <header>
        <h1>My Website</h1>
        <nav>
            <ul>
                <li><a href="<c:url value='/home' />">Home</a></li>
                <li>
                    <c:if test="${isGuest}">
                    press to login
                    </c:if>
                </li>
            </ul>
        </nav>
    </header>