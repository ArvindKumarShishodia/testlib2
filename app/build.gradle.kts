import org.gradle.internal.impldep.org.apache.ivy.core.module.id.ArtifactId

buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()            // << --- ADD This
    }

    dependencies {
      //  classpath 'com.android.tools.build:gradle:7.1.3'
        //classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
    //id("java")
}

android {
    namespace = "com.emt.libraryprojectgit"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 34

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

  /*  buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }*/
//    java {
//        toolchain {
//            languageVersion = JavaLanguageVersion.of(17)        // << --- ADD This
//        }
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    api("com.intuit.sdp:sdp-android:1.1.0"){
        isTransitive = true
    }
    /*configurations.all{
        resolutionStrategy{
            force("com.intuit.sdp:sdp-android:1.1.0")
        }
    }
*/
}
 //5. Publishing:
/*
publishing {
    publications {
        maven(MavenPublication) {
            groupId = 'com.github.GIT_USER_NAME'
            artifactId = 'REPO_NAME'
            version = "VERSION"
            pom {
                description = 'DESCRIPTION'
            }
        }
    }
    repositories {               // << --- ADD This
        mavenLocal()
    }
}*/
/*publishing {
    publications {
        maven(MavenPublication) {
            groupId = 'com.github.ArvindKumarShishodia'
            artifactId = 'testlib2'
            version = "1.0.0"
            pom {
                description = 'First Android library'
            }
        }
    }
    repositories {               // << --- ADD This
        mavenCentral()
    }
}*/
/*
publishing {
    publications {
        register<MavenPublication>("mavenJava") {
            artifactId = "testlib2
            from(components["java"])
            artifact("")
            pom {
                name.set("Project Name")
            }
        }
    }
}*/

/*
publishing {
    publications {
        repositories(MavenPublication) {
            groupId ="org.gradle.sample"
            artifactId ="project1-sample"
            version ='1.1'

            from components.java
        }
    }
}*/
