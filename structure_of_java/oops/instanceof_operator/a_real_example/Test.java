package structure_of_java.oops.instanceof_operator.a_real_example;

class Test {
    public static void main(String args[]){
        Printable p=new B();
        Call c=new Call();
        c.invoke(p);
    }
}  