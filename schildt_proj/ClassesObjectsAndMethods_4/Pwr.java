package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/21/17.
 */
public class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base,int exp){
        b = base;
        e = exp;
        val = 1;
        if (exp==0)return;
        for (;exp>0;--exp)val = val * base;
    }
    double getPwr(){
        return this.val;
    }

    public static void main(String args[]){
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,1);
        Pwr z = new Pwr(5.7,0);

        System.out.println(x.b+" raised to the "+x.e+"" +
                " power is "+x.getPwr());
        System.out.println(y.b+" raised to the "+y.e+"" +
                " power is "+y.getPwr());
        System.out.println(z.b+" raised to the "+z.e+"" +
                " power is "+z.getPwr());
    }

}
