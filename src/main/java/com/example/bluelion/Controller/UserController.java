package com.example.bluelion.Controller;

import com.example.bluelion.Model.User;
import com.example.bluelion.Repositories.UserRepository;
import com.example.bluelion.Services.UserService;
import com.example.bluelion.Services.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping(path = "/BlueLion")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/createNew", method = RequestMethod.POST,produces = {"application/json"})
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, "Required properties are missing", e);
        }
    }
}
