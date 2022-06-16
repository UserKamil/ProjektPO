package pl.pwr.grupaj.building.blocks.animals;

import pl.pwr.grupaj.building.blocks.Element;

public class Herbivore extends Element {
    private static final int HERBIVORE_MOVE_DISTANCE = 1;

    public Herbivore(int x, int y) {
        super(x, y, HERBIVORE_MOVE_DISTANCE);
    }
}
