package com.jifelog.feed.postgres.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(schema = "feed", name = "post")
class PostJpaEntity(
    @Id
    @Column(name = "id", columnDefinition = "uuid", updatable = false)
    val id: UUID,

    @Column(name = "fk_user_id", nullable = false)
    val userId: UUID,

    @Column(name = "content", nullable = false)
    val content: String,

    @Column(name = "visibility", nullable = false)
    val visibility: String,

    @Column(name = "fk_place_id")
    val placeId: UUID? = null,

    @Column(name = "like_count", nullable = false)
    val likeCount: Int = 0,

    @Column(name = "comment_count", nullable = false)
    val commentCount: Int = 0,

    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: Instant = Instant.now(),

    @Column(name = "updated_at", nullable = false)
    val updatedAt: Instant = Instant.now(),

    @Column(name = "deleted_at")
    val deletedAt: Instant? = null
)