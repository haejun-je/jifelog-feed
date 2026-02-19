package com.jifelog.feed.postgres.repository

import com.jifelog.feed.postgres.entity.PostJpaEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface PostJpaRepository : JpaRepository<PostJpaEntity, UUID> {
}