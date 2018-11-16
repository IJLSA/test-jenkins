package com.ijlsa.twitter.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Id

class TwitterUser(
        @Id
        var userId: String,
        @Column
        var userName: String,
        @Column
        var userPassword: String,
        @Column
        var userEmail: String,
        @Column
        var lastLoggedIn: LocalDateTime
)
    : User {
}