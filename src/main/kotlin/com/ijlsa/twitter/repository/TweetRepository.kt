package com.ijlsa.twitter.repository

import com.ijlsa.twitter.model.Tweet
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface TweetRepository : PagingAndSortingRepository<Tweet, String>
