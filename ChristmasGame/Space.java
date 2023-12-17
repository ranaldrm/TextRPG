
public class Space {
	protected String option1;
	protected String option2;
	protected String option3;
	protected String option4;
	protected String text;
	protected String textForm;
	protected int buttonOne;
	protected int buttonTwo;
	protected int buttonThree;
	protected int buttonFour;
	
	
	
	
	public int getButtonOne() {
		return buttonOne;
	}
	public void setButtonOne(int buttonOne) {
		this.buttonOne = buttonOne;
	}
	public int getButtonTwo() {
		return buttonTwo;
	}
	public void setButtonTwo(int buttonTwo) {
		this.buttonTwo = buttonTwo;
	}
	public int getButtonThree() {
		return buttonThree;
	}
	public void setButtonThree(int buttonThree) {
		this.buttonThree = buttonThree;
	}
	public int getButtonFour() {
		return buttonFour;
	}
	public void setButtonFour(int buttonFour) {
		this.buttonFour = buttonFour;
	}
	public void setTextForm(String textForm) {
		this.textForm = textForm;
	}
	public Space () {
		this.option1 = "Go forward";
		this.option2 = "Go left";
		this.option3 = "Go right";
		this.option4 = "Rest";
//The text is formed as a String that can be manipulated by results
		this.text = "You find yourself in a forest clearing. Two paths lead off the main track, one to the left and one to the right.";
/*The text string is fed into another string formatted with html. This is the 
 * one that appears.		
 */
		this.textForm = "<html><div style='width: 200px; text-align: center;'>" + this.text + "</div></html>";
		this.buttonOne = 0;
		this.buttonTwo = 0;
		this.buttonThree = 0;
		this.buttonFour = 0;
	}
	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
		
	}
	public String getText () {
		return text;
	}
		


	
	public String getTextForm() {
		return textForm;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void result1 () {
		
	}
	public void result2 () {
		
	}
	public void result3 () {
		
	}
	public void result4 () {
		if (buttonFour == 0) {
//concactanate with new text
			this.text = this.text + "You wake up after a lovely kip.";
//format with html
			this.textForm = "<html><div style='width: 200px; text-align: center;'>" + this.text + "</div></html>";
//change the button to blank text.			
			this.option4 = "";
/*change the status of the button, so that the Visual object will know it has
 * been pushed once 
 */

			this.buttonFour +=1;
		}
	}
		
}


