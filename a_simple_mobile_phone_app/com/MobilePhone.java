package a_simple_mobile_phone_app.com;

import java.util.ArrayList;

/**
 * Created by RI on 6/12/2017.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0 ){
            System.out.println("Contact is already in the file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int pos= findContact(oldContact);
        if (pos < 0){
            System.out.println(oldContact.getName()+" , was not found.");
            return false;
        }
        this.myContacts.set(pos,newContact);
        System.out.println(oldContact.getName()+" , was replaced with "+newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
        int pos = findContact(contact);
        if (pos < 0){
            System.out.println(contact.getName()+" , was not found.");
            return false;
        }
        this.myContacts.remove(pos);
        System.out.println(contact.getName()+" , was deleted.");
        return true;
    }
    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos >= 0)
            return this.myContacts.get(pos);
        return null;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public void printContacts() {
        System.out.println("Contact list :");
        if (myContacts.size() == 0)
            System.out.println("No contacts saved yet.");
        else{
            for (int i = 0; i <this.myContacts.size() ; i++) {
                System.out.println((i+1)+".\t"+
                        this.myContacts.get(i).getName()+" -->"+
                        this.myContacts.get(i).getNumber());
            }
        }
    }





}
