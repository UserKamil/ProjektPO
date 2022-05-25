package pl.pwr.grupaj.Simulation;

import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Herbivore;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Predator;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Scavenger;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Poacher;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Tourist;
import pl.pwr.grupaj.SimulationBuildingBlocks.Human.Zoologist;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.Bush;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.Zoo;

import java.util.Random;


public class MapInitialization {

    // FIXME: 25.05.2022 nie dziala zmienna mapfilling nie przypisuje wartosci
    private double mapFilling = (Map.getMapDimensions() * Map.getMapDimensions() * 0.7);

    // TODO: 25.05.2022 jak znajdziemy lepszy pomysl to zmienic 8 ifow 
    // TODO: 25.05.2022 zrobic dodatkowa tablice na same obiekty bez pustych pol 

    public void initialization() {
        Random random = new Random();
        for (int i = 0; i < Math.floor(mapFilling); i++) {
            int x = random.nextInt(Map.getMapDimensions());
            int y = random.nextInt(Map.getMapDimensions());
            int chance = random.nextInt(8);

            if (Map.getMap()[x][y] != null) {
                continue;
            }

            if (chance == 0) {
                Map.getMap()[x][y] = new Herbivore(x, y);
            }
            if (chance == 1) {
                Map.getMap()[x][y] = new Predator(x, y);
            }
            if (chance == 2) {
                Map.getMap()[x][y] = new Scavenger(x, y);
            }
            if (chance == 3) {
                Map.getMap()[x][y] = new Poacher(x, y);
            }
            if (chance == 4) {
                Map.getMap()[x][y] = new Tourist(x, y);
            }
            if (chance == 5) {
                Map.getMap()[x][y] = new Zoologist(x, y);
            }
            if (chance == 6) {
                Map.getMap()[x][y] = new Bush(x, y);
            }
            if (chance == 7) {
                Map.getMap()[x][y] = new Zoo(x, y);
            }
        }
    }


}
