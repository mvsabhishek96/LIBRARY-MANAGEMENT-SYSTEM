package librarymanagementsystem;

class Book extends WrittenItem {
    public Book(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.toString());
    }
}

