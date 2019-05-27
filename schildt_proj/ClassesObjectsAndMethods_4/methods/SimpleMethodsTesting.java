package schildt_proj.ClassesObjectsAndMethods_4.methods;

/**
 * Created by ri on 1/25/17.
 * int this section we are gonna use some methods
 * to perform some specific task.
 * NOTE: There are variations on methods
 * some are parametrized and some are blank
 * some has return type and some returns void
 * Let's see all of them.
 */
public class SimpleMethodsTesting {
    public static void main(String args[]){
        int number = 105;
        System.out.println("Square of "+number+" is:"+square(number));
        // argument....-this is called pass by value that means no change in the real number.
        System.out.println("Original value of the number is :"+number);
        /*
        Scanner input = new Scanner(System.in);
        double ftemp,ctemp;
        double temperature;
        String type;
        System.out.print("Enter a temperature to convert :");
        temperature = input.nextDouble();
        System.out.println("Enter type to convert to (C or F)");
        type = input.next();
        System.out.println("The converted temperature is "+convert(temperature,type));
        */

        /*
        System.out.println("Enter a temperature in Fahrenheit :");
        ftemp = input.nextDouble();
        ctemp = fahrenheitToCelsius(ftemp);
        System.out.println(ftemp+" F is equal to "+ctemp+" C.");

        System.out.println("Enter a temperature in Celsius :");
        ctemp = input.nextDouble();
        ftemp = celsiusToFahrenheit(ctemp);
        System.out.println(ctemp+" C is equal to "+ftemp+" F.");
        */

    }
    /** we use static word in methods which are not attached
     *   to objects.
     */
    static int square(int number){
        return number * number;
        /*
         *  Do we know this only effects only inside methods that means
         *  this is pass by value on argument. Such no effect on the main variable.
         */
    }
    static double fahrenheitToCelsius(double temp){
        double celsius;
        celsius = (temp - 32.0)*(5.0/9.0);
        return celsius;
    }
    static double celsiusToFahrenheit(double temp) {
        double fahrenheit;
        fahrenheit = temp * (9.0 / 5.0) + 32.0;
        return fahrenheit;
    }
    static double convert(double temp,String type){
        if (type.equals("C"))
            return (temp - 32.0) * (5.0/9.0);
        else
            return temp * (9.0 / 5.0) + 32.0;
    }
}
