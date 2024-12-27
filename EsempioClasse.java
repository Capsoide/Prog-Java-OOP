/*public class EsempioClasse {
    int stampa_e_incrementa(int i) {
        System.out.println("I = " + i);
        i++;
        return i;
    }

    static boolean ordinato(int[] a) {
        for (int i = 0; i < a.length - 1 ; i ++)
        if (a[i] > a[i + 1]) return false;
        return true;
    }

    static boolean ripetizioni(int[] a) {
        for (int i = 0; i < a.length; i ++)
        for (int j = i + 1; j < a.length; j ++)
        if (a[i] == a[j]) return true;
        return false;
        }*/
        
        
    public class EsempioClasse{
        public static void main(String[] args) {
        /*  int i = 0;
            EsempioClasse esempio = new EsempioClasse();
            i = esempio.stampa_e_incrementa(i);
            i = esempio.stampa_e_incrementa(i);
            i = esempio.stampa_e_incrementa(i);
            int[] a = { 2, 3, 5, 7 };
            System.out.println("Ordinato = " + ordinato(a));
            int[] b = { 2, 5, 7, 7 };
            System.out.println("Ordinato = " + ordinato(b));
            System.out.println("Ripetizioni = " + ripetizioni(a));
            System.out.println("Ripetizioni = " + ripetizioni(b));*/

            //dichiarazione dell'array tridimensionale

            int [][][] a = 
            {
                { //primo livello di array (indice 0)
                    { 2, 3, 5, 7 }, //secondo livello di array (indice 0)
                    { 11, 13, 17 }, //secondo livello di array (indice 1)
                    { 1, 4, 7 },    //secondo livello di array (indice 2)
                },
                { //primo livello di array (indice 1)
                    { 1, 2, 3, 4 },  //secondo livello di array (indice 0)
                    { 15, 16, 17 },  //secondo livello di array (indice 1)
                },
                { //primo livello di array (indice 2)
                    {8,9,8,9}, //secondo livello di array (indice 0)
                    {6,7,6,7}, //secondo livello di array (indice 1)
                    {10,11,12,13,14}, //secondo livello di array (indice 2)
                    {20,21,22,23,24}, //secondo livello di array (indice 3)
                }
            };

            System.out.println("A " + a.length+"\n"); // Stampa il numero di elementi nel primo livello di array di "a"

            // Stampa il numero di elementi nel secondo livello di array per ciascun primo livello di array di "a"
            System.out.println("A[0] " + a[0].length);
            System.out.println("A[1] " + a[1].length);
            System.out.println("A[2] " + a[2].length+"\n");

            // Stampa il numero di elementi nel terzo livello di array per il primo secondo livello di array di "a"
            System.out.println("A[0][0] " + a[0][0].length);
            System.out.println("A[0][1] " + a[0][1].length);
            System.out.println("A[0][2] " + a[0][2].length+"\n");

            // Stampa il numero di elementi nel terzo livello di array per il secondo secondo livello di array di "a"
            System.out.println("A[1][0] " + a[1][0].length);
            System.out.println("A[1][1] " + a[1][1].length+"\n");

            // Stampa il numero di elementi nel terzo livello di array per il terzo secondo livello di array di "a"
            System.out.println("A[2][0] " + a[2][0].length);
            System.out.println("A[2][1] " + a[2][1].length);
            System.out.println("A[2][2] " + a[2][2].length);
            System.out.println("A[2][3] " + a[2][3].length);
        }
    }
//}






 
 