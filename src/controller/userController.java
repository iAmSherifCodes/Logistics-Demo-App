package controller;

import data.model.User;
import dto.requests.RegisterUserRequest;
import dto.responses.RegisterUserResponse;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import service.UserServiceImpl;

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
