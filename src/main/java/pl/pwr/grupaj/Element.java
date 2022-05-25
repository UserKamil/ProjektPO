package pl.pwr.grupaj;

public abstract class Element {
    private int x;
    private int y;

    public Element setX(int x) {
        this.x = x;
        return this;
    }

    public Element setY(int y) {
        this.y = y;
        return this;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
