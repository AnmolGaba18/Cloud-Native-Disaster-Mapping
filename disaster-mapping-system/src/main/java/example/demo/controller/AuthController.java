package example.demo.controller;

import example.demo.model.User;
import example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){

        Optional<User> loggedUser =
                service.login(user.getEmail(), user.getPassword());

        return loggedUser.orElse(null);
    }
}