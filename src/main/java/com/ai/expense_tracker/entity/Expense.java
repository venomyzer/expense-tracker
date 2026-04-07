package com.ai.expense_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int expenseID;

    String title;
    String description;
    String category;
    double amount;
    LocalDate date;
}
