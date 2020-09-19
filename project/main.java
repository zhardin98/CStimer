import java.util.*;
import java.text.*;
import java.io.*;
public class main{
	public static DecimalFormat timeFormat = new DecimalFormat("#.##");
	public static void main(String[] args) throws IOException{
		String[] scrambleAlg = scramble.guide();
		double time = timer.guide(scrambleAlg);
		System.out.println("Time: " + timeFormat.format(time));
	}
}
