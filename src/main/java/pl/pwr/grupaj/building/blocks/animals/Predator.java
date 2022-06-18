package pl.pwr.grupaj.building.blocks.animals;

import pl.pwr.grupaj.building.blocks.Element;

public class Predator extends Element {
    private static final int PREDATOR_MOVE_DISTANCE = 2;

    public Predator(int x, int y) {
        super(x, y,PREDATOR_MOVE_DISTANCE);
    }
}
