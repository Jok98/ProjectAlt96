package com.projectalt96.expenses.connector;

import com.projectalt96.expenses.dto.ExpenseDTO;
import com.projectalt96.expenses.dto.RetrieveExpensesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "core-service") // is the name of the service we want to connect to, registered in Eureka
public interface FeignClientConnectorInterface {
    @GetMapping("/expense")
    ResponseEntity<RetrieveExpensesResponse> getExpensesList();

    @DeleteMapping("/expense/{id}")
    ResponseEntity<Boolean> deleteExpenseById(String id);

    @GetMapping("/expense/{id}")
    ResponseEntity<ExpenseDTO> getExpenseById(String id);

    @PostMapping("/expense")
    ResponseEntity<Boolean> createExpense(@RequestBody ExpenseDTO expenseDTO);
}
