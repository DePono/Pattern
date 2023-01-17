package Facade;

import java.awt.*;

public abstract class FacadeShapes {
    int x, y;
    void draw(Graphics g) {
        paintShape((Graphics2D) g.create());
    }

    abstract void paintShape(Graphics2D g);
}
