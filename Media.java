import java.util.Scanner;

/*Questo programma legge una sequenza di numeri positivi interi dati in input dall'utente e stampa la media di questi interi.
 * L'tente deve inserire i numeri uno alla volta, per stoppare l'inserimento deve inserire 0.
 */
public class Media{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber;    //numero preso in input
        int sum = 0;        //somma dei numeri
        int count = 0;      //contatore
        int average;        //risultato media
        int n;              //numeri da calcolare

        System.out.print("Inserisci n da calcolare : ");
        n = scanner.nextInt();

        for(count = 1; count <= n; count ++){
            System.out.println("Inserisci il numero " +count+" per calcolare la media");
            inputNumber = scanner.nextInt();
                if (inputNumber == 0) {
                    break;
                } 
            sum = inputNumber + sum;
        }

        if (count > 0) {  // Verifica che almeno un numero sia stato inserito
            average = sum / n;
            System.out.println("La media e': "+average);
        }else{
            System.out.println("Nessun numero inserito");
        }
            scanner.close();
    }
}