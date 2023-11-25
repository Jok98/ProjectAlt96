package com.projectalt96.Expenses.service;

import com.projectalt96.Expenses.dto.ExpenseDTO;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO) {
        expenseDTO.setId("SiVolaaaaaaaa"+ System.currentTimeMillis());
        return expenseDTO;
    }
}
