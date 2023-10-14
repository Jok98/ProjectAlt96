package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.model.pojo.Expenses;
import com.project.ProjectAlt96.model.pojo.Macroarea;
import com.project.ProjectAlt96.model.pojo.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MacroareaDaoTest {
    private static final Logger logger = LogManager.getLogger(MacroareaDaoTest.class);
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private MacroareaDao macroareaDao;

    private Macroarea savedMacroarea;

    @Test
    void testCrudMacroarea(){
        Users users = usersDao.getLast();
        Macroarea macroarea = new Macroarea("Prima macroarea",users);

        try {
            macroareaDao.save(macroarea);
            System.out.println("\n saved into db " + macroarea.toString());
        }catch (Exception e){
            logger.catching(e);
            fail("Error saving the instance");
        }
        try {
            savedMacroarea = macroareaDao.getLast();
            System.out.println("\n recovered from db " + savedMacroarea.toString());
            if (savedMacroarea.getId()!=macroarea.getId()){
                fail("Error getting the last instance");
            }
        }catch (Exception e){
            logger.catching(e);
            fail("Error getting the last instance");
        }
//        deleteTestMacroarea();
    }

    void deleteTestMacroarea(){
        try {
            macroareaDao.delete(savedMacroarea);
            Macroarea lastMacroarea = macroareaDao.getLast();
            System.out.println("\n deleted from db " + savedMacroarea.toString());
            if (lastMacroarea.getId()==savedMacroarea.getId()){
                fail("Error deleting the instance");
            }
        }catch (Exception e){
            logger.catching(e);
            fail("Error deleting the instance");
        }
    }
}