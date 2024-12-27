public class ContoBancario{
    private String denaro = "500000 di euro";
    private int codice = 1234;
    private int codiceInserito;

    public void setCodiceInserito(int codiceInserito) {
        this.codiceInserito = codiceInserito;
    }

    public String getDenaro(int codiceDaTestare){
        return controllaCodice(codiceDaTestare);
    }

    private String controllaCodice(int codiceDaTestare){
        if(codiceDaTestare == codice){
            return denaro;
        }else{
            return "Codice errato!!";
        }
    }
}