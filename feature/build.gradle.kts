plugins {
    alias(libs.plugins.p.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.p.hilt)
    alias(libs.plugins.p.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.example.pricetagdemo.feature"
    compileSdk = 35
}

dependencies {
    implementation(project(":domain"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(platform(libs.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.lottie.compose)
    implementation(libs.coil.compose)

}