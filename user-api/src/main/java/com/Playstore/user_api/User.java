package com.Playstore.user_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String  userName;
    private LocalDate userDOB;
    private long userContact;
    private String userEmail;
    transient private List<Apps> myApps;

    public void setMyApps(List<Apps> apps) {
    }

    public int getUserId() {
        return userId;
    }
}
