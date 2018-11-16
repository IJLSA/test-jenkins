package com.ijlsa.twitter.web

import com.ijlsa.twitter.model.Tweet
import com.ijlsa.twitter.service.TweetService
import mu.KLogging
import org.springframework.web.bind.annotation.*

@RestController
class TweetController(private val tweetService: TweetService) {

    @PostMapping(value = "/tweets")
    fun saveTweet(@RequestBody tweet: Tweet) {
        logger.info { "Saved Tweet $tweet" }
        tweetService.saveTweet(tweet)
    }

    @GetMapping(value = "/tweets/{tweetId}")
    fun getTweet(@PathVariable tweetId: String): Tweet {
        logger.info { "getting tweet with id: [$tweetId]" }
        return tweetService.getTweet(tweetId)
    }

    companion object : KLogging()
}