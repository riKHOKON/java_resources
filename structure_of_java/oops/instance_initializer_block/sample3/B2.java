
package structure_of_java.oops.instance_initializer_block.sample3;

class B2 extends A{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }
    {System.out.println("instance initializer block is invoked");}
    public static void main(String args[]){
        B2 b=new B2();
    }
}  