package com.projectalt96.core.service.expenses;

import com.projectalt96.core.connector.jpa.expenses.ExpensesJpaRepository;
import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpensesService {
    @Autowired
    ExpensesJpaRepository expensesJpaRepository;
    public List<ExpenseJpa> getExpensesList(){
        List<ExpenseJpa> expenseJpaList = expensesJpaRepository.findAll();
        return expenseJpaList;
    }

    public void deleteExpenseById(String id) {
        expensesJpaRepository.deleteById(id);
    }

    public Optional<ExpenseJpa> getExpenseById(String id) {
        return expensesJpaRepository.findById(id);
    }

    public void saveExpense(ExpenseJpa expenseJpa){
        expensesJpaRepository.save(expenseJpa);
    }

    public void updateExpense(ExpenseJpa expenseJpa) {
        expensesJpaRepository.save(expenseJpa);
    }
}
