package bookauthorclassesexample;

public class BookAuthorClassesExample {
    
    public static void main(String[] args) {
        Author author1 = new Author("Samuel", "Klemans", "Mark Twen");
        System.out.println(author1);
        Book book1 = new Book("Tom Soer's adventures", 
                              1895, 
                              1900, 
                              author1, 
                              "American publisher");
        System.out.println(book1);
    }
}