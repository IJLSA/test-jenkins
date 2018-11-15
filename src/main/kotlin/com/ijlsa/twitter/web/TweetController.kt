package com.ijlsa.twitter.web

import com.ijlsa.twitter.model.Tweet
import com.ijlsa.twitter.service.TweetService
import mu.KLogging
import org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
class TweetController(private val tweetService: TweetService) {

    @PostMapping(value = "/tweets")
    fun saveTweet() {
        val tweet = Tweet(randomAlphanumeric(10),
                "description",
                100,
                500,
                139,
                LocalDateTime.now())

        logger.info { "Saved Tweet $tweet" }
        tweetService.saveTweet(tweet)
    }

    @GetMapping(value = "/tweets/{tweetId}")
    fun getTweet(@PathVariable tweetId: String) : Tweet {
        logger.info { "getting tweet with id: [$tweetId]" }
        return tweetService.getTweet(tweetId)
    }
    companion object : KLogging()
}