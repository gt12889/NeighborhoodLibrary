import java.util.Scanner;

public class Main {
    static Book[] books = new Book[5];
    static int counter;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;
        Book Book1 = new Book(1, "123", "Book1", false, "");
        Book Book2 = new Book(2, "456", "Book2", false, "");
        Book Book3 = new Book(3, "789", "Book3", false, "");
        Book Book4 = new Book(4, "101", "Book4", false, "");
        Book Book5 = new Book(5, "121", "Book5", false, "");
        counter = 5;

        books[0] = Book1;
        books[1] = Book2;
        books[2] = Book3;
        books[3] = Book4;
        books[4] = Book5;

        Menu();


    }

    public static void ShowBooks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            if (books[i].isCheckedOut == false)
                System.out.println("ID: " + books[i].getId() +
                        "\nTitle " + books[i].getTitle(books[i].title) +
                        " \nISBN: " + books[i].getIsbn() + "\n---");
        }
        System.out.println("C) Checkout a book\nX) Menu");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("C")) {
            CheckOut();
            Menu();
        } else if (choice.equalsIgnoreCase("X")) {
            Menu();
        } else
            System.out.println("Invalid Entry");
        Menu();
    }


    public static void ShowCheckedOut() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            if (books[i].isCheckedOut == true)
                System.out.println("\nID: " + books[i].getId() +
                        "\nTitle: " + books[i].getTitle(books[i].title) +
                        " \nISBN: " + books[i].getIsbn() +
                        " \nName: " + books[i].getCheckedOutTo() + "\n---");

        }
        System.out.println("-----------------------------------");
        System.out.println("C) Select a book to check in");
        System.out.println("X) Exit to main menu");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("C")) {
            CheckIn();
            Menu();
        } else if (choice.equalsIgnoreCase("X")) {
            Menu();
        } else
            System.out.println("Invalid Entry");
        Menu();
    }

    public static void SelectBook() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        for (int i = 0; i <= counter; i++) {
            books[i].checkOut(Book.getTitle(books[i].title));
        }
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Home Screen");
        System.out.println("1) Show Availible Books");
        System.out.println("2) Show Checked out Books");
        System.out.println("3) Exit");
        int choice = sc.nextInt();

        if (choice == 1) {

            ShowBooks();


        } else if (choice == 2) {
            ShowCheckedOut();
        } else if (choice == 3) {
            System.exit(0);
        } else {
            System.out.println("Invalid Option");
            Menu();
        }


    }

    public static void CheckIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID");
        for (int i = 0; i <= counter; i++) {
            if (sc.nextInt() == books[i].getId() && books[i].isCheckcedOut() == true) {
                books[i].checkIn(Book.getTitle(books[i].title));
                System.out.println("Success");
            } else {
                System.out.println("Invalid");
                Menu();
            }
        }

        Menu();
    }

    public static void CheckOut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Book ID");
        int choice = sc.nextInt();

        for (int i = 0; i <= counter; i++) {
            if (books[choice].isCheckcedOut() == false) {
                books[i].checkOut(name);
                System.out.println("Success");
                Menu();
            } else {
                System.out.println("Invalid Book");
                Menu();
            }
        }

        Menu();
    }
}
