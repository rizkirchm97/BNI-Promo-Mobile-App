plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:common"))

    implementation(libs.kotlin.coroutine)
    implementation(libs.kotlin.coroutine.core)
    implementation(libs.retrofit.moshi)
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.mockito.junit.jupiter)
    testImplementation(libs.kotlin.coroutine.test)

}

tasks.withType<Test> {
    useJUnitPlatform()
}