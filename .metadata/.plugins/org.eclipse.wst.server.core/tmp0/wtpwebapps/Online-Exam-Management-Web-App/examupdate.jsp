<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Exam</title>
<link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
/>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
      href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap"
      rel="stylesheet"
/>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
/>
<link rel="stylesheet" href="stylesU.css" />
<link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
/>
</head>
<body>
<%
	String paperID = request.getParameter("paperID");
	String Title = request.getParameter("Title");
	String Date = request.getParameter("Date");
	String TotalParticipants = request.getParameter("TotalParticipants");
	String Duration = request.getParameter("Duration");
	String TotalQuestions = request.getParameter("TotalQuestions");
	String Time = request.getParameter("Time");
	String Password = request.getParameter("Password");
%>

<div class="form-container">
    <h2 class="mb-4">Update Exam Details</h2>
    <form action="ExamUpdateServlet" method="POST" id="exam-form" onsubmit="return validateForm()">
      <div class="mb-3">
        <label for="exam-id" class="form-label">Exam ID</label>
        <input
          type="text"
          class="form-control"
          id="exam-id"
          name="paperID"
          value="<%=paperID%>"
          placeholder="Exam ID"
          readonly
        />
      </div>

      <div class="mb-3">
        <label for="exam-title" class="form-label">Exam Title</label>
        <input
          type="text"
          class="form-control"
          id="exam-title"
          name="Title"
          value="<%=Title%>"
          placeholder="Enter exam title"
          required
        />
      </div>

      <div class="mb-3">
        <label for="exam-date" class="form-label">Exam Date</label>
        <input
          type="date"
          class="form-control"
          id="exam-date"
          name="Date"
          value="<%=Date%>"
          required
        />
        
        <label for="exam-time" class="form-label">Exam Time</label>
        <input
          type="time"
          class="form-control"
          id="exam-time"
          name="Time"
          value="<%=Time%>"
          required
        />
      </div>

      <div class="mb-3">
        <label for="exam-duration" class="form-label">Exam Duration</label>
        <input
          type="number"
          class="form-control"
          id="exam-duration"
          name="Duration"
          value="<%=Duration%>"
          placeholder="Enter duration in minutes"
          min="1"
          required
        />
      </div>

      <div class="mb-3">
        <label for="num-participants" class="form-label">Number of Participants</label>
        <input
          type="number"
          class="form-control"
          id="num-participants"
          name="TotalParticipants"
          value="<%=TotalParticipants%>"
          placeholder="Enter number of participants"
          min="1"
          required
        />
      </div>

      <div class="mb-3">
        <label for="num-questions" class="form-label">Number of Questions</label>
        <input
          type="number"
          class="form-control"
          id="num-questions"
          name="TotalQuestions"
          value="<%=TotalQuestions%>"
          placeholder="Enter number of questions"
          min="1"
          required
        />
      </div>
      
      <div class="mb-3">
        <label for="q-password" class="form-label">Quiz Password</label>
        <input
          type="text"
          class="form-control"
          id="q-password"
          name="Password"
          value="<%=Password%>"
          placeholder="Enter Quiz password"
          readonly
        />
      </div>

      <div class="btn-container">
        <input
          type="submit"
          value="Update"
          class="button-35"
        />
      </div>
    </form>
  </div>

  <script>
    // Prevent past dates from being selected
    window.onload = function() {
      var examDate = document.getElementById("exam-date");
      var today = new Date().toISOString().split('T')[0];
      examDate.setAttribute('min', today);
    };

    // Validate form before submission
    function validateForm() {
      var duration = document.getElementById("exam-duration").value;
      var participants = document.getElementById("num-participants").value;
      var questions = document.getElementById("num-questions").value;

      // Check if any value is negative or zero
      if (duration <= 0) {
        alert("Exam duration must be a positive number.");
        return false;
      }
      if (participants <= 0) {
        alert("Number of participants must be a positive number.");
        return false;
      }
      if (questions <= 0) {
        alert("Number of questions must be a positive number.");
        return false;
      }

      return true;  // Allow form submission if validation passes
    }
  </script>
  
</body>
</html>
