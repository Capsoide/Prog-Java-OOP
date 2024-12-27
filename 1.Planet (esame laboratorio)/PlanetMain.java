public class PlanetMain {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(9); // Crea un sistema solare con massimo 9 pianeti

        Planet earth = new Planet("Terra", 999.01, 561.65);
        Planet mars = new Planet("Marte", 999.01, 560.65);
        Planet venus = new Planet("Venere", 98.9, 101.88765);

        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(venus);

        int numPlanets = solarSystem.getNumber();
        System.out.println("Numero di pianeti nel sistema solare: " + numPlanets);

        Planet maxMassPlanet = solarSystem.getmaxplanet();
        if (maxMassPlanet != null) {
            System.out.println("Pianeta con massa maggiore: " + maxMassPlanet.getName());
        } else {
            System.out.println("Nessun pianeta nel sistema solare.");
        }
    }
}