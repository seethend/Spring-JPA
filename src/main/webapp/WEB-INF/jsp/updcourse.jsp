<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Course</title>
</head>
<body>

	<form method="post">
		<pre>
			ID : <input type="text" name="id" value="${id}" disabled="disabled"><br><br>
			Name: <input type="text" name="name"><br><br>
			<input type="submit" value="Submit">
		</pre>
	</form>
	
	<p>${success}</p>

</body>
</html>