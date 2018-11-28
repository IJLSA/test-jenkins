package com.ijlsa.twitter.repository

import com.ijlsa.twitter.model.User
import org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime

@SpringBootTest
@RunWith(SpringRunner::class)
class UserRepositoryTest {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Test
    fun `persist and find a user`() {
        val userId = randomAlphanumeric(10)
        val user = User(userId,
                randomAlphanumeric(10),
                randomAlphanumeric(10),
                randomAlphanumeric(10),
                randomAlphanumeric(10),
                LocalDateTime.now(),
                true
        )

        userRepository.save(user)
        assertThat(userRepository.findById(userId).get()).isEqualTo(user)
    }
}