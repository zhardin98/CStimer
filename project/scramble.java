import java.util.Random;
import java.util.Arrays;
public class scramble{
	public static String[] guide(){
		int[] sideNumber = buildArray();
		String[] finalScramble = side(sideNumber);
		return finalScramble;		
	}
	public static int[] buildArray(){
		int randomRange = 6;
		int[] beginArray = new int[20];
		beginArray[0] = getRandom(randomRange);
		for(int i = 1; i < 20; i++){
			boolean test = false;
			int newNumber = 0;
			do{
				newNumber = getRandom(randomRange);
			}while(!test(beginArray, i, newNumber));
			beginArray[i] = newNumber;
		}
		return beginArray;
	}
	public static String[] side(int[] sideNumber){
		String[] finalScramble = new String[20];
		for(int i = 0; i < 20; i++){
			String letter = "";
			switch(sideNumber[i]){
				case 1:
					letter = "F";
					break;
				case 2:
					letter = "B";
					break;
				case 3:
					letter = "R";
					break;
				case 4:
					letter = "L";
					break;
				case 5:
					letter = "U";
					break;
				case 6:
					letter = "D";
					break;
			}
			String notationType = getType();
			String move = letter + notationType;
			finalScramble[i] = move;
			
		}
		return finalScramble;
	}
	public static String getType(){
		int randomRange = 3;
		String type = "";
		switch(getRandom(randomRange)){
			case 1:
				type = "";
				break;
			case 2:
				type = "'";
				break;
			case 3:
				type = "2";
				break;
		}
		return type;
	}
	public static int getRandom(int randomRange){
		Random rand = new Random();
		int randomNumber = (rand.nextInt(randomRange) + 1);
		return randomNumber;
	}
	public static boolean test(int[] beginArray, int i, int newNumber){
		if(beginArray[i - 1] != newNumber){
			return true;
		}else{
			return false;
		}
	}
}
