package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

fun Project.configureBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *>
) {
    commonExtension.apply {

        buildFeatures {
            buildConfig = true
        }

        buildTypes {
            getByName("debug") {
                isMinifyEnabled = false
            }
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }

        flavorDimensions += "services"

        productFlavors {
            create("gms") {
                dimension = "services"
                buildConfigField("String", "SERVICE_USED", "\"gms\"")
                buildConfigField("String", "BASE_URL", "\"https://test.com\"")
            }
            create("hms") {
                dimension = "services"
                buildConfigField("String", "SERVICE_USED", "\"hms\"")
                buildConfigField("String", "BASE_URL", "\"https://test.com\"")
            }
        }
    }
}