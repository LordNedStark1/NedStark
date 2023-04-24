package service;

import data.models.User;
import data.repository.UserRepository;
import data.repository.UserRepositoryImpl;
import dto.requests.SignUpRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserService customer;
    UserRepository person;
    User user;

    @BeforeEach
    void setUp() {
        customer = new UserServiceImpl();
        person = new UserRepositoryImpl();
        user = new User();
    }

    @Test
    public void testThatObjectExists(){
        assertNotNull(customer);
        assertNotNull(person);
        assertNotNull(user);
    }

    @Test
    public void userCanSignUpTest(){
        SignUpRequest request = new SignUpRequest();
        request.setEmail("ename@gmail.com");
        request.setPassword("1234");

        assertEquals("Sign Up Successful", customer.signUp(request));
        UUID id = UUID.fromString(customer.signUpNed(request));
        System.out.println(person);
        System.out.println(user.getEmail());
//        assertEquals(1, person.countUsers());
        assertEquals("ename@gmail.com", person.findById(id).getEmail());
    }
}