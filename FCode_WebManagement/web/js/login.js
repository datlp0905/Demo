function showLogin()
{
  var login = document.getElementById("loginPanel");
    if(login.style.display == "none"){
        login.style.display = "block";
    } else{
                login.style.display = "none";
    }
}