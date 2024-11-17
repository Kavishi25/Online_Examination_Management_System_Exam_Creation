<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Exam Creation Page</title>
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
      href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&display=swap"
      rel="stylesheet"
    />

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="css_create/stylesC.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
    />
</head>
<body>

	<nav class="navbar navbar-expand-lg">
      <a class="navbar-brand" href="#">SmartExam</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div
        class="collapse navbar-collapse justify-content-between"
        id="navbarNav"
      >
        <ul class="navbar-nav justify-content-center flex-grow-1 pe-3">
          <li class="nav-item active">
            <a class="nav-link" href="admindashboard.jsp">Dashboard</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Exam Concerns</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="examForm.jsp">Create Exam</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Results Publishing</a>
          </li>
          
        </ul>
        
      </div>
    </nav>
    <div class="container my-5">
      <div class="row">
        <!-- Left Side: Form -->
        <div class="col-md-6">
          <h2 class="mb-4">Create an Exam</h2>
          
          <p>Fill in the details to create an exam for students.</p>
          
          
          <form action="ExamInsertServlet" method="POST" id="exam-form" onsubmit="return validateForm()">
            
          
            <div class="mb-3">
             <label for="exam-title" class="form-label">Exam Title</label>
             <input
                type="text"
                class="form-control"
                id="exam-title"
                name="Title"
                placeholder="Enter exam title"
                required
              />
            </div>
            
            <div class="mb-3">
              <div class="row">
                <div class="col-md-6">
                  <label for="exam-date" class="form-label">Exam Date</label>
                  <input
                    type="date"
                    class="form-control"
                    id="exam-date"
                    name="Date"
                    required
                  />
                </div>
                
                <div class="col-md-6">
                  <label for="exam-time" class="form-label">Exam Time</label>
                  <input
                    type="time"
                    class="form-control"
                    id="exam-time"
                    name="Time"
                    required
                  />
                </div>
              </div>
            </div>
            
            <div class="mb-3">
              <label for="exam-duration" class="form-label">Exam Duration</label>
              <input
                type="number"
                class="form-control"
                id="exam-duration"
                name="Duration"
                placeholder="Enter duration in minutes"
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
                placeholder="Enter number of participants"
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
                placeholder="Enter number of questions"
                required
              />
            </div>
            
            
            
          
            <div class="mb-3">
              <label for="num-questions" class="form-label">Quiz Password</label>
              <input
                type="password"
                class="form-control"
                id="q-password"
                name="Password"
                placeholder="Enter Quiz password"
                required
              />
            </div>
            
            
            
            <div class="mb-3">
        		<label id="exam-paper" class="form-label">Upload Exam Paper (PDF only)</label>
        		<input
            type="file"
            class="form-control"
            id="exam-paper"
            name="paperFile"
            accept=".pdf"
            required
        			/>
    			</div>
            
            <div class="btn-container mt-4">
              <input
                type="submit"
                value="Submit"
                id="add-question-btn"
                class="button-35"
                role="button"
              />
          
            </div>
            
      </form>
        </div>

        <div class="col-md-6 image-container">
          <img src="images/exam.jpg" alt="Exam Image" class="img-fluid" />
        </div>
      </div>
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
