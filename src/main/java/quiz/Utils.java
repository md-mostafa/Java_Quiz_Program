package quiz;

import java.util.HashMap;
import java.util.Random;

public class Utils {
    public static int getRandomNum(int len){
        Random random = new Random();
        return random.nextInt(len);
    }
}
