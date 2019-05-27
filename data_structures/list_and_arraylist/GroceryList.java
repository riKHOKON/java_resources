package data_structures.list_and_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by RI on 6/11/2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in the list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + " . " + groceryList.get(i));
        }
    }
    public boolean onFile(String searchItem){
        int pos = groceryList.indexOf(searchItem);
        if (pos >= 0)
            return true;
        else return false;
    }
    private int findGroceryItem(String name){
      return groceryList.indexOf(name);
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public void removeGroceryItem(String name){
        int pos = findGroceryItem(name);
        if (pos >= 0)
            removeGroceryItem(pos);
    }
    private void modifyGroceryItem(int pos,String newItem){
        System.out.println(groceryList.get(pos)+" is going to be modified with "+newItem);
        groceryList.set(pos,newItem);
    }
    public void modifyGroceryItem(String currentItem,String newItem){
        int pos = findGroceryItem(currentItem);
        if (pos >= 0)
            modifyGroceryItem(pos,newItem);
    }



//    public static void main(String args[]){
//
//        Scanner scanner = new Scanner(System.in);
//        String[] items = {"milk","suger","rice","honey","onion","water"};
//
//        GroceryList myList = new GroceryList();
//        for (int i = 0;i < items.length; ++i)
//            myList.addGroceryItem(items[i]);
//
//
//        myList.printGroceryList();
//        myList.removeGroceryItem(4);
//        myList.printGroceryList();
//        myList.modifyGroceryItem(4,"cold drinks");
//        myList.printGroceryList();
//        System.out.print("Enter the item name to search : ");
//        myList.findItem(scanner.nextLine());
//
//
//
//
//    }
}
