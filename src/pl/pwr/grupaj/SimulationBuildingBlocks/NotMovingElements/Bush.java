package pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Bush extends Element {


    public Bush(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public int getMoveDistance() {
        return 0;
    }

    @Override
    public void action(Element NeighbourClass){
        //if(NeighbourClass instanceof Bush){
    }

}
