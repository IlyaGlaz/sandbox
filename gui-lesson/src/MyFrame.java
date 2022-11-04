import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() throws HeadlessException {

        setTitle("My window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(420, 420);
        setVisible(true);

        getContentPane().setBackground(new Color(25,75,200));
    }
}
