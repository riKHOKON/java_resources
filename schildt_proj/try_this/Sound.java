package schildt_proj.try_this;

/**
 * Created by rashedulislam on 12/21/2016.
 * Computing the distance to a lightning strike whose sound takes 7.2 seconds
 * to reach me
 */
public class Sound {
    public static void main(String args[]){
        double distance;
        double time = 7.2;
        distance = time * 1100; // sound travels 1100 feet per second through air
        System.out.println("The Lightning is "+distance+" feet far away.");
    }
}
