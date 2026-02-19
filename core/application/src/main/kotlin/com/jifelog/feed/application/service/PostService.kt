package com.jifelog.feed.application.service

import com.jifelog.feed.application.port.`in`.CreatePostCommand
import com.jifelog.feed.application.port.`in`.CreatePostUseCase
import com.jifelog.feed.application.port.out.FeedCommandPort
import com.jifelog.feed.domain.Post
import org.springframework.stereotype.Service

@Service
class PostService(
    private val feedCommandPort: FeedCommandPort
) : CreatePostUseCase {
    override fun createPost(command: CreatePostCommand) {
        feedCommandPort.savePost(
            Post.withoutId(
                command.userId,
                command.title,
                command.visibility,
                command.placeId
            )
        )
    }
}