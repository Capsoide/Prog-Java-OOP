public class Principale1{

    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(6,4);
        Quadrato q = new Quadrato(3);
        System.out.println("Area del rettangolo: " + r.area());
        System.out.println("Area del quadrato: " + q.area());
    }
}