package bookauthorclassesexample;

public class Book {

    public Book(String title, int yearOfW, int yearOfP, Author author, String publisher) {
        this.title = title;
        this.yearOfW = yearOfW;
        this.yearOfP = yearOfP;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book: " + "title = " + title + ", yearOfW = " + yearOfW + ", yearOfP = " + yearOfP + ", author = " + author + ", publisher = " + publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfW() {
        return yearOfW;
    }

    public int getYearOfP() {
        return yearOfP;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearOfP(int yearOfP) {
        this.yearOfP = yearOfP;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    String title;
    int yearOfW;
    int yearOfP; //candidate to be list or massive
    Author author; // candidate to be list or massive
    String publisher;
}
