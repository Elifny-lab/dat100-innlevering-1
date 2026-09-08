import java.util.Scanner;

public class TrinnskattO1 {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        double inntekt = tastatur.nextDouble();

        double skatt = 0;

        if (inntekt > 226100) {
            skatt += (Math.min(inntekt, 318300) - 226100) * 0.017;
        }

        if (inntekt > 318300) {
            skatt += (Math.min(inntekt, 725050) - 318300) * 0.040;
        }

        if (inntekt > 725050) {
            skatt += (Math.min(inntekt, 980100) - 725050) * 0.137;
        }

        if (inntekt > 980100) {
            skatt += (Math.min(inntekt, 1467200) - 980100) * 0.168;
        }

        if (inntekt > 1467200) {
            skatt += (inntekt - 1467200) * 0.178;
        }

        System.out.println("Trinnskatten er: " + skatt + " kr");
    }
}
