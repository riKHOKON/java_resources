package schildt_proj.Package_And_Interface_8.bookpackext;

import schildt_proj.Package_And_Interface_8.bookpack.Book;

/**
 * Created by RI on 4/24/2017.
 */
public class UseBook {
    public static void main(String args[]){
        Book books[] = new Book[5];
        double totalPrice = 0;
        books[0] = new Book("Java Programming.","KHOKON",2017,100);
        books[1] = new Book("Python Programming.","KHOKON",20123,200);
        books[2] = new Book("Math Programming.","KHOKON",20173,234);
        books[3] = new Book("Biology Programming.","KHOKON",2054,45);
        books[4] = new Book("Science Programming.","KHOKON",20100,435);

        for (int i = 0;i < books.length;++i){
            books[i].showInfo();
            totalPrice += books[i].getPrice();
        }

        System.out.println("Total price is : "+totalPrice);

    }
}
