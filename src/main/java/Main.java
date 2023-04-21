import java.util.Scanner;

public class Main {
    static Book[] books = new Book[5];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Book Book1 = new Book(1, "123", "Book1",false, "");
        Book Book2 = new Book(2, "123", "Book1",false, "");
        Book Book3 = new Book(3, "123", "Book1",false, "");
        Book Book4 = new Book(4, "123", "Book1",false, "");
        Book Book5 = new Book(5, "123", "Book1",false, "");

        books[0] = Book1;
        books[1] = Book2;
        books[2] = Book3;
        books[3] = Book4;
        books[4] = Book5;

        System.out.println("Home Screen");
        System.out.println("Show Availible Books");
        System.out.println("Show Checked out Books");
        System.out.println("Exit");

        choice = sc.nextInt();

        if(choice == 1)
        {

            ShowBooks();


        }
        else if(choice ==2)
        {
            ShowCheckedOut();
        }else if(choice ==3)
        {


        }else if(choice ==4)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Option");

        }





















    }
    public static void ShowBooks()
    {
        for(int i = 0; i < books.length; i++) {
            System.out.println("\nID: " + books[i].getId() +
                    "\nTitle " + books[i].getTitle() +
                    " \nISBN: " + books[i].getIsbn());
        }

    }
    public static void ShowCheckedOut()
    {
        for(int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut = true)
                System.out.println("\nID: " + books[i].getId() +
                "\nTitle " + books[i].getTitle() +
                " \nISBN: " + books[i].getIsbn());
        }
        }


    public void Menu(){


    }

}
