package chapter3.varianta.book.entities;

import chapter3.varianta.book.enums.TypeCover;
import chapter3.varianta.book.exception.ParamsException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Maryana_Sukhocheva
 * @version – 1
 */

//creation of the book
public class Book  {
    private int id;
    private String nameEdition;
    private List<Author> authors;
    private String publishingName;
    private int yearOfPublishing;
    private int amountPages;
    private int price;
    private TypeCover typeCover;

    
    private Calendar currentCalendar = new GregorianCalendar();
    
    
    public Book() {

    }

    public Book(int id, String nameEdition, List<Author> authors, String publishingName, int yearOfPublishing,
            int amountPages, int price, TypeCover typeCover) {
       try { 
        this.id = id;
        this.nameEdition = nameEdition;
        this.authors = authors;
        this.publishingName = publishingName;
        this.yearOfPublishing = yearOfPublishing;
        this.amountPages = amountPages;
        this.price = price;
        this.typeCover = typeCover;
        } catch (Exception ex) {
            System.err.println("Book's parameters  incorrect");
        }
    }
    
    
      public int getId() {
        return id;
    }

   
    public final void setId(int id) throws ParamsException {
        if (id>0) {
            this.id = id;
        } else {
            throw new ParamsException("Parameter id incorrect");
        }
    }
    public String getNameEdition() {
        return nameEdition;
    }

      public final void setNameEdition(String nameEdition) throws ParamsException {
        if (nameEdition!=null && !nameEdition.isEmpty()) {
            this.nameEdition = nameEdition;
        } else {
            throw new ParamsException("Parameter nameEdition incorrect");
        }
    }
      
    public List<Author> getAuthors() {
        return authors;
    }

    public final void setAuthor(List<Author> authors) throws ParamsException {
        if (authors!=null) {
          this.authors = authors;
        } else {
            throw new ParamsException("Parametr authors incorrect");
        }
    }
    public String getPublishingName() {
        return publishingName;
    }

   
    public void setPublishingName(String publishingName)  throws ParamsException {
        if (publishingName!=null && !publishingName.isEmpty()) {
            this.publishingName = publishingName;
        } else {
            throw new ParamsException("Parameter publishingName incorrect");
        }
    }
   
      public int getYearOfPublishing() {
        return yearOfPublishing;
    }

 
    public final void setYearOfPublishing(int yearOfPublishing) throws ParamsException {
        if ((yearOfPublishing>0) && (yearOfPublishing<=currentCalendar.get(Calendar.YEAR))) {
	    this.yearOfPublishing = yearOfPublishing;
	} else {
            throw new ParamsException("Parameter yearOfPublishing incorrect");
	}
      
    }
    
     public int getAmountPages() {
        return amountPages;
    }

     public final void setAmountPages(int amountPages)  throws ParamsException {
         if (amountPages>0) {
            this.amountPages = amountPages;
        } else {
            throw new ParamsException("Parameter amountPages incorrect");
        }
    }

     public final int countPages(){
        Random rand = new Random();
        return rand.nextInt(990) + 10;
    }

    public int getPrice() {
        return price;
    }

   
    public final void setPrice(int price) throws ParamsException {
        if (price>0) {
            this.price = price;
        } else {
            throw new ParamsException("Parameter price incorrect");
        }
    }
 
    public TypeCover getTypeCover() {
        return typeCover;
    }

    public void setTypeCover(TypeCover typeCover) throws ParamsException {
       if (typeCover!=null ) {
         this.typeCover = typeCover;
        } else {
            throw new ParamsException("Parameter typeCover incorrect");
        } 
    }

   
  
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("Книга").append(" ");
        str.append(getNameEdition()).append("\n");
        str.append("ID").append(" ");
        str.append(getId()).append("\n");
        str.append("Авторы:").append(" ");
        for (Author author: getAuthors()) {
          str.append(author.getNameAuthor()).append("\n");  
        }
        str.append("Год издания").append(" ");
        str.append(getYearOfPublishing()).append("\n");
        str.append("Издательство").append(" ");
        str.append(getPublishingName()).append("\n");
        str.append("Количество страниц").append(" ");
        str.append(getAmountPages()).append("\n");
        str.append("Тип переплета").append(" ");
        str.append(getTypeCover().toString());
        return  str.toString();
    }

    }