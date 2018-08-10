import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        for ( int i = 0; i < WIDTH; i += 1) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(1 + (i * 9), 1, WIDTH, 10 + (i * 9));
        }
        for ( int i = 0; i < HEIGHT; i += 1) {
                graphics.setColor(Color.green);
                graphics.drawLine(1, 1 + (i*9), 10 + (i*9), WIDTH);
        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 523;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}