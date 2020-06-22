public class Motorbike extends Vehicle{
    @Override
    public void render() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Motorbike(x: " + getPositionX() + ", y: " + getPositionY() + ")";
    }
}
