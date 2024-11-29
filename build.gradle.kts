plugins {
    java
    application
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10")
}

application {
    mainClass.set("com.example.Main")
}

tasks.jar {
    archiveBaseName.set("myname")
    manifest {
        attributes(
            "Main-Class" to application.mainClass
        )
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}