package com.projectalt96.expenses.mapper;

import com.projectalt96.expenses.connector.model.ExpenseJPAEntity;
import org.openapitools.model.Expense;
import org.springframework.stereotype.Component;

@Component
public class ExpenseMapper {
    public Expense mapExpenseJPAEntityToExpense(ExpenseJPAEntity expenseJPAEntity) {
        Expense expense = new Expense();
        expense.setId(expenseJPAEntity.getId());
        expense.setDescription(expenseJPAEntity.getDescription());
        expense.setExpense(expenseJPAEntity.getExpense());
        expense.setCategory(expenseJPAEntity.getCategory());
        expense.setNote(expenseJPAEntity.getNote());
        expense.setUser(expenseJPAEntity.getUser());
        expense.setDate(expenseJPAEntity.getDate());
        return expense;
    }
}
