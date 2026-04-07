package com.ai.expense_tracker.dto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseRequest {

    String title;
    String description;
    String category;
    double amount;
    LocalDate date;

}
