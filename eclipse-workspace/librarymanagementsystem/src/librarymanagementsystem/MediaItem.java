package librarymanagementsystem;

abstract class MediaItem extends Item {
    private int runtime;  // in minutes

    public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
        super(identificationNumber, title, numberOfCopies);
        this.runtime = runtime;
    }

    // Getters and Setters
    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }

    @Override
    public void print() {
        System.out.println("Media Item: " + this.toString());
    }
}
