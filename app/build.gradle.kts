plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.safwatech.baytelhekmakotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.safwatech.baytelhekmakotlin"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.kotlin.stdlib)
    //hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.core.splashscreen)
    annotationProcessor (libs.hilt.compiler)

    // For instrumentation tests
    androidTestImplementation(libs.hilt.android.testing)
    kaptAndroidTest (libs.hilt.compiler)

    // For local unit tests
    testImplementation(libs.hilt.android.testing)
    kaptTest (libs.hilt.compiler)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.gson)
    implementation (libs.logging.interceptor)
    implementation (libs.converter.scalars)
    implementation (libs.androidx.legacy.support.v4)
    implementation (libs.androidx.lifecycle.livedata.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    //retrofit
    implementation (libs.okhttp)
    implementation(libs.androidx.datastore.core)
    implementation (libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore.preferences.core.jvm)
    //For Coroutines if not added earlier
    implementation (libs.kotlinx.coroutines.android)

//For lifecycle if not added earlier
    implementation (libs.androidx.lifecycle.runtime.ktx)


    implementation (libs.circleimageview)


}
kapt {
    correctErrorTypes= true
}