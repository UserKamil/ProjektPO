package pl.pwr.grupaj.SimulationBuildingBlocks;

public abstract class Element {
    private int x;
    private int y;
    private int moveDistance;

    public int getMoveDistance(){
        return moveDistance;
    }

    public Element(int x,int y,int moveDistance) {
        this.x=x;
        this.y=y;
        this.moveDistance=moveDistance;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }



    public abstract void action(Element classtype);
    public void randomAction(){
        System.out.println("randomAction");
    }

    public Element setX(int x) {
        this.x = x;
        return this;
    }

    public Element setY(int y) {
        this.y = y;
        return this;
    }
}
