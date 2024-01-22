package com.util.net.expense.tracker.Expense_Tracker.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;

@Documented
@Constraint(validatedBy = DateValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@NotNull(message = "Date is Required")
public @interface ValidateDateFormate {

	String message() default  "Invalide Date Format .Use the format ddmmyyyy";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
