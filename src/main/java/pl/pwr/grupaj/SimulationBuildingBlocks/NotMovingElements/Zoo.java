package pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Zoo extends Element {
    private int x;
    private int y;
    @Override
    public int getMoveDistance() {
        return 0;
    }

    public Zoo(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public void action(Element classtype){

    }
}
