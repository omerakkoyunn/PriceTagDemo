plugins {
    alias(libs.plugins.p.library)
    alias(libs.plugins.p.kotlin.android)
    alias(libs.plugins.p.hilt)
    alias(libs.plugins.ksp)
    alias(libs.plugins.compose.compiler)

}

android {
    namespace = "com.example.pricetagdemo.domain"
}

dependencies {

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
    implementation(libs.androidx.compose.runtime)


}