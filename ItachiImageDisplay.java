import javax.swing.*;
import java.awt.*;

public class ItachiImageDisplay{
    public static void main(String[] args){
        /*
        Creating a jframe bruuh
         */
        JFrame frame = new JFrame("Itachi Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        /*
        getting the image
         */
        ImageIcon itachiImage = new ImageIcon("itachi.jpeg");

        /*
        creating a jlabel and set image icon

         */
        JLabel label = new JLabel(itachiImage);

        /*
        Adding the label to the frame haha
         */
        frame.getContentPane().add(label, BorderLayout.CENTER);

        /*
        make the frame to be visible me gustas tu
         */
        frame.setVisible(true);
    }

}
