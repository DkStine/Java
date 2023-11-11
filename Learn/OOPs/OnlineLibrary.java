class Library{
    private String[] availableBooks;
    private int bookNo;
    

    Library() {
        this.availableBooks = new String[100];
        this.bookNo = 0;
    }

    public void addBook(String book) {
        availableBooks[bookNo] = book;
        System.out.println(book + " added successfully!");
        bookNo++;
    }
    public void showAvailableBooks() {
        for (String b : this.availableBooks) {
            if (b == null) {
                continue;
            }
            System.out.println("* " + b);
        }
    }
    public void issueBook(String book) {
        for (int i = 0; i < this.availableBooks.length; i++) {
            if (book == this.availableBooks[i]) {
                System.out.println(book + " has been issued!");
                this.availableBooks[i] = null;
                return;
            }
        }
        System.out.println(book + " doesn't exist");
    }
    public void returnBook(String book) {
        addBook(book);
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
        lib.issueBook("Kidnapped");
        lib.showAvailableBooks();
        lib.returnBook("Kidnapped");
        lib.showAvailableBooks();
        
    }
}
