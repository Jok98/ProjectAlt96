package com.projectalt96.expenses.connector;

import com.projectalt96.expenses.dto.RetrieveExpensesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "core-service") // is the name of the service we want to connect to, registered in Eureka
public interface FeignClientConnectorInterface {

    @GetMapping("/expense")
    ResponseEntity<RetrieveExpensesResponse> getExpensesList();
}
