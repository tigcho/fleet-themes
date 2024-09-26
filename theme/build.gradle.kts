plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
    id = "tangerine.dream.dark"

    metadata {
        readableName = "Tangerine Dream"
        description = "🍊 A vibrant tangerine-inspired theme for JetBrains Fleet."
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}