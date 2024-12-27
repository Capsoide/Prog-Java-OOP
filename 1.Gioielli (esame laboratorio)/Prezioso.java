/*Si vuole realizzare un sistema di gestione di gioielli. 
Il sistema prevede una classe astratta Prezioso che descrive un oggetto di valore generico composto da pietre preziose e varie parti di oro. 
La classe Prezioso e' caratterizzata da un intero positivo 'peso' che esprime il peso in grammi del prezioso. 
Specializzare la classe Prezioso con le classi Pietra e Oro. 
La classe Pietra e' caratterizzata dall'intero positivo 'carati' che esprime i numeri di carati della pietra. 
Definire il costruttore di Pietra con eccezione se i parametri sono errati. 
La classe Oro e' caratterizzata da un intero positivo 'carati' compreso tra 8 e 14 indicante il numero di carati dell'oro. 
Definire il costruttore di Oro con eccezione se i parametri sono errati. 
Definire la classe Gioiello e il suo costruttore che accetta un intero indicante il numero massimo di componenti preziosi presenti
nel gioiello. 
Viene prodotta un'eccezione se il parametro e' minore di 1. 
Definire la classe boolean add (Prezioso) che accetta un prezioso (oro o pietra) e produce true se l'aggiunta ha successo, false altrimenti.
Definire il metodo boolean check() che verifica se la somma dei carati delle pietre presenti nel gioiello e' maggiore al peso complessivo del gioiello. 
Definire il metodo int caratiPietre() che produce somma del numero dei carati delle pietre presenti nel gioiello. Non modificare la classe Prezioso.
Non e' consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. 
In particolare, non e' consentito uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.) fornita la classe Test che esegue alcuni test per verificare le 
principali funzionalita' delle classi Prezioso, Oro, Pietra e Gioiello*/

class Prezioso {
    protected int peso;

    public Prezioso(int peso) {
        this.peso = peso;
    }
}

class Pietra extends Prezioso {
    private int carati;

    public Pietra(int peso, int carati) {
        super(peso);
        if (carati <= 0) {
            throw new IllegalArgumentException("I carati devono essere positivi");
        }
        this.carati = carati;
    }

    public int getCarati() {
        return carati;
    }
}

class Oro extends Prezioso {
    private int carati;

    public Oro(int peso, int carati) {
        super(peso);
        if (carati < 8 || carati > 14) {
            throw new IllegalArgumentException("I carati dell'oro devono essere tra 8 e 14");
        }
        this.carati = carati;
    }
}

class Gioiello {
    private Prezioso[] componenti;
    private int numComponenti;
    private int caratiPietre; // Contatore carati pietre

    public Gioiello(int maxComponenti) {
        if (maxComponenti < 1) {
            throw new IllegalArgumentException("Il numero massimo di componenti deve essere almeno 1");
        }
        componenti = new Prezioso[maxComponenti];
        numComponenti = 0;
        caratiPietre = 0; // Inizializza il contatore carati pietre
    }

    public boolean add(Prezioso p) {
        if (numComponenti >= componenti.length) {
            return false;
        }
        componenti[numComponenti] = p;
        numComponenti++;

        if (p instanceof Pietra) {
            caratiPietre += ((Pietra) p).getCarati(); // Aggiorna il contatore carati pietre
        }

        return true;
    }

    public boolean check() {
        int pesoGioiello = 0;

        for (int i = 0; i < numComponenti; i++) {
            pesoGioiello += componenti[i].peso;
        }

        return caratiPietre > pesoGioiello; // Utilizza il contatore carati pietre
    }

    public int caratiPietre() {
        return caratiPietre; // Restituisce il contatore carati pietre
    }
}







