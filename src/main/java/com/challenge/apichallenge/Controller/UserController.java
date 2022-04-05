package com.challenge.apichallenge.Controller;

import com.challenge.apichallenge.DTO.UserDto;
import com.challenge.apichallenge.Entity.User;
import com.challenge.apichallenge.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("api/users")
    public User post_userController (@RequestBody UserDto userDto){
        return userService.post_user(userDto);
    }

    @GetMapping("api/users")
    public List<User> getAllUsersCtrl(){
        return userService.getAllUserService();
    }

    @GetMapping("api/users/{id}")
    public User getUserbyIdctrl(@PathVariable("id") int id){
        return userService.getUserById(id);
    }


    @PutMapping("api/users/{id}")
    public User updateUserCtrl(@PathVariable int id, @RequestBody UserDto usersDto){
        return userService.updateUser(id,usersDto);
    }

    @DeleteMapping("api/users/{id}")
    public User deleteUserCtrl(@PathVariable("id") int id){
        return userService.deleteUser(id);
    }




}
