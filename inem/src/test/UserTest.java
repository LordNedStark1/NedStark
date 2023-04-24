package test;





import dto.SignUpRequest;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repo.Repository;
import repo.UserRepository;
import userService.UserServivce;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {
    UserServivce customer;
    Repository person;
    User user;

    @BeforeEach
    void setUp() {
        person = new Repository();
        customer = new UserServivce(person);
        user = new User();
    }

    @Test
    public void testThatObjectExists() {
        assertNotNull(customer);
        assertNotNull(person);
        assertNotNull(user);
    }

    @Test
    public void userCanSignUpTest() {
        SignUpRequest request = new SignUpRequest();
        request.setEmail("ename@gmail.com");
        request.setPassword("1234");

        assertEquals(1, customer.signUp(request));



        assertEquals(1, person.countUsers());

    }

    @Test
    public void userCanFindUserTest() {
        SignUpRequest request = new SignUpRequest();
        request.setEmail("ename@gmail.com");
        request.setPassword("1234");

        int id = customer.signUp(request);
        assertEquals(id, person.findById(id).getId());
        assertEquals("ename@gmail.com", person.findById(id).getEmail());
    }
}

