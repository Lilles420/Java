import java.util.Scanner;

public class Lilles5 {
    public static void main(String[] args){
        kusti();
    }
    public static void kusti(){
        for (int i = 0; i < 3; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sisesta arv: ");
            double arv1 = scan.nextInt();
            System.out.println("Sisesta arv paljuga jagada soovid: ");
            double arv2 = scan.nextInt();
            if (arv1 <= 0 || arv2 <= 0) {
                System.out.println("Arvu ei saa jagada loll");
                System.exit(0); 
            }
            System.out.println("Arvude jagatis on: " + arv1/arv2);
            scan.close();
        }
    }
}