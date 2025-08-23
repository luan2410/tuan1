<%--
  Created by IntelliJ IDEA.
  User: Luan
  Date: 8/23/2025
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Đăng ký</title>
</head>
<body>
<h2>Đăng ký thông tin</h2>
<form action="register" method="post">
    <p>Họ tên: <input type="text" name="fullname" required></p>
    <p>Email: <input type="email" name="email" required></p>
    <p>Password: <input type="password" name="password" required></p>

    <p>Giới tính:
        <select name="gender">
            <option value="Nam">Nam</option>
            <option value="Nữ">Nữ</option>
            <option value="Khác">Khác</option>
        </select>
    </p>

    <p>Sở thích:<br>
        <input type="checkbox" name="hobby" value="Đọc sách"> Đọc sách
        <input type="checkbox" name="hobby" value="Thể thao"> Thể thao
        <input type="checkbox" name="hobby" value="Âm nhạc"> Âm nhạc
    </p>

    <p>Giới thiệu bản thân:<br>
        <textarea name="about" rows="4" cols="30"></textarea>
    </p>

    <input type="submit" value="Đăng ký">
</form>
</body>
</html>

