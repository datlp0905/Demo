function checkregister(){
	var username=document.getElementById("username");
		var fullname=document.getElementById("fullname");

		var password=document.getElementById("password");
		var confirmpassword=document.getElementById("confirmpassword"); 
		var mau1=/^([a-zA-Z0-9]{6,})$/; 
		var mau2=/^([a-zA-Z\s]{3,})$/;  
		var flag=true;
		if(mau1.test(username.value)==false ){  
			flag=false; 
			username.style.borderColor = "red"; 
		} 
 		else username.style.borderColor = "white";
		if(mau2.test(fullname.value)==false){ 
			flag=false;
			fullname.style.borderColor = "red"; 
		} 
		else fullname.style.borderColor = "white";
		if(mau1.test(password.value)==false || password.value != confirmpassword.value){
			flag=false; 
				password.style.borderColor = "red";
				confirmpassword.style.borderColor = "red"; 
		} 
		else{
			password.style.borderColor = "white"; confirmpassword.style.borderColor = "white";
		}

		if(flag == false) window.alert("Thông tin nhập chưa hợp lệ!");
		return flag;
}