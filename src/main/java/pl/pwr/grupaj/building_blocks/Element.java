package pl.pwr.grupaj.building_blocks;

public abstract class Element {
    int x;
    int moveDistance;
    int y;

    public Element(int x, int y, int moveDistance) {
        this.x = x;
        this.y = y;
        this.moveDistance = moveDistance;
    }

    public int getMoveDistance() {
        return moveDistance;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
