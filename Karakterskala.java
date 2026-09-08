import java.util.Scanner;

public class Karakterskala {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.print("Skriv inn poengsum for student " + i + ": ");
            int poeng = tastatur.nextInt();

            while (poeng < 0 || poeng > 100) {
                System.out.println("Ugyldig poengsum.");
                System.out.print("Skriv inn poengsummen på nytt: ");
                poeng = tastatur.nextInt();
            }

            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }
    }
}