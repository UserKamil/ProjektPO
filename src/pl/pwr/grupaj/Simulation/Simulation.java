package pl.pwr.grupaj.Simulation;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

import java.util.Arrays;

public class Simulation {
    private static int round = 1;
    private static int maxRound;

    Simulation(int maxRound) {
        this.maxRound = maxRound;
        simjulation();
    }

    @Override
    public String toString() {
        return "Simulation{}";
    }

    // TODO: 26.05.2022 ogarnac jak ustawic pola w klasach pod elementem
    void simjulation() {
        /*for (Element i : Map.getList()) {
            boolean actionPerformed=false;
            int j = i.getY() - i.getMoveDistance();
            for (; j < i.getY() + i.getMoveDistance(); j++) {
                int k = i.getX() - i.getMoveDistance();
                for (; k < i.getX() + i.getMoveDistance(); k++) {
                    try {
                        if ((Map.getMap()[k][j] != null) && (i.getX() != k || i.getY() != j)) {
                            i.action(Map.getMap()[k][j]);
                            actionPerformed=true;
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        k = Math.min(Math.max(k, 0), 99) - 1;
                        j = Math.min(Math.max(j, 0), 99);
                    }
                }
                if(actionPerformed)
                    break;
            }
            if(!actionPerformed){
                i.randomAction();
            }
        }*/
        for (int round = 0; round < maxRound; round++) {
            for (Element i:Map.getList()) {
                i.action(i);
            }
            for (Element i:Map.getList()) {
                Map.getMap()[i.getX()][i.getY()]=i;
            }
            //drukowanie mapy na tablicy po skonczonej rundzie
            for (int i = 0; i < Map.getMapDimensions()-1; i++) {
                for (int j = 0; j < Map.getMapDimensions()-1; j++) {
                    try {
                        System.out.print(Map.getMap()[i][j].getClass().getSimpleName()+" ");
                    }
                    catch (NullPointerException e){
                        System.out.print("Empty ");
                    }
                }
                System.out.println("");
            }
        }
    }
}


