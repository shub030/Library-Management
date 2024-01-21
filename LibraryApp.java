public class LibraryApp {

    public static void main(String[] args) {
        
        Book myBook = new Book("Dune", "Frank Herbert", "878-3-16-148410-4", "Sci-Fi");
        BookView bookView = new BookView();
        BookController bookController = new BookController(myBook, bookView);

        
        System.out.println("Initial Book Details:");
        bookController.updateView();
        System.out.println();

    
        Book newBook = new Book("Neuromancer", "William Gibson", "678-0-06-112008-2", "Cyberpunk Sci-Fi");

        
        bookController.setBookTitle(newBook.getTitle());
        bookController.setBookAuthor(newBook.getAuthor());
        bookController.setBookIsbn(newBook.getIsbn());
        bookController.setBookGenre(newBook.getGenre());

        
        System.out.println("Book Added. Updated Book Details:-");
        bookController.updateView();
        System.out.println();

        
        bookController.setBookGenre("Science Fiction");

        
        System.out.println("Book Information Updated. Updated Book Details:-");
        bookController.updateView();
    }
}
