public class Car extends Vehicle {

    @Override
    public void render() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car(x: " + getPositionX() + ", y: " + getPositionY() + ")";
    }
}
