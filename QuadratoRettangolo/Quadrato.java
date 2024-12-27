public class Quadrato extends Rettangolo {
    public Quadrato(float base) {
        super(base, 0);
    }
@Override //eseguo l'override del  metodo della superclasse area
    public float area() {
        return base * base; 
    }
}