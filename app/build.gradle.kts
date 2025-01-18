plugins {
    alias(libs.plugins.p.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.p.hilt)
    alias(libs.plugins.compose.compiler)

}

android {
    defaultConfig {
        applicationId = "com.example.pricetagdemo"
        versionCode = 1
        versionName = "1.0.0"
    }
    namespace = "com.example.pricetagdemo"
}

dependencies {
    implementation(project(":feature"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}

