package com.yoon.userapi.repository

import com.yoon.userapi.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
    fun findAllBy(): List<User>
}