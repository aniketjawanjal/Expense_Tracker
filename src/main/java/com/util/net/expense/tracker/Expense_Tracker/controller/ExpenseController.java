package com.util.net.expense.tracker.Expense_Tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.util.net.expense.tracker.Expense_Tracker.entity.ExpenseEntity;
import com.util.net.expense.tracker.Expense_Tracker.service.ExpenseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("expense")
@Validated
public class ExpenseController {

	@Autowired
	ExpenseService service;

	@GetMapping
	public String ExpenseDemo() {
		return "Add Your Expense...";
	}

	@PostMapping("/save")
	public ResponseEntity<ExpenseEntity> saveExpense(
			@Valid
			@RequestBody ExpenseEntity entity) {
		ExpenseEntity saveExpense = service.saveExpense(entity);
		return new ResponseEntity<ExpenseEntity>(saveExpense, HttpStatus.CREATED);
	}

	@GetMapping("all/expense")
	public ResponseEntity<List<ExpenseEntity>> getAllExpense() {
		List<ExpenseEntity> expenseEntity = service.getAllExpenseEntity();
		return new ResponseEntity<List<ExpenseEntity>>(expenseEntity, HttpStatus.OK);
	}

}
