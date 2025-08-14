rootProject.name = "mendra-sdk-publisher"
include("sdk")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}