import java.util.*;
import java.text.*;
import java.io.*;
import javax.swing.*;
public class main{
	public static DecimalFormat timeFormat = new DecimalFormat("#.##");
	public static void main(String[] args) throws IOException{
		/*JFrame frame = new JFrame("My First GUI");
       		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       		frame.setSize(300,300);
       		frame.setVisible(true);
		*/
		String[] scrambleAlg = scramble.guide();
		double time = timer.guide(scrambleAlg);
		System.out.println("Time: " + timeFormat.format(time));
	}
}
