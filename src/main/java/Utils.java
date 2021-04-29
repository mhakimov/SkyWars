import java.util.Random;

public class Utils {
	public static int getRandomInteger(int minimum, int maximum) {
		 Random random = new Random();
		    return random.nextInt(maximum - minimum) + minimum;
	}
}
