package external

import external.Lyrics.Lyrics

interface ExternalService {
    fun getLyricsFromService(song: String, artist: String): Lyrics
}
