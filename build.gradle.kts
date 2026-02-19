import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
	kotlin("jvm") version "2.2.21" apply false
	kotlin("plugin.spring") version "2.2.21" apply false
	id("org.springframework.boot") version "4.0.2" apply false
	id("io.spring.dependency-management") version "1.1.7" apply false
}

group = "com.jifelog"
version = "0.0.1-SNAPSHOT"
description = "Feed Service for Jifelog"

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	dependencies {
	}

	tasks.withType<Test>().configureEach {
		useJUnitPlatform()
	}

	plugins.withId("java") {
		extensions.configure<JavaPluginExtension> {
			toolchain {
				languageVersion.set(JavaLanguageVersion.of(24))
			}
		}
	}

	plugins.withId("org.jetbrains.kotlin.jvm") {
		extensions.configure<KotlinJvmProjectExtension> {
			compilerOptions {
				freeCompilerArgs.addAll(
					"-Xjsr305=strict",
					"-Xannotation-default-target=param-property"
				)
			}
		}
	}
}
