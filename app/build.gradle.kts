plugins {
    application
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(libs.guava)
    implementation(libs.ton4j)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "ru.chb.ton.token.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

sourceSets {
    main {
        resources {
            srcDir("src/main/resources")
        }
    }
}
