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
    <title>Квест</title>
</head>
<body>

    <div style="height: 100%; width: 100%;">
        <div class="flex justify-center items-center text-center h-1/2" style="background: cornflowerblue;">
            <p class="mt-40 mb-40 text-white text-xl"><%out.print(session.getAttribute("questions"));%></p>
        </div>
        <div class="flex justify-between h-1/2 flex-row">
            <%
                String[] answers = (String[]) session.getAttribute("answers");
                for (int i = 0; i < answers.length; i++) {
                    out.print("<div class=\"flex justify-center text-center m-5 rounded-xl clickable-div cursor-pointer\" " +
                            "style=\"background: darksalmon;width: 100%; border: 1px solid gray;\" data-send=\"" + i + "\">" +
                            "<p class=\"mt-32 mb-32 text-white text-xl\">" + answers[i] + "</p>" +
                            "</div>");
                }
            %>
        </div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(".clickable-div").click(function () {
            location.href = "/logic?answer=" + $(this).attr("data-send");
        });

    </script>
</body>
</html>