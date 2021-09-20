import processing.core.PApplet;
import processing.core.PGraphics;

public class MyApplet extends PApplet {
    PGraphics pg;

    protected PGraphics getBackground() {
        if(pg == null){
            pg = createGraphics(width, height);
        }
        pg.beginDraw();
        pg.background(155,0,0);
        pg.endDraw();
        return pg;
    }
}
