import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        int n = tastatur.nextInt();
        int fakultet = 1;

        for (int i = 1; i <= n; i++) {
            fakultet = fakultet * i;
        }

        System.out.println(n + "! = " + fakultet);
    }
}