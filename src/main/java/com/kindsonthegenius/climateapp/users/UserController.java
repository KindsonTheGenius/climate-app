package com.kindsonthegenius.climateapp.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }


    @GetMapping("/users2")
    public List<User> getUser2(){
        return userService.getUsers();
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Integer id){
        userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser( id);
    }
}
