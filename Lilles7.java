import java.util.InputMismatchException;
import java.util.Scanner;

public class Lilles7 {
    public static void main(String args[]){
        tehe();
    }

    public static void tehe(){
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta arv: ");
        while(true){
            try{
                a = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Sisesta arv: ");
                scan.nextLine();
            }
        }
        System.out.println("Sisesta teine arv: ");
        while(true){
            try{
                b = scan.nextInt();
                scan.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Sisesta arv: ");
                scan.nextLine();
                
            }
        }
        int t = a + b;
        System.out.println(t);
    } 
}

