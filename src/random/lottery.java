package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	Random bob=new Random();
	String boby="";
for(int i = 0; i < 5; i++) {
	boby+=bob.nextInt(10);
}
JOptionPane.showMessageDialog(null, boby);
if (boby.equals("53926")) {
	JOptionPane.showMessageDialog(null, "You won $1,000,000,000!");
}
	
}
}
