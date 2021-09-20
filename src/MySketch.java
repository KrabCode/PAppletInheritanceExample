import processing.core.PApplet;

public class MySketch extends MyApplet {

    public static void main(String... args) {
        PApplet.main("MySketch");
    }

    public void settings() {
        size(200, 200);
    }

    public void setup() {

    }

    public void draw() {
        image(getBackground(), 0, 0);
        ellipse(mouseX, mouseY, 20, 20);
    }

}
