package structure_of_java.oops.instanceof_operator.a_real_example;

class Call{

    void invoke(Printable p){
        //upcasting
        if(p instanceof A){
            A a=(A)p;//Downcasting
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;//Downcasting
            b.b();
        }
  
    }
}//end of Call class  