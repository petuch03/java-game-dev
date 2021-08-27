package game.com.petuch.game;


import javax.swing.JFrame;
public class Window extends JFrame {
    public Window() {
        setTitle("windowtf");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel(500, 500));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
