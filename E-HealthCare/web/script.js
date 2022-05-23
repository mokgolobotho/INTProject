
function clientMenu(){
    window.location.href ="patient.html";
}

function logout(){
    window.location.href ="logout.do";
}

function register(){
   window.location.href ="registration_page.html";  
}
function forgotPassword(){
   window.location.href ="forgot_password.html";  
}

function login(){
    window.location.href ="index.html";
}


function checkPassword()
{
    var pass1 = document.getElementById("pass").value;
    var pass2 = document.getElementById("re_pass").value;
   
    if ( pass1 ===  pass2)
    {
       document.getElementById("message").innerHTML = "";
       
    }else {
        
        document.getElementById("message").innerHTML = "Passwords are not the same";
        
    }
    
}

function doctorExtras() {
    var ch = document.getElementById("chkBx");
    var tb = document.getElementById("extraTable");
    
    if ( ch.checked == true ) {
        tb.style.display = "block";
    } else {
        tb.style.display = "none";
    }
}
