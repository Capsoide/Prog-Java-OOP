public class TestContoBancario{
    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancario();
        ContoBancario2 c2 = new ContoBancario2();
        c2.setCodiceInserito(4321);
        
        System.out.println("Conto Bancario 1: "+c1.getDenaro(1234));
        System.out.println("Conto Bancario 2: "+c2.getDenaro());

    }
}