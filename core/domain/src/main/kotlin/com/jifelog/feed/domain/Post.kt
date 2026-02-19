package com.jifelog.feed.domain

import java.time.Instant
import java.util.UUID

data class Post(
    val id: UUID? = null,
    val userId: UUID,
    val content: String,
    val visibility: String,
    val placeId: UUID? = null,
    val likeCount: Int = 0,
    val commentCount: Int = 0,
    val createdAt: Instant = Instant.now(),
    val updatedAt: Instant = Instant.now(),
    val deletedAt: Instant? = null
) {
    companion object {
        fun withoutId(
            userId: UUID,
            content: String,
            visibility: String,
            placeId: UUID
        ): Post {
            return Post(
                userId = userId,
                content = content,
                visibility = visibility,
                placeId = placeId
            )
        }
    }
}