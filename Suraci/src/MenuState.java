import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuState extends GameState{
    
    private Background bg;

    private int currentChoice = 0;
    private String[] options = {
        "Start",
        "Help",
        "Quit"
    };

    private Color titleColor;
    private Font titleFont;

    private Font font;

    public MenuState(GameStateManager gsm){
        this.gsm = gsm;
        try {
            bg = new Background(null, 1);
            bg.setVector(-0.1, 0);

            titleColor = new Color(0, 128, 128);
            titleFont = new Font("Centuray Gothic", 
            Font.PLAIN, 
            70);
            font = new Font("Arial", Font.PLAIN, 22);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void init() {}
    public void update() {
        bg.update();
    }
    public void draw(Graphics2D g) {
        //draw background
        bg.draw(g);
        //draw title
        g.setColor(titleColor);
        g.setFont(titleFont);
        g.drawString("Suraci", 220, 200);
        //draw menu options
        g.setFont(font);
        for(int i = 0; i < options.length; i++) {
            if(i == currentChoice) {
                g.setColor(Color.YELLOW);
            }
            else {
                g.setColor(Color.ORANGE);
            }
            g.drawString(options[i], 300, 260 + i * 25);
        }
    }

    private void select() {
        if(currentChoice == 0) {
            // start
        }
        if(currentChoice == 1) {
            // help
        }
        if(currentChoice == 2) {
            // exit
            System.exit(0);
        }
    }

    public void keyPressed(int k) {
        if(k == KeyEvent.VK_ENTER) {
            select();
        }
        if(k == KeyEvent.VK_UP) {
            currentChoice--;
            if(currentChoice == -1) {
                currentChoice = options.length - 1;
            }
        }
        if(k == KeyEvent.VK_DOWN) {
            currentChoice++;
            if(currentChoice == options.length) {
                currentChoice = 0;
            }
        }
    }
    public void keyReleased(int k) {}

}
