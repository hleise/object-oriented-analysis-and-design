
public class BookDriver {

    public static void main(String[] args) {
        // Since Book is abstract, you can't directly instantiate it.
        // But you can instantiate its subclass Textbook
        Book javabook = new Textbook("Java Rules", 303, 12);
        javabook.setPage(225);
        javabook.nextPage();
        javabook.setPage(600);
        javabook.nextPage();
        
        Book library[] = new Book[1];
        library[0] = javabook;
    }

}
