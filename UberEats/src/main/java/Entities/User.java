package Entities;

public class User {




    public enum UserType {Customer,Driver,Admin};
    private String firstName;
    private String password;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private UserType userType;

    public User() {
        firstName = "none";
        password= "none";
        lastName = "none";
        emailAddress ="no@ne";
        phoneNumber ="0000000000";
        userType= UserType.Admin;
    }

    public User(String firstName, String password, String lastName, String emailAddress, String phoneNumber, UserType userType) {
        this.firstName = firstName;
        this.password = password;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()< 3)
        {
            throw  new IllegalArgumentException("Fist Name can not have less than 3 characters");
        }
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        if(password.length()< 3)
        {
            throw  new IllegalArgumentException("Password must have  7 or more characters");
        }
        this.password = password;
    }

    public void setLastName(String lastName) {
        if(lastName.length()< 3)
        {
            throw  new IllegalArgumentException("Last Name can not have less than 3 characters");
        }
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        if(emailAddress.contains("@"))
        {
            this.emailAddress = emailAddress;
        }else
        {
            throw  new IllegalArgumentException("Invalid Email Address");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserType getUserType() {
        return userType;
    }



}
