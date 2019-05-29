package ayds.ak4.lyrics

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LyricsAPI {

    @GET("lyric/{artist}/{track}?apikey=dTRPy7BE2FooWBPRz1NG9hMhoPLYJs57wAIQyDFZv3of8beE9ljOfpdqb4oeNap7")
    fun getLyrics(@Path("artist") artist: String, @Path("track") track: String): Call<String>
    //https://loremflickr.com/640/480/artist,music/all
}
