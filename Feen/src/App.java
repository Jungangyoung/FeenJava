import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Feen");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Feen feen = new Feen(boardWidth, boardHeight);
        frame.add(feen);
        frame.pack();
        feen.requestFocus();
    }
}
