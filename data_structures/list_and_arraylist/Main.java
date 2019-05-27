package data_structures.list_and_arraylist;

import java.util.Scanner;

/**
 * Created by RI on 6/11/2017.
 */
public class Main {

    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String args[]){
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit){
            System.out.println("\nEnter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    groceryList.printGroceryList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4 :
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6 :
                    System.out.println("Application quits.\nGood Bye.");
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("0. to show choices.");
        System.out.println("1. to view items.");
        System.out.println("2. to add new items.");
        System.out.println("3. to modify items.");
        System.out.println("4. to remove items.");
        System.out.println("5. to search items.");
        System.out.println("6. to close the application");
    }
    public static void addItem(){
        System.out.print("Enter new item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter which item to replace :");
        String  oldItem = scanner.nextLine();
        System.out.println("Enter replacement item");
        String newitem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem,newitem);
    }
    public static void removeItem(){
        System.out.print("Enter item name : ");
        String name = scanner.nextLine();
        groceryList.removeGroceryItem(name);
    }
    public static void findItem(){
        System.out.print("Enter what to find :");
        String name = scanner.nextLine();
        if (groceryList.onFile(name))
            System.out.println(name+" found in the grocery list.");
        else
            System.out.println(name+" not found in the grocery list.");
    }
}
