package librarymanagementsystem;

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int yearPublished) {
        super(identificationNumber, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + this.toString());
    }
}
