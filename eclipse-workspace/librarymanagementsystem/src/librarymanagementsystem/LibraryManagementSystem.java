package librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] items = new Item[5];
        items[0] = new Book(101, "Java Programming", 5, "John Doe");
        items[1] = new JournalPaper(102, "AI Research", 3, "Jane Smith", 2020);
        items[2] = new Video(103, "Inception", 4, 148, "Christopher Nolan", "Sci-Fi", 2010);
        items[3] = new CD(104, "Thriller", 6, 42, "Michael Jackson", "Pop");
        items[4] = new Book(105, "Python Guide", 8, "Alice Johnson");

        boolean running = true;
        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View all items");
            System.out.println("2. Check out item");
            System.out.println("3. Check in item");
            System.out.println("4. Add copies to item (Admin)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Item item : items) {
                        item.print();
                    }
                    break;
                case 2:
                    System.out.print("Enter item ID to check out: ");
                    int checkOutId = scanner.nextInt();
                    for (Item item : items) {
                        if (item.getIdentificationNumber() == checkOutId) {
                            item.checkOut();
                            System.out.println("Item checked out.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter item ID to check in: ");
                    int checkInId = scanner.nextInt();
                    for (Item item : items) {
                        if (item.getIdentificationNumber() == checkInId) {
                            item.checkIn();
                            System.out.println("Item checked in.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter item ID to add copies: ");
                    int addItemId = scanner.nextInt();
                    System.out.print("Enter number of copies to add: ");
                    int copies = scanner.nextInt();
                    for (Item item : items) {
                        if (item.getIdentificationNumber() == addItemId) {
                            item.addItem(copies);
                            System.out.println("Copies added.");
                        }
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}

