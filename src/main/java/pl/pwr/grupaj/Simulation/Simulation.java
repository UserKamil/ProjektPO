package pl.pwr.grupaj.Simulation;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Simulation {
    private static int round = 1;
    private static int maxRound;

    Simulation(int maxRound) {
        this.maxRound = maxRound;
        simjulation();
    }

    // TODO: 26.05.2022 ogarnac jak ustawic pola w klasach pod elementem 
    void simjulation() {

        for (Element i : Map.getList()) {
            for (int j = i.getY() - i.getMoveDistance(); j < i.getY() + i.getMoveDistance(); j++) {
                for (int k = i.getX() - i.getMoveDistance(); k < i.getX() + i.getMoveDistance(); k++) {
                    try {
                        if (Map.getMap()[k][j] != null && (i.getX() != k || i.getY() != k)) {
                            i.action(Map.getMap()[k][j]);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        k = Math.min(Math.max(k, 0), 100) - 1;
                        j = Math.min(Math.max(j, 0), 100);
                    }
                }
            }
        }


    }
}
