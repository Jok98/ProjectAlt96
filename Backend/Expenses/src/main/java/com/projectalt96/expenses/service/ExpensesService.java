package com.projectalt96.expenses.service;

import com.projectalt96.expenses.connector.FeignClientConnectorInterface;
import com.projectalt96.expenses.dto.ExpenseDTO;
import com.projectalt96.expenses.dto.RetrieveExpensesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
    @Autowired
    FeignClientConnectorInterface feignClientConnectorInterface;

    public ResponseEntity<RetrieveExpensesResponse> getExpensesList() {
        ResponseEntity<RetrieveExpensesResponse> response = feignClientConnectorInterface.getExpensesList();
        response.getBody().getExpenses().forEach(System.out::println);
        return response;
    }

    public ResponseEntity<Boolean> deleteExpenseById(String id) {
        ResponseEntity<Boolean> response = feignClientConnectorInterface.deleteExpenseById(id);
        return response;
    }

    public ResponseEntity<ExpenseDTO> getExpenseById(String id) {
        ResponseEntity<ExpenseDTO> response = feignClientConnectorInterface.getExpenseById(id);
        return response;
    }

    public ResponseEntity<Boolean> saveExpense(ExpenseDTO expenseDTO) {
        ResponseEntity<Boolean> response = feignClientConnectorInterface.createExpense(expenseDTO);
        return response;
    }
}
