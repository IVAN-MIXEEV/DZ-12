public class Book {
    private String bookName;
    private final Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public void setBookYear(int year) {
        this.bookYear = year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String toString() {
        return "Название книги: " + this.bookName + "\nФИО автора: "
                + this.author.toString() + "\nГод книги: " + this.bookYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book obj2 = (Book) other;
        return this.bookName.equals(obj2.bookName) && this.bookYear == obj2.bookYear && this.author.equals(obj2.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.bookName, this.bookYear, this.author);
    }
}
