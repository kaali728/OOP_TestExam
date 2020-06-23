public abstract class Vehicle implements IControllable, IRenderObject {

    protected double rotation;
    protected double positionX;
    protected double positionY;

    public Vehicle(double rotation, double positionX, double positionY) {
        this.rotation = rotation;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public void turnLeft(double degree) {
        rotation = (rotation - degree) % 360;
    }

    @Override
    public void moveForward(double distance) {
        double rad = Math.toRadians(rotation);
        double deltaX = Math.sin(rad) * distance;
        double deltaY = Math.cos(rad) * distance;
        positionX += deltaX;
        positionY += deltaY;
    }

    @Override
    public void moveBackward(double distance) {
        moveForward(-distance);
    }

    @Override
    public void turnRight(double degree) {
        turnLeft(-degree);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(vehicle.positionX, positionX) != 0) return false;
        return Double.compare(vehicle.positionY, positionY) == 0;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }
}
