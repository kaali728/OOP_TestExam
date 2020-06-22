public class Main {

    public static void main(String[] args) {
        Renderer r = new Renderer();
        Car c = new Car();
        Motorbike m = new Motorbike();
        r.addRenderObject(c);
        r.addRenderObject(m);

        for (int i = 0; i < 5; i++) {
            System.out.println("New Frame\n=====================================");
            m.moveForward(1);
            c.turnLeft(10);
            c.moveForward(3);
            r.render();
        }
    }
}
