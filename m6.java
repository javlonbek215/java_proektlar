public class m6 {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.printf("%2d * %2d = %2d   ", i, j, i * j);
            }
            System.out.println();
        }

        System.out.println();


        for (int j = 1; j <= 10; j++) {
            for (int i = 6; i <= 10; i++) {
                System.out.printf("%2d * %2d = %2d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
