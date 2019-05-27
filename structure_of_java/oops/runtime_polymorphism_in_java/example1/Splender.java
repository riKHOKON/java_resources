package structure_of_java.oops.runtime_polymorphism_in_java.example1;

class Splender extends Bike{
    void run(){
        System.out.println("running safely with 60km");
    }
    public static void main(String args[]){
        Bike b = new Splender();//upcasting
        b.run();
    }
}  
