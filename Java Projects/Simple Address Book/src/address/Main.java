package address;
import java.util.*;
public class Main {
    static class Contact {
        String name, phone;
        Contact(String name, String phone) {
            this.name = name; this.phone = phone;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter phone: ");
                String phone = sc.nextLine();
                contacts.add(new Contact(name, phone));
            } else if (choice == 2) {
                for (Contact c : contacts) {
                    System.out.println(c.name + ": " + c.phone);
                }
            } else break;
        }
    }
}