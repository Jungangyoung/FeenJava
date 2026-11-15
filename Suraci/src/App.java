import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        JFrame window = new JFrame("Suraci");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);
        
    }
}
