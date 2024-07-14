package com.Playstore.apps_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppsRemote extends JpaRepository<Apps,Integer> {
    List<Apps> findAllByUserId(int userId);

}
