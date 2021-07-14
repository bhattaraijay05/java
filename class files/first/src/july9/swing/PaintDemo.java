
// Paint lines to a panel.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class extends JPanel. It overrides
// the paintComponent() method so that random
// lines are pl7otted in the panel.
class PaintPanel extends JPanel {
    Insets ins; // holds the panel's insets
    Random rand; // used to generate random numbers
    // Construct a panel.

    PaintPanel() {
        // Put a border around the panel.
        setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        rand = new Random();
    }

    // Override the paintComponent() method.
    protected void paintComponent(Graphics g) {
        // Always call the superclass method first.
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillOval(10, 10, 50, 50);
        g.fillRect(70, 10, 50, 50);
        g.drawOval(10, 70, 50, 50);
        g.drawRect(70, 70, 50, 50);
        g.drawOval(10, 130, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(50, 180, 170, 50);
        g.drawLine(100, 200, 200, 60);
    }
}

// Demonstrate painting directly onto a panel.
class PaintDemo {
    JLabel jlab;
    PaintPanel pp;

    PaintDemo() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Paint Demo");
        // Give the frame an initial size.
        jfrm.setSize(200, 150);
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create the panel that will be painted.
        pp = new PaintPanel();
        // Add the panel to the content pane. Because the default
        // border layout is used, the panel will automatically be
        // sized to fit the center region.
        jfrm.add(pp);
        // Display the frame.
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintDemo();
            }
        });
    }
}