package ayds.ak4.lyrics;

import ayds.ak4.ExternalService;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class LyricsServiceModule {

    private static LyricsServiceModule instance;
    private ExternalService externalService;

    private LyricsServiceModule() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://orion.apiseeds.com/api/music/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        LyricsAPI lyricsAPI = retrofit.create(LyricsAPI.class);
        externalService = new LyricsService(new LyricsBuilderImp(), lyricsAPI);
    }

    public static LyricsServiceModule getInstance() {
        if (instance == null) {
            instance = new LyricsServiceModule();
        }
        return instance;
    }

    public ExternalService getExternalService() {
        return externalService;
    }
}
