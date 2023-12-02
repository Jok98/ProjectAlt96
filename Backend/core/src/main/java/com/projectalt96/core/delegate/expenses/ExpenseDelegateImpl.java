package com.projectalt96.core.delegate.expenses;

import com.projectalt96.core.api.ExpenseApiDelegate;
import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import com.projectalt96.core.dto.ExpenseDTO;
import com.projectalt96.core.dto.RetrieveExpensesResponse;
import com.projectalt96.core.mapper.expenses.ExpensesMapper;
import com.projectalt96.core.model.ExpenseDTOWrapper;
import com.projectalt96.core.service.expenses.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseDelegateImpl implements ExpenseApiDelegate {
    @Autowired
    private final ExpensesService expensesService;
    @Autowired
    ExpensesMapper expensesMapper;

    public ExpenseDelegateImpl(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @Override
//    http://localhost:8090/expense GET
    public ResponseEntity<RetrieveExpensesResponse> getExpensesList() {
        RetrieveExpensesResponse responseEntity = new RetrieveExpensesResponse();
        List<ExpenseJpa> expenseJpaList = expensesService.getExpensesList();
        List<ExpenseDTO> expenseDTOList = new ArrayList<>();
        expenseJpaList.forEach(expenseJpa -> {
            expenseDTOList.add(expensesMapper.expenseJpaEntityToExpense(expenseJpa));
        });
        System.out.println(expenseDTOList);
        ExpenseDTOWrapper expenseDTOWrapper = new ExpenseDTOWrapper(expenseDTOList);
        responseEntity.setExpenses(expenseDTOList);
        return ResponseEntity.ok(responseEntity);
    }
}
