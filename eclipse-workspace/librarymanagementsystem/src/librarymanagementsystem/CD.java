package librarymanagementsystem;

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(identificationNumber, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    // Getters and Setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + this.toString());
    }
}

