package advanced_java_practices.static_initialization;

import advanced_java_practices.apple.Apple;
import advanced_java_practices.apple.AppleJar;

import java.util.ArrayList;

/**
 * Created by ri on 2/20/2017.
 */
public class StaticInit {
    public static void main(String args[]){
        ArrayList<Apple> apples = AppleJar.apples;
        for (Apple a:apples) {
            System.out.println(a.toString());
        }
    }
}
