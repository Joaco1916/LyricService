package ayds.ak4;

import ayds.ak4.lyrics.LyricsServiceModule;

public class ExternalServiceModule {
    private static ExternalServiceModule instance;

    private ExternalServiceModule() {}

    public static ExternalServiceModule getInstance() {
        if (instance == null)
            instance = new ExternalServiceModule();
        return instance;
    }

    public ExternalService getLyricsExternalService() {
        return LyricsServiceModule.getInstance().getExternalService();
    }
}
