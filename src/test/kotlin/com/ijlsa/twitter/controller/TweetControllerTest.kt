package com.ijlsa.twitter.controller

import com.ijlsa.twitter.model.Tweet
import com.ijlsa.twitter.web.TweetController
import org.apache.commons.lang3.RandomStringUtils
import org.assertj.core.api.Assertions
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import java.time.LocalDateTime

class TweetControllerTest {

    @Autowired
    private lateinit var tweetController: TweetController

    @Test
    fun test() {
        
    }
}