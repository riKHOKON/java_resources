package schildt_proj.Exception_Handling.GraphicsExercise;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RI on 6/1/2017.
 */
public class Shapes extends JPanel {
    private int choice;

    public Shapes(int choice){
        this.choice = choice;
    }
    public void paint(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            switch (choice){
                case 1:
                    g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
                    break;
                case 2:
                    g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
                    break;
                case 3:
                    g.draw3DRect(10+i*10,10+i*10,50+i*10,50+i*10,true);
                    break;
                case 4:
                    g.drawArc(10+i*10,10+i*10,50+i*10,50+i*10,100,350);
            }

        }
    }
}
