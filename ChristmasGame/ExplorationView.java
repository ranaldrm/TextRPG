import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;



public class ExplorationView extends Visual{
	protected JButton exButton1, exButton2, exButton3, exButton4, exInvButton;
	protected JPanel exButtonPanel, exSouthOuterPanel, exNorthOuterPanel;
	protected JLabel exTextLabel, exSanityLabel, exHealthLabel, exEquipLabel;
	protected Player player;

	
	
	public ExplorationView(Player player) {
		
		
			
		//Basic features of Frame 

		this.setLayout(new BorderLayout ());
		this.player = player;
				
		//set up an outer Panel to centre the buttons at the bottom
		exSouthOuterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		exSouthOuterPanel.setBackground(Color.BLACK);
		this.add(exSouthOuterPanel, BorderLayout.SOUTH);
						
		//Make panel for buttons, set colours, organise layout and set to bottom.
		exButtonPanel = new JPanel();
		exButtonPanel.setBackground(Color.BLACK);
		exButtonPanel.setLayout(new BoxLayout(exButtonPanel, BoxLayout.Y_AXIS));
		exSouthOuterPanel.add(exButtonPanel);

		        
		//create buttons and add to buttonPanel
		exButton1 = new JButton("Option 1");
		exButton1.setBackground(Color.BLACK);
		exButton1.setForeground(Color.WHITE);
		exButtonPanel.add(exButton1);
		exButton2 = new JButton("Option 2");
		exButton2.setBackground(Color.BLACK);
		exButton2.setForeground(Color.WHITE);
		exButtonPanel.add(exButton2);
		exButton3 = new JButton("Option 3");
		exButton3.setBackground(Color.BLACK);
		exButton3.setForeground(Color.WHITE);
		exButtonPanel.add(exButton3);
		exButton4 = new JButton("Option 4");
		exButton4.setBackground(Color.BLACK);
		exButton4.setForeground(Color.WHITE);
		exButtonPanel.add(exButton4);
				
/*the text in the JLabel is formatted using HTML (<html> and <div> tags) to 
* allow text wrapping. Additionally, a width style of 200 pixels and text-align: 
* center; are applied to the div element to limit the width and center-align 
* the text. Adjust the width value according to your desired text width. 
* The setHorizontalAlignment(SwingConstants.CENTER) method ensures that 
* the label content is centred within the label component.	
*/
		exTextLabel = new JLabel("<html><div style='width: 200px; text-align: center;'>Just some random default text but we need space to blah blah blah as this is going to go on for a while.</div></html>");
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

		}