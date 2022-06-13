package pl.pwr.grupaj.building_blocks.animals;

import pl.pwr.grupaj.building_blocks.Element;

public class Herbivore extends Element {
    private static final int getMoveDistance = 1;

    public Herbivore(int x, int y) {
        super(x, y, getMoveDistance);
    }
}
