 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome sir</h3>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>Policy Management</title>
</head>
<body>
<div class="row mt-4">
	<div class="col-4"></div>
	<div class="col-4">
		<div class="card">
			<form method="post">
			<div class="card-header text-center h4 text-primary">Policy Login</div>
			<div class="card-body">
				<div class="form-group">
					<label>Login</label>
					<input type="email" name="t1" class="form-control" required>
				</div>
				<div class="form-group">
					<label>Password</label>
					<input type="password" name="t2" class="form-control"  required>
				</div>
				<input type="checkbox" name="c1"> Rememer Me<br/>
				<div class="mt-3">
					<input type="submit" name="b1" value="Login" class="btn btn-primary mt-3">
					&nbsp;&nbsp;&nbsp;<a href="register.jsp">New Registration</a>
				</div>
				<div class="text-danger"><%=msg%></div>
			</div>
			</form>
		</div>
	</div>
	<div class="col-4"></div>
</div>
</body>
</html>
</body>
</html>