package com.artgallery.artgallery.authController;

import com.artgallery.artgallery.SharedBeans.GenericResponse;
import com.artgallery.artgallery.authService.AuthService;
import com.artgallery.artgallery.entityClass.Users;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AuthService authService;

    @PostMapping("/saveUser")
    public @ResponseBody GenericResponse registerUser(@RequestBody Users user){
        GenericResponse response = new GenericResponse("User registered successfully",200,(Users)authService.saveEntity(user));
        return response;
    }

    @GetMapping("/getUsers")
    public @ResponseBody GenericResponse getRegisteredUsers(){
        GenericResponse response = new GenericResponse("Result fetched",200,(List<Users>) authService.getEnitity());
        return response;
    }

}
