package com.yoon.userapi.dto

import com.yoon.userapi.model.User

data class GetUserDto(
    val id: Long? = null,
    val name: String,
    val password: String,
    val point: Number
)

data class CreateUserDto(
    val name: String,
    val password: String,
    val point: Number
) {
    fun toEntity(): User {
        return User(
            name = name,
            password = password,
            point = point
        )
    }
}

data class UpdateUserDto(
    val point: Number
)