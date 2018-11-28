package com.ijlsa.twitter.repository

import com.ijlsa.twitter.model.User
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: PagingAndSortingRepository<User, String>