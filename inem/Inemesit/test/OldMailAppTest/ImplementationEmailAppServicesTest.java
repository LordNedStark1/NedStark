package OldMailAppTest;

import zoldMailApp.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ImplementationEmailAppServicesTest {

    SignUpDetails request;
    LoginDetails loginRequest;
    EmailAppServices emailAppServices;

    User user;

    @BeforeEach
    void setUp() {
        request = new SignUpDetails();
        loginRequest = new LoginDetails();
        emailAppServices = new ImplementationEmailAppServices();
        user = new User();
    }

    @Test
    public void userCanSignupTest(){
        request.setFirstName("Inem");
        request.setLastName("Udousoro");
        request.setNewEmailAddress("emsd@gmail.com");
        request.setPhoneNumber("07064591358");
        request.setNewPassword("1234");

        String signUpMessage = emailAppServices.signUp(request);

        assertEquals("successfully signed up", signUpMessage);
        assertEquals(1, emailAppServices.getNoOfSignees());
    }

    @Test
    public void userCanLoginTest(){
        request.setFirstName("Inem");
        request.setLastName("Udousoro");
        request.setNewEmailAddress("emsd@gmail.com");
        request.setPhoneNumber("07064591358");
        request.setNewPassword("1234");
        emailAppServices.signUp(request);

        loginRequest.setEmailAddress(request.getNewEmailAddress());
        loginRequest.setPassword(request.getNewPassword());
        emailAppServices.login(loginRequest);



    }
}