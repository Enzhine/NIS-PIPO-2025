plugins {
    kotlin("jvm") version "2.0.21"
}

val buildNumber = project.findProperty("BUILD_NUMBER") ?: "SNAPSHOT"

group = "ru.enzhine.pipo"
version = "0.0-${buildNumber}"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
