package com.projectalt96.expenses.connector;

import com.projectalt96.expenses.connector.model.ExpenseJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseJPARepository extends JpaRepository<ExpenseJPAEntity, String> {
}
