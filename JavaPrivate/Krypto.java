package JavaPrivate;

import java.util.Scanner;

public class Krypto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Betrag in Euro an: ");
        Double money = scanner.nextDouble();
        convertToXRP(money);
        convertToXLM(money);
        scanner.close();

    }
    
    public static void convertToXRP(Double eur){
        System.out.println("Der Betrag in XRP ist: "+eur * 1.35);
    }
    public ststaic void convertToXLM (Double eur){
        System.out.println("Der Betrag in XLM ist: "+eur * 0.46)
    }
}
