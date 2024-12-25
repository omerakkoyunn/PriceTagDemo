package plugins

import com.android.build.api.dsl.ApplicationExtension
import extensions.configureAndroidCompose
import extensions.configureBuildTypes
import extensions.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                configureAndroidCompose(this)
                configureBuildTypes(this)

                buildFeatures {
                    flavorDimensions += "environment"
                    buildConfig = true
                }
            }
        }
    }
}
