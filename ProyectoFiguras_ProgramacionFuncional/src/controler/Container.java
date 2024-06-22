package controler;

import model.Circle;
import model.Square;
import model.Triangle;

import java.awt.*;
import java.util.function.Consumer;

public class Container {
    private Circle circle;
    private Square square;
    private Triangle triangle;
    private final Object[][] figures;

    public Container() {
        circle = new Circle();
        square = new Square();
        triangle= new Triangle();

        figures = new Object[][]{
                {"Circle", (Consumer< Graphics>) (graphics -> circle.draw(graphics))},
                {"Square", (Consumer<Graphics>) (graphics -> square.draw(graphics))},
                {"Triangle", (Consumer<Graphics>) (graphics-> triangle.draw(graphics))}

        };
    }

    // Método para dibujar la figura
    public void drawFigure(Graphics graphics, String fig) {
        // Busca la funcion lambda correspondiente al nombre de la figura
        for (Object[] figureInfo : figures) {
            if (fig.equals(figureInfo[0])) {
                ((Consumer<Graphics>) figureInfo[1]).accept(graphics);
                return;
            }
        }
        System.out.println("Figure not found: " + fig);
    }

}
