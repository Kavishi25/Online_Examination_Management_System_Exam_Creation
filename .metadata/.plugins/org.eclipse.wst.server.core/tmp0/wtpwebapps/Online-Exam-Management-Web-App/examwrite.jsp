<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="Assets/IMGS/home.png" />
    <title>Exam Writing - SmartExam</title>

    <!-- Bootstrap and other resources -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
    <link
    href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900&display=swap"
    rel="stylesheet"
  />
   
    <style>
            @import url("https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap");

:root {
  --button: ;
  --back: ;
  --fColor: ;
  --heading: ;
  --bFonts: ;
  --forms: ;
}
html,
body {

   background: #c9d6ff;
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
  height: 100vh;
  margin: 10px;

  margin: 0px;
}
a {
  text-decoration: none;
  color: #000000;
}

.navbar {
  margin: 10px 10px 10px;
  border-radius: 25px;
  background: #4a12a5;
  /*backdrop-filter: blur(10px);
  -webkit-backdrop-filter: blur(10px);*/
  box-shadow: 5px;
  border-bottom: none;
}

.navbar-nav .nav-item {
  font-size: 1rem;
  font-family: Roboto Condensed;
  font-weight: 700;
  margin-right: 20px;
}

.navbar-brand {
  margin: 15px;
  font-weight: bold;
  color: rgb(255, 255, 255);
}

.navbar-nav .nav-link {
  color: rgb(255, 255, 255);
  position: relative;
  padding-bottom: 5px;
}

.navbar-nav .nav-link:hover {
  text-decoration: none;
}

.navbar-nav .nav-link::before {
  content: "";
  position: absolute;
  width: 0;
  height: 2px;
  bottom: 0;
  left: 0;
  background-color: rgb(255, 255, 255);
  visibility: hidden;
  transition: all 0.3s ease-in-out;
}

.navbar-nav .nav-link:hover::before {
  visibility: visible;
  width: 100%;
}

.btn-outline-primary {
  border: 2px;
  border-radius: 50px;
  text-align: center;
  font-family: Roboto Condensed;
  font-weight: 500;
  font-size: 1rem;
  color: rgb(0, 0, 0);
  border-color: rgb(255, 255, 255);
}

.btn-outline-primary:hover {
  background-color: rgb(124, 39, 243);
  color: #ffffff;
  transition: 0.3s;
}

.navbar-toggler-icon {
  background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 30 30' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath stroke='rgba%28255, 255, 255, 1%29' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3E%3C/svg%3E");
}
.modal-header,
.bg-primary {
  background: #6c757dcc;
}
@media (max-width: 768px) {
  .navbar {
    padding: 0.5rem 1rem;
  }
}

.bg-image {
  background-size: cover;
  background-position: center;
  height: 100vh;
}
.container {
 
   box-shadow: 20px;
  border-bottom: 2px;

  border-radius: 20px;
  background-color: #f4f4f4;
  backdrop-filter: blur(10px);
  -webkit-backdrop-filter: blur(10px);
 
  
}
.Hbtn {
  margin: 10px;
}
h2 {
  font-size: 2rem;
 padding-top: 20px;
  text-align: center;
  align-items: center;
}
header h1 {
  font-family: Roboto Condensed;

  margin-top: 10px;
  color: rgb(0, 0, 0);
  font-size: 4rem;
  font-weight: 900;
}

@media (max-width: 768px) {
  header h1 {
    font-size: 2.5rem;
  }

  .btn-container .btn {
    font-family: Roboto Condensed;
    font-weight: 500;
    font-size: 1rem;
    padding: 8px 16px;
  }
}

img {
	width: 100%;
	height: auto;
}

.l-card {
  margin-right: 20px;
  display: inline-block;
	width: auto;
	min-width: 360px;
	max-width: 480px;
	height: auto;
	background: #f5f5f5;
	color: #4a12a5;
	padding: 50px;
	box-shadow: 0px 7px 24px rgba(100, 100, 100, 0.4);
}

.l-card__text p {
	font-size: 30px;
	font-family: "Vollkorn", serif;
	font-weight: 400;
	color: #e415a6;
	text-align: left;
}

.l-card__text p::after {
	content: "\201D";
	display: inline;
	color: #999;
}

.l-card__text p::before {
	content: "\201C";
	display: inline;
	color: #999;
}

