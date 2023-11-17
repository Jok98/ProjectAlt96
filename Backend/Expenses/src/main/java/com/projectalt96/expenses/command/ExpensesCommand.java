package com.projectalt96.expenses.command;

import io.swagger.annotations.Scope;
import org.openapitools.model.ExpensesResponse;
import org.springframework.stereotype.Component;

@Component
public class ExpensesCommand {
    protected ExpensesResponse doExecute() {
        ExpensesResponse expensesResponse = new ExpensesResponse();
        return expensesResponse;
    }
}
