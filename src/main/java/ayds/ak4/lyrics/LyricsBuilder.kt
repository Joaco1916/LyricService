package ayds.ak4.lyrics

interface LyricsBuilder {
    fun buildErrorLyrics(): Lyrics

    fun buildBasicLyrics(callResponse: String): Lyrics
}
