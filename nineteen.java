import java.util.ArrayList;
import java.util.List;

public class nineteen {
    public static void main(String[] args){
        Library lib = new Library();
        Book b1 = new Book(100, 300, "Fablehaven");
        Book b2 = new Book(400,1000,"The Hunger Games");
        Book b3 = new Book(415,499,"The Maze Runner");
        Journal j1 = new Journal(150, 100, "Essential Java");
        Journal j2 = new Journal(60,50,"HTML in 60 pages");
        lib.addItem(b1);
        lib.addItem(b2);
        lib.addItem(b3);
        lib.addItem(j1);
        lib.addItem(j2);
        lib.display();
    }
}

abstract class Publication{
    int noOfPages;
    float price;
    String publisherName;
    abstract void getDetails();
}
class Book extends Publication{
    Book(int noOfPages, float price, String publisherName){
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }
    public void getDetails(){
        System.out.println("(Publisher) NAME: "+this.publisherName+" PAGES: "+this.noOfPages+" PRICE: "+this.price);
    }
}
class Journal extends Publication{
    Journal(int noOfPages, float price, String publisherName){
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }
    public void getDetails(){
        System.out.println("(Publisher) NAME: "+this.publisherName+" PAGES: "+this.noOfPages+" PRICE: "+this.price);
    }
}
class Library{
    List<Publication> list;
    Library(){
        list = new ArrayList<>();
    }
    public void addItem(Publication p){
        list.add(p);
    }
    public void display(){
        for(Publication p:list){
            p.getDetails();
        }
    }
}