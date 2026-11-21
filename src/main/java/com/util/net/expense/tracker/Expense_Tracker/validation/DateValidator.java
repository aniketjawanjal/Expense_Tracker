package com.util.net.expense.tracker.Expense_Tracker.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<ValidateDateFormate, LocalDate> {
	private static final String DATE_FORMAT = "ddMMyyyy";

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		try {
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
	            String formattedDate = value.format(formatter);
	            LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
	            return value.isEqual(parsedDate);

		} catch (Exception e) {
			return false;
		}
	}

}
