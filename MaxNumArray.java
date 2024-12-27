import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MaxNumArray{

    public static void main (String args[]){
        double[] a = inserimentoArray();
        printMax(a);
        printMax(new double[] {6.9, 98.2, 100.5});
    }

    public static double[] inserimentoArray(){
        double[] a;
        int n = 0;
        int i = 0;
        
        System.out.print("Inserisci la grandezza dell'array: ");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try{
            String inputA = console.readLine();
            n = Integer.parseInt(inputA);
        }catch (IOException e) {               // Eccezione in caso di errore nell'input/output
            System.out.println("Errore di input");
            System.exit(1);   
        }
    
        a = new double[n]; // alloca memoria per un nuovo array di numeri in virgola mobile di tipo double con una dimensione specificata n

        for(i = 0; i<a.length; i++){
            System.out.print("Elemento " + (i) + ": ");
            try{
                String inputB = console.readLine();
                a[i] = Double.parseDouble(inputB);
            }catch (IOException e) {               // Eccezione in caso di errore nell'input/output
                System.out.println("Errore di input");
                System.exit(1);   
            }
        }
        return a;
    }

    public static void printMax(double[] a){
        int i = 0;
        double max = a[0];
         
        for(i = 0; i<a.length; i++){
            if(a[i]> a[0]){
                max = a[i];
            }
        }
        System.out.println("Il numero piu' alto nell'array e': "+max);
    }
}