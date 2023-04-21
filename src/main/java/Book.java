public class Book {

    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    static String[] Books = {"Book1", "Book2", "Book3", "Book4", "Book5"};

    public Book(int id, String isbn, String title, boolean isCheckcedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckcedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name)
    {

                checkedOutTo = name;
                isCheckedOut = true;


    }

    public void checkIn(String name)
    {
        checkedOutTo = "";
        isCheckedOut = false;

    }
    public int getId() {
        return id;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckcedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }




}
