/*Definire una classe Planet Con attributi name di tipo string, mass e distance di tipo double.
Definire una classe SolarSystem che memorizzi oggetti di tipo Planet in ordine crescente di distanza dalla stella. 
Il costruttore di SolarSystem ha un argomento di tipo int che indica il numero massimo di pianeti che possono appartenere al sistema solare. 
Il costruttore genera un'eccezione di runtime se l'argomento e' negativo.

Define metodo boolean New (Planet p) che aggiunge il pianeta p al sistema solare, se p e' nullo o e' stata raggiunta la dimensione massima dei pianeti 
oppure p e' minore degli altri pianeti, il metodo restituisce false altrimenti true;
int getNumber() che restituisce il numero corrente di pianeti che appartengono al pianeta solare del sistema;

getplanet(int n) che restituisce l'oggetto pianeta alla posizione n, dove 0 e' la posizione vicino alla stella;

planet getmaxplanet() che restituisce il pianeta con la massa maggiore o nullo se non c ci sono pianeti nel sistema solare;
Se ci sono piu' pianeti con la stessa massa massima, il metodo restituisce quello piu' vicino alla stella. 

L'uso di classi della libreria standard Java e' proibito tranne String o Exception. 
_____________________________________________________________________________________________________________________________________________________________________________________ */

//Definisco una classe Planet Con attributi name di tipo string, mass e distance di tipo double
public class Planet{
    private String name;
    private double mass;
    private double distance;

    public Planet(String name, double mass, double distance){
        this.name = name;
        this.mass = mass;
        this.distance = distance;
    }

    public double getMass(){
        return mass;
    }

    public double getDistance(){
        return distance;
    }

    public String getName(){
        return name;
    }

}



