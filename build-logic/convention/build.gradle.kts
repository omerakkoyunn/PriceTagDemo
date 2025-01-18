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
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}


gradlePlugin {
    plugins {
        register("androidApp") {
            id = "p.application"
            implementationClass = "plugins.AndroidApplicationConventionPlugin"
        }

        register("libraryApp") {
            id = "p.library"
            implementationClass = "plugins.AndroidLibraryConventionPlugin"
        }

        register("androidHilt") {
            id = "p.hilt"
            implementationClass = "plugins.AndroidHiltConventionPlugin"
        }
        register("androidKotlin"){
            id = "p.android"
            implementationClass = "plugins.AndroidKotlinConventionPlugin"
        }
    }
}