.l-card__user {
	display: flex;
	flex-direction: row;
	padding-top: 24px;
	margin-top: 12px;
	/* border-top: 1px solid #c1c1c1; */
	align-items: center;
}
.l-card__userImage {
	width: 42px;
	height: 42px;
	overflow: hidden;
	border-radius: 50%;
}

.l-card__userImage img {
	width: 100%;
	height: 100%;

}

.l-card__userInfo {
	display: flex;
	flex-direction: column;
	margin-left: 16px;
}

.l-card__userInfo span:nth-child(1) {
	font-weight: bold;
	font-family: sans-serif;
	font-size: 14px;
	color: #3f3f55;
}
.l-card__userInfo span:nth-child(2) {
	color: #adada6;
	font-family: sans-serif;
	font-size: 12px;
	margin-top: 2px;
}


@media (max-width: 768px) {
  .why-section {
    padding: 15px;
  }
}

.ft {
  text-align: center;
  width: 100%;
  background-color: #4a12a5;
  color: rgb(255, 255, 255);
  padding: 20px;
}
.para {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  text-align: center;
  align-items: center;
}

@media (max-width: 768px) {
  footer {
    padding: 15px;
  }
}

.button-35 {
  align-items: center;
  background-color: transparent;
  border-radius: 12px;
  box-shadow: transparent 0 0 0 3px, rgba(18, 18, 18, 0.1) 0 6px 20px;
  box-sizing: border-box;
  color: #121212;
  cursor: pointer;
  display: inline-flex;
  flex: 1 1 auto;
  font-family: Roboto Condensed;
  font-size: 1rem;
  font-weight: 700;
  justify-content: center;
  line-height: 1;
  margin: 20px;
  outline: none;
  padding: 1rem 1.2rem;
  text-align: center;
  text-decoration: none;
  transition: box-shadow 0.2s, -webkit-box-shadow 0.2s;
  white-space: nowrap;
  border: 0;
  -webkit-user-select: none;
  user-select: none;
  touch-action: manipulation;
  box-shadow: #000000 0 0 0 3px, transparent 0 0 0 0;
}

.button-35:hover {
  background-color: #4a12a5;
  color: #ffffff;
  box-shadow: none;
}
.footer-section {
  background: #070111;
  color: #ffffff;
  padding: 40px 0;
}

.dcontainer {
  width: 90%;
  max-width: 1200px;
  margin: 0 auto;
}

.footer-content {
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
}

/*.footer-logo img {
  max-width: 150px;
}*/

.footer-links, .footer-contact, .footer-subscribe {
  flex: 1 1 25%; /* Flex-grow, flex-shrink, and flex-basis */
  margin: 20px;
}

.footer-links h3,
.footer-contact h3,
.footer-subscribe h3 {
  margin-bottom: 15px;
  font-size: 18px;
  position: relative;
}

.footer-links h3::after,
.footer-contact h3::after,
.footer-subscribe h3::after {
  content: "";
  display: block;
  height: 2px;
  width: 50px;
  background: #ff5e14;
  margin-top: 5px;
}

.footer-links ul {
  list-style: none;
}

.footer-links ul li {
  margin: 10px 0;
}

.footer-links ul li a {
  color: #ffffff;
  text-decoration: none;
}

.footer-links ul li a:hover {
  text-decoration: underline;
}

.footer-contact p {
  margin: 10px 0;
}

.footer-subscribe form {
  display: flex;
}

.footer-subscribe input {
  flex: 1;
  padding: 10px;
  border: none;
  border-radius: 5px;
}

.footer-subscribe button {
  background: #ff5e14;
  border: none;
  border-radius: 5px;
  padding: 10px 15px;
  color: white;
  cursor: pointer;
}

.footer-subscribe button:hover {
  background: #e05210;
}

.footer-bottom {
  text-align: center;
  margin-top: 20px;
  border-top: 1px solid #373636;
  padding: 20px 0;
}

.footer-bottom p {
  margin: 0;
}

.footer-socials a {
  color: #ffffff;
  margin: 0 10px;
  font-size: 20px;
  text-decoration: none;
}

.footer-socials a:hover {
  color: #ff5e14;
}

