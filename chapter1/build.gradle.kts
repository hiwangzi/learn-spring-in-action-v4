plugins {
    java
    application
}

group = "com.hiwangzi"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:5.3.31")
    implementation("org.aspectj:aspectjweaver:1.9.4")
}
