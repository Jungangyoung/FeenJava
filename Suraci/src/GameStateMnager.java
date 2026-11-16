import java.util.ArrayList;

public class GameStateMnager {
    private ArrayList<GameState> gameStates;
    private int currentState;

    public static final int MENUSTATE = 0;
    public static final int LEVELSTATE = 1;

    public GameStateMnager () {

        gameStates = new ArrayList<GameState>();
        
        currentState = MENUSTATE;
        gameStates.add(new MenuState(this));
    }

    public void setState(int state) {
        currentState = state;
        gameStates.get(currentState).init();
    }

    public void update() {
        gameStates.get(currentState).update();
    }

}
