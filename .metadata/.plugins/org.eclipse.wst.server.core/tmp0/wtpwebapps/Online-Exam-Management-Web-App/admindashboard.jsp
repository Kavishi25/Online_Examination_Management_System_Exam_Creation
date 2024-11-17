<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="RegistrationAssets/IMGS/dash.png">
    <title>ADMIN DASH</title>
    <link rel="stylesheet" href="RegistrationAssets/CSS/adminstyle.css" />
    <link
    href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css"
    rel="stylesheet"
  />
  </head>
  <body>
    <div class="container">
        <div class="navigation">
          <ul>
            <li>
              <a href="#">
                <span class="icon">
                  <ion-icon class="bx bxs-book-reader"></ion-icon>
                </span>
                <span class="title">SmartExam</span>
              </a>
            </li>
  
            <li>
              <a href="admindashboard.jsp">
                <span class="icon">
                  <ion-icon name="home-outline"></ion-icon>
                </span>
                <span class="title">Dashboard</span>
              </a>
            </li>
  
            <li>
              <a href="#">
                <span class="icon">
                  <ion-icon class="bx bxs-envelope"></ion-icon>
                </span>
                <span class="title">Exam Concerns</span>
              </a>
            </li>
  
            <li>
              <a href="examForm.jsp">
                <span class="icon">
                  <ion-icon class ="bx bxs-edit"></ion-icon>
                </span>
                <span class="title">Create Exam</span>
              </a>
            </li>
  
            <li>
              <a href="publishResults.jsp">
                <span class="icon">
                  <ion-icon name="megaphone"></ion-icon>
                </span>
                <span class="title">Results Publishing</span>
              </a>
            </li>
  
            <li>
              <a href="#">
                <span class="icon">
                  <ion-icon class= "bx bxs-user"></ion-icon>
                </span>
                <span class="title">Profile</span>
              </a>
            </li>
  
           <br>
           <br>
           <br>
            <li>
              <a href="Home.jsp">
                <span class="icon">
                  <ion-icon name="log-out-outline"></ion-icon>
                </span>
                <span class="title">Sign Out</span>
              </a>
            </li>
          </ul>
        </div>

        <div class="main">
            <div class="topbar">
              <div class="toggle">
                <ion-icon name="menu-outline"></ion-icon>
              </div>
    
              <div class="search">
                <label>
                  <input type="text" placeholder="Search here" />
                  <ion-icon name="search-outline"></ion-icon>
                </label>
              </div>
    
              <div class="user">
                <i class="bx bxs-user" ></i>
              </div>
            </div>

            <div class="cardBox">
             
                <div class="card">
                  <div>
                    <div class="numbers">15   </div>
                    <a href="GetAllStudentServlet">
                    <div class="cardName"> All Students </div>
                    </a>
                  </div>
              
      
                  <div class="iconBx">
                    <i class="bx bxs-user"></i>
                  </div>
                </div>
      
                <div class="card">
                  <div>
                    <div class="numbers">80</div>
                    <a href ="paymentgetall">
                    <div class="cardName">Payments</div>
                    </a>
                  </div>
      
                  <div class="iconBx">
                    <i class="bx bxs-wallet-alt
                    "></i>
                    
                  </div>
                </div>
      
                <div class="card">
                  <div>
                    <div class="numbers">284</div>
                    <a href ="GetAllExamServlet">
                   
                    <div class="cardName">Exams</div>
                     </a>
                  </div>
      
                  <div class="iconBx">
                    <i class="bx bxs-book"></i>
                  </div>
                </div>
      
                <div class="card">
                  <div>
                    <div class="numbers">21</div>
                    <a href = "getResultServlet">
                    <div class="cardName">Published Results</div>
                    </a>
                  </div>
                     <div class="iconBx">
                      <i class="bx bxs-file-blank"></i>
                    </div>
                  </div>
                  <div class="card">
                    <div>
                      <div class="numbers">Admins</div>
                      <div class="cardName"><ul>
                        <li>Dumindu</li>
                        <li>Kavishi</li>
                        <li>Hafsa</li>
                        <li>Kalana</li>
                        <li>Ravindu</li>
                      </ul></div>
                    </div>
                       <div class="iconBx">
                        <i class="bx bxs-user"></i>
                      </div>
                    </div>
                    <div class="card">
                      <div>
                        <div class="numbers">Instructors</div>
                        <div class="cardName"><ul>
                          <li>Dumindu</li>
                          <li>Kavishi</li>
                          <li>Hafsa</li>
                          <li>Kalana</li>
                          <li>Ravindu</li>
                        </ul></div>
                      </div>
                         <div class="iconBx">
                          <i class="bx bxs-user"></i>
                        </div>
                      </div>
                      <div class="card">
                        <div>
                          <div class="numbers">Teachers</div>
                          <div class="cardName"><ul>
                            <li>Dumindu</li>
                            <li>Kavishi</li>
                            <li>Hafsa</li>
                            <li>Kalana</li>
                            <li>Ravindu</li>
                          </ul></div>
                        </div>
                           <div class="iconBx">
                            <i class="bx bxs-user"></i>
                          </div>
                        </div>
                        <div class="card">
                          <div>
                            <div class="numbers">T.O</div>
                            <div class="cardName"><ul>
                              <li>Dumindu</li>
                              <li>Kavishi</li>
                              <li>Hafsa</li>
                              <li>Kalana</li>
                              <li>Ravindu</li>
                            </ul></div>
                          </div>
                             <div class="iconBx">
                              <i class="bx bxs-user"></i>
                            </div>
                          </div>
              </div>
             
              
                
      
                
             
              
      
                
      
               
              
              
            <script src="RegistrationAssets/Script/admin.js"></script>
        <script
        type="module"
        src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"
      ></script>
      <script
        nomodule
        src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"
      ></script>
  </body>
</html>
    