//Definisco una classe SolarSystem che memorizzi oggetti di tipo Planet in ordine crescente di distanza dalla stella.
public class SolarSystem{
    private Planet[] planets;
    private int currentPlanets;

    public SolarSystem(int maxPlanets){
        if(maxPlanets < 0){
            throw new IllegalArgumentException("Il numero massimo di pianeti non puo' essere negativo");
        }
        planets = new Planet[maxPlanets];
        currentPlanets = 0;
    }
    //Define metodo boolean New (Planet p) che aggiunge il pianeta p al sistema solare, se p e' nullo o e' stata raggiunta la dimensione massima dei pianeti 
    //oppure p e' minore degli altri pianeti, il metodo restituisce false altrimenti true;
    public boolean addPlanet(Planet p){
        if((p == null)||(currentPlanets >= planets.length)){
            return false;
        }
        if (currentPlanets == 0 || p.getDistance() < planets[currentPlanets - 1].getDistance()) {
            planets[currentPlanets] = p;
            currentPlanets++;
            return true;
        }
        
        return false;
    }

    public Planet getPlanet(int n) {
        if (n >= 0 && n < currentPlanets) {
            return planets[n];
        }
        return null;
    }

    public int getNumber() {
        return currentPlanets;
    }

    // Metodo per ottenere il pianeta con la massa maggiore
    public Planet getmaxplanet() {
        if (currentPlanets == 0) {
            return null;
        }

        Planet maxPlanet = planets[0];
        for (int i = 1; i < currentPlanets; i++) {
            if (planets[i].getMass() > maxPlanet.getMass() ||
                (planets[i].getMass() == maxPlanet.getMass() && planets[i].getDistance() < maxPlanet.getDistance())) {
                maxPlanet = planets[i];
            }
        }
        
        return maxPlanet;
    }
}