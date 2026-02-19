package com.jifelog.feed.postgres.adapter

import com.jifelog.feed.application.port.out.FeedCommandPort
import com.jifelog.feed.domain.Post
import com.jifelog.feed.postgres.mapper.PostMapper
import com.jifelog.feed.postgres.repository.PostJpaRepository
import org.springframework.stereotype.Component

@Component
class FeedAdapter(
    private val postJpaRepository: PostJpaRepository
) : FeedCommandPort {
    override fun savePost(post: Post) {
        val postEntity = PostMapper.toEntity(post)
        postJpaRepository.save(postEntity)
    }
}