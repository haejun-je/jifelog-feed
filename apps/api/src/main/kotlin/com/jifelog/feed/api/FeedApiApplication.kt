package com.jifelog.feed.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.jifelog.feed"])
class FeedApiApplication

fun main(args: Array<String>) {
    runApplication<FeedApiApplication>(*args)
}
