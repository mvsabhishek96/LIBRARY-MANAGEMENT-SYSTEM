package librarymanagementsystem;

abstract class Item {
    private int identificationNumber;
    private String title;
    private int numberOfCopies;

    public Item(int identificationNumber, String title, int numberOfCopies) {
        this.identificationNumber = identificationNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters and Setters
    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Common methods
    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        } else {
            System.out.println("No copies left to check out.");
        }
    }

    public void addItem(int copies) {
        this.numberOfCopies += copies;
    }

    @Override
    public String toString() {
        return "ID: " + identificationNumber + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    public abstract void print();
}
