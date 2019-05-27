package advanced_java_practices.apple;

/**
 * Created by ri on 2/20/2017.
 */
public class Apple {
    private static final long BLACK = 0*000000;

    private String appleName;
    private long color = BLACK;

    public Apple(String appleName, long color) {
        this.appleName = appleName;
        this.color = color;
    }
    public String toString(){
        return "name : "+this.appleName+"\tcolor "+this.color;
    }
}
