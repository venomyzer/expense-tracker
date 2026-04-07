package com.ai.expense_tracker.controller;

import com.ai.expense_tracker.dto.ExpenseRequest;
import com.ai.expense_tracker.entity.Expense;
import com.ai.expense_tracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
class ExpenseController {

    private final ExpenseService expenseService;

    ExpenseController (ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public void createExpense(@RequestBody ExpenseRequest request) {
        expenseService.createExpense(request.getTitle(), request.getDescription(), request.getCategory(), request.getAmount(), request.getDate());
    }

    @PutMapping("/{id}")
    public void updateExpense(@PathVariable int id, @RequestBody ExpenseRequest request) {
        expenseService.updateExpense(id, request.getTitle(), request.getDescription(), request.getCategory(), request.getAmount(), request.getDate());
    }

    @GetMapping
    public List<Expense> getExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expense getExpensesByID(@PathVariable int id) {
        return expenseService.getExpenseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable int id) {
        expenseService.deleteExpense(id);
    }

}
