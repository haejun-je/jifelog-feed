package com.jifelog.feed.application.port.`in`

interface CreatePostUseCase {
    fun createPost(command: CreatePostCommand)
}