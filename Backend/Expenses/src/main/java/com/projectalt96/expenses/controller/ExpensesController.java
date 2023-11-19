package com.projectalt96.expenses.controller;
import com.projectalt96.expenses.command.ExpensesCommand;
import org.openapitools.api.ExpensesApi;
import org.openapitools.model.ExpensesResponse;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensesController implements ExpensesApi {

    @Override
    public ResponseEntity<ExpensesResponse> retriveExpenses() {
        ExpensesCommand expensesCommand = new ExpensesCommand();
        return ResponseEntity.ok(expensesCommand.doExecute());
    }
}
