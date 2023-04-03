package com.yoon.userapi.service

import com.yoon.userapi.dto.CreateUserDto
import com.yoon.userapi.dto.GetUserDto
import com.yoon.userapi.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun getUsers(): List<GetUserDto> {
        val user = userRepository.findAll()
        return user.map { it.getUser() }
    }

    @Transactional
    fun createUser(createUserDto: CreateUserDto): CreateUserDto {
        val user = userRepository.save(createUserDto.toEntity())
        return user.createUser()
    }
}