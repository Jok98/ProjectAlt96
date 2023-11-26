package com.projectalt96.Expenses.service;

import com.projectalt96.Expenses.dto.ExpenseDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ExpensesService {
    public List<ExpenseDTO> getExpensesList() {
        List<ExpenseDTO> expenseDTO = new ArrayList<>();
        WebClient client = WebClient.create("http://localhost:8090");
        Mono<ResponseEntity<List<ExpenseDTO>>> result = client.get()
                .uri("/expense").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntityList(ExpenseDTO.class);
        expenseDTO = result.block().getBody();
        System.out.println(result);
        System.out.println(expenseDTO);
        return expenseDTO;
    }
}
