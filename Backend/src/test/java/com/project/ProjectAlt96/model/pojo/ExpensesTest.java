package com.project.ProjectAlt96.model.pojo;

import com.project.ProjectAlt96.model.dao.ExpensesDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ExpensesTest {
    private static final Logger logger = LogManager.getLogger(ExpensesTest.class);
    @Autowired
    private ExpensesDao expensesDao;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

}