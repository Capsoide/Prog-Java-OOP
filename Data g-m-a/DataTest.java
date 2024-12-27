public class DataTest{
    public static void main(String[] args) {
        Data d = new Data();
        d.setGiorno(15);
        d.setMese(12);
        d.setAnno(2002);
        System.out.print("La data e': "+d.getGiorno()+"/"+d.getMese()+"/"+d.getAnno());
    }
}