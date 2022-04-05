package com.challenge.apichallenge.Services;

import com.challenge.apichallenge.DTO.UserDto;
import com.challenge.apichallenge.Entity.User;
import com.challenge.apichallenge.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //tanda ini class service
public class UserService {

    @Autowired  //panggil class lain
    UserRepository userRepository;

    public User post_user(UserDto userDto){
        // entity
        User user = new User();
        // inisialisasi entity dengan dto
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        // save
        return userRepository.save(user);
    }

    public List<User> getAllUserService(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        try {
            User user = userRepository.findById(id);
            if(user != null){
                userRepository.findById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User not found");
        }
        return userRepository.findById(id);
    }

    public User updateUser(int id, UserDto usersDto){
        User usersupdate = new User();

        try{
            User user = userRepository.findById(id);
            if(user != null){
                user.setUsername(usersDto.getUsername());
                user.setEmail(usersDto.getEmail());
                user.setPassword(usersDto.getPassword());
                usersupdate = userRepository.save(user);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User not found");
        }
        return usersupdate;
    }

    public User deleteUser(int id){
        try {
            User user = userRepository.findById(id);
            if(user != null){
                userRepository.deleteById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User not found");
        }
        return userRepository.findById(id);
    }





}
