pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BNI Promo - Mobile App"
include(":app")
include(":core:data")
include(":core:domain")
include(":features:bni-promo-home")
include(":core:di")
