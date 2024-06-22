package model;

import model.interfaces.Drawable;

import java.awt.*;

public class Triangle implements Drawable {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        int[] xPoints = {250, 400, 325};
        int[] yPoints = {125, 125, 50};
        graphics.fillPolygon(xPoints, yPoints, 3);

    }
}
