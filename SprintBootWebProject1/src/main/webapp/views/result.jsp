<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
	<link rel="stylesheet" href="style.css">
    <body>
        <h2> Result is: <%= request.getSession().getAttribute("result") %> </h2>
		
		Using JST
		<h2> Result is: ${result} </h2>
    </body>
</html>


