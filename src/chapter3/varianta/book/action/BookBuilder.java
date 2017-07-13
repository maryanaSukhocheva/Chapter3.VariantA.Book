
package chapter3.varianta.book.action;

import chapter3.varianta.book.entities.Author;
import chapter3.varianta.book.entities.Book;
import chapter3.varianta.book.enums.TypeCover;
import chapter3.varianta.book.exception.ParamsException;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class BookBuilder {
    
    //Creating a book on the set parameters
    public Book buildBook(int id, String nameEdition, List<Author> authors, String publishingName, int yearOfPublishing,
            int amountPages, int price, TypeCover typeCover) throws Exception {
        Book book = new Book();
         if (authors!=null && !nameEdition.isEmpty() && nameEdition!=null  && publishingName!=null && yearOfPublishing>=0 && amountPages>=0 && price>=0 && typeCover!=null ) {
                if (id == 0) {
                    id = Action.generateId(); //id generation
                }
                try {
                    book.setId(id);
                    book.setNameEdition(nameEdition);
                    book.setAuthor(authors);
                    book.setPublishingName(publishingName);
                    book.setAmountPages(amountPages);
                    book.setPrice(price);
                    book.setTypeCover(typeCover);
                               
                } catch (ParamsException ex) {
                    System.out.println("Book error");
                }

        } else {
             System.out.println("Parametrs incorrect");
        }

        return book;
    }
    
    
    
    
}
