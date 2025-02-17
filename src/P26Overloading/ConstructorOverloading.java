package P26Overloading;

public class ConstructorOverloading {
    private float x;
    private float y;

    public ConstructorOverloading() {
        x=2.5f;
        y=3.5f;
    }
    public ConstructorOverloading(float x) {
        this.x = x;
        this.y = x;
    }

    public ConstructorOverloading(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ConstructorOverloading{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
