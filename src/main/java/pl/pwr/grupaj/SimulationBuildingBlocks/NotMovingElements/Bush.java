package pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Bush extends Element {
    private int x;
    private int y;
    public Bush(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public int getMoveDistance() {
        return 0;
    }

    @Override
    public void action(Element classtype){

    }

}
