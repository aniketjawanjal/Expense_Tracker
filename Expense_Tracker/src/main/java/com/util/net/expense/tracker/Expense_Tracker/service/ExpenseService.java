package com.util.net.expense.tracker.Expense_Tracker.service;

import java.util.List;

import com.util.net.expense.tracker.Expense_Tracker.entity.ExpenseEntity;

public interface ExpenseService {
	
	
	
public ExpenseEntity saveExpense(ExpenseEntity entity);

public List<ExpenseEntity> getAllExpenseEntity();
}
