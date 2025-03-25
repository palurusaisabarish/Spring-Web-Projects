<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style2.css">
</head>
<body>
    <div class="container">
        <div class="jobs-header">
            <h1>Current Job Opportunities</h1>
            <p>${allJobs.size()} active positions</p>
        </div>
        
        <div class="jobs-grid">
            <c:forEach items="${allJobs}" var="job">
                <div class="job-card">
                    <div class="job-header">
                        <div class="job-id">ID: ${job.postId}</div>
                        <div class="job-title">${job.postProfile}</div>
                    </div>
                    <div class="job-body">
                        <div class="detail-item">
                            <div class="detail-label">Experience Required</div>
                            <div class="detail-value">${job.reqExperience}+ years</div>
                        </div>
                        
                        <div class="detail-item">
                            <div class="detail-label">Job Description</div>
                            <div class="detail-value">${job.postDesc}</div>
                        </div>
                        
                        <div class="detail-item">
                            <div class="detail-label">Technology Stack</div>
                            <div class="tech-stack">
                                <c:forEach items="${job.postTechStack}" var="tech">
                                    <span class="tech-item">${tech}</span>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        
        <a href="/" class="back-btn">Back to Home</a>
    </div>
</body>
</html>