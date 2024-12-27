//dichiara due variabili intere inizializzare e crea un metodo che scambi tra di loro il valore contenuto

/*public class VarSwap{
    private static int a, b;
    
    public static void main(String[] args) {
        a = 15;
        b = 30;
        System.out.println("I valori di a e b sono rispettivamente: "+a+" "+b);
        swap();
        System.out.println("Sto switchando i due numeri...\nI valori di a e b ora sono rispettivamente: "+a+" "+b); 
    }

    private static void swap(){
        int f = a;
        a = b;
        b = f;
    }
} */

//stesso programma con array

public class VarSwap{
    
    public static void main (String[] args){
        int[] a = {15, 30};
        System.out.println("I valori di a e b sono rispettivamente: "+a[0]+" "+a[1]);
        swap(a);
        System.out.println("Sto switchando i due numeri...\nI valori di a e b ora sono rispettivamente: "+a[0]+" "+a[1]); 
    }

    public static void swap(int[] a){
        int f = a[0];
        a[0] = a[1];
        a[1] = f;
    }
}


'999'