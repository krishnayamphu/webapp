<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        p{
            font-family: Arial;
            font-size: 18px;
            line-height: 1.5;
            text-align: justify;
            background-color: #3e00ff;
            color: #ffffff;
            padding: 30px;
            margin: 30px;
            border: 10px groove red;
        }
        .box1{
            width: 200px;
            height: 100px;
            background-color: darkgreen;
            margin: 15px;
        }
        .box2{
            width: 200px;
            height: 100px;
            background-color: darkgreen;
            background-image: url("pic.png");
            background-size: contain;
            margin: 15px;
        }

        .box3{
            width: 100px;
            height: 100px;
            background-color: red;
            float: left;
        }
        .box4{
            width: 100px;
            height: 100px;
            background-color: blue;
            float: left;
        }
    </style>
</head>
<body>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam aliquid assumenda culpa dolorem eum illo ipsa labore laboriosam, laudantium minima mollitia, natus nostrum numquam optio quidem reiciendis saepe tempore veritatis?</p>

<div class="box1">box 1</div>
<div class="box2">box 2</div>

<div class="box3">box 3</div>
<div class="box4">box 4</div>
</body>
</html>
