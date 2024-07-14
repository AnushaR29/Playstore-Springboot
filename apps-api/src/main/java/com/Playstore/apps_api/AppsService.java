package com.Playstore.apps_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppsService {
    @Autowired
    AppsRemote remote;

    public List<Apps> implementFindUser(int userId){
        return remote.findAllByUserId(userId);
    }

    public Apps implementFindById(int appsID){
        return remote.findById(appsID).orElse(new Apps());
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Apps> implementFindAll(){
        return remote.findAll();
    }

    public Apps implementSave(Apps apps){
        return remote.save(apps);
    }
}

