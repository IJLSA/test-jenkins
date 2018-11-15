package com.ijlsa.twitter.service

import com.ijlsa.twitter.model.Tweet
import com.ijlsa.twitter.repository.TweetRepository
import org.springframework.stereotype.Service

@Service
class TweetService(private val tweetRepository: TweetRepository) {

    fun saveTweet(tweet: Tweet) {
        tweetRepository.save(tweet)
    }

    fun getTweet(tweetId: String) : Tweet {
        return tweetRepository.findById(tweetId).orElseThrow { Exception() }
    }
}