package com.ijlsa.twitter.service

import com.ijlsa.twitter.model.User
import com.ijlsa.twitter.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun saveUser(user: User) {
        userRepository.save(user)
    }

    fun getUser(userId: String) : User {
        return userRepository.findById(userId).orElseThrow { Exception() }
    }
}