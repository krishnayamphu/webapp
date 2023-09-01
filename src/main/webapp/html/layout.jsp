<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Layout</title>
    <style>
        *{
            font-family: Arial;
            text-align: center;
        }
        header{
            background-color: teal;
            padding: 30px;
        }
        nav{
            background-color: coral;
            padding: 10px 0;
            margin: 10px 0;
        }
        main{
            background-color: purple;
        }
        .content{
            float: left;
            width: 70%;
            background-color: green;
        }
        aside{
            float: left;
            background-color: orange;
            height: 400px;
            width: 30%;
        }
        section{
            height: 200px;
            background-color: #3e00ff;
        }
        article{
            height: 200px;
            background-color: aquamarine;
        }
        footer{
            background-color: orangered;
            padding: 15px;
            margin-top: 15px;
            clear: both;
        }
    </style>
</head>
<body>
<header>Header</header>
<nav>Nav</nav>
<main>
    <div class="content">
        <section>Section</section>
        <article>Article</article>
    </div>
    <aside>Aside</aside>
</main>
<footer>Footer</footer>

</body>
</html>
