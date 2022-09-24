public class ZinsDemo {

    //Zinsberechnung Schritt 1
    public static void main(String[] args) {
        int kontostand = 1000;
        double zinsen = 10;

        //Output V1
        System.out.println(zinsen + "% von " + kontostand + " sind " + ((kontostand * zinsen) / 100));

        //Output V2
        zinsen = 5;
        System.out.println(zinsen + "% von " + kontostand + " sind " + zinsrechnung(kontostand, zinsen));

        zinsen = 2.5;
        kontostand = 1500;
        System.out.println(zinsen + "% von " + kontostand + " sind " + zinsrechnung(kontostand, zinsen));

        zinsen = 1.25;
        System.out.println(zinsen + "% von " + kontostand + " sind " + zinsrechnung(kontostand, zinsen));

    }

    //Zinsberechnung Schritt 2

    public static double zinsrechnung(int konto, double zinsen) {
        double kontoneu = ((konto * zinsen) / 100);
        return kontoneu;
    }
}
