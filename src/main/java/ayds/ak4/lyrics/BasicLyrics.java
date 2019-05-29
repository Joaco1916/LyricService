package ayds.ak4.lyrics;

public class BasicLyrics implements Lyrics {
    private String lyrics;
    private String imagePath;

    public BasicLyrics(String lyrics, String imagePath){
        this.lyrics = lyrics;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getLyrics() {
        return lyrics;
    }
}
