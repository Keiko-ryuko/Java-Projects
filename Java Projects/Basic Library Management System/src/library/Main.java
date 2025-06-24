package library;
import java.util.*;
public class Main {
    static class Book {
        String title; boolean isIssued;
        Book(String title) { this.title = title; this.isIssued = false; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("5. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter book title: ");
                books.add(new Book(sc.nextLine()));
            } else if (choice == 2) {
                System.out.print("Enter title to issue: ");
                String title = sc.nextLine();
                for (Book b : books) {
                    if (b.title.equalsIgnoreCase(title) && !b.isIssued) {
                        b.isIssued = true; System.out.println("Book issued."); break;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter title to return: ");
                String title = sc.nextLine();
                for (Book b : books) {
                    if (b.title.equalsIgnoreCase(title) && b.isIssued) {
                        b.isIssued = false; System.out.println("Book returned."); break;
                    }
                }
            } else if (choice == 4) {
                for (Book b : books) {
                    System.out.println(b.title + " - " + (b.isIssued ? "Issued" : "Available"));
                }
            } else break;
        }
    }
}