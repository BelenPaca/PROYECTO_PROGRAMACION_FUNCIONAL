package view;

import controler.Container;

import javax.swing.*;
import java.awt.*;

public class JFrameFigure extends JFrame {

    private JPanel panel;
    private JButton buttonCircle;
    private JButton buttonTriangle;
    private JButton buttonSquare;
    private Container container;
    private String currentFigure;
    private Image imagenFondo;


    public JFrameFigure() {
        setTitle("Draw Geometric Figures");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon iconoFondo = new ImageIcon("resources/universidad.jpg");
        imagenFondo = iconoFondo.getImage();

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                graphics.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
                // Dibujar la figura geométrica actual
                if (currentFigure != null) {
                    container.drawFigure(graphics, currentFigure);
                }
            }
        };
        panel.setLayout(null);
        panel.setBackground(Color.white);

        buttonCircle = new JButton("Circle");
        buttonSquare = new JButton("Square");
        buttonTriangle = new JButton("Triangle");

        buttonCircle.setBounds(50, 70, 110, 45);;
        buttonSquare.setBounds(50, 185, 110, 45);
        buttonTriangle.setBounds(50, 300, 110, 45);

        buttonCircle.setBackground(Color.CYAN);
        buttonSquare.setBackground(Color.yellow);
        buttonTriangle.setBackground(Color.pink);

        panel.add(buttonCircle);
        panel.add(buttonSquare);
        panel.add(buttonTriangle);

        container = new Container();

        buttonCircle.addActionListener(e -> {
            currentFigure = "Circle";
            panel.repaint();
        });

        buttonSquare.addActionListener(e -> {
            currentFigure = "Square";
            panel.repaint();
        });

        buttonTriangle.addActionListener(e -> {
            currentFigure = "Triangle";
            panel.repaint();
        });
        add(panel);

    }
}



