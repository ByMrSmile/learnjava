package qwe;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    private String author;

    public Book(String n, int a){
        name = n;
        pages = a;
        author = "Author1";
    }
    public Book(String n){
        name = n;
        pages= 3;
        author = "Author1";
    }
    public Book(){
        name = "Kniga3";
        pages = 3;
        author = "Author1";
    }

    public void setPage(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return this.name+", pages "+this.pages;
    }

    public void WhoAuthor(){
        System.out.println(name+"'s author is "+author);
    }
}
