
package chapter3.varianta.book.main;

import chapter3.varianta.book.action.Action;
import chapter3.varianta.book.action.OutputData;
import chapter3.varianta.book.action.Tasks;
import chapter3.varianta.book.entities.Book;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Action action = new Action();
            List<Book> books = new ArrayList<Book>();
            books = action.generateBooks();
            Tasks tasks = new Tasks();
            
            System.out.println("Cписок книг автора Стивена Кинга:");
            List<Book> listBooksFirst = tasks.booksOfCertainAuthors(books, "Стивен Кинг");
            OutputData.outputListBooks(listBooksFirst);
                        
            System.out.println("Cписок книг, выпущенных издательством 'Москва':");
            List<Book> listBooksSecond = tasks.booksOfCertainPublishingName(books, "Москва");
            OutputData.outputListBooks(listBooksSecond);
                        
            System.out.println("Список книг, выпущенных после 1950 года:");
            List<Book> listBooksThird = tasks.getBooksAfterСertainYear(books, 1950);
            OutputData.outputListBooks(listBooksThird);
       
        

    }
}
