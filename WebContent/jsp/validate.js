function validate()
{
	var first_name = document.getElementById("first_name").value;
	var last_name = document.getElemeneById("last_name").value;
	var dob = document.getElementById("dob").value;
	var address = document.getElementById("address").value;
	var state = document.getElementById("state").value;
	var pincode = document.getElementById("pincode").value;
	var f_name = document.getElementById("f_name").value;
	var f_contact = document.getElementById("f_contact").value;
	var email = document.getElementById("email").value;
	var contact = document.getElementById("contact").value;
	
	var emailreg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]{2,6}$/;
	
	if(first_name!="" && last_name!="" && dob!="" && address!="" && state!="" && pincode!="" && f_name!="" && f_contact!="" && email!="" && contact!="" ){
		if(pincode.length == 6){
			if(f_contact.length == 10){
				if(email.match(emailreg)){
					if(contact.length == 10){
						alert("All fields are validated");
						return true;
					}
					else{
						alert("Enter a valid Contact number of 10 digits");
						return false;
					}
				}
				else{
					alert("Enter a valid Email Id");
					return false;
				}
			}
			else{
				alert("Enter a valid Father's contact no. of 10 digits");
				return false;
			}
		}
		else{
			alert("Enter a valid pincode of 6 digits");
			return false;
		}
	}
	else{
		alert("All fields are required");
		return false;
	}
}