package com.finance.finplanner.expense.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class ExpenseType extends  BaseModel{
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ExpenseType parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<ExpenseType> subTypes;

}
