package external;

import external.Lyrics.LyricsServiceModule;

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
