package com.Playstore.user_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apps {
    private int appId;
    private String appName;
    private String appVendor;
    private int downloadedCount;
    private double ratings;
    private int userId;
}
