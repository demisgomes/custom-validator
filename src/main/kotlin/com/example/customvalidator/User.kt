package com.example.customvalidator

import com.example.customvalidator.validation.MinimumAge
import javax.validation.constraints.NotBlank

data class User(
        @field:NotBlank
        val name:String,
        @MinimumAge
        val age:Int
)