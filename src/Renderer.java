public class Renderer {

    private RenderObject[] objects = new RenderObject[0];

    public boolean addRenderObject(RenderObject o) {
        int potentialSpace = -1;
        for(int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                potentialSpace = i;
            }
            if(objects[i] != null && objects[i].equals(o)) {
                return false;
            }
        }
        if (potentialSpace != -1) {
            objects[potentialSpace] = o;
        } else {
            RenderObject[] tmp = new RenderObject[objects.length + 1];
            System.arraycopy(objects, 0, tmp, 0, objects.length);
            objects = tmp;
            objects[objects.length - 1] = o;
        }
        return true;
    }

    public boolean removeObject(RenderObject o) {
        for(int i = 0; i < objects.length; i++) {
            if(objects[i] != null && objects[i].equals(o)) {
                objects[i] = null;
                return true;
            }
        }
        return false;
    }

    public void render() {
        for(int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                objects[i].render();
            }
        }
    }
}
