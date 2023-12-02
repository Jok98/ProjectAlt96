package com.projectalt96.expenses.delegate;

import com.projectalt96.expenses.api.ExpenseApiDelegate;
import com.projectalt96.expenses.dto.RetrieveExpensesResponse;
import com.projectalt96.expenses.service.ExpensesService;
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
        RetrieveExpensesResponse responseEntity = expensesService.getExpensesList().getBody();
        return ResponseEntity.ok(responseEntity);
    }
}