/* Responsive Styles */
@media (max-width: 768px) {
  .footer-content {
      flex-direction: column;
      align-items: center;
  }
  
  .footer-links,
  .footer-contact,
  .footer-subscribe {
      flex: 1 1 100%; /* Full width for small screens */
      text-align: center;
  }

  .footer-bottom {
      text-align: center;
  }
}
.form-control{
  width: 500px;
}
.timer{
  color: #e05210;
  font-weight: bold;
}


        /* Your CSS remains the same */
        .container {
            margin-top: 50px;
        }
        .exam-timer {
            font-size: 2rem;
            font-weight: bold;
            margin-bottom: 20px;
            text-align: center;
        }
        .upload-section {
            margin-top: 20px;
        }
        .upload-section label {
            font-size: 1.2rem;
        }
        .btn-custom {
            background-color: #4a12a5;
            color: white;
            border-radius: 10px;
            margin-top: 20px;
        }
        .btn-custom:hover {
            background-color: #350d7d;
        }
        footer {
            margin-top: 50px;
        }
        .form-control{
            width: 450px;
        }
        .timer{
            color: #e05210;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <nav class="navbar navbar-expand-lg">
        <a class="navbar-brand" href="home2.jsp">SmartExam</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-between" id="navbarNav">
            <ul class="navbar-nav justify-content-center flex-grow-1">
                <li class="nav-item"><a class="nav-link" href="studentprofile.jsp">Dashboard</a></li>
                <li class="nav-item"><a class="nav-link" href="examconcern.jsp">Exam Concerns</a></li>
                <li class="nav-item"><a class="nav-link" href="getResultServlet">Results</a></li>
                <li class="nav-item"><a class="nav-link" href="examwrite.jsp">Exams</a></li>
                <li class="nav-item"><a class="nav-link" href="aboutus2.jsp">About Us</a></li>
            </ul>
        </div>
    </nav>

   <!-- Exam Writing Page Content -->
   <div class="container">
        <h2>Exam Writing</h2>

        <!-- Download Section -->
        <div class="download-section ">
            <button id="downloadBtn" class="button-35">Download Exam Paper</button>
        </div>

        <!-- Countdown Timer -->
        <div class="timer" id="countdown">Time Left: 02:00:00</div>

        <!-- Upload Section -->
        <div class="upload-section ">
            <label for="uploadFile" class="form-label">Upload Your Answer Paper (PDF):</label>
            <input type="file" class="form-control" id="uploadFile" accept="application/pdf" />
            <button class="button-35">Submit Answers</button>
        </div>
    </div>

    <!-- Modal for Quiz Password -->
    <div class="modal fade" id="passwordModal" tabindex="-1" aria-labelledby="passwordModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="passwordModalLabel">Enter Quiz Password</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <label for="quizPassword" class="form-label">Quiz Password:</label>
                    <input type="password" id="quizPassword" class="form-control" placeholder="Enter password"  />
                    <small class="text-danger d-none" id="errorMsg">Incorrect Password, please try again!</small>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" id="submitPassword" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </div>
    </div>

    <script>
      let countdownInterval;

      // Countdown function
      function startCountdown(duration) {
        let timer = duration, hours, minutes, seconds;
        countdownInterval = setInterval(function () {
          hours = Math.floor((timer / 3600) % 24);
          minutes = Math.floor((timer % 3600) / 60);
          seconds = Math.floor(timer % 60);

          hours = hours < 10 ? "0" + hours : hours;
          minutes = minutes < 10 ? "0" + minutes : minutes;
          seconds = seconds < 10 ? "0" + seconds : seconds;

          document.getElementById("countdown").textContent = "Time Left: " + hours + ":" + minutes + ":" + seconds;

          if (--timer < 0) {
            clearInterval(countdownInterval);
            document.getElementById("countdown").textContent = "Time's Up!";
          }
        }, 1000);
      }

      // Open password modal when Download button is clicked
      document.getElementById("downloadBtn").addEventListener("click", function () {
        let passwordModal = new bootstrap.Modal(document.getElementById('passwordModal'));
        passwordModal.show();
      });

      // Handle password submission
      document.getElementById("submitPassword").addEventListener("click", function () {
        const correctPassword = "exam123"; // Set the correct password here
        const enteredPassword = document.getElementById("quizPassword").value;

        if (enteredPassword === correctPassword) {
          // Close modal
          let passwordModal = bootstrap.Modal.getInstance(document.getElementById('passwordModal'));
          passwordModal.hide();

          // Simulate downloading exam paper
          alert("Exam paper downloaded!");

          // Clear any existing countdown
          clearInterval(countdownInterval);

          // Start the countdown (e.g., 2 hours = 7200 seconds)
          startCountdown(7200); // 2 hours countdown
        } else {
          document.getElementById("errorMsg").classList.remove("d-none");
        }
      });
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
