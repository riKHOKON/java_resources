package schildt_proj.MethodsAndClasses_6.access_modifiers;

/**
 * Created by ri on 1/25/17.
 * To understand the difference between public and private
 * consider this example.
 */
class MyClass {

    private int alpha; // private access.
    public int beta; // public access.
    int gamma; // default access.
    /*
     * Methods to access alpha. It's OK for a
     * member of a class to access a private
     * member of the same class
     * */
    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}
