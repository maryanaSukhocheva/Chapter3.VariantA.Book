/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.varianta.book.action;

import chapter3.varianta.book.entities.Author;
import chapter3.varianta.book.entities.Book;
import chapter3.varianta.book.enums.TypeCover;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    private List<Book> arrayOfBooks;
    //id generating
    public static int generateId() {
        int resultId;
        Random random =new Random();
        resultId=random.nextInt(10000);
        return resultId;
    }
    
    public boolean addBook(Book book) throws Exception {
        boolean result;
        if (book!=null) {
            result=arrayOfBooks.add(book);
            System.out.println("Add book");
        } else {
            throw new Exception("Error book added");
        }
        return result;
    }
//filling the arrayOfBooks with books
     public List<Book> generateBooks()  {
        List<Book> arrayOfBooks = new ArrayList<Book>();
        try {
        BookBuilder action = new BookBuilder();
        List<Author> authors1 = new ArrayList<Author>();
        authors1.add(new Author("Есенин"));
        Book bookFirst = action.buildBook(1,"Белая береза", authors1, "Дрофа", 1905,300, 2500, TypeCover.HARD);
        List<Author> authors2 = new ArrayList<Author>();
        authors2.add(new Author("Блинов А.Р."));
        authors2.add(new Author("Романчик О.П."));
        Book bookSecond = action.buildBook(2,"Промышленное программирование", authors2, "Москва", 2016,368, 4000, TypeCover.SOFT);
        List<Author> authors3 = new ArrayList<Author>();
        authors3.add(new Author("Стивен Кинг"));
        Book bookThird = action.buildBook(5, "Маугли", authors3, "Алматы", 1956,2560, 3000, TypeCover.SOFT);
        
        arrayOfBooks.add(bookFirst);
        arrayOfBooks.add(bookSecond);
        arrayOfBooks.add(bookThird);
        
         } catch (Exception ex) {
            System.err.println("Error when creating books");
        }
        System.out.println("Создан массив книг");
        return arrayOfBooks;

    }
}
