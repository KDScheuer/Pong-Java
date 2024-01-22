import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    
    GamePannel panel;

    GameFrame() {
        panel = new GamePannel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
    }
}
