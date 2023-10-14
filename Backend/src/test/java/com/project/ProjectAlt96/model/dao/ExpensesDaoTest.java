package com.project.ProjectAlt96.model.dao;

import com.project.ProjectAlt96.controller.JwtUtils;
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
class ExpensesDaoTest {
    private static final Logger logger = LogManager.getLogger(ExpensesDaoTest.class);
    @Autowired
    private ExpensesDao expensesDao;
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private MacroareaDao macroareaDao;
    @Autowired
    private Expenses savedExpenses;
    @Test
    void testCrudExpenses(){
        Users users = usersDao.getLast();
        Macroarea macroarea = macroareaDao.getLast();
        Expenses expenses = new Expenses(new Date(), macroarea , "spesa", 50.00, 20.00, users);

        try {
            expensesDao.save(expenses);
            System.out.println("\n saved into db " + expenses.toString());
        }catch (Exception e){
            logger.catching(e);
            fail("Error saving the instance");
        }
        try {
            savedExpenses = expensesDao.getLast();
            System.out.println("\n recovered from db " + savedExpenses.toString());
            if (savedExpenses.getId()!=expenses.getId()){
                fail("Error getting the last instance");
            }
        }catch (Exception e){
            logger.catching(e);
            fail("Error getting the last instance");
        }
//        deletetestExpenses();
    }

    void deletetestExpenses(){
        try {
            expensesDao.delete(savedExpenses);
            Expenses lastExpenses = expensesDao.getLast();
            System.out.println("\n deleted from db " + savedExpenses.toString());
            if (lastExpenses.getId()==savedExpenses.getId()){
                fail("Error deleting the instance");
            }
        }catch (Exception e){
            logger.catching(e);
            fail("Error deleting the instance");
        }
    }
    @Test
    void getByUsername(){
        Users user = usersDao.getByUsername("test");
        System.out.println(user.toString());
    }

    @Test
    void token(){
       String token = JwtUtils.generateJwtToken("bho");
        System.out.println(token);
    }
}