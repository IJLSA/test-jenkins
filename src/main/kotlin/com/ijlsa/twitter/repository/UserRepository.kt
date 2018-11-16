package com.ijlsa.twitter.repository

import com.ijlsa.twitter.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String>{
}