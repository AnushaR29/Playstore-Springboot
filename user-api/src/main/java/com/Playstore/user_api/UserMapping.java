package com.Playstore.user_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserMapping {
    @Autowired
    UserService service;

    @PostMapping("/add")
    public User callSave(@RequestBody User user){
        return service.implementSave(user);
    }

    @GetMapping("/getId/{id}")
    public User getId (@PathVariable("id") int id){
        return service.readId(id);
    }


    @GetMapping("/")
    public List<User> callFetch(){
        return service.implementFindAll();
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }
}
