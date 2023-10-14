package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.model.pojo.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UsersDaoTest {
    private static final Logger logger = LogManager.getLogger(UsersDaoTest.class);
    @Autowired
    UsersDao usersDao;
    @Autowired
    private Users savedUser;

    @Test
    void testCrudUser(){
        Users user = new Users("test","password","email@test.com");

        try {
            usersDao.save(user);
            System.out.println("\n saved into db " + user.toString());
        }catch (Exception e){
            logger.catching(e);
            Assertions.fail("Error saving the instance");
        }
        try {
            savedUser = usersDao.getLast();
            System.out.println("\n recovered from db " + savedUser.toString());
            if (savedUser.getId()!=user.getId()){
                Assertions.fail("Error getting the last instance");
            }
        }catch (Exception e){
            logger.catching(e);
            Assertions.fail("Error getting the last instance");
        }
//        deletetestUser();
    }
    void deletetestUser(){
        try {
            usersDao.delete(savedUser);
            Users lastUser = usersDao.getLast();
            System.out.println("\n deleted from db " + savedUser.toString());
            if (lastUser.getId()==savedUser.getId()){
                Assertions.fail("Error deleting the instance");
            }
        }catch (Exception e){
            logger.catching(e);
            Assertions.fail("Error deleting the instance");
        }
    }
}