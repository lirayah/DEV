package CM1B;

import java.lang.Math;
import java.util.Random;

public class MainAleatoire {
    public static void main(String[] args) {
        double deMath;
        deMath=Math.random();
        Random deRandom=new Random();
        System.out.println("random propose : " + deMath);
        System.out.println("nextDouble propose : " + deRandom.nextDouble());
    }
}
