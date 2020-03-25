package ex1.Bookstore;

import java.util.ArrayList;

public class BookstoreCheck {
    public String checkDouble(ArrayList<Book> books, Book book){

        int cate = 0;
        for(int  i = 0; i < books.size(); i ++){
            Book aux = books.get(i);
            if(aux.equals(book))
                cate ++;
        }
        if(cate >= 2) return "Yes";
        else return "No";
    }

    public Book isBigger(Book book1, Book book2){

        if(book1.getPageCount() >= book2.getPageCount())
            return book1;
        else
            return book2;
    }
}
