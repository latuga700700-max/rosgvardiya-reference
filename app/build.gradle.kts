
plugins {
    id("com.android.application")
}

android {
    namespace = "ru.rosgvardiya.reference"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.rosgvardiya.reference"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
