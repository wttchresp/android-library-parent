// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
  val kotlinVersion by extra("1.4.20")
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:4.1.1")

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle.kts.kts files
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
    maven { setUrl("https://jitpack.io") }
  }
}
//
//task<org.gradle.api.tasks.Delete> clean (type: Delete) {
//    delete rootProject . buildDir
//}