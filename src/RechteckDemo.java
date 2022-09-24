public class RechteckDemo {
    public static void main(String[] args) {
        int breite = 10;
        int laenge = 10;
        int umfang = (2 * laenge) + (2 * breite);
        int flaeche = laenge * breite;

        System.out.println("Umfang = " + umfang);
        System.out.println("Flaeche = " + flaeche);
    }
}
