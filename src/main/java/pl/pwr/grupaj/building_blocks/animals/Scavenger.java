package pl.pwr.grupaj.building_blocks.animals;

import pl.pwr.grupaj.building_blocks.Element;

public class Scavenger extends Element {
    private static final int SCAVENGER_MOVE_DISTANCE = 1;

    public Scavenger(int x, int y) {
        super(x, y, SCAVENGER_MOVE_DISTANCE);
    }
}
