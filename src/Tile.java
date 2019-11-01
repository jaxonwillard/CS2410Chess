import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile{
    public Color color;
    public Rectangle tile;
    public Board board;
    public int i;
    public int j;
    public Tile(Color color, int i, int j, Board board){
        this.color = color;
        this.tile =  new Rectangle(70, 65, color);
        this.i = i;
        this.j = j;
        this.board = board;
        tile.setStroke(Color.BLACK);

        tile.setOnMouseClicked(e -> {
            System.out.println("tile " + board.onDeck);
            if (board.onDeck != null) board.handleOnDeck(this.i, this.j);
        });
    }
}
