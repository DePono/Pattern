package Observer;

import javax.swing.*;
import java.awt.*;

public class Face extends JPanel {
    public Face(){}
        public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawArc(100,45,80,80,0,360);
        graphics.setColor(Color.blue);
        graphics.drawArc( 120, 70, 10, 10, 0, 360);
        graphics.drawArc( 150, 70, 10, 10, 0, 360);

        graphics.setColor( Color.magenta );
        graphics.drawLine ( 140, 85, 140, 100 );

        graphics.setColor( Color.red );
        graphics.drawArc ( 110, 55, 60, 60, 0, -180 );
        }

    public void paint(Graphics graphics)
    {
        //Change color to yellow
        graphics.setColor(Color.green);
        //Draw and fill the face
        graphics.drawArc(100,100,250,250,0,360);
        graphics.fillArc(100,100,250,250,0,360);
        //Change color to black
        graphics.setColor(Color.black);
        //Draw the left eye
        graphics.drawArc(170,185,25,25,0,360);
        graphics.fillArc(170,185,25,25,0,360);

        //Draw the right eye
        graphics.drawArc(255,185,25,25,0,360);
        graphics.fillArc(255,185,25,25,0,360);

        //Draw the smile
        graphics.drawArc(150,215,150,100,0,-180);
    }

    public Graphics rightEye(Graphics graphics) {

        return graphics;
    }
}

