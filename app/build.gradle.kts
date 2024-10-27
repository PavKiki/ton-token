plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
    implementation(libs.ton4j)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
//
//sourceSets {
//    main {
//        resources {
//            srcDirs("src/main/resources")
//        }
//    }
//}

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
