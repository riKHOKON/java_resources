
package structure_of_java.oops.super_keyword.another_test;
/*Another example of super keyword where super()
  is provided by the compiler implicitly.
 */
class Dog extends Animal{
    Dog(){
        System.out.println("dog is created");
    }
    public static void main(String args[]){
        Dog dog=new Dog();
    }
} 