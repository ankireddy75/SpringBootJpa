package com.example.springbootjpa;

import com.example.springbootjpa.dao.UserDaoService;
import com.example.springbootjpa.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {


    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserDaoService userDAOService;

    @Override
    public void run(String... args) throws Exception {

        User user= new User("Rama","admin");

        userDAOService.insert(user);
        logger.info("User created Id:"+user.getId());

    }
}
