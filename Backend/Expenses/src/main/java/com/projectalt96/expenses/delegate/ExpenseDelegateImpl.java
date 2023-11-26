package com.projectalt96.Expenses.delegate;

import com.projectalt96.Expenses.api.ExpenseApiDelegate;
import com.projectalt96.Expenses.dto.ExpenseDTO;
import com.projectalt96.Expenses.dto.RetrieveExpensesResponse;
import com.projectalt96.Expenses.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpenseDelegateImpl implements ExpenseApiDelegate {
    @Autowired
    private final ExpensesService expensesService;

    public ExpenseDelegateImpl(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @Override
    public ResponseEntity<RetrieveExpensesResponse> getExpensesList() {
        RetrieveExpensesResponse responseEntity = new RetrieveExpensesResponse();
        responseEntity.setExpenses(expensesService.getExpensesList());
        return ResponseEntity.ok(responseEntity);
    }
}
