import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){

        setBounds(100, 100, 1050, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel drawing = new DrawingPanel();
        drawing.setBackground(Color.WHITE);
        drawing.setLayout(null);
        add(drawing);



    }
}
