package pl.pwr.grupaj.SimulationBuildingBlocks;

public abstract class Element {
    private int x;
    private int y;
    private int moveDistance;

    public int getMoveDistance(){
        return moveDistance;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }



    public abstract void action(Element classtype);
}
