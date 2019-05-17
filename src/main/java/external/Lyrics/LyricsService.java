package external.Lyrics;

import external.ExternalService;
import java.io.IOException;

public class LyricsService implements ExternalService {
    private LyricsBuilder lyricsBuilder;
    private LyricsAPI lyricsAPI;

    public LyricsService(LyricsBuilder lyricsBuilder, LyricsAPI lyricsAPI){
        this.lyricsBuilder = lyricsBuilder;
        this.lyricsAPI = lyricsAPI;
    }

    public Lyrics getLyricsFromService(String song, String artist) {
        Lyrics lyrics;
        try {
            String callResponse = getCallResponse(song, artist);
            lyrics = lyricsBuilder.buildBasicLyrics(callResponse);
        }
        catch (Exception e) {
            e.printStackTrace();
            lyrics = lyricsBuilder.buildErrorLyrics();
        }
        return lyrics;
    }

    private String getCallResponse(String song, String artist) throws IOException{
        return lyricsAPI.getLyrics(artist, song).execute().body();
    }
}
