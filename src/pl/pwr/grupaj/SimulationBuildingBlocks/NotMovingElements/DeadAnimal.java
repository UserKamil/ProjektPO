package pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class DeadAnimal extends Element {

    public DeadAnimal(int x, int y, int moveDistance) {
        super(x, y, moveDistance);

    }

    @Override
    public void action(Element classtype) {
        return;
    }
}
