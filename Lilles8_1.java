import java.util.Scanner;

public class Lilles8_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valige tegevus: \n1. Arvuta rööpküliku pindala \n2. Arvuta ristküliku pindala \n3. Arvuta kolmnurga pindala \n4. Arvuta silindri ruumala \n5. Arvuta risttahuka ruumala \n6. Arvuta koonuse ruumala \nTeie valik: ");
        String valik = input.next();

        double tulemus;
        switch (Integer.parseInt(valik)) {
            case 1:
                tulemus = KujunditeArvutused.arvutaRoopkylikuPindala(input);
                System.out.printf("Rööpküliku pindala on %.2f", tulemus);
                break;
            case 2:
                tulemus = KujunditeArvutused.arvutaRistkylikuPindala(input);
                System.out.printf("Ristküliku pindala on %.2f", tulemus);
                break;
            case 3:
                tulemus = KujunditeArvutused.arvutaKolmnurgaPindala(input);
                System.out.printf("Kolmnurga pindala on %.2f", tulemus);
                break;
            case 4:
                tulemus = KujunditeArvutused.arvutaSilindriRuumala(input);
                System.out.printf("Silindri ruumala on %.2f", tulemus);
                break;
            case 5:
                tulemus = KujunditeArvutused.arvutaRisttahukaRuumala(input);
                System.out.printf("Risttahuka ruumala on %.2f", tulemus);
                break;
            case 6:
                tulemus = KujunditeArvutused.arvutaKoonuseRuumala(input);
                System.out.printf("Koonuse ruumala on %.2f", tulemus);
                break;
            default:
                System.out.print("Vigane valik!");
                break;
        }

        input.close();
    }
}

class KujunditeArvutused {

    static double arvutaRoopkylikuPindala(Scanner input) {
        System.out.print("Sisestage rööpküliku laius: ");
        double laius = input.nextDouble();
        System.out.print("Sisestage rööpküliku kõrgus: ");
        double korgus = input.nextDouble();
        return laius * korgus;
    }

    static double arvutaRistkylikuPindala(Scanner input) {
        System.out.print("Sisestage ristküliku pikkus: ");
        double pikkus = input.nextDouble();
        System.out.print("Sisestage ristküliku laius: ");
        double laius = input.nextDouble();
        return pikkus * laius;
    }

    static double arvutaKolmnurgaPindala(Scanner input) {
        System.out.print("Sisestage kolmnurga alus: ");
        double alus = input.nextDouble();
        System.out.print("Sisestage kolmnurga kõrgus: ");
        double korgus = input.nextDouble();
        return 0.5 * alus * korgus;
    }

    static double arvutaSilindriRuumala(Scanner input) {
        System.out.print("Sisestage silindri raadius: ");
        double raadius = input.nextDouble();
        System.out.print("Sisestage silindri kõrgus: ");
        double korgus = input.nextDouble();
        return Math.PI * Math.pow(raadius, 2) * korgus;
    }

    static double arvutaRisttahukaRuumala(Scanner input) {
        System.out.print("Sisestage risttahuka pikkus: ");
        double pikkus = input.nextDouble();
        System.out.print("Sisestage risttahuka laius: ");
        double laius = input.nextDouble();
        System.out.print("Sisestage risttahuka kõrgus: ");
        double korgus = input.nextDouble();
        return pikkus * laius * korgus;
    }

    static double arvutaKoonuseRuumala(Scanner input) {
        System.out.print("Sisestage koonuse raadius: ");
        double raadius = input.nextDouble();
        System.out.print("Sisestage koonuse kõrgus: ");
        double korgus = input.nextDouble();
        return (1.0 / 3) * Math.PI * Math.pow(raadius, 2) * korgus;
    }
}
