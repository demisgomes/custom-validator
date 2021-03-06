package com.example.customvalidator.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [MinimumAgeValidator::class])
@MustBeDocumented
annotation class MinimumAge(
        val message: String = "Please, insert an age above 13 years old",
        val groups: Array<KClass<Any>> = [],
        val payload: Array<KClass<Payload>> = []
)