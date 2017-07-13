package chapter3.varianta.book.action;

import chapter3.varianta.book.entities.Author;
import chapter3.varianta.book.entities.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Tasks {
   //Output a list of books of a certain author
    public List<Book> booksOfCertainAuthors(List<Book> books, String author){ 
        List<Book> listBooks = new ArrayList<Book>(); //Create a new array of books
        for (Book currentBook : books) {
            for (Author currentAuthor : currentBook.getAuthors()) {
                if (currentAuthor.getNameAuthor().equals(author)) {
                    listBooks.add(currentBook); //Add the book to the new array 
                }  
            }
        }
        return listBooks;
    }

    //список книг, выпущенных заданным издательством;
    public List<Book> booksOfCertainPublishingName(List<Book> books, String publishingName) {
        List<Book> listBooks = new ArrayList<Book>(); //Create a new array of books
        for (Book currentBook : books) { 
             if (currentBook.getPublishingName().equals(publishingName) ) {
                listBooks.add(currentBook);
            } //Add the book to the new array 
        }
        return listBooks;
    }

    //список книг, выпущенных после заданного года
    public List<Book> getBooksAfterСertainYear(List<Book> books, int year) {
        List<Book> listBooks = new ArrayList<Book>(); //Create a new array of books
        for (Book currentBook : books) {
            if (currentBook.getYearOfPublishing()>year) 
                listBooks.add(currentBook); //Add the book to the new array
        }
        return listBooks;
    }
}
