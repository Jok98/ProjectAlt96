package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Expense;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExpensesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-18T19:04:30.827287700+01:00[Europe/Rome]")
public class ExpensesResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid Expense> expenses;

  public ExpensesResponse expenses(List<@Valid Expense> expenses) {
    this.expenses = expenses;
    return this;
  }

  public ExpensesResponse addExpensesItem(Expense expensesItem) {
    if (this.expenses == null) {
      this.expenses = new ArrayList<>();
    }
    this.expenses.add(expensesItem);
    return this;
  }

  /**
   * Get expenses
   * @return expenses
  */
  @Valid 
  @Schema(name = "expenses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expenses")
  public List<@Valid Expense> getExpenses() {
    return expenses;
  }

  public void setExpenses(List<@Valid Expense> expenses) {
    this.expenses = expenses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpensesResponse expensesResponse = (ExpensesResponse) o;
    return Objects.equals(this.expenses, expensesResponse.expenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpensesResponse {\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

