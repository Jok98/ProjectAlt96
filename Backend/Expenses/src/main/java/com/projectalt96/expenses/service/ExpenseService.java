package com.projectalt96.expenses.service;

import com.projectalt96.expenses.connector.ExpenseJPARepository;
import com.projectalt96.expenses.connector.model.ExpenseJPAEntity;
import com.projectalt96.expenses.mapper.ExpenseMapper;
import org.openapitools.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseJPARepository expenseJPARepository;

    @Autowired
    ExpenseMapper expenseMapper;

    public List<Expense> getExpenses(){
        List<ExpenseJPAEntity> expensesJpaList = expenseJPARepository.findAll();
        List<Expense> expensesList = null;
        expensesJpaList.forEach(expense -> {
            expensesList.add(expenseMapper.mapExpenseJPAEntityToExpense(expense));
        });
        return expensesList;
    }

}
