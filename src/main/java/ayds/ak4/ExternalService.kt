package ayds.ak4

import ayds.ak4.lyrics.Lyrics

interface ExternalService {
    fun getLyricsFromService(song: String, artist: String): Lyrics
}
