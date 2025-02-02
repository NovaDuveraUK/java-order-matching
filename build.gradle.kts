plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Mockito for mocking
    testImplementation("org.mockito:mockito-core:3.11.2")
}

tasks.test {
    useJUnitPlatform()
}