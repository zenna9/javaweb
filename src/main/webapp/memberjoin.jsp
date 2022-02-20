<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join our site!</title>
</head>
<body>
	<h2>Insert your information and join our member!</h2>
	<div class="boxgrid">
		<form action="join" method="POST">
			<input type="hidden" value="a" /> 
			이름 : <input type="text" name="name" /> 
			<br>이메일 : <input type="email" 	name="email" /> 
			<br>아이디 : <input type="text" name="id" /> 
			<br>비밀번호 : <input type="password" name="password" />
			<br>
			<input type="reset" value="새로 작성하기" /> <br>
			<input type="submit" value="제출하기" />
		</form>
	</div>
</body>
</html>