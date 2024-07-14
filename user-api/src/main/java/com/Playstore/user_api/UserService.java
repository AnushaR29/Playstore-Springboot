package com.Playstore.user_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

    public User implementFindById(int id){
        User obj = remote.findById(id).orElse(new User());
        if(obj!=null){
            obj.setMyApps(fiegnCommunicator.callApps(obj.getUserId()));
        }
        return obj;
    }
    public List<User> implementFindAll(){
        return remote.findAll();
    }
    public User implementSave(User user){
        return remote.save(user);
    }
    public User readId( int id){
        return remote.findById(id).orElse(new User());
    }
    public void implementDelete(int id) {
        remote.deleteById(id);
    }
}
