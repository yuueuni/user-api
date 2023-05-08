package com.yoon.userapi.model

import com.yoon.userapi.dto.CreateUserDto
import com.yoon.userapi.dto.GetUserDto
import com.yoon.userapi.dto.UpdateUserDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.OffsetDateTime

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val password: String,
    val point: Number,
    val createDate: OffsetDateTime = OffsetDateTime.now()
) {
    fun getUser(): GetUserDto {
        return GetUserDto(
            id = id,
            name = name,
            password = password,
            point = point
        )
    }

    fun createUser(): CreateUserDto {
        return CreateUserDto(
            name = name,
            password = password,
            point = point
        )
    }

    fun updateUser(): UpdateUserDto {
        return UpdateUserDto(
            point = point
        )
    }
}