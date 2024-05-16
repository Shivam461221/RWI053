<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: white;  
}  
button {   
        background-color: #462255;   
        width: 10%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
        text-decoration: none;
         }
            
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
        padding: 25px;   
         margin: 25px;
        background-color: lightblue;  
    }  
   a {
   text-decoration: none;
   color: orange;
   }
   
</style>   
</head>    
<body>    
    <center> <h1>HR Manager Login Form </h1> </center>   
    <form method="post" action="managers">  
        <div class="container"> 
            <label>userName : </label>   
            <input type="hidden" name="task" value="login">
            <input type="text" placeholder="userName" name="userName" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
            <button type="submit">Login</button>
            <button type="submit"> <a  href="signup.jsp" >Sign Up</a></button>   
             Forgot <a href="#"> password? </a>   
        </div>   
    </form>     
</body>
</html>