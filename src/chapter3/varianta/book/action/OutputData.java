package chapter3.varianta.book.action;

import chapter3.varianta.book.entities.Book;
import java.util.List;

/**
 *
 * @author SLAVA
 */
public class OutputData {
    
    public static void outputListBooks (List<Book> listBooks) {
    for (Book book : listBooks)
            System.out.println(book.toString());
            System.out.println("---------------");
    
    }
}
