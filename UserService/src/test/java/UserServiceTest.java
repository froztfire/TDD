import com.appsdeveloperblog.estore.model.User;
import com.appsdeveloperblog.estore.service.UserService;
import com.appsdeveloperblog.estore.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    UserService userService;
    String firstName;
    String lastName;
    String email;
    String password;
    String repeatPassword;

    @BeforeEach
    void init() {
        userService = new UserServiceImpl();
        firstName = "Jerome";
        lastName = "Garcia";
        email = "test@test.com";
        password = "12345678";
        repeatPassword = "12345678";
    }

    @DisplayName("User Object Created")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject() {
        //Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        //Assert
        assertNotNull(user, "The createUser() should not have returned null");
        assertEquals(firstName, user.getFirstName(), "User firstname must be correct");
        assertEquals(lastName, user.getLastName(), "User lastname must be correct");
        assertEquals(email, user.getEmail(), "User email must be correct");
        assertNotNull(user.getId(), "User id is missing");
    }

    @DisplayName("Empty First name cause correct Exception")
    @Test
    void testCreateUser_whenFistNameIsEmpty_ThrowsIllegalArgumentException() {
        //Arrange
        String firstName = "";
        String expectedMessage = "User's first name is empty";

        //Act & Assert
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Empty first name should have cause illegal argument exception");

        //Assert
        assertEquals(expectedMessage, thrown.getMessage(), "Exception error is not correct");
    }
}
