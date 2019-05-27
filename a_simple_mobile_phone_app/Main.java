package a_simple_mobile_phone_app;

import a_simple_mobile_phone_app.com.Contact;
import a_simple_mobile_phone_app.com.MobilePhone;

import java.util.Scanner;

/**
 * Created by RI on 6/12/2017.
 */
public class Main {



    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("01936733420");

    public static void main(String args[]){

        boolean quit = false;
        start();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down.");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
    private static void updateContact(){
        System.out.print("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact number:");
        String num = scanner.nextLine();
        Contact newContact = Contact.create_Contact(newName,num);
        if (mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Update successful.");
        }else System.out.println("Not updated.");
    }
    private static void removeContact(){
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContact)){
            System.out.println("Deleted successfully.");
        }else System.out.println("Error on delete.");
    }
    private static void queryContact(){
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println(existingContact.getName()+"\t --> "+existingContact.getNumber());
    }
    private static void addNewContact(){
        System.out.print("Enter contact name :");
        String name = scanner.nextLine();
        System.out.print("Enter phone number :");
        String phone = scanner.nextLine();
        Contact newContact = Contact.create_Contact(name,phone);
        if(mobilePhone.addNewContact(newContact))
            System.out.println("Contact added.\t"+name+" --> "+phone);
    }
    public static void start(){
        System.out.println("Phone starting.");
    }
    public static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n"+
                            "1 - to print contacts.\n"+
                            "2 - to add a new contact.\n"+
                            "3 - to update existing an contact.\n"+
                            "4 - to remove an existing contact.\n"+
                            "5 - to query if an existing contact exists\n"+
                            "6 - to print available actions.\n");
        System.out.println("Choose your action: ");
    }
}
