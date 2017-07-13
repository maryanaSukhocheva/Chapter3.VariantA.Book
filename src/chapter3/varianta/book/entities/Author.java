package chapter3.varianta.book.entities;


import chapter3.varianta.book.exception.ParamsException;

/**
 *
 * @author Maryana_Sukhocheva
 * @version – 1
 */


//creation of the author
public class Author {
    private int birthYear;
    private String nameAuthor;
   
    public Author() {

    }

    public Author(String name) {
        try {
            setNameAuthor(name);
        } catch (ParamsException ex) {
            System.err.println("Parameters incorrect");
        }
     }

    public Author(String name, int birthYear) {
        try {
            setNameAuthor(name);
            setBirthYear(birthYear);
        } catch (ParamsException ex) {
             System.err.println("Parameters incorrect");
       }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public final void setBirthYear(int birthYear) throws ParamsException {
        if (birthYear>0) {
            this.birthYear = birthYear;
        } else {
              throw new ParamsException("Parameter birthYear incorrect");
        }
     }

   public String getNameAuthor() {
        return nameAuthor;
    }

    public final void setNameAuthor(String nameAuthor) throws ParamsException {
        if (nameAuthor!=null && !nameAuthor.isEmpty()) {
            this.nameAuthor = nameAuthor;
        } else {
            throw new ParamsException("Parameter nameAuthor incorrect");
        }
    }

    
      @Override
    public String toString() {
       return  getNameAuthor()+", " + getBirthYear() + "г";
    }

}


