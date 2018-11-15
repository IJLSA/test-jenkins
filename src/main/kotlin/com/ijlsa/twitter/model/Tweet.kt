package com.ijlsa.twitter.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Tweet(
        @Id
        val tweetId: String,
        @Column(nullable = false)
        val description: String,
        @Column
        val likeCount: Int,
        @Column
        val retweetCount: Int,
        @Column
        val commentCount: Int,
        @Column(nullable = false)
        val creationDate: LocalDateTime
)

