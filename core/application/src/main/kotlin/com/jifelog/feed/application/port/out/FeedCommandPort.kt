package com.jifelog.feed.application.port.out

import com.jifelog.feed.domain.Post

interface FeedCommandPort {
    fun savePost(post: Post)
}