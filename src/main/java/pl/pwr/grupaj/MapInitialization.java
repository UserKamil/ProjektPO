package pl.pwr.grupaj;

import pl.pwr.grupaj.Animals.Herbivore;
import pl.pwr.grupaj.Animals.Predator;
import pl.pwr.grupaj.Animals.Scavenger;
import pl.pwr.grupaj.Human.Poacher;
import pl.pwr.grupaj.Human.Tourist;
import pl.pwr.grupaj.Human.Zoologist;

import java.util.Random;


public class MapInitialization {
    MapInitialization(int mapDimensions) {
        this.mapDimensions = mapDimensions;
        mapFilling = mapDimensions * mapDimensions * 0.7;
        initialization();
    }

    private final int mapDimensions;
    private double mapFilling;

    //jak znajdziemy lepszy pomysl to zmienic 8 ifow

    public void initialization() {
        Random random = new Random();
        for (int i = 0; i < (int) mapFilling; i++) {
            int x=random.nextInt(mapDimensions);
            int y=random.nextInt(mapDimensions);


            if ((int) (0 * mapFilling) > i && (int) (1/8 * mapFilling) <= i) {
                Map.map[x][y]=new Herbivore(x,y);
            }
            if ((int) (1/8 * mapFilling) > i && (int) (2/8 * mapFilling) <= i) {
                Map.map[x][y]=new Predator(x,y);
            }
            if ((int) (2/8* mapFilling) > i && (int) (3/8 * mapFilling) <= i) {
                Map.map[x][y]=new Scavenger(x,y);
            }
            if ((int) (3/8 * mapFilling) > i && (int) (4/8 * mapFilling) <= i) {
                Map.map[x][y]=new Poacher(x,y);
            }
            if ((int) (4/8 * mapFilling) > i && (int) (5/8 * mapFilling) <= i) {
                Map.map[x][y]=new Tourist(x,y);
            }
            if ((int) (5/8 * mapFilling) > i && (int) (6/8 * mapFilling) <= i) {
                Map.map[x][y]=new Zoologist(x,y);
            }
            if ((int) (6/8 * mapFilling) > i && (int) (7/8 * mapFilling) <= i) {
                Map.map[x][y]=new Bush(x,y);
            }
            if ((int) (7/8 * mapFilling) > i && (int) (8/8 * mapFilling) <= i) {
                Map.map[x][y]=new Zoo(x,y);
            }
        }
    }


}
