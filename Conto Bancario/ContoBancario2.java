public class ContoBancario2{
    private String denaro = "1  euro, stai a secco frate";
    private int codice = 4321;
    private int codiceInserito;

    public void setCodiceInserito(int cod) {
        codiceInserito = cod;
    }

    public int getCodiceInserito(){
        return codiceInserito;
    }

    public String getDenaro(){
        if(codiceInserito == codice){
            return denaro;
        }else{
            return "Codice errato!!";
        }
    }
}