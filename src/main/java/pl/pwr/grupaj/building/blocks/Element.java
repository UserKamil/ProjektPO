package pl.pwr.grupaj.building.blocks;

public abstract class Element {
    private int x;
    private final int moveDistance;
    private int y;

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

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + moveDistance;
        result = 31 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Element element = (Element) o;

        if (x != element.x)
            return false;
        if (moveDistance != element.moveDistance)
            return false;
        return y == element.y;
    }
}
