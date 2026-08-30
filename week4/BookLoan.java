class Book {

    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title, String author, String bookCode) {
        if (isBlank(title) || isBlank(author) || isBlank(bookCode)) {
            throw new IllegalArgumentException(
                "Title, author, and bookCode must not be blank");
        }
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        this.loaned = false;
    }

    private boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public boolean borrowBook() {
        if (loaned) {
            return false;
        }
        loaned = true;
        return true;
    }

    public boolean returnBook() {
        if (!loaned) {
            return false;
        }
        loaned = false;
        return true;
    }

    public boolean isAvailable() {
        return !loaned;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return "Book[" + title + " by " + author + " (" + bookCode + "), "
                + (loaned ? "loaned" : "available") + "]";
    }
}

public class BookLoan {

    public static void main(String[] args) {
        Book b = new Book("Harry Potter", "J.K. Rowling", "HP001");
        System.out.println(b);

        System.out.println("Available? " + b.isAvailable());
        System.out.println("Borrow: " + b.borrowBook());
        System.out.println("Borrow again (repeated): " + b.borrowBook());
        System.out.println("Available after borrow? " + b.isAvailable());

        System.out.println("Return: " + b.returnBook());
        System.out.println("Return again (already available): " + b.returnBook());

        Book c = new Book("1984", "George Orwell", "1984A");
        System.out.println(c);
        System.out.println("Independent: b available? " + b.isAvailable()
                + ", c available? " + c.isAvailable());
        c.borrowBook();
        System.out.println("After borrowing c only: b=" + b.isAvailable()
                + ", c=" + c.isAvailable());
    }
}
