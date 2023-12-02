package com.projectalt96.expenses.service;

import com.projectalt96.expenses.connector.FeignClientConnectorInterface;
import com.projectalt96.expenses.dto.RetrieveExpensesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
    @Autowired
    FeignClientConnectorInterface feignClientConnectorInterface;

    public ResponseEntity<RetrieveExpensesResponse> getExpensesList() {
        ResponseEntity<RetrieveExpensesResponse> result = feignClientConnectorInterface.getExpensesList();
        result.getBody().getExpenses().forEach(System.out::println);
        return result;
    }
}
