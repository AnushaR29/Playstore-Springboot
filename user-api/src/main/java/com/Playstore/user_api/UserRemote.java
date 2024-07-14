package com.Playstore.user_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRemote extends JpaRepository<User,Integer> {
}
