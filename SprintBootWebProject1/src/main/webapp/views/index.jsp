<%@page language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- <title>Addition of Two Numbers</title>-->
    <link rel="stylesheet" href="style.css">  <!-- Optional CSS File -->
</head>
<body>

    <!--<div class="calculator">
        <h2>Addition of Two Numbers</h2>
        
         The form uses the GET method to pass parameters in the URL 
        <form id="additionForm" action="/add" method="get">
            <div class="input-container">
                <label for="num1">Enter First Number:</label>
                <input type="number" id="num1" name="num1" placeholder="Enter first number" required>
            </div>
            
            <div class="input-container">
                <label for="num2">Enter Second Number:</label>
                <input type="number" id="num2" name="num2" placeholder="Enter second number" required>
            </div>
            
            <button type="submit" class="button">Submit</button>
        </form>
    </div>-->

	<form action="addAlien" method="get">
		<div class="input-container">
		      <label for="aid">Enter Id</label>
		      <input type="text" id="aid" name="aid" placeholder="Enter Id" required>
		</div>
		           
		<div class="input-container">
		     <label for="aname">Enter Name</label>
		     <input type="text" id="aname" name="aname" placeholder="Enter Name" required>
		</div>
		           
		<button type="submit" class="button">Submit</button>
	</form>
  
</body>
</html>

