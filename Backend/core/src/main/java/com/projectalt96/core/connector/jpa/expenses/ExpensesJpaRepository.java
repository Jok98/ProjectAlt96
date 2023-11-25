package com.projectalt96.core.connector.jpa.expenses;

import com.projectalt96.core.connector.jpa.expenses.model.ExpenseJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesJpaRepository extends JpaRepository<ExpenseJpa,String> {
}
