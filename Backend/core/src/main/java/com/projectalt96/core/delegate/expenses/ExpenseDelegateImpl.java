package com.projectalt96.core.delegate.expenses;

import com.projectalt96.core.api.ExpenseApiDelegate;
import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import com.projectalt96.core.dto.ExpenseDTO;
import com.projectalt96.core.dto.RetrieveExpensesResponse;
import com.projectalt96.core.mapper.expenses.ExpensesMapper;
import com.projectalt96.core.service.expenses.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        responseEntity.setExpenses(expenseDTOList);
        return ResponseEntity.ok(responseEntity);
    }

    @Override
    //    http://localhost:8090/expense/{id} DELETE
    public ResponseEntity<Boolean> deleteExpenseById(String id) {
        try {
            expensesService.deleteExpenseById(id);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }

    @Override
    //    http://localhost:8090/expense/{id} GET
    public ResponseEntity<ExpenseDTO> getExpenseById(String id) {
        Optional<ExpenseJpa> expenseJpa = expensesService.getExpenseById(id);
        if (expenseJpa.isPresent()){
            ExpenseDTO expenseDTO = expensesMapper.expenseJpaEntityToExpense(expenseJpa.get());
            return ResponseEntity.ok(expenseDTO);
        }else {
            return ResponseEntity.notFound().build();
        }
    }



    @Override
    //    http://localhost:8090/expense POST body-> ExpenseDTO (JSON) entity
    public ResponseEntity<Boolean> saveExpense(ExpenseDTO expenseDTO) {
        try {
            expensesService.saveExpense(expensesMapper.expenseEntityToExpenseJpa(expenseDTO));
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }

    @Override
    //    http://localhost:8090/expense PUT body-> ExpenseDTO (JSON) entity
    public ResponseEntity<Boolean> updateExpenseById(String id, ExpenseDTO expenseDTO) {
        try {
            expensesService.updateExpense(expensesMapper.expenseEntityToExpenseJpa(expenseDTO));
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
}
