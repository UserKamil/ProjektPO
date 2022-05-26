package pl.pwr.grupaj.Simulation.Map;

import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Herbivore;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Predator;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Scavenger;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Poacher;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Tourist;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Zoologist;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.Bush;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.Zoo;

import java.util.ArrayList;
import java.util.Random;


public class MapInitialization {


    private double mapFilling = (Math.pow(Map.getMapDimensions(), 2) * 0.7);

    // TODO: 25.05.2022 jak znajdziemy lepszy pomysł to zmienić 8 ifów


    public MapInitialization() {
        initialization();
    }
    Random random = new Random();
    ArrayList<Element> list = new ArrayList<>();
    Element[][] map = new Element[Map.getMapDimensions()][Map.getMapDimensions()];
    public void initialization() {
        for (int i = 0; i < Math.floor(mapFilling); i++) {
            int x = random.nextInt(Map.getMapDimensions());
            int y = random.nextInt(Map.getMapDimensions());
            int chance = random.nextInt(8);

            if (map[x][y] != null) {
                i--;
                continue;
            }
            if (chance == 0) {
                map[x][y] = new Herbivore(x, y);
            }
            if (chance == 1) {
                map[x][y] = new Predator(x, y);
            }
            if (chance == 2) {
                map[x][y] = new Scavenger(x, y);
            }
            if (chance == 3) {
                map[x][y] = new Poacher(x, y);
            }
            if (chance == 4) {
                map[x][y] = new Tourist(x, y);
            }
            if (chance == 5) {
                map[x][y] = new Zoologist(x, y);
            }
            if (chance == 6) {
                map[x][y] = new Bush(x, y);
            }
            if (chance == 7) {
                map[x][y] = new Zoo(x, y);
            }
            list.add(map[x][y]);
        }
    }

    public ArrayList<Element> getlist() {
        return list;
    }
    public Element[][] getMap(){
        return map;
    }


}
