package com.jifelog.feed.postgres.mapper

import com.jifelog.feed.domain.Post
import com.jifelog.feed.postgres.entity.PostJpaEntity

object PostMapper {
    fun toEntity(post: Post): PostJpaEntity {
        return PostJpaEntity(
            id = post.id,
            userId = post.userId,
            content = post.content,
            visibility = post.visibility,
            placeId = post.placeId,
            likeCount = post.likeCount,
            commentCount = post.commentCount
        )
    }

    fun toDomain() {

    }
}