package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Predator extends Animal{


    public Predator(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public int getMoveDistance() {
        return 5;
    }

    @Override
    public void action(Element classtype){
        //if(classtype instanceof Herbivore){
            System.out.println("i love disowsky");
        //}
    }

    @Override
    void move() {

    }
}
