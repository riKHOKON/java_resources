package schildt_proj.Exception_Handling.GraphicsExercise;


import javax.swing.*;
import java.util.Scanner;

/**
 * Created by RI on 6/1/2017.
 */
public class ShapesTest {
    public static void main(String args[]){
        // obtaining user choice
        String input  = JOptionPane.showInputDialog("Enter 1 to draw Rectangles\n"+
        "Enter 2 to draw Ovals\n"+
        "Enter 3 for 3d Rectangle\n"+
                "Enter 4 for Arc");
        int choice = Integer.parseInt(input);
        Shapes shape = new Shapes(choice);
        JFrame applicationFrame = new JFrame();
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.add(shape);
        applicationFrame.setSize(300,300);
        applicationFrame.setVisible(true);
    }
}
