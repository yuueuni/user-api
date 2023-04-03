package com.yoon.userapi.controller

import com.yoon.userapi.dto.CreateUserDto
import com.yoon.userapi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/users")
    fun getUsers(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(userService.getUsers())
    }

    @PostMapping("/user")
    fun createUser(@RequestBody createUserDto: CreateUserDto): ResponseEntity<Any> {
        userService.createUser(createUserDto)
        return ResponseEntity.ok().body(true)
    }
}