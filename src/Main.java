import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Super Tic-Tac-Toe", 50, 50);
        int[] topLeft = {1, 2};
        g2d.drawLine(topLeft[0], topLeft[1], 590, topLeft[1]+500);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Main extends JFrame {
    public Main() {
        initUI();
    }

    private void initUI() {
        add(new Surface());

        setTitle("Super Tic-Tac-Toe");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main window = new Main();
                window.setVisible(true);
            }
        });
    }
}