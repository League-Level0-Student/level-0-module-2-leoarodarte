package methods;

import javax.swing.JOptionPane;

public class Voting {

	public Voting() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	String vote = JOptionPane.showInputDialog("How old are you in years?");
	int numVote=Integer.parseInt(vote);
	
	if(numVote>17) {
	String i=	JOptionPane.showInputDialog("Who do you think was the worst president in history?");
	
	if(i.equals("Donald Trump") ){
		JOptionPane.showMessageDialog(null, "You have an amazing opinion!");
	}else {
	String x=	JOptionPane.showInputDialog("Do you support povery, evil and dishonesty?");
		if(x.equals("No.")) {
			JOptionPane.showMessageDialog(null, "Good");
	}else {
		JOptionPane.showMessageDialog(null, "Then you're evil!");
	}
	}
	}
	if(numVote<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares about your opinion bub!");

}
}
}