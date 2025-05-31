package com.finance.finplanner.expense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Expense extends BaseModel{

    private String description;
    private Double value;
    @ManyToOne
    @JoinColumn(name = "expense_type_id")
    private ExpenseType expenseType;
}
