package model;

import model.interfaces.Drawable;

import java.awt.*;

public class Square implements Drawable {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.orange);
        graphics.fillRect(250, 100, 150, 150);

    }
}
