package schildt_proj.Package_And_Interface_8.bookpack;

/**
 * Created by RI on 4/24/2017.
 */
public class Book {

    private String title;
    private String author;
    private int pubDate;
    private float price;
    public Book(String title, String author, int pubDate,float price) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.printf(title+"\t");
        System.out.printf(author+"\t");
        System.out.printf(pubDate+"\t");
        System.out.printf(price+"\t");
        System.out.println();
    }
}
