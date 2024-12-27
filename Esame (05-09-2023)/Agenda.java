public class Agenda {
    private Appuntamento[] appuntamenti;
    private int numeroAppuntamenti;

    public Agenda(int n) {
        if (n < 0) {
            throw new RuntimeException("Numero negativo non valido");
        }
        appuntamenti = new Appuntamento[n];
        numeroAppuntamenti = 0;
    }

    public boolean aggiungi(Appuntamento a) {
        if (a == null || numeroAppuntamenti == appuntamenti.length) {
            return false;
        }
        for (int i = 0; i < numeroAppuntamenti; i++) {
            if (a.getGiorno() == appuntamenti[i].getGiorno() && a.getOra() == appuntamenti[i].getOra()) {
                return false;
            }
            if (a.crono() < appuntamenti[i].crono()) {
                // Spostiamo gli appuntamenti successivi di una posizione per fare spazio a 'a'
                for (int j = numeroAppuntamenti - 1; j >= i; j--) {
                    appuntamenti[j + 1] = appuntamenti[j];
                }
                appuntamenti[i] = a;
                numeroAppuntamenti++;
                return true;
            }
        }
        // 'a' va inserito alla fine dell'array
        appuntamenti[numeroAppuntamenti] = a;
        numeroAppuntamenti++;
        return true;
    }

    public boolean disdetta(int n) {
        if (n < 0 || n >= numeroAppuntamenti) {
            return false;
        }
        for (int i = n; i < numeroAppuntamenti - 1; i++) {
            appuntamenti[i] = appuntamenti[i + 1];
        }
        numeroAppuntamenti--;
        return true;
    }

    public int numeroAppuntamenti() {
        return numeroAppuntamenti;
    }

    public Appuntamento appuntamento(int i) {
        if (i < 0 || i >= numeroAppuntamenti) {
            return null;
        }
        return appuntamenti[i];
    }
}

