package com.projectalt96.expenses.controller;

import com.projectalt96.expenses.command.ExpensesCommand;
import org.openapitools.model.ExpensesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<ExpensesResponse> testRetriveExpenses() {
        ExpensesCommand expensesCommand = new ExpensesCommand();
        return ResponseEntity.ok(expensesCommand.doExecute());
    }
    @GetMapping("/testString")
    public String testString() {
        return "testString";
    }
}
