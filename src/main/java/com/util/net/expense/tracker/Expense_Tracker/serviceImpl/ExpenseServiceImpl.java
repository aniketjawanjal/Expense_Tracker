package com.util.net.expense.tracker.Expense_Tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.util.net.expense.tracker.Expense_Tracker.entity.ExpenseEntity;
import com.util.net.expense.tracker.Expense_Tracker.repository.ExpenseRepository;
import com.util.net.expense.tracker.Expense_Tracker.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository repository;

	@Override
	public ExpenseEntity saveExpense(ExpenseEntity entity) {
		return repository.save(entity);
	}

	@Override
	public List<ExpenseEntity> getAllExpenseEntity() {
		
		return repository.findAll();
	}

}
