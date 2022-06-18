package pl.pwr.grupaj.simulation;


import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        SimulationArguments arguments = parse(args);

        SimulationMapCreator simulationMapCreator = new SimulationMapCreator(arguments.getMapDimension());

        SimulationMap simulationMap = simulationMapCreator.create();

        Simulation simulation = new Simulation(arguments.getMaxRounds(), simulationMap);

        SimulationStats stats = simulation.run();

        printStats(stats);
    }

    private static void printStats(SimulationStats stats) {

    }

    static SimulationArguments parse(String[] args) {
        return new SimulationArguments(parseInt(args[0]), parseInt(args[1]));
    }

    private static class SimulationArguments {

        private final int mapDimension;
        private final int maxRounds;

        private SimulationArguments(int mapDimension, int maxRounds) {
            this.mapDimension = mapDimension;
            this.maxRounds = maxRounds;
        }

        public int getMapDimension() {
            return mapDimension;
        }

        public int getMaxRounds() {
            return maxRounds;
        }
    }
}
