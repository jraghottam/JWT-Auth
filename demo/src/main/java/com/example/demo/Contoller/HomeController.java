package com.example.demo.Contoller;

import com.example.demo.models.users;
import com.example.demo.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class HomeController {

//    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public List<users> test(){
        return this.userService.getusersList();
    }

    @GetMapping("/lu")
    public String getloggeduser(Principal principal){
        return (principal.getName());
    }

    @GetMapping("/abc")
    public String abc(){
        return ("hello");
    }


}


