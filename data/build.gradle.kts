plugins {
    alias(libs.plugins.plugin.library)
    alias(libs.plugins.plugin.hilt)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.example.data"
}

dependencies {

    implementation(project(":domain"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation (libs.retrofit)
    implementation (libs.okhttp)
    implementation (libs.retrofit.converter)
    implementation(libs.okhttp.logging.interceptor)
    implementation (libs.gson)
}