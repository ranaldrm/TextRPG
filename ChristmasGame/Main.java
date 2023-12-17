import javax.swing.*;

public class Main {
    public static void main(String[] args) {

            Player player = new Player();
            Space space = new Space ();
            Visual visual = new Visual(player, space);
            visual.setVisible(true);
        
    }
}
