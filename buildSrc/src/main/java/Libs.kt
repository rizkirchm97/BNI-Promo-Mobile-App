/**
 * created by RIZKI RACHMANUDIN on 09/08/2023
 */
object Libs {
    const val adnroidCore = "androidx.core:core-ktx:${Versions.androidCoreVersion}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeVersion}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBoomVersion}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeMaterial3 = "androidx.compose.material3:material3"

    // Test
    const val junitJupiter = "org.junit.jupiter:junit-jupiter:${Versions.junitJupiterVersion}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
}