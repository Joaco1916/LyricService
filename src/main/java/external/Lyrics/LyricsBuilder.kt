package external.Lyrics

interface LyricsBuilder {
    fun buildErrorLyrics(): Lyrics

    fun buildBasicLyrics(callResponse: String): Lyrics
}
