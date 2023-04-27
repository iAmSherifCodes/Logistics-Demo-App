package sourceCodes.controller;

import sourceCodes.data.model.User;
import sourceCodes.dto.requests.RegisterUserRequest;
import sourceCodes.dto.responses.RegisterUserResponse;
import org.springframework.web.bind.annotation.*;
import sourceCodes.service.UserService;
import sourceCodes.service.UserServiceImpl;

@RestController
public class userController {
    private UserService userService = new UserServiceImpl();

    @PostMapping("/user")
    public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest user){
        return userService.registerNewUser(user);
    }
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return userService.findUser(id);
    }

}
