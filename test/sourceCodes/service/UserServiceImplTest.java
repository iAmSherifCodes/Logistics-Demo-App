package sourceCodes.service;

import sourceCodes.data.model.User;
import sourceCodes.dto.requests.RegisterUserRequest;
import sourceCodes.dto.responses.RegisterUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private UserService userService;

    @BeforeEach
    void setUp(){ userService = new UserServiceImpl(); }
    @Test
    void registerUserTest(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setFirstName("Legends");
        request.setFirstName("Odogwu");
        request.setPhoneNumber("08066085496");
        request.setAddress("Yaba");
        request.setEmail("legends@gmail.com");

        RegisterUserResponse user = userService.registerNewUser(request);
        assertEquals(1,user.getId());
        User foundUser = userService.findUser(1);
        //assertEquals(user,foundUser);
        //assertSame(user,foundUser);
        System.out.println(foundUser);
    }

}