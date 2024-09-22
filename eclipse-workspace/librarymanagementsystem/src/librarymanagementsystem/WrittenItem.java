package librarymanagementsystem;

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies);
        this.author = author;
    }

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    @Override
    public void print() {
        System.out.println("Written Item: " + this.toString());
    }
}
