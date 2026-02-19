plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

repositories {
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:4.0.2"))

    implementation(project(":core:domain"))

    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-tx")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
