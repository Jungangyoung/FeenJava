import java.awt.Graphics2D;
import java.awt.*;
public class LevelState extends GameState{
    
    private TileMap tileMap;

    public LevelState(GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    public void init() {
        //tileMap = new TileMap(30);
    }
    public void update() {}
    public void draw(Graphics2D g) {}
    public void keyPressed(int k) {}
    public void keyReleased(int k) {}
}
