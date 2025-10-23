package cafe.adriel.chroma.model

private const val pkg = "cafe.adriel.chroma"

enum class AppLink(val url: String) {
    PLAY_STORE("https://play.google.com/store/apps/details?id=$pkg"),
    MARKET("market://details?id=$pkg")
}
