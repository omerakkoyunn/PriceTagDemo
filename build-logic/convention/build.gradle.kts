import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

gradlePlugin {
    plugins {
        register("androidApp") {
            id = "plugin.application"
            implementationClass = "plugins.AndroidApplicationConventionPlugin"
        }

        register("libraryApp") {
            id = "plugin.library"
            implementationClass = "plugins.AndroidLibraryConventionPlugin"
        }

        register("androidHilt") {
            id = "plugin.hilt"
            implementationClass = "plugins.AndroidHiltConventionPlugin"
        }
    }
}