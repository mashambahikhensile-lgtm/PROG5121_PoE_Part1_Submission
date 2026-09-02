package com.mycompany.chatapp.prog5121_poe_part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author masha
 */
public class LoginTest {

    @Test
    public void testLoginSuccessful() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFailed() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertFalse(login.loginUser("kyl_1", "wrongpassword"));
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertTrue(login.checkUserName());
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyle!!!!!!",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertFalse(login.checkUserName());
    }

    @Test
    public void testPasswordMeetsComplexityRequirements() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "password",
                "+27338968976"
        );

        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553"
        );

        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testSuccessfulLoginMessage() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertEquals(
                "Welcome Mash, Grace it is great to see you again.",
                login.returnLoginStatus(true)
        );
    }

    @Test
    public void testFailedLoginMessage() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertEquals(
                "Username or password incorrect, please try again.",
                login.returnLoginStatus(false)
        );
    }

    @Test
    public void testUsernameErrorMessage() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyle!!!!!!",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertEquals(
                "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
                login.registerUser()
        );
    }

    @Test
    public void testPasswordErrorMessage() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "password",
                "+27338968976"
        );

        assertEquals(
                "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
                login.registerUser()
        );
    }

    @Test
    public void testSuccessfulRegistrationMessage() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertEquals(
                "User registered successfully.",
                login.registerUser()
        );
    }

    @Test
    public void testSuccessfulLoginUsernameAndPassword() {
        Login login = new Login(
                "Mash",
                "Grace",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27338968976"
        );

        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
}