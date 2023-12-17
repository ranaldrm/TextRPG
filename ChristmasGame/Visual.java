
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Visual extends JFrame  {
	protected Player player;
	protected Space space;
	protected JButton exButton1, exButton2, exButton3, exButton4, exInvButton;
	protected JPanel exButtonPanel, exSouthOuterPanel, exNorthOuterPanel;
	protected JLabel exTextLabel, exSanityLabel, exHealthLabel, exEquipLabel;
	

    
			
	public Visual (Player player, Space space) {

		
		//Basic features of Frame 		
		this.player = player;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize (600, 600);
		this.setLocation(200,40);
		this.getContentPane().setBackground(Color.BLACK);
		this.setTitle("A Walk in Fanghorn Woods.");
		this.setLayout(new BorderLayout ());
		
//pass a player and a space object
		this.player = player;
		this.space = space;
					
//set up an outer Panel to centre the buttons at the bottom
		exSouthOuterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		exSouthOuterPanel.setBackground(Color.BLACK);
		this.add(exSouthOuterPanel, BorderLayout.SOUTH);
							
//Make panel for buttons, set colours, organise layout and set to bottom.
		exButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		exButtonPanel.setBackground(Color.BLACK);
		
		exSouthOuterPanel.add(exButtonPanel);

			        
//create buttons and add to buttonPanel
		exButton1 = new JButton(space.getOption1());
		exButton1.setBackground(Color.BLACK);
		exButton1.setForeground(Color.WHITE);
//		exButton1.addActionListener(this);
		exButtonPanel.add(exButton1);
		exButton2 = new JButton(space.getOption2());
		exButton2.setBackground(Color.BLACK);
		exButton2.setForeground(Color.WHITE);
//		exButton2.addActionListener(this);
		exButtonPanel.add(exButton2);
		exButton3 = new JButton(space.getOption3());
		exButton3.setBackground(Color.BLACK);
		exButton3.setForeground(Color.WHITE);
//		exButton3.addActionListener(this);
		exButtonPanel.add(exButton3);
		exButton4 = new JButton(space.getOption4());
		exButton4.setBackground(Color.BLACK);
		exButton4.setForeground(Color.WHITE);
//		exButton4.addActionListener(this);
		exButtonPanel.add(exButton4);
					
/*the text in the JLabel is formatted using HTML (<html> and <div> tags) to 
* allow text wrapping. Additionally, a width style of 200 pixels and text-align: 
* center; are applied to the div element to limit the width and center-align 
* the text. Adjust the width value according to your desired text width. 
* The setHorizontalAlignment(SwingConstants.CENTER) method ensures that 
* the label content is centred within the label component.	
*/
		exTextLabel = new JLabel(space.getTextForm());
		exTextLabel.setForeground(Color.WHITE);
		exTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(exTextLabel, BorderLayout.CENTER);
				    
/*This is the outer panel for the north segment into which the Northeast and 
* Northwest intermediate panels will go.
				    */
		exNorthOuterPanel = new JPanel(new BorderLayout());
		exNorthOuterPanel.setBackground(Color.BLACK);
		this.add(exNorthOuterPanel, BorderLayout.NORTH);
				    
//Sanity and health labels to be put in the north west intermediate panel	    
				    
		exSanityLabel = new JLabel("   Sanity: " + this.player.getSanity());
		exSanityLabel.setBackground(Color.BLACK);
		exSanityLabel.setForeground(Color.WHITE);
		exHealthLabel = new JLabel("   Health: " + this.player.getHealth());
		exHealthLabel.setBackground(Color.BLACK);
		exHealthLabel.setForeground(Color.WHITE);
				    
				    
/*Equip label and a button to go to inventory to be placed in the north east 
intermediate panel    */
		exEquipLabel = new JLabel ("Equipped: " + this.player.getEquipped());
		exEquipLabel.setBackground(Color.BLACK);
		exEquipLabel.setForeground(Color.WHITE);
		exInvButton = new JButton("Inventory");
		exInvButton.setBackground(Color.BLACK);
		exInvButton.setForeground(Color.WHITE);
				    
//north west intermediate panel to go inside exNortherOuterPanel	    
		JPanel exNorthWestPanel = new JPanel(new BorderLayout());
		exNorthWestPanel.setBackground(Color.BLACK);
		exNorthWestPanel.add(exSanityLabel, BorderLayout.NORTH);
		exNorthWestPanel.add(exHealthLabel, BorderLayout.SOUTH);
//north east intermediate panel to go inside exNortherOuterPanel	    
		JPanel exNorthEastPanel = new JPanel(new BorderLayout());
		exNorthEastPanel.setBackground(Color.BLACK);
		exNorthEastPanel.add(exEquipLabel, BorderLayout.NORTH);
		exNorthEastPanel.add(exInvButton, BorderLayout.SOUTH);
				    
//add the intermediate panels to the North panel    
		exNorthOuterPanel.add(exNorthWestPanel, BorderLayout.WEST);
		exNorthOuterPanel.add(exNorthEastPanel, BorderLayout.EAST);		
	
	}
	public void setSpace (Space space) {
		this.space = space; 
	}

public JButton getExButton1() {
		return exButton1;
	}
	public void setExButton1(JButton exButton1) {
		this.exButton1 = exButton1;
	}
	public JButton getExButton2() {
		return exButton2;
	}
	public void setExButton2(JButton exButton2) {
		this.exButton2 = exButton2;
	}
	public JButton getExButton3() {
		return exButton3;
	}
	public void setExButton3(JButton exButton3) {
		this.exButton3 = exButton3;
	}
	public JButton getExButton4() {
		return exButton4;
	}
	public void setExButton4(JButton exButton4) {
		this.exButton4 = exButton4;
	}
	/*this method will perform actions when buttons are pressed. Each button will 
 * trigger a result method in the space object, which in turn will alter
 * buttons, text etc. So the update method is called after the result is.
 */
//	public void actionPerformed (ActionEvent e) {
//		if (e.getSource() == exButton1) {
//						
//		} 
//		else if (e.getSource() == exButton2) {
//			
//		}
//		else if (e.getSource ()== exButton3) {
//			
//		}
//		else if (e.getSource () == exButton4) {
//			if (this.space.getButtonFour()< 1) {
//				space.result4();
//				this.update();
//			} 		
//		}	
//	}

/*This updates the text and buttons from the space and can be called after a
result has been triggered */
	
	public void update () {
		this.exTextLabel.setText(space.getTextForm());
		this.exButton1.setText(space.getOption1());
		this.exButton2.setText(space.getOption2());
		this.exButton3.setText(space.getOption3());
		this.exButton4.setText(space.getOption4());	
		
		
	}

}
