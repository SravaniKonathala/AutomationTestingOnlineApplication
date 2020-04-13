package com.works.test.javabeans;

public class UserRegistrationDetails {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String confemail;
    private String confPassword;

    public UserAddressRegistration getUserAddressRegistration() {
        return userAddressRegistration;
    }

    public void setUserAddressRegistration(UserAddressRegistration userAddressRegistration) {
        this.userAddressRegistration = userAddressRegistration;
    }

    public UserAddressRegistration userAddressRegistration;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfemail() {
        return confemail;
    }

    public void setConfemail(String confemail) {
        this.confemail = confemail;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }


}
