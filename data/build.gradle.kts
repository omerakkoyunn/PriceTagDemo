plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.plugin.kotlin.android)
    alias(libs.plugins.ksp)
}

android {
    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
    namespace = "com.example.pricetagdemo.data"
}

dependencies {

    implementation(project(":domain"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.coroutines.android)
    implementation(libs.coroutines.core)
    implementation(libs.inject)


    implementation (libs.retrofit)
    implementation (libs.okhttp)
    implementation (libs.retrofit.converter)
    implementation(libs.okhttp.logging.interceptor)
    implementation (libs.gson)
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.navigation.compose)
}