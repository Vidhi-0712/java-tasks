package Library_Management_System;
import java.util.*;

public class Library  {
    private List<Book> bookName = new ArrayList<>();
    private Map<String, String> borrowedBooks = new HashMap<>();
    private Set<String> categories = new TreeSet<>();

    public void addBook(Book book){
        bookName.add(book);
        categories.add(book.getCategory());
    }

    public Book searchBookByTitle(String title){
        for(Book b : bookName){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public boolean borrowBook(String title, String borrowerName){
        Book book = searchBookByTitle(title);
        if(book == null){
            System.out.println("Book titled '"+title+"' not found in the library");
            return false;
        }
        if(book.borrowBook()){
            borrowedBooks.put(book.getTitle(), borrowerName);
            System.out.println(borrowerName+"borrowed: "+book.getTitle());
            return true;
        }else{
            System.out.println("Already borrowed by "+borrowedBooks.get(book.getTitle()));
            return false;
        }
    }

    public boolean returnBook(String title){
        Book book = searchBookByTitle(title);
        if(book==null){
            System.out.println("Book titled '"+title+"' not found in library.");
            return false;
        }
        if(book.returnBook()){
            String borrower = borrowedBooks.remove(book.getTitle());
            System.out.println(borrower+" Returned: "+book.getTitle());
            return true;
        }else{
            System.out.println("Cannot return '"+title+"' -it wasn't borrowed");
            return false;
        }
    }

    public void displayAvailableBooks(){
        if(bookName.isEmpty()){
            System.out.println(" Library has no books.");
        }else{
            System.out.println(" Books in Library");
            bookName.forEach(System.out::println);
        }
    }

    public void displayBorrowedBooks(){
        if(borrowedBooks.isEmpty()){
            System.out.println("No borrowed books currently");
        } else {
            System.out.println("Borrowed Books: ");
            for(Map.Entry<String, String> entry : borrowedBooks.entrySet()){
                System.out.println(entry.getKey()+" Borrowed by: "+entry.getValue());
            }
        }
    }

    public void displayCategories(){
        if(categories.isEmpty()){
            System.out.println("No categories found");
        }else{
            System.out.println("Unique Categories in Library: ");
            for(String category : categories){
                System.out.println("- "+category);
            }
        }
    }
}
