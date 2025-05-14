package Core_Principles;

import java.util.List;

class Book{
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    Book(List<String> title, List<String> author,List<Boolean> isAvailable)
    {
        this.title= title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public boolean borrowBook(String bookName)
    {
        for(int i=0;i<isAvailable.size();i++)
        {
             if(title.get(i).equals(bookName))
            {
                if(isAvailable.get(i)){
                isAvailable.set(i,false);
                return isAvailable.get(i);
                }
            }
        }
        System.out.println("Book is not available.");
        return false;
    }
    public void returnBook(String bookName)
    {
        for(int i=0;i<isAvailable.size();i++)
        {
              if(title.get(i).equals(bookName))
            {
                isAvailable.set(i,true);
                return;
            }
        }
    }
    public void getAvailability(String bookName){
        for(int i=0;i<isAvailable.size();i++)
        {
              if(title.get(i).equals(bookName))
            {
                if(isAvailable.get(i))
                {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }

            }
        }
    }
}

// Please Do not change anything below, It is only for your reference.
/*
 * 
 * This is the driver code that will execute and demonstrate the functionality
 * of your `Book` class.
 * 
 * It creates a object of class `Book`, the parameterised constructor sets the
 * values of titles, authors, isAvailable attributes.
 * It iterates over the methodCalls array and calls methods corresponding the
 * operation type.
 * 
 * 
 * // Main class to demonstrate the functionality of the Student class
 * public class Main {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * 
 * List<String> titles, authors;
 * List<Boolean> isAvailable;
 * List<List<String>> methodCalls = new ArrayList<>();
 * 
 * // Create book object using parameterised Constructor to initialize the
 * attributes
 * Book book = new Book(titles, authors, isAvailable);
 * 
 * //Iterate over the methodCalls
 * for (List<String> methodCall : methodCalls) {
 * String operation = methodCall.get(0);
 * String bookName = methodCall.get(1);
 * 
 * if (operation.equals("1")) {
 * 
 * //If the opertion is of type 1 then calling method borrowBook
 * book.borrowBook(bookName);
 * }
 * else if (operation.equals("2")) {
 * 
 * //If the opertion is of type 1 then calling method returnBook
 * book.returnBook(bookName);
 * }
 * else if (operation.equals("3")) {
 * 
 * //If the opertion is of type 1 then calling method getAvailability
 * book.getAvailability(bookName);
 * }
 * }
 * }
 * 
 * sc.close();
 * }
 * }
 * 
 */

/*
 * //Below are the output statements
 * 
 * System.out.println("false");
 * System.out.println("true");
 * System.out.println("Book is not available.");
 * 
 */ 
class Practice_Encapsulation{
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book(List.of("Harry Potter", "The Hobbit"), List.of("J.K. Rowling", "J.R.R. Tolkien"), List.of(true, true));
        
        // Borrowing a book
        book.borrowBook("Harry Potter");
        
        // Checking availability
        book.getAvailability("Harry Potter");
        
        // Returning a book
        book.returnBook("Harry Potter");
        
        // Checking availability again
        book.getAvailability("Harry Potter");
    }
}
