package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures {
            viewBinding = true
            dataBinding {
                this.enable = true
            }
            compose = true
        }
//
        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("androidxComposeCompiler").get().toString()
        }

        dependencies {
            val bom = libs.findLibrary("compose-bom").get()
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))
        }

        testOptions {
            unitTests {
                isIncludeAndroidResources = true
            }
        }
    }

//    tasks.withType<KotlinCompile>().configureEach {
//        kotlinOptions {
//            freeCompilerArgs = freeCompilerArgs + buildComposeMetricsParameters()
//        }
//    }
}
//
//private fun Project.buildComposeMetricsParameters(): List<String> {
//    val metricParameters = mutableListOf<String>()
//    val enableMetricsProvider = project.providers.gradleProperty("enableComposeCompilerMetrics")
//    val relativePath = projectDir.relativeTo(rootDir)
//    val buildDir = layout.buildDirectory.get().asFile
//    val enableMetrics = (enableMetricsProvider.orNull == "true")
//    if (enableMetrics) {
//        val metricsFolder = buildDir.resolve("compose-metrics").resolve(relativePath)
//        metricParameters.add("-P")
//        metricParameters.add(
//            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + metricsFolder.absolutePath
//        )
//    }
//
//    val enableReportsProvider = project.providers.gradleProperty("enableComposeCompilerReports")
//    val enableReports = (enableReportsProvider.orNull == "true")
//    if (enableReports) {
//        val reportsFolder = buildDir.resolve("compose-reports").resolve(relativePath)
//        metricParameters.add("-P")
//        metricParameters.add(
//            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=" + reportsFolder.absolutePath
//        )
//    }
//    return metricParameters.toList()
//}