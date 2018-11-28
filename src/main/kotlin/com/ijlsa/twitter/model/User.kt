package com.ijlsa.twitter.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
        @Id
        val userId: String,
        @Column(nullable = false)
        val username: String,
        @Column(nullable = false)
        val email: String,
        @Column
        val firstname: String,
        @Column
        val lastname: String,
        @Column(nullable = false)
        val creationDate: LocalDateTime,
        @Column
        val active: Boolean
)

