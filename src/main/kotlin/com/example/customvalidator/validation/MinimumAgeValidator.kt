package com.example.customvalidator.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

private const val MINIMUM_AGE = 13
class MinimumAgeValidator : ConstraintValidator<MinimumAge, Int> {
    override fun isValid(value: Int, context: ConstraintValidatorContext?): Boolean {
        return value > MINIMUM_AGE
    }
}