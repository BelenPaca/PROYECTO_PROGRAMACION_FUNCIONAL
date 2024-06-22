package model;
import model.interfaces.Drawable;

import java.awt.*;

public class Circle implements Drawable {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillOval(250, 100, 150, 150);

    }
}
