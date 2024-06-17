package com.anisa.customValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CouponCodeConstraintValidator.class)
public @interface CouponCode {

    String value() default "OFF";

    String message() default "code with OFF";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
