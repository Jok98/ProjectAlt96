package com.projectalt96.expenses.connector.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "expense")
@Data
@Component
public class ExpenseJPAEntity implements Serializable {
    @Id
    private Integer id;

    private String description;

    private BigDecimal expense;

    private String category;

    private String note;

    private String user;

    private String date;

}
