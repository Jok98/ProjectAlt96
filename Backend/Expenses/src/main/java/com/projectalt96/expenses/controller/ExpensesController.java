package com.projectalt96.expenses.controller;
import org.openapitools.api.ExpensesApi;
import org.openapitools.model.ExpensesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensesController implements ExpensesApi {

    @Override
    public ResponseEntity<ExpensesResponse> retriveExpenses() {
        return null;
    }
}
