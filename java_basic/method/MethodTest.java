package java_basic.method;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by RI on 4/15/2017.
 */
public class MethodTest {
    public static void main(String args[]) throws IOException{
        
    	Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        char operation;
        do {
    	   System.out.print("Enter temptuare or 'q' to quit :");
       		double temp = input.nextDouble();
       		System.out.print("what was the type 'c' or 'f' :");
       		operation = (char) System.in.read();
       		double convertedTemp = convertTemparature(temp,operation);
       	
       } while (operation != 'q'); 
        
    	
    	
    	
   	}
    static int square(int number){
        return number * number;
    }
    static double fToC(double temp,char choice){
        
    	double celcius;
        celcius = (temp - 32.0) * (5.0 / 9.0);
        return celcius;
    }
    static double cToF(double temp){
        double fahrenheit;
        fahrenheit = temp * (9.0 / 5.0) + 32.0;
        return fahrenheit;
    }
    static double convertTemparature(double temp,char choice){
    	if(choice == 'f'){
        	double celcius;
            celcius = (temp - 32.0) * (5.0 / 9.0);
            System.out.println(temp+" degree fahrenheit is equal to "+celcius+" degree celcius");
            return celcius;
    	}else if(choice == 'c'){
    		double fahrenheit;
            fahrenheit = temp * (9.0 / 5.0) + 32.0;
            System.out.printf(temp+" degree celcius is equal to "+fahrenheit+" degree fahrenheit");
            return fahrenheit;	
    	}
    	return (Double) null;
    }

}
