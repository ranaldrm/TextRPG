import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Play implements ActionListener {
	protected Player player;
	protected Visual visual;
	protected Space space;

	public Play () {
		

        player = new Player();
        space = new Space ();
        visual = new Visual(player, space);
        visual.setVisible(true);
        
        visual.getExButton1().addActionListener(this);
        visual.getExButton2().addActionListener(this);
        visual.getExButton3().addActionListener(this);
        visual.getExButton4().addActionListener(this);
        
	}
	
	
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == visual.exButton1) {
						
		} 
		else if (e.getSource() == visual.exButton2) {
			
		}
		else if (e.getSource ()== visual.exButton3) {
			
		}
		else if (e.getSource () == visual.exButton4) {
			if (this.space.getButtonFour()< 1) {
				space.result4();
				visual.update();
			} 		
		}	
	}
}
