import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lilles6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbrid = new ArrayList<>();
        Scanner skanner = new Scanner(System.in);
        System.out.println("Sisesta numbrid:");
        while (true) {
            String sisend = skanner.nextLine();
            if (sisend.isEmpty()) {
                break;
            }
            if (onTaisarv(sisend)) {
                try {
                    int number = Integer.parseInt(sisend);
                    numbrid.add(number);
                } catch (NumberFormatException e) {
                    System.err.println("Vigane sisend.");
                }
            } else {
                System.err.println("Sisesta ainult täisarvud.");
            }
        }
        skanner.close();
        int summa = arvutaSumma(numbrid);
        double keskmine = arvutaKeskmine(numbrid);
        System.out.println("Summa: " + summa);
        System.out.println("Keskmine: " + keskmine);
        
        try {
            salvestaAndmedFaili("andmed.txt", numbrid, summa, keskmine);
            System.out.println("Andmed salvestatud.");
        } catch (IOException e) {
            System.err.println("Viga: " + e.getMessage());
        }
    }

    public static boolean onTaisarv(String sisend) {
        return sisend.matches("\\d+");
    }

    public static int arvutaSumma(ArrayList<Integer> numbrid) {
        int summa = 0;
        for (int number : numbrid) {
            summa += number;
        }
        return summa;
    }

    public static double arvutaKeskmine(ArrayList<Integer> numbrid) {
        if (numbrid.isEmpty()) {
            return 0.0;
        }
        int summa = arvutaSumma(numbrid);
        return (double) summa / numbrid.size();
    }

    public static void salvestaAndmedFaili(String failinimi, ArrayList<Integer> numbrid, int summa, double keskmine) throws IOException {
        try (BufferedWriter kirjutaja = new BufferedWriter(new FileWriter(failinimi))) {
            for (int number : numbrid) {
                kirjutaja.write(Integer.toString(number) + " ");
            }
        }
    }
}

