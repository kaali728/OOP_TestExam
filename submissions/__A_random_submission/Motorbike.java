public class Motorbike extends Vehicle{

    private double tiltAngle;

    public Motorbike() {
        this(0, 0, 0, 0);
    }

    public Motorbike(double initialTiltAngle, double rotation, double positionX, double positionY) {
        super(rotation, positionX, positionY);
        this.tiltAngle = initialTiltAngle;
    }

    @Override
    public void render() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Motorbike(x: " + getPositionX() + ", y: " + getPositionY() + ")";
    }

    public double getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(double tiltAngle) {
        this.tiltAngle = tiltAngle;
    }
}
