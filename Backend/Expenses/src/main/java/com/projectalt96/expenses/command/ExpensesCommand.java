package com.projectalt96.expenses.command;

import com.projectalt96.expenses.service.ExpenseService;
import org.openapitools.model.Expense;
import org.openapitools.model.ExpensesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpensesCommand {
    @Autowired
    private ExpenseService expenseService;
    protected ExpensesResponse doExecute() {
        List<Expense> expenses = expenseService.getExpenses();
        ExpensesResponse expensesResponse = new ExpensesResponse();
        expensesResponse.setExpenses(expenses);
        return expensesResponse;
    }
}
