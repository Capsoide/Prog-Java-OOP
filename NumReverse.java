import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NumReverse{

    public static void reverseMethod(int n){
        int nReverse = 0;
        while(n!=0){
            nReverse = nReverse * 10;
            nReverse = nReverse + n%10;
            n = n/10;
            
        }
        System.out.println("il numero al contrario e'"+nReverse);
    }
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 0;
        
        System.out.print("Inserisci un numero intero (n=>10 o n>=-10): " );
        do{
            try{
                String inputA = console.readLine();
                n = Integer.parseInt(inputA);
                if((n<10)&&(n>-10)){
                    System.out.print("Devi inserire un numero >= a 10 o >=, riprova: ");
                }
            //} catch (NumberFormatException e) {     // Eccezione se l'input inserito non puo' essere convertito in int
                //System.out.println("Devi inserire un intero, riprova... ");
            } catch (IOException e) {               // Eccezione in caso di errore nell'input/output
                System.out.println("Errore di input");
                System.exit(1);   
            }
        }while((n <= 10) && (n >= -10));

        reverseMethod(n);
        

    }
}