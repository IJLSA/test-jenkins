package com.ijlsa.twitter.web

import com.ijlsa.twitter.model.User
import com.ijlsa.twitter.service.UserService
import mu.KLogging
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {

    @PostMapping(value = "/users")
    fun saveUser(@RequestBody user: User) {
        logger.info { "Saving User $user" }
        userService.saveUser(user)
    }

    @GetMapping(value = "/users/{userId}")
    fun getUser(@PathVariable userId: String): User {
        logger.info { "getting user with id [$userId]" }
        return userService.getUser(userId)
    }

    companion object : KLogging()
}