/*
 * Yo have to implement a library using Java Class 'Library'
 * Methods: issueBook, returnBook, showAvailableBooks
 * Properties:
 *  Array to store the available books
 *  Array to store the issued books
 */

package code.JavaCourseCWH.src.exercises;

class Library {

    String[] availableBooks;
    int noOfAvailableBooks;

    String[] issuedBook;
    int noOfIssuedBook;

    public Library() {
        this.availableBooks = new String[100];
        this.noOfAvailableBooks = 0;
        this.issuedBook = new String[100];
        this.noOfIssuedBook = 0;
    }

    public void addBook(String book) {
        this.availableBooks[noOfAvailableBooks] = book;
        System.out.println("'"+ book + "'" + " added successfully!");
        this.noOfAvailableBooks++;
    }

    public void showAvailableBooks() {
        System.out.println("List of available books: ");
        for (String book: this.availableBooks) {
            if (book==null) {
                continue;
            }
            else {
                System.out.println('\t' + " * " + book);
            }
        }
    }

    public void issueBook(String book) {

        boolean success = false;

        for (int i=0; i<this.availableBooks.length; i++) {

            if (book == this.availableBooks[i]) {
                System.out.println("'" + book + "'" + " issued successfully!");
                this.availableBooks[i] = null;
                this.issuedBook[i] = book;
                this.noOfAvailableBooks--;
                this.noOfIssuedBook++;
                success = true;
                break;
            }

            else {
                continue;
            }
        }

        if (success == false) {
            System.out.println("The book is not available.");
        }
    }

    public void returnBook(String book) {

        boolean success = false;

        for (int i=0; i<this.noOfIssuedBook; i++) {
            if (book == this.issuedBook[i]) {
                this.issuedBook[i] = null;
                this.noOfIssuedBook--;
                this.availableBooks[i] = book;
                this.noOfAvailableBooks++;
                break;
            }
                
            else{
                continue;
            }
        }

        if (success == false) {
            System.out.println("The book has not been issued yet.");
        }
    }
}


public class Ex63_Online_Library {

    public static void main(String[] args) {
        
        Library centralLibrary = new Library();

        // Add three books
        centralLibrary.addBook("The Alchemist");
        centralLibrary.addBook("Rich Dad, Poor Dad");
        centralLibrary.addBook("Harry Potter");

        // Show the number of available books
        System.out.println("The number of available books: " + centralLibrary.noOfAvailableBooks);
        centralLibrary.showAvailableBooks();

        // Issue a book
        centralLibrary.issueBook("The Alchemist");
        System.out.println("The number of available books: " + centralLibrary.noOfAvailableBooks);
        centralLibrary.showAvailableBooks();

        // Return the same book
        centralLibrary.returnBook("The Alchemist");
        System.out.println("The number of available books: " + centralLibrary.noOfAvailableBooks);
        centralLibrary.showAvailableBooks();

        // Try to issue a book which is not available
        centralLibrary.issueBook("Think like a monk");

        // Try to return a book which has not been issued
        centralLibrary.returnBook("Think like a monk");
    }
}
