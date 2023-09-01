<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Html Form</title>
</head>
<body>
<form action="">
    <label for="username">Username</label>
    <input type="text" id="username" placeholder="username" required>
    <br><br>
    <label>Password</label>
    <input type="password" placeholder="password" required>
    <br><br>
    <label>Email</label>
    <input type="email" placeholder="example@email.com">
    <br><br>
    <label>Number</label>
    <input type="number">
    <br><br>
    <label>Checkbox</label>
    <input type="checkbox" value="checkbox1" checked>Checkbox 1
    <input type="checkbox" value="checkbox2">Checkbox 2
    <br><br>
    <label>Radio</label>
    <input type="radio" name="r" value="radio1" checked>Radio 1
    <input type="radio" name="r" value="radio2">Radio 2
    <br><br>
    <label>Range</label>
    <input type="range" min="0" max="100" value="50">
    <br><br>
    <label>Date</label>
    <input type="date">
    <br><br>
    <label>Time</label>
    <input type="time">
    <br><br>
    <label>Datetime Local</label>
    <input type="datetime-local">
    <br><br>
    <label>file</label>
    <input type="file">
    <br><br>
    <label>color</label>
    <input type="color">
    <br><br>
    <label>Textarea</label>
    <textarea cols="30" rows="5"></textarea>
    <br><br>
    <label>Select</label>
    <select name="" id="">
        <option value="">Apple</option>
        <option value="">Mango</option>
        <option value="">Orange</option>

    </select>
    <br><br>


    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
    <button type="button">Button</button>
</form>

</body>
</html>
