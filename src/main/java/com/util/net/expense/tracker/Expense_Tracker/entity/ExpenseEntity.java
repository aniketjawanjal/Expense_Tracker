package com.util.net.expense.tracker.Expense_Tracker.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.util.net.expense.tracker.Expense_Tracker.validation.NotFutureDate;
import com.util.net.expense.tracker.Expense_Tracker.validation.ValidateDateFormate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name = "ExpenseTracker")
public class ExpenseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty(message = "description should not be empty or null")
	private String description;

	@DecimalMin(value = "0.01" ,message = "Amount must be greater than 0")
	private double amount;

	@NotEmpty(message = "category should not be empty or null")
	private String category;

	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@ValidateDateFormate()
	@NotFutureDate
	private LocalDate expense_Date;



	public ExpenseEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getExpense_Date() {
		return expense_Date;
	}

	public void setExpense_Date(LocalDate expense_Date) {
		this.expense_Date = expense_Date;
	}

	@Override
	public String toString() {
		return "ExpenseEntity [id=" + id + ", description=" + description + ", amount=" + amount + ", category="
				+ category + ", expense_Date=" + expense_Date + "]";
	}

}
