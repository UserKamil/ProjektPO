package pl.pwr.grupaj.simulation;
import pl.pwr.grupaj.simulation.Simulation;

public class Main {

    public static void main(String[] args) {
        Map.setMapDimensions(Integer.parseInt(args[0]));
        Simulation.setMaxRounds(Integer.parseInt(args[1]));
        new Simulation();
    }
}
