public class Book {

    boolean isCheckedOut;
    String checkedOutTo;
    int id;
    String isbn;
    String title;


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public static String getTitle(String title) {
        return title;
    }

    public void checkOut(String name) {

        this.checkedOutTo = name;
        this.isCheckedOut = true;


    }

    public void checkIn(String name) {
        this.checkedOutTo = "";
        this.isCheckedOut = false;

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
