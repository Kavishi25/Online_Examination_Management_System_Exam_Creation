<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="about.css">
    <link rel="shortcut icon" href="aboutus.png" />
    <title>About Us</title>
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
  />

  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link
    href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap"
    rel="stylesheet"
  />
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
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
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

</head>
<body>
<!-- Navigation Bar -->
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
                  <a class="nav-link" href="home2.jsp">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Courses</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Results</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Exams</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="about.jsp">About Us</a>
                </li>
              </ul>
              <div>
        <a href=studentprofile.jsp>
          <button id="profileButton" class="btn btn-outline-primary mx-1">
            <i class="fas fa-user"></i>
          </button>
          </a>
        </div>
            </div>
        </nav>
    
        <!-- Main Container -->
        <header class="header">
            <div class="container">
                <h1 class="animate-header">About Us</h1>
                <p class="animate-header">Welcome to SmartExam, a trusted online platform dedicated to revolutionizing the way examinations are conducted. Our mission is to provide a seamless, secure, and efficient online examination experience for students, educators, and institutions worldwide.</p>
            </div>
        </header>
    
        <!-- Company Info Section -->
        <section class="company-info">
            <div class="container">
                <div class="info-grid">
                    <div class="info-item animate-item">
                        <h2>Our Mission</h2>
                        <p>To become the leading global platform for secure, accessible, and efficient online examinations, empowering learners and institutions with innovative assessment solutions that bridge the gap between knowledge and opportunity.</p>
                    </div>
                    <div class="info-item animate-item">
                        <h2>Our Vision</h2>
                        <p>To provide a seamless and user-friendly online examination platform that ensures fairness, integrity, and convenience for students and educators.
                           To leverage advanced technology for secure exam proctoring, real-time analytics, and personalized feedback, making assessments more effective and efficient.</p>
                    </div>
                    <div class="info-item animate-item">
                        <h2>Our Values</h2>
                        <p>We prioritize honesty, transparency, and fairness in every aspect of our platform, ensuring that exams are conducted with the highest ethical standards. Constantly evolving with cutting-edge technologies to provide secure, scalable, and adaptive solutions for online assessments.</p>
                    </div>
                </div>
            </div>
        </section>
    
        <!-- Team Section -->
        <section class="team">
            <div class="container">
                <h2 class="animate-team">Meet the Leadership Team</h2>
                <div class="team-grid">
                    <div class="team-member animate-team">
                        <img src="https://via.placeholder.com/150" alt="dumindu">
                        <h3>DUMINDU</h3>
                        <p>CEO & Founder</p>
                    </div>
                    <div class="team-member animate-team">
                        <img src="https://via.placeholder.com/150" alt="kavishi">
                        <h3>KAVISHI</h3>
                        <p>Chief Technology Officer</p>
                    </div>
                    <div class="team-member animate-team">
                        <img src="https://via.placeholder.com/150" alt="kalana">
                        <h3>KALANA</h3>
                        <p>Chief Financial Officer</p>
                    </div>
                    <div class="team-member animate-team">
                        <img src="https://via.placeholder.com/150" alt="hafsa">
                        <h3>HAFSA</h3>
                        <p>Chief HR Officer</p>
                    </div>
                </div>
            </div>
        </section>
    
        <!-- Footer Code -->
        <footer class="footer-section">
            <div class="container">
                <div class="footer-content">
                    <!-- <div class="footer-logo">
                        <a href="#"><img src="https://i.ibb.co/QDy827D/ak-logo.png" alt="Logo"></a>
                    </div> -->
                    <div class="footer-links">
                        <h3>Quick Links</h3>
                        <ul>
                            <li><a href="home2.jsp">Home</a></li>
                            <li><a href="about.jsp">About</a></li>
                            <li><a href="pricelist.jsp">courses</a></li>
                            <li><a href="examconcern.jsp">conserns</a></li>
                        </ul>
                    </div>
                    <div class="footer-contact">
                        <h3>Contact Us</h3>
                        <p><i class="fas fa-map-marker-alt"></i> 123 Street, City, Country</p>
                        <p><i class="fas fa-phone"></i> +123 456 789</p>
                        <p><i class="fas fa-envelope"></i> info@example.com</p>
                    </div>
                    <div class="footer-subscribe">
                        <h3>Subscribe to our Newsletter</h3>
                        <form action="#">
                            <input type="email" placeholder="Your Email Address" required>
                            <button type="submit"><i class="fas fa-paper-plane"></i></button>
                        </form>
                    </div>
                </div>
                <div class="footer-bottom">
                    <p>&copy; 2024 Your Company. All rights reserved.</p>
                    <div class="footer-socials">
                        <a href="#"><i class="fab fa-facebook-f"></i></a>
                        <a href="#"><i class="fab fa-twitter"></i></a>
                        <a href="#"><i class="fab fa-instagram"></i></a>
                        <a href="#"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    
        <!-- Bootstrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    

</body>
</html>