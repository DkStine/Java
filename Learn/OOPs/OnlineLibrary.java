class Library{
    private String[] availableBooks;
    private int bookNo = 0;
    private String[] issuedBooks;

    Library() {
        availableBooks = new String[10];
        issuedBooks = new String[10];
        System.out.println("Library under development, only 10 books can be added and issued as of now...");
    }

    public void addBook(String book) {
        while (bookNo <= 9) {
            availableBooks[bookNo] = book;
            break;
        }
        bookNo++;
    }
    public void showAvailableBooks() {
        for (String i : availableBooks) {
            for (String j : issuedBooks) {
                if (i != j) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public void issueBook(String book) {
        issuedBooks[issuedBooks.length] = book;
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Kidnapped");
        lib.addBook("The Adventures");
        lib.addBook("The Lost City");
        lib.addBook("Tom Sawyer");

        lib.showAvailableBooks();
        
        lib.issueBook("Tom Sawyer");
        lib.showAvailableBooks();
    }
}
