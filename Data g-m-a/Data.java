public class Data{
    private  int giorno;
    private  int mese;
    private  int anno;

    public void setGiorno(int g){
        if((g > 0)&&(g<=31)){
            giorno = g;
        }else{
            System.out.println("Giorno non valido, controlla il setGiorno");
        }
    }

    public int getGiorno(){
        return giorno;
    }

    public void setMese(int m){
        if((m > 0)&&(m<=12)){
            mese = m;
        }else{
            System.out.println("Mese non valido, controlla il setMese");
        }
    }

    public int getMese(){
        return mese;
    }

    public void setAnno(int a){
        if((a >= 0)&&(a<=2100)){
            anno = a;
        }else{
            System.out.println("Anno non valido, controlla il setAnno");
        }
    }

    public int getAnno(){
        return anno;
    }
}