plugins {
    id("com.android.application")
}

android {
    namespace = "com.exmaple.lookup"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.exmaple.lookup"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // sdp
    implementation("com.intuit.sdp:sdp-android:1.1.0")

    // ssp
    implementation("com.intuit.ssp:ssp-android:1.1.0")

    // circular ImageView
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // Java language implementation of navigation component
    val navVersion by extra { "2.7.4" }
    implementation("androidx.navigation:navigation-fragment:$navVersion")
    implementation("androidx.navigation:navigation-ui:$navVersion")
}