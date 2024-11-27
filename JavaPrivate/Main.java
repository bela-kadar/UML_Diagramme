package JavaPrivate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Betrag in € an: "); 
        Double money = scanner.nextDouble();
        convertToCHF(money);
        convertToDollars(money);
        convertToGBP(money);
        convertToRon(money);
        scanner.close();
    }
    public static void convertToDollars(Double eur) {
        System.out.println("Der Betrag in $ ist: " + eur * 1.12);
    }
    public static void convertToRon(Double eur) {
        System.out.println("Der betrag in Ron ist: "+eur * 4.95);
    }
    public static void convertToGBP(Double eur){
        System.out.println("Der Betrag in GBP ist: "+eur *0.84);
    }
    public static void convertToCHF(Double eur){
        System.out.println("Der Betrag in CHF ist: "+eur * 0.95);
    }
}