package CoronaRestaurantApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Methodes {

    public static Date datumInvoeren(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Op welke datum wilt u reserveren? formaat: dd-mm-jjjj");

        String date = scanner.next();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=null;
        try {
            date2 = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);

        return date2;
    }

    // Methode om gebruiker naar short te vragen
    static short vraagShort(String vraag) { return vraagShort(vraag, false); }
    static short vraagShort(String vraag, boolean posCheck) {
        int inputInt = 0;
        boolean teGroot = true;
        boolean teKlein = true;
        while (teGroot | teKlein) {
            inputInt = vraagInt(vraag, posCheck);
            teGroot = inputInt > Short.MAX_VALUE;
            teKlein = inputInt < Short.MIN_VALUE;
        }
        return (short) inputInt;
    }

    // Methode om gebruiker naar int te vragen
    static int vraagInt(String vraag) { return vraagInt(vraag, false); }
    static int vraagInt(String vraag, boolean posCheck) {
        // Variabelen
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        boolean isGeaccepteerd;

        // Blijf vragen tot input een integer is
        do {
            try {
                System.out.println(vraag);
                inputInt = input.nextInt();

                // Controleer eventueel of de int positief is
                isGeaccepteerd = !posCheck || inputInt > 0;

            } catch (InputMismatchException ime) {
                isGeaccepteerd = false;
                input.next();
            }
        } while (!isGeaccepteerd);
        return inputInt;
    }

    // Methode om gebruiker naar char te vragen
    static char vraagChar(String vraag) {
        // Variabelen
        String inputChar;

        // Blijf vragen tot input een char is
        do {
            inputChar = vraagString(vraag);
        } while (inputChar.length() > 1);

        return inputChar.charAt(0);
    }

    // Methode om gebruiker naar string te vragen
    static String vraagString(String vraag) { return vraagString(vraag, new String[0]); }
    static String vraagString(String vraag, String[] mogelijkeAntwoorden) {
        // Variabelen
        Scanner input = new Scanner(System.in);
        String inputString;
        boolean inMogelijkeAntwoorden;

        // Blijf vragen totdat input iets bevat
        do {
            System.out.println(vraag);
            inputString = input.next();

            // Controleer eventueel of de String voorkomt in het opgegeven array
            boolean allesMogelijk = mogelijkeAntwoorden.length == 0;
            inMogelijkeAntwoorden = allesMogelijk || Arrays.asList(mogelijkeAntwoorden).contains(inputString);
        } while (inputString.isEmpty() || !inMogelijkeAntwoorden);

        return inputString;
    }

}
