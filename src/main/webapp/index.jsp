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
    <link rel="icon" type="image/png" href="static/quest.png" />
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Квест</title>
</head>
<body>
    <div class="flex justify-center h-1/2" style="background: cornflowerblue;">
        <div class="flex mt-67 mb-67 flex-col justify-center text-center items-center">
            <h1 class="text-white text-5xl mb-10">Дуже цікавий квест</h1>
            <p class="text-white text-2xl mb-10">Зможете спасти планету X-9?</p>
            <a class="w-50 h-10 bg-green-600 text-white rounded-xl pt-2 cursor-pointer hover:bg-white hover:text-neutral-950" style="transition: .3s linear;" href="/start">Почати Квест -></a>
        </div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(".clickable-div").click(function () {

        })
    </script>
</body>
</html>