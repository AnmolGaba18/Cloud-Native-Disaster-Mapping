package example.demo.service;

import example.demo.model.User;
import example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    /* REGISTER USER */

    public User register(User user) {

        if(user.getProfileImage() == null || user.getProfileImage().isEmpty()){
            user.setProfileImage("default.png");
        }

        return repository.save(user);
    }


    /* LOGIN USER */

    public Optional<User> login(String email, String password){

        Optional<User> user = repository.findByEmail(email);

        if(user.isPresent()){

            if(user.get().getPassword().equals(password)){
                return user;
            }
        }

        return Optional.empty();
    }
}