package pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Zoo extends Element {


    public Zoo(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public int getMoveDistance() {
        return 0;
    }


    @Override
    public void action(Element classtype){
        //if(classtype instanceof Herbivore){
        System.out.println("i love disowsky");
        //}
    }
}
