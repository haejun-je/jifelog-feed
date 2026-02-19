package com.jifelog.feed.postgres

import org.springframework.boot.persistence.autoconfigure.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.jifelog.feed.postgres.repository"])
@EntityScan(basePackages = ["com.jifelog.feed.postgres.entity"])
class JpaConfig {
}