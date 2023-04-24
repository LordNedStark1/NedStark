package data.repository;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {

    UserRepository person;
    User user;

    @BeforeEach
    void setUp() {
        person = new UserRepositoryImpl();
        user = new User();
    }

    @Test
    public void testThatObjectsExists(){
        assertNotNull(person);
        assertNotNull(user);
    }

    @Test
    @DisplayName("Create new User test")
    public void saveOneUser_countIsOneTest(){
        assertEquals(0, person.countUsers());

        System.out.println(person.saveUser(user));
        user.setFirstName("Inem");

        assertEquals(1, person.countUsers());
    }

    @Test
    @DisplayName("Can Generate Id test")
    public void saveOneUser_IdCountIsNotNull(){
        assertNull(user.getId());

        person.saveUser(user);

        assertNotNull(user.getId());

    }

    @Test
    @DisplayName("Find by Id test")
    public void saveOneUser_findUserById_returnsSavedUserTest(){
        user.setFirstName("Inem");
        user.setLastName("Udo");
        person.saveUser(user);

        User foundUser = person.findById(user.getId());
        assertNotNull(foundUser.getId());
        assertEquals(1, person.countUsers());
        assertEquals("Inem", user.getFirstName());
    }

    @Test
    @DisplayName("Update test")
    public void saveTwoUsersWithSameId_countIsOneTest(){
        user.setEmail("ename@gmail.com");
        person.saveUser(user);
        User savedUser = person.findById(user.getId());
        assertEquals(user, savedUser);

        User secondUser = new User();
        secondUser.setId(user.getId());
        secondUser.setEmail("legend@gmail.com");
        person.saveUser(secondUser);

        assertEquals(1, person.countUsers());
        User findUser = person.findById(secondUser.getId());
        assertEquals(findUser, secondUser);
        assertEquals("legend@gmail.com", secondUser.getEmail());
        assertSame(savedUser.getId(), findUser.getId());
    }

    @Test
    @DisplayName("Delete User test")
    public void deleteUserTest(){
        User firstUser = new User();
        User secondUser = new User();
        User thirdUser = new User();
        User fourthUser = new User();

        person.saveUser(firstUser);
        person.saveUser(secondUser);
        person.saveUser(thirdUser);
        person.saveUser(fourthUser);

        person.deleteUser(firstUser);
        person.deleteUser(secondUser);
//        person.deleteUser(thirdUser);
//        person.deleteUser(fourthUser);
        assertEquals(2, person.countUsers());
    }

    @Test
    @DisplayName("Delete By Id test")
    public void deleteUserBy_Id_Test(){
        User firstUser = new User();
        User secondUser = new User();
        User thirdUser = new User();

        firstUser.setId(firstUser.getId());
        person.saveUser(firstUser);

        secondUser.setId(secondUser.getId());
        person.saveUser(secondUser);

        thirdUser.setId(thirdUser.getId());
        person.saveUser(thirdUser);

        person.deleteUser(firstUser.getId());

        assertEquals(2, person.countUsers());
    }
}