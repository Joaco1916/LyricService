package ayds.ak4.lyrics

import ayds.ak4.ExternalService
import java.io.IOException

internal class LyricsService(private val lyricsBuilder: LyricsBuilder, private val lyricsAPI: LyricsAPI) : ExternalService {

    override fun getLyricsFromService(song: String, artist: String): Lyrics {
        var lyrics: Lyrics
        try {
            val callResponse = getCallResponse(song, artist)
            lyrics = lyricsBuilder.buildBasicLyrics(callResponse!!)
        } catch (e: Exception) {
            e.printStackTrace()
            lyrics = lyricsBuilder.buildErrorLyrics()
        }

        return lyrics
    }

    @Throws(IOException::class)
    private fun getCallResponse(song: String, artist: String): String? {
        return lyricsAPI.getLyrics(artist, song).execute().body()
    }
}
