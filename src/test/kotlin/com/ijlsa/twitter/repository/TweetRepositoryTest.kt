package com.ijlsa.twitter.repository

import com.ijlsa.twitter.model.Tweet
import com.ijlsa.twitter.repository.TweetRepository
import org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric
import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDate
import java.time.LocalDateTime

@SpringBootTest
@RunWith(SpringRunner::class)
class TweetRepositoryTest {

    @Autowired
    private lateinit var tweetRepository: TweetRepository

    @Test
    fun `persist and find a tweet`() {
        val id = randomAlphanumeric(10)

        val tweet = Tweet(id,
                "description",
                100,
                500,
                139,
                LocalDateTime.now())
        tweetRepository.save(tweet)

        Assertions.assertThat(tweetRepository.findById(id).get()).isEqualTo(tweet)
    }
}