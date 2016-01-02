package gojava.services;

import gojava.dao.UserDAO;
import gojava.model.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by root on 16.12.15.
 */
public class UserServiceTest {

    @Mock
    UserDAO mockTarget;

    UserService userService = new UserService();

    User user =  new User("Bob", "123456", "Marley", "bm@gmail.com");

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        userService.userDAO = mockTarget;
    }

    @Test
    public void testRegisterUser() throws Exception {
        when(mockTarget.create(user)).thenReturn(user);
        User actual = userService.registerUser(user);
        verify(mockTarget).create(user);
        assertEquals(user, actual);
    }

    @Test
    public void testLoginUser() throws Exception {

    }
}