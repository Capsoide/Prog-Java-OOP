//Usare le eccezioni per fare i controlli di input per le variabili: intere, double e String
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eccezioni1 {
    public static void main(String[] a) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserisci un numero intero: ");

        boolean f = true;
        int datoInt = 0;
        double datoDouble = 0;
        String datoString = "";

        // Loop che continua fino a quando non viene inserito correttamente un numero intero

        do {
            try {
                String inputA = console.readLine(); // Legge l'input dell'utente come stringa
                datoInt = Integer.parseInt(inputA); // Converte la stringa in un numero intero
                f = false;                          // Imposta la variabile booleana a false per uscire dal loop
            } catch (NumberFormatException e) {     // Eccezione se l'input inserito non puo' essere convertito in int
                System.out.println("Devi inserire un intero, riprova... ");
            } catch (IOException e) {               // Eccezione in caso di errore nell'input/output
                System.out.println("Errore di input");
                System.exit(1);                     // Termina il programma con codice di errore
            }
        } while (f);                                // Ripeti il loop finche' f e' true
        
        f = true;   
        System.out.print("Inserisci un numero double: ");

        // Loop che continua fino a quando non viene inserito correttamente un numero double

        do {
            try {
                String inputB = console.readLine();         // Legge l'input dell'utente come stringa
                datoDouble = Double.parseDouble(inputB);    // Converte la stringa in un numero double
                f = false;                                  // Imposta la variabile booleana a false per uscire dal loop
            } catch (NumberFormatException e) {             // Eccezione se l'input inserito non puo' essere convertito in double
                System.out.println("Devi inserire un double, riprova... ");
            } catch (IOException e) {                       // Eccezione in caso di errore nell'input/output
                System.out.println("Errore di input");
                System.exit(1);                             // Termina il programma con codice di errore
            }
        } while (f);                                        // Ripeti il loop finche' f e' true

        f = true;
        System.out.print("Inserisci una stringa: ");

        // Loop che continua fino a quando non viene inserito correttamente una stringa

        do {
            try {
                datoString = console.readLine();
                f = false;
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire una stringa, riprova... ");
            } catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        } while (f);


        System.out.println("\nIl numero intero dato e': " + datoInt +
                            "\nIl numero double dato e': " + datoDouble +
                            "\nLa stringa data e': " + datoString);
    }
}
