package methods;

import javax.swing.JOptionPane;

public class RollerCoasterPoo {

	public RollerCoasterPoo() {
		// TODO Auto-generated constructor stub
		
}
	public static void main(String[] args) {
		String person = JOptionPane.showInputDialog("How tall are you in inches?");
		int numPerson=Integer.parseInt(person);
		if(numPerson>47) {
			JOptionPane.showMessageDialog(null, "Get in the bag!");
	}
if(numPerson<48) {
	JOptionPane.showMessageDialog(null, "Go home, small fry! And don't come back!");
}	
	}
}