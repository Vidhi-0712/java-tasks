package Library_Management_System;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("6. Display Borrowed Books");
            System.out.println("7. Display Categories");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.println("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.println("Enter Category: ");
                    String category = sc.nextLine();

                    Book book = new Book(id, title, author, category);
                    library.addBook(book);
                    System.out.println("Book added Successfully");
                }

                case 2 -> {
                    library.displayAvailableBooks();
                }

                case 3 -> {
                    System.out.println("Enter title of book to borrow: ");
                    String title = sc.nextLine();
                    System.out.println("Enter your name: ");
                    String borrower = sc.nextLine();
                    library.borrowBook(title, borrower);
                }

                case 4 -> {
                    System.out.println("Enter title of book to return: ");
                    String title = sc.nextLine();
                    library.returnBook(title);
                }

                case 5 -> {
                    exit = true;
                    System.out.println("Exiting Library System. Goodbye!");
                }

                case 6 -> library.displayBorrowedBooks();

                case 7 -> library.displayCategories();

                default -> System.out.println("Invalid choice! Please try again");
            }
            sc.close();
        }
    }
}




//        System.out.println("Enter Book ID :");
//        int id = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Enter Book Title :");
//        String title = sc.nextLine();
//
//        System.out.println("Enter Book author name :");
//        String author = sc.nextLine();
//
//        System.out.println("Enter Book Category :");
//        String category = sc.next();
//
//        boolean isAvailable = true;
//
//        Book obj = new Book(id,title,author,category,isAvailable);
//
//        System.out.println("\n Book Created");
//        System.out.println(obj);
//
//        sc.close();

