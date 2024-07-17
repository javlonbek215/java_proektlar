import java.util.Random;
import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0, k, count = 0;

        Random rnd = new Random();

        k = rnd.nextInt(100) + 1;

        while (n != k) {
            n = in.nextInt();

            count++;

            if (n == k) {
                System.out.println("Tabriklaymiz, siz yutdingiz");
            } else if (n > k) {
                System.out.println("Katta son kiritdingiz");
            } else {
                System.out.println("Kichik son kiritdingiz");
            }
        }
        System.out.println("Urinishlar soni = " + count);
    }
}
