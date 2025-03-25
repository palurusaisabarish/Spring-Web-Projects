<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Post a New Job</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Arial', sans-serif;
        }

        body {
            background-color: #f5f5f5;
            padding: 20px;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
            padding-bottom: 20px;
            border-bottom: 2px solid #eee;
        }

        .header h1 {
            color: #333;
            font-size: 2em;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #555;
            font-weight: bold;
        }

        input[type="text"],
        textarea,
        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
            margin-bottom: 10px;
        }

        textarea {
            resize: vertical;
            min-height: 100px;
        }

        button {
            background-color: #007bff;
            color: white;
            padding: 12px 24px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #0056b3;
        }

        #selectedTechList {
            list-style: none;
            padding: 10px 0;
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
        }

        #selectedTechList li {
            background-color: #e9ecef;
            padding: 5px 10px;
            border-radius: 4px;
            color: #333;
        }

        @media (max-width: 600px) {
            .container {
                padding: 20px;
            }
            
            .header h1 {
                font-size: 1.5em;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Post a New Job</h1>
        </div>
		<form id="jobForm" action="handleform" method="post">
		    <div class="form-group">
		        <label for="postId">Post ID:</label>
		        <input type="text" id="postId" name="postId" required>
		    </div>
		    <div class="form-group">
		        <label for="postProfile">Post Profile:</label>
		        <input type="text" id="postProfile" name="postProfile" required>
		    </div>
		    <div class="form-group">
		        <label for="postDescription">Post Description:</label>
		        <textarea id="postDescription" name="postDesc" rows="4" required></textarea>
		    </div>
		    <div class="form-group">
		        <label for="requiredExperience">Required Experience (years):</label>
		        <input type="number" id="requiredExperience" name="reqExperience" required>
		    </div>
		    <div class="form-group">
		        <label for="techStack">Tech Stack:</label>
		        <select id="techStack" name="postTechStack" multiple size="5">
		            <option value="Java">Java</option>
		            <option value="JavaScript">JavaScript</option>
		            <option value="Python">Python</option>
		            <option value="C++">C++</option>
		            <option value="Ruby">Ruby</option>
		            <option value="PHP">PHP</option>
		        </select>
		        <small>Hold Ctrl/Cmd to select multiple technologies</small>
		    </div>
		    <div class="form-group">
		        <button type="submit">Post Job</button>
		    </div>
		</form>
    </div>
</body>
</html>