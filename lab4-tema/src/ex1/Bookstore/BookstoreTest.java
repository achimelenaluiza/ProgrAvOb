package ex1.Bookstore;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreTest {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Book book3 = new Book("mara","mara", "mara",200);
        books.add(book3);
        books.add(book3);
        Book book4 = new Book("ana","are", "mere",500);
        books.add(book4);

        BookstoreCheck check = new BookstoreCheck();
        System.out.println(check.checkDouble(books, book3));
        System.out.println(check.isBigger(book3,book4));

        System.out.println();

        Book book1 = create(scanner);
        books.add(book1);
        Book book2 = create(scanner);
        books.add(book2);
        display(books);

        update(books,scanner);
        display(books);

        delete(books,scanner);
        display(books);


        scanner.close();
    }

    public static Book create(Scanner scanner) {

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Create new book");
        System.out.println("Insert number of pages: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert author: ");
        String author = scanner.nextLine();
        System.out.println("Insert title: ");
        String title = scanner.nextLine();
        System.out.println("Insert publisher: ");
        String publisher = scanner.nextLine();


        Book book = new Book(title,author,publisher,pageCount);
        return book;
    }

    public static void update (ArrayList<Book> books, Scanner scanner) {

       // Scanner scanner = new Scanner(System.in);

        System.out.println("What is the title of the  book you want to update? ");
        String titleToChange = scanner.nextLine();
        System.out.println("Type update:");

        System.out.println("Insert new number of pages: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert new author: ");
        String author = scanner.nextLine();
        System.out.println("Insert new title: ");
        String title = scanner.nextLine();
        System.out.println("Insert new publisher: ");
        String publisher = scanner.nextLine();

        int ok = 0;

        for(int  i = 0; i < books.size(); i ++){
            Book aux = books.get(i);
            if(aux.getTitle().equals(titleToChange)){
                System.out.println("Updated!");
                ok = 1;
                aux.setTitle(title);
                aux.setAuthor(author);
                aux.setPageCount(pageCount);
                aux.setPublisher(publisher);
            }
        }
        if(ok == 0) {
            System.out.println("No such book, creating new entry");
            books.add(new Book(title, author, publisher, pageCount));
        }
    }

    public static void delete(ArrayList<Book> books, Scanner scanner) {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("What is the title of the  book you want to delete? ");
        String titleToDelete = scanner.nextLine();

        int ok = 0;
        int aux2 = -1;

        for (int i = 0; i < books.size(); i++) {
            Book aux = books.get(i);
            if (aux.getTitle().equals(titleToDelete)) {
                ok = 1;
                aux2 = i;
            }
        }
        if(ok == 0) System.out.println("No such book");
        else{
            System.out.println("Deleted successfully!");
            books.remove(aux2);
        }
    }

    public static void display(ArrayList<Book> books){
        for(int  i = 0; i < books.size(); i ++){
            Book aux = books.get(i);
            System.out.println(aux.toString());
        }
    }
}
