import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        for ( int i = 0; i < 26; i += 1) {
            graphics.setColor(Color.green);
            graphics.drawLine(WIDTH/2, 1 + (i * 10), WIDTH/2 + (i*10), HEIGHT/2);
        }
        for ( int i = 0; i < 26; i += 1) {
            graphics.setColor(Color.red);
            graphics.drawLine(WIDTH/2, 1 + (i*10), WIDTH/2 - (i*10), HEIGHT/2);
        }
        for ( int i = 0; i < 26; i += 1) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(WIDTH/2, HEIGHT/2 + (i*10), 1 + (i*10), HEIGHT/2);
        }
        for ( int i = 0; i < 26; i += 1) {
            graphics.setColor(Color.blue);
            graphics.drawLine(WIDTH/2, HEIGHT/2 + (i*10), WIDTH - (i*10), HEIGHT/2);
        }



    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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