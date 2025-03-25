<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <link rel="icon" type="image/png" href="static/quest.png" />
    <title>Результат</title>
</head>
<body>
    <c:choose>
        <c:when test="${sessionScope.isLose}">
            <div class="flex justify-center items-center text-center flex-col bg-red-800" style="width: 100%; height: 100%;">
                <h1 class="text-4xl text-white mt-70 mb-10"><%out.print(session.getAttribute("user"));%>, ви програли</h1>
                <p class="text-xl text-white mb-10">Рахунок: <%out.print(session.getAttribute("Score"));%></p>
                <button class="w-50 h-10 bg-green-600 text-white rounded-xl  cursor-pointer hover:bg-white hover:text-neutral-950 mb-60" style="transition: .3s linear;" onclick="window.location.href = '/restart'">Повернутися на головну</button>
            </div>
        </c:when>
    <c:when test="${sessionScope.isWin}">
        <div class="flex justify-center items-center text-center flex-col bg-sky-800" style="width: 100%; height: 100%;">
            <h1 class="text-4xl text-white mt-70 mb-10"><%out.print(session.getAttribute("user"));%>, ви виграли</h1>
            <p class="text-xl text-white mb-10">Рахунок: <%out.print(session.getAttribute("Score"));%></p>
            <button class="w-50 h-10 bg-green-600 text-white rounded-xl  cursor-pointer hover:bg-white hover:text-neutral-950 mb-60" style="transition: .3s linear;" onclick="window.location.href = '/restart'">Повернутися на головну</button>
        </div>
    </c:when>
    </c:choose>
</body>
</html>