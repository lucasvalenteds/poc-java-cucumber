plugins {
    java
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j", "log4j-api", properties["version.log4j"].toString())
    implementation("org.apache.logging.log4j", "log4j-core", properties["version.log4j"].toString())
    implementation("org.slf4j", "slf4j-simple", properties["version.slf4j"].toString())

    testImplementation(platform("org.junit:junit-bom:${properties["version.junit"]}"))
    testImplementation(platform("io.cucumber:cucumber-bom:${properties["version.cucumber"]}"))
    testImplementation("io.cucumber", "cucumber-java")
    testImplementation("io.cucumber", "cucumber-junit-platform-engine")
    testImplementation("org.junit.platform", "junit-platform-suite")
    testImplementation("org.junit.jupiter", "junit-jupiter")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.withType<JacocoReport>())
    systemProperty("cucumber.publish.quiet", "true")
}
