package com.jifelog.feed.application.port.`in`

import java.util.UUID

data class CreatePostCommand(
    val userId: UUID,
    val title: String,
    val visibility: String,
    val placeId: UUID
)
