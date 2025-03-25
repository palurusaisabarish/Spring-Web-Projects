<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style1.css">
</head>
<body>
    <div class="container">
        <h1>Job Post Details</h1>
        
        <div class="detail-item">
            <span class="detail-label">Post ID:</span>
            ${jobPost.postId}
        </div>
		    
		    <div class="detail-item">
		        <span class="detail-label">Post Profile:</span>
		        ${jobPost.postProfile}
		    </div>
		    
		    <div class="detail-item">
		        <span class="detail-label">Post Description:</span><br>
		        ${jobPost.postDesc}
		    </div>
		    
		    <div class="detail-item">
		        <span class="detail-label">Required Experience:</span>
		        ${jobPost.reqExperience} years
		    </div>
		    
		    <div class="detail-item">
		        <span class="detail-label">Technology Stack:</span>
		        <div class="tech-stack">
		            <c:forEach items="${jobPost.postTechStack}" var="tech">
		                <span class="tech-item">${tech}</span>
		            </c:forEach>
		        </div>
		    </div>
			<div class="buttons">
			           <a href="/addjob" class="btn add-job-btn">Add Another Job</a>
			           <a href="/viewjobs" class="btn view-jobs-btn">View All Jobs</a>
			       </div>
		</div>
	</body>
</html>