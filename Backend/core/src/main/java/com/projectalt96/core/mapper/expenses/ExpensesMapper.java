package com.projectalt96.core.mapper.expenses;

import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import com.projectalt96.core.dto.ExpenseDTO;
import org.springframework.stereotype.Component;

@Component
public class ExpensesMapper {

    public ExpenseDTO expenseJpaEntityToExpense(ExpenseJpa expenseEntity) {
        ExpenseDTO expense = new ExpenseDTO();
        expense.setId(expenseEntity.getId());
        expense.setName(expenseEntity.getName());
        expense.setDescription(expenseEntity.getDescription());
        expense.setAmount(expenseEntity.getAmount());
        expense.setDate(expenseEntity.getDate());
        expense.setCategory(expenseEntity.getCategory());
        return expense;
    }

    public ExpenseJpa expenseEntityToExpenseJpa(ExpenseDTO expenseEntity) {
        ExpenseJpa expense = new ExpenseJpa();
        expense.setId(expenseEntity.getId());
        expense.setName(expenseEntity.getName());
        expense.setDescription(expenseEntity.getDescription());
        expense.setAmount(expenseEntity.getAmount());
        expense.setDate(expenseEntity.getDate());
        expense.setCategory(expenseEntity.getCategory());
        return expense;
    }
}
