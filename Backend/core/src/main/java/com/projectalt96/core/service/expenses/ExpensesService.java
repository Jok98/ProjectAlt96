package com.projectalt96.core.service.expenses;

import com.projectalt96.core.connector.jpa.expenses.ExpensesJpaRepository;
import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import com.projectalt96.core.dto.ExpenseDTO;
import com.projectalt96.core.mapper.expenses.ExpensesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {
    @Autowired
    ExpensesJpaRepository expensesJpaRepository;
    @Autowired
    ExpensesMapper expensesMapper;

    public List<ExpenseJpa> getExpensesList(){
        List<ExpenseJpa> expenseJpaList = expensesJpaRepository.findAll();
        return expenseJpaList;
    }


}
