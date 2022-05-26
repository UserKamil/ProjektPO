package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Predator extends Animal{
    private int x;
    private int y;
    @Override
    public int getMoveDistance() {
        return 5;
    }
    public Predator(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public void action(Element classtype){
        if(classtype instanceof Herbivore){
            System.out.println("i love disowsky");
        }
    }

    @Override
    void move() {

    }
}
