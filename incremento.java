public class incremento{
    public static void main(String[] args) {
        int x = 1; 
        int y = 5;
        System.out.println(x + ", " + y); 
        x ++; 
        y --; 
        System.out.println((x++) + " , " +y); 
        System.out.println(( ++x) + ", " + y); 
        System.out.println(x + ", " + (y --)); 
        System.out.println(x + ", " + ( --y)); 
        ++x; 	                    
        --y;                                 
        System.out.println(x + ", " + y);   
    }  
}