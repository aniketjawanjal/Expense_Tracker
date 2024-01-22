package com.util.net.expense.tracker.Expense_Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.util.net.expense.tracker.Expense_Tracker.entity.ExpenseEntity;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}
