import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EccezioneArray{
    public static void main(String[] args) {
        int a[];
        int n = 0;
        int i = 0;
        do{
            System.out.print("Inserisci la grandezza dell'array: ");
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            try{
                String inputA = console.readLine();
                n = Integer.parseInt(inputA);
            }catch (IOException e) {               // Eccezione in caso di errore nell'input/output
                System.out.println("Errore di input");
                System.exit(1);   
            }

            a = new int[n];
        
            for(i = 0; i < n; i++){
                System.out.print("Elemento " + (i) + ": ");
                try{
                    String inputB = console.readLine();
                    a[i] = Integer.parseInt(inputB);
                }catch (IOException e) {               // Eccezione in caso di errore nell'input/output
                    System.out.println("Errore di input");
                    System.exit(1);   
                }
            }

            System.out.println("Gli elementi inseriti nell'array sono:");
            for (i = 0; i < n; i++) {
                System.out.println(" " + i + ": " + a[i]);
            }

            try{
                System.out.println("L'elemento nell'indice 8 e': " +a[8]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Il tuo array e' troppo piccolo per stampare l'elemento 8, reinserisci la grandezza dell'array: ");
            }
        }while(n<9);
    }
}
