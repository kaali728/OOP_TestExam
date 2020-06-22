public class Car extends Vehicle {

    public Car() {
        this(0, 0, 0);
    }

    public Car(double rotation, double positionX, double positionY) {
        super(rotation, positionX, positionY);
    }

    @Override
    public void render() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car(x: " + getPositionX() + ", y: " + getPositionY() + ")";
    }
}
