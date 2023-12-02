package com.projectalt96.core.model;

import com.projectalt96.core.dto.ExpenseDTO;

import java.util.List;

public class ExpenseDTOWrapper {

    private List<ExpenseDTO> expenses;

    public ExpenseDTOWrapper(List<ExpenseDTO> expenses) {
        this.expenses = expenses;
    }

    public List<ExpenseDTO> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<ExpenseDTO> expenses) {
        this.expenses = expenses;
    }
}
