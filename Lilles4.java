import java.util.Scanner; 

public class Lilles4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kirjuta lause");
        String Eesnimi= scan.nextLine();
        System.out.println(Eesnimi.toUpperCase());
        System.out.println(Eesnimi.length());
        String[] sonad = Eesnimi.split(" ");
        System.out.printf("Esimene lause oli '%s'", sonad[0]);
        scan.close();

    }
}
