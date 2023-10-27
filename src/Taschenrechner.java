import java.util.Scanner;
public class Taschenrechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        boolean weitermachen = true;
         while(weitermachen){
            double zahl1, zahl2, ergebnis;
            char operation;

        System.out.println("\u001B[34mBitte geben Sie die erste Zahl ein: ");
        while(!eingabe.hasNextDouble()) {
            System.out.println("\u001B[31mUngültige Eingabe. Sie haben keine gültige Zahl eingegeben.");
            eingabe.next();
        }
        zahl1=eingabe.nextDouble();

            System.out.println("Bitte geben Sie die  Zahl2 ein: ");
            while(!eingabe.hasNextDouble()){
                System.out.println("\u001B[31mUngültige Eingabe. Sie haben keine gültige Zahl2 eingegeben.");
                eingabe.next();
        }
            zahl2= eingabe.nextDouble();

        System.out.println("\u001B[34mWählen Sie die gewünschte Operation (+, -, *, /): ");
        operation = eingabe.next().charAt(0);


        switch (operation) {
            case '+':
                ergebnis = zahl1 + zahl2;
                System.out.println("Summe: " + ergebnis);
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                System.out.println("Differenz: " + ergebnis);
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                System.out.println("Produkt: " + ergebnis);
                break;
            case '/':
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                    System.out.println("Quotient: " + ergebnis);
                } else {
                    System.out.println("\u001B[31mFehler: Division durch Null!");
                }
                break;
            default:
                System.out.println("Ungültige Operation ausgewählt. Bitte geben Sie +, -, *, oder / ein.");

        }
        System.out.println("\u001B[34mMöchten Sie eine weitere Berechnung durchführen?(Geben Sie 'E' oder 'e' für Ja ein) ");
        System.out.println("\u001B[34moder Beenden mit jeder anderen Taste:");
        char fortsetzenAuswahl = eingabe.next().charAt(0);
        weitermachen = (fortsetzenAuswahl == 'E' || fortsetzenAuswahl == 'e');{
            weitermachen=true;

    }}
    System.out.println("\u001B[34mDer Taschenrechner wird geschlossen.Auf wiedersehen");
    }}
