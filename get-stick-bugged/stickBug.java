import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class stickBug {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Get Doged lol");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(Color.BLACK);

        ImageIcon imageIcon = new ImageIcon("stickbugged-memes.gif");

        if (imageIcon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("Image not found!");
        }

        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        frame.setVisible(true);
    }
}