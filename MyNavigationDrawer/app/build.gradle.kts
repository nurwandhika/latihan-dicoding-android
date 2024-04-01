plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.dicoding.mynavigationdrawer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dicoding.mynavigationdrawer"
        minSdk = 24
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material) //komponen NavigationDrawer menjadi bagian dari material design
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx) // mengatur proses transaksi antar fragment lebih mudah
    implementation(libs.androidx.navigation.ui.ktx) // membuat navigation UI seperti navigation drawer
    implementation("de.hdodenhof:circleimageview:3.1.0") // membuat icon image berbentuk lingkaran
    implementation("com.github.bumptech.glide:glide:4.13.1")
    implementation(libs.androidx.activity) // image loading dan caching library from sources like URLs, local files or other
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}