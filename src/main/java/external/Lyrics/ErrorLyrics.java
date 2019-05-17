package external.Lyrics;

public class ErrorLyrics implements Lyrics {
    private String lyrics;
    private String imagePath;

    public ErrorLyrics(){
        this.lyrics = "No se encontro letra para esta canción. Vuelva y pruebe otra vez.";
        this.imagePath = "https://source.unsplash.com/dQLgop4tnsc/300x300";
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getLyrics() {
        return lyrics;
    }
}
