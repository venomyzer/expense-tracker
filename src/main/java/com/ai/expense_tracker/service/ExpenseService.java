package com.ai.expense_tracker.service;

import com.ai.expense_tracker.entity.Expense;
import com.ai.expense_tracker.exception.ResourceNotFoundException;
import com.ai.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void createExpense(String title, String description, String category, double amount, LocalDate date) {

        Expense expense = new Expense();
        expense.setTitle(title);
        expense.setDescription(description);
        expense.setCategory(category);
        expense.setAmount(amount);
        expense.setDate(date);
        expenseRepository.save(expense);

    }

    public void updateExpense(int id, String title, String description, String category, double amount, LocalDate date) {
        if (expenseRepository.findById(id).isPresent()) {
            Expense expense = expenseRepository.findById(id).get();
            expense.setTitle(title);
            expense.setDescription(description);
            expense.setCategory(category);
            expense.setAmount(amount);
            expense.setDate(date);
            expenseRepository.save(expense);
        }
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(int id) {
        return expenseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + id));
    }

    public void deleteExpense(int id) {
        if (expenseRepository.findById(id).isPresent()) {
            expenseRepository.deleteById(id);
        }
    }

}
