package AutoWiring.annotation;

public class B {
    private int x;

    public int getX() {
        return x;
    }

    public B(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                '}';
    }

    public void setX(int x) {
        this.x = x;
    }
    public B()
    {
        super();
    }
}
