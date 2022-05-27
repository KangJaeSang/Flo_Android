object Dependencies {

    const val isRealServer = false

    object Versions {

        const val compileSdk = 30
        const val minSdk = 23
        const val targetSdk = 30

        private const val versionMajor = 1
        private const val versionMinor = 4
        private const val versionPatch = 0
        private const val versionOffset = 0
        const val versionCode = versionMajor * 1000000 + versionMinor * 10000 + versionPatch * 100 + versionOffset
        val versionName =  "$versionMajor.$versionMinor.$versionPatch${if (isRealServer) "" else "-DEV"}"
        const val buildTools = "30.0.3"

        const val gradle = "7.0.3"
        const val kotlin = "1.5.21"
        const val kotlinx = "1.4.1"
        const val appcompat = "1.3.1"
        const val ktx = "1.6.0"
        const val constraintlayout = "2.1.1"
        const val material = "1.4.0"
        const val multidex = "2.0.1"
        const val securityCrypto = "1.0.0"
        const val biometric = "1.1.0"
        const val lifecycle = "2.3.1"
        const val navigation = "2.3.5"
        const val room = "2.2.5"
        const val dagger = "2.40"
        const val hilt = "2.36"
        const val hilt_viewmodel = "1.0.0-alpha03"
        const val glide = "4.12.0"
        const val okhttp3 = "4.9.2"
        const val retrofit = "2.9.0"
        const val rxandroid = "3.0.0"
        const val services = "4.3.5"
        const val crashlytics = "2.2.0"

        const val jackson = "2.13.0"

        const val junit = "4.13.2"
        const val adison = "2.5.60"
    }

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    object Androidx {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
        const val securityCrypto = "androidx.security:security-crypto:${Versions.securityCrypto}"
        const val biometric = "androidx.biometric:biometric:${Versions.biometric}"
    }

    object Lifecycle {
        const val lifecycle = "androidx.lifecycle"
//        const val extensions = "$lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val viewmodel = "$lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    }

    object Navigation {
        const val navigation = "androidx.navigation"
        const val fragment = "$navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "$navigation:navigation-ui-ktx:${Versions.navigation}"
        const val safeArgs = "$navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    }

    object Room {
        const val room = "androidx.room"
        const val runtime = "$room:room-runtime:${Versions.room}"
        const val compiler = "$room:room-compiler:${Versions.room}"
        const val rxjava2 = "$room:room-rxjava2:${Versions.room}"
    }

    object Dagger {
        const val dagger = "com.google.dagger"
        const val core = "$dagger:dagger:${Versions.dagger}"
        const val compiler = "$dagger:dagger-compiler:${Versions.dagger}"
        const val android = "$dagger:dagger-android:${Versions.dagger}"
        const val androidSupport = "$dagger:dagger-android-support:${Versions.dagger}"
        const val androidProcessor = "$dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Hilt {
        const val dagger = "com.google.dagger"
        const val hilt = "androidx.hilt"
        const val android = "$dagger:hilt-android:${Versions.hilt}"
        const val androidCompiler = "$dagger:hilt-android-compiler:${Versions.hilt}"
        const val lifecycleViewmodel = "$hilt:hilt-lifecycle-viewmodel:${Versions.hilt_viewmodel}"
//        const val compiler = "$hilt:hilt-compiler:${Versions.dagger}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide"
        const val core = "$glide:glide:${Versions.glide}"
        const val okhttp3 = "$glide:okhttp3-integration:${Versions.glide}"
        const val compiler = "$glide:compiler:${Versions.glide}"
    }

    object OkHttp3 {
        const val okhttp3 = "com.squareup.okhttp3"
        const val loggingIntercepter = "$okhttp3:logging-interceptor:${Versions.okhttp3}"
        const val urlconnection = "$okhttp3:okhttp-urlconnection:${Versions.okhttp3}"
    }

    object Retrofit2 {
        const val retrofit2 = "com.squareup.retrofit2"
        const val core = "$retrofit2:retrofit:${Versions.retrofit}"
        const val converterGson = "$retrofit2:converter-gson:${Versions.retrofit}"
        const val converterProtobuf = "$retrofit2:converter-protobuf:${Versions.retrofit}"
        const val converterScalars = "$retrofit2:converter-scalars:${Versions.retrofit}"
        const val adapterRxJava2 = "$retrofit2:adapter-rxjava3:${Versions.retrofit}"
    }

    object FireBase {
        const val bom = "com.google.firebase:firebase-bom:28.4.0"
        const val messaging = "com.google.firebase:firebase-messaging:20.2.4"
        const val crashlytics = "com.google.firebase:firebase-crashlytics:17.1.0"
        const val analytics = "com.google.firebase:firebase-analytics:18.0.3"
    }

    object Google {
        const val auth = "com.google.android.gms:play-services-auth:16.0.1"
        const val phone = "com.google.android.gms:play-services-auth-api-phone:16.0.0"
        const val ads = "com.google.android.gms:play-services-ads:15.0.0"
        const val identifiler = "com.google.android.gms:play-services-ads-identifier:17.0.0"
        const val protobuf = "com.google.protobuf:protobuf-java:3.15.5"
        const val gson = "com.google.code.gson:gson:2.8.9"
    }

    const val rxandroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxandroid}"
    const val jackson = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jackson}"
    const val installreferrer = "com.android.installreferrer:installreferrer:1.0"
/*    const val dfinery = "io.dfinery:android-sdk:2.1.3.0"*/
    const val offerwall = "co.adison:adison-offerwall-sdk:${Versions.adison}"

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
    }
}