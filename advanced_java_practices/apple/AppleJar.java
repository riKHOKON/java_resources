package advanced_java_practices.apple;

import java.util.ArrayList;

/**
 * Created by ri on 2/20/2017.
 */
public class AppleJar {
    public static ArrayList<Apple> apples;
    static {
        System.out.println("Initializing.....");
        apples = new ArrayList<>();
        apples.add(new Apple("Red apple",0*00002));
        apples.add(new Apple("Yellow apple",0*00001));
        apples.add(new Apple("Green apple",0*000012));
    }
}
