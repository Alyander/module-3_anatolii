<%@ page import="org.anatolii.DataClass" %>
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
    <title>Введення</title>
</head>
<body>
    <div class="flex justify-center items-center text-center flex-col" style="background: cornflowerblue; width: 100%; height: 100%;">
        <p class="mt-70 mb-20 text-white text-xl"><%out.print(DataClass.start);%></p>
        <button class="w-50 h-10 bg-green-600 text-white rounded-xl mb-65  cursor-pointer hover:bg-white hover:text-neutral-950 button-send" style="transition: .3s linear;">Наступне -></button>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(".button-send").click(function () {
            window.location.href = "/quest.jsp";
        })
    </script>
</body>

</html>