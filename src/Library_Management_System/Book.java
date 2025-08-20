package Library_Management_System;

class Book {
    private final int id;
    private String title;
    private String author;
    private String category;
    private boolean available;

    public Book(int Bookid, String Booktitle, String Bookauthor, String Bookcategory){
        id=Bookid;
        title=Booktitle;
        author=Bookauthor;
        category=Bookcategory;
        available=true;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String newtitle){
        title=newtitle;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String newauthor){
        author=newauthor;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String newcategory){
        category=newcategory;
    }

    public Boolean IsAvailable(){
        return available;
    }


    public boolean borrowBook(){
        if(available){
            available = false;
            System.out.println("Book named "+title+" borrowed successfully");
        } else{
            System.out.println("Book named "+title+" is not available at the moment");
        }
        return false;
    }

    public boolean returnBook(){
        if(available){
            available = true;
            System.out.println("Book named "+title+" returned successfully");
        } else{
            System.out.println("Book named "+title+" was not borrowed");
        }
        return false;
    }

    public String toString(){
        return "Book{ id = "+id+"\n title = "+title+"\n author = "+author+"\n category ="+category+"\n is Available = "+available+'}';

    }


}
