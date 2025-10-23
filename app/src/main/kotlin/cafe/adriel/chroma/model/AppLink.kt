package cafe.adriel.chroma.model

import cafe.adriel.chroma.BuildConfig

private val pkg = BuildConfig.LIBRARY_PACKAGE_NAME

enum class AppLink(val url: String) {
    PLAY_STORE("https://play.google.com/store/apps/details?id=$pkg"),
    MARKET("market://details?id=$pkg")
}
