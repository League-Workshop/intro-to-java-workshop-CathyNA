package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	String hello="Hello World!";
	System.out.println(hello);
	JOptionPane.showMessageDialog(null, hello);
	String name=JOptionPane.showInputDialog("Please type your name");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Good afternoon, "+name);
}
}
