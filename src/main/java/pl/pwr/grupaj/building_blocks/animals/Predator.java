package pl.pwr.grupaj.building_blocks.animals;

import pl.pwr.grupaj.building_blocks.Element;

public class Predator extends Element {
    private static final int PREDATOR_MOVE_DISTANCE = 1;

    public Predator(int x, int y) {
        super(x, y, PREDATOR_MOVE_DISTANCE);
    }
}
