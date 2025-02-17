package com.example.springbootjpa.dao;


import com.example.springbootjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {

    @PersistenceContext
    private EntityManager entityManager;


    public  long insert(User user){

        entityManager.persist(user);
        return user.getId();

    }
}
