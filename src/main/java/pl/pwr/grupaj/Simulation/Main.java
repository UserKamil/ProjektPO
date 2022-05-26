package pl.pwr.grupaj.Simulation;


import pl.pwr.grupaj.Simulation.Map.Map;

public class Main {
    public static void main(String[] args) {
        new Map(Integer.parseInt(args[0]));
        new Simulation(Integer.parseInt(args[1]));

    }
}
