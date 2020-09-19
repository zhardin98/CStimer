import java.util.*;
import java.text.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class timer{
	public static DecimalFormat timeFormat = new DecimalFormat("#.##");
	public static double finalTime = 0.0;
	public static double guide(String[] scrambleAlg) throws IOException{
		clearScreen();
		double time = stopWatch(scrambleAlg);
		return time;
	}
	public static double stopWatch(String[] scrambleAlg) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println(Arrays.toString(scrambleAlg));
		input.next();
		Thread t = new Thread(new Runnable(){
			public void run(){
				try{
					for(double i = 0; ; i += 0.01){
						Thread.sleep(10);
						clearScreen();
						System.out.println(Arrays.toString(scrambleAlg) + "\n" + timeFormat.format(i));
						finalTime = i;
					}
				}catch(InterruptedException e){
					System.out.println("ERROR");
				}
			}
		});
		t.start();
		System.in.read();
		t.stop();
		double returnTime = finalTime;
		return returnTime;
	}
	public static void clearScreen(){
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}		
}
