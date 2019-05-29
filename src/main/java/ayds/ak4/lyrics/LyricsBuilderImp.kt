package ayds.ak4.lyrics

import com.google.gson.Gson
import com.google.gson.JsonObject

internal class LyricsBuilderImp : LyricsBuilder {

    override fun buildErrorLyrics(): Lyrics {
        return ErrorLyrics()
    }

    override fun buildBasicLyrics(callResponse: String): Lyrics {
        val gson = Gson()
        val jobj = gson.fromJson(callResponse, JsonObject::class.java)
        val result = jobj.get("result").asJsonObject
        val track = result.get("track").asJsonObject
        val songName = track.get("name").asString
        val text = track.get("text").asString
        val image = "https://source.unsplash.com/random/300x300/?" + songName.replace(" ", "%20") + ",music"
        return BasicLyrics(text, image)
    }
}
