public class Motorbike extends Vehicle{

    public Motorbike() {
        this(0, 0, 0);
    }

    public Motorbike(double rotation, double positionX, double positionY) {
        super(rotation, positionX, positionY);
    }

    @Override
    public void render() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Motorbike(x: " + getPositionX() + ", y: " + getPositionY() + ")";
    }
}
