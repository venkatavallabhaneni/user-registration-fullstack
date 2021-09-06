import React from "react"
class UserRegistrationForm extends React.Component {
  render() {
    return (
      
    <div class="container">
        <h1><p class="registerbtn">User Registration Form</p></h1>
       
        <hr></hr>
    
        <label for="email"><b>Name</b></label>
        <input type="text" placeholder="Enter Name" name="name" id="name" required/>
    
        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" id="email" required/>

       
        <label for="phone"><b>Phone</b></label>
        <input type="text" placeholder="Enter Phone Number" name="phone" id="phone" required/>
      
        <label for="address"><b>Address</b></label>
        <input type="text" placeholder="Enter Full Address" name="address" id="address" required/>
    
        <label for="gender-label"><b>Gender</b></label><br/>
        <select name="gender" id="gender" >
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Others">Others</option>           
        </select>
        <br/>
        <br/>
        <label for="profession-label"><b>Profession</b></label>
       &nbsp; <input type="radio" id="eng" name="profession" value="eng"/>
        <label for="eng">Engineer</label>
        <input type="radio" id="dr" name="profession" value="dr"/>
        <label for="dr">Doctor</label>
        <input type="radio" id="bm" name="profession" value="bm"/>
        <label for="bm">Business</label>
         
        <hr></hr>
    
        <button type="submit" class="registerbtn">Register</button>
    </div>
    
   
    )
  }
}
export default UserRegistrationForm