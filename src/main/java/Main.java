import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Book Book1 = new Book(1, "123", "Book1",false, "");
        Book Book2 = new Book(2, "123", "Book1",false, "");
        Book Book3 = new Book(3, "123", "Book1",false, "");
        Book Book4 = new Book(4, "123", "Book1",false, "");
        Book Book5 = new Book(5, "123", "Book1",false, "");
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

        }





















    }
    public static void ShowBooks()
    {
        for(int i = 0; i < Book.Books.length; i++)
        {
            System.out.println(Book.Books[i] + getId() + );
        }


    }
    public void

}
