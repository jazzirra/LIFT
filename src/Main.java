import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(1,4);
        int s = scanner.nextInt();
        int s1 = scanner.nextInt();
        Lift lift =new Lift(1,200,18);
        lift.toFloor(s,s1,r);

    }
}