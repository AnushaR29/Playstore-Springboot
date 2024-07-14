package com.Playstore.user_api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8056/app")
public interface FiegnCommunicator {
    @GetMapping("/byUser/{userId}")
    public List<Apps> callApps(@PathVariable("userId") int userId);
    @GetMapping("/byUser/{userId}")
    public List<Apps> callByUser(@PathVariable("userId") int userId);

}
