package com.jifelog.feed.api.controller

import com.jifelog.feed.application.port.`in`.CreatePostCommand
import com.jifelog.feed.application.port.`in`.CreatePostUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class FeedController(
    private val createPostUseCase: CreatePostUseCase
) {
    @GetMapping("/test")
    fun test() {
        createPostUseCase.createPost(
            CreatePostCommand(
                UUID.randomUUID(),
                "test",
                "PRIVATE",
                UUID.randomUUID()
            )
        )
    }
}