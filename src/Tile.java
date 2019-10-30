import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Node {
    public Color color;
    public Rectangle tile;
    public Tile(Color color){
        this.color = color;
        this.tile =  new Rectangle(70, 65, color);
        tile.setStroke(Color.BLACK);


    }
}
