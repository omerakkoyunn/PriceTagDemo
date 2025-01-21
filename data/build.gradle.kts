plugins {
    alias(libs.plugins.p.library)
    alias(libs.plugins.p.kotlin.android)
    alias(libs.plugins.p.hilt)
    alias(libs.plugins.compose.compiler)

}

android {
    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
    namespace = "com.example.pricetagandroid.data"
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

